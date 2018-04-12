import java.util.*;
import java.io.*;

public class TFIDF {

    public static void main (String args[]) throws IOException{
        
        ArrayList<HashMap<String, Double>> text = new ArrayList<HashMap<String, Double>>();
        ArrayList<String> lines = new ArrayList<String>(args.length);
        int i = 0;
        
        if(args.length == 1){
            
            lines.add(conversion(args[0]));
            
            System.out.println("Max TF value for this file." + "\n" + args[0]);
            best(lines.get(0), tf(lines.get(0), appearances(lines.get(0))));
        }
        
        else{
        
        while (i < args.length){
       
       lines.add(conversion(args[i]));
        
        text.add(tf(lines.get(i), appearances(lines.get(i))));
        
        i++;}
        
        i = 0;
        
        System.out.println("Max TFIDF value for each file.");
        
        while (i < args.length){
            
            System.out.println(args[i]);
            
            best(lines.get(i), finalmap(lines.get(i), idf(lines.get(i), text, args.length)));
        i++;}
        }
        
        //System.out.println(conversion(args[0]));
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
    
    public static void best (String str, HashMap<String, Double> list){
        
        ArrayList<Double> numbers = new ArrayList<Double>();
        ArrayList<String> letters = new ArrayList<String>();
        Scanner file = new Scanner(str);
        int j = 1;
        int loc = 0;

        while (file.hasNext()){
            String word = file.next();
            word = word.toLowerCase();
            String[] wordlist = word.split("[^\\p{L}0-9]+");
            
            for (String w : wordlist) {
                
                letters.add(w);
                numbers.add(list.get(w));
            }
    
        }
        
        while(j<numbers.size()){
            
            if(numbers.get(j)>numbers.get(loc)){loc = j;}
            
        j++;}
        
        System.out.println(letters.get(loc) + " " + numbers.get(loc));
    }
    public static String conversion (String path) throws IOException{
        
        String line;
        String title = "";
        BufferedReader in = new BufferedReader(new FileReader(path));
        while((line = in.readLine()) != null){
            title = title + "\n" + line;
        }
    return title;}
}
