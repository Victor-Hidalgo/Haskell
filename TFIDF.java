import java.util.*;

public class TFIDF {

    public static void main (String args[]) {
        
        String papi = args[0] + " que rico";
        System.out.println(papi);
        System.out.println(args.length);
        
        HashMap<String, Integer> terms = new HashMap<String, Integer>();
        Scanner file = new Scanner(papi);
        while (file.hasNext()){
            String word = file.next();
            word = word.toLowerCase();
            String[] wordlist = word.split("[^\\p{L}0-9]+");
           
            for (String w : wordlist) {
           
            if (terms.containsKey(w)){terms.put(w, terms.get(w) + 1);}
            
            else{terms.put(w, 1);
            }
            }
        }
        file.close();
        System.out.println(terms);
        
    }
    
    public static double tf(int term, int document){
        
        double ocurrences = 1;
        double allwords=15;
        double tf = ocurrences / allwords;
        
        return tf;
        
    }
    
    public static double idf(int term, int collection){
        
        double n = 5;
        double d = 3;
        double idf = Math.log10(n/d);
        
        return idf;
    }
}