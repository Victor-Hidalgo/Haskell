import java.util.*;

public class TFIDF {

    public static void main (String args[]) {
        
        ArrayList<HashMap<String, Double>> text = new ArrayList<HashMap<String, Double>>();
        int i = 0;
        
        while (i < args.length){
        
        i++;}
        
        text.add(tf(args[0], appearances(args[0])));
        text.add(tf(args[1], appearances(args[1])));
        idf(args[0], text, args.length);
        idf(args[1], text, args.length);
        
        System.out.println(finalmap(args[0], idf(args[0], text, args.length)));
        System.out.println(finalmap(args[1], idf(args[1], text, args.length)));
        
    }
    
	public static HashMap<String, Double> appearances (String str){
		
		HashMap<String, Double> terms = new HashMap<String, Double>();
        Scanner file = new Scanner(str);
        while (file.hasNext()){
            String word = file.next();
            word = word.toLowerCase();
            String[] wordlist = word.split("[^\\p{L}0-9]+");
           
            for (String w : wordlist) {
           
            if (terms.containsKey(w)){terms.put(w, terms.get(w) + 1);}
            
            else{terms.put(w, 1.0);
            }
            }
        }
        file.close();
        return terms;
		
	}
	
	public static double countwords (String str){
		
		Scanner file = new Scanner (str);
		double counter = 0;
		
		while (file.hasNext()){
            String word = file.next();
            word = word.toLowerCase();
            String[] wordlist = word.split("[^\\p{L}0-9]+");
           
            for (String w : wordlist) {
				counter++;
            }
        }
        file.close();
		
		return counter;
	}
	
    public static HashMap<String, Double> tf(String str, HashMap<String, Double> list){
        
		HashMap<String, Double> document = new HashMap<String, Double>();
        Scanner file = new Scanner (str);
		while (file.hasNext()){
            String word = file.next();
            word = word.toLowerCase();
            String[] wordlist = word.split("[^\\p{L}0-9]+");
           
            for (String w : wordlist) {
           
            document.put(w, list.get(w)/countwords(str));            
         
            }
		}
        
        return document;
    }
    
    public static HashMap<String, Double> idf(String phrase, ArrayList<HashMap<String, Double>> list, int yo){
         
        int n = 0;
        double times = 0;
        HashMap<String, Double> results = new HashMap<String, Double>();
        Scanner file = new Scanner(phrase);
        while (file.hasNext()){
            String word = file.next();
            word = word.toLowerCase();
            String[] wordlist = word.split("[^\\p{L}0-9]+");
            
            for (String w : wordlist) {
                
                while(n < yo){
                    
                    if(list.get(n).containsKey(w)){times++;}
                n++;}
                
                results.put(w, Math.log10(yo/times)); n = 0; times = 0;
            }
        }
        
        return results;
    }
    
    public static HashMap<String, Double> finalmap(String str, HashMap<String, Double> values2){
        
        HashMap<String, Double> values1 = tf(str, appearances(str)); 
        HashMap<String, Double> values3 = new HashMap<String, Double>();
        Scanner file = new Scanner(str);
        while (file.hasNext()){
            String word = file.next();
            word = word.toLowerCase();
            String[] wordlist = word.split("[^\\p{L}0-9]+");
            
            for (String w : wordlist) {
                
                if(values1.containsKey(w)){values3.put(w, values1.get(w) * values2.get(w));}
                
            }
        }
      
    return values3;}
    
}
