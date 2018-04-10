import java.util.*;

public class TFIDF {

    public static void main (String args[]) {
        
        String papi = args[0] + " que rico";
        System.out.println(papi);
        System.out.println(args.length);
        
        System.out.println(appearances(papi) + "\nthere are " + countwords(papi, appearances(papi)) + " words");
		System.out.println(tf(papi, appearances(papi)));
        
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
	
	public static int countwords (String str, HashMap <String, Double> serie){
		
		Scanner file = new Scanner (str);
		int counter = 0;
		
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
	
    public static HashMap<String, Double> tf(String str, HashMap <String, Double> document){
        
		Scanner file = new Scanner (str);
		while (file.hasNext()){
            String word = file.next();
            word = word.toLowerCase();
            String[] wordlist = word.split("[^\\p{L}0-9]+");
           
            for (String w : wordlist) {
           
            document.put(w, document.get(w)/countwords(str, document));            
         
            }
		}
        
        return document;
    }
    
    public static double idf(int term, int collection){
        
        double n = 5;
        double d = 3;
        double idf = Math.log10(n/d);
        
        return idf;
    }
}
