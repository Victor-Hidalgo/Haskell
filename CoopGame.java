import java.util.*;
import java.io.*;

public class CoopGame{
	
	public static void main (String args[]) {
		
		int n = 0;
		int trials = 0;
		double total1 = 0;
		double total2 = 0;
		double total3 = 0;
		double total4 = 0;
		int k = 0;
		Path object1 = new Path();
		Cycle object2 = new Cycle();
        
        Scanner scan = new Scanner(System.in);
        
        if(args.length==1){
        
            try{
            
                n = Integer.parseInt(args[0]);
                trials = 2000;
            }
            
            catch(NumberFormatException e){
                
                System.out.println(" Oops, check your parameter(s). The first parameter specifies n, "
                +"the number of vertices (at least 3).\n An optional second parameter specifies the number of "
                +"trials to perform (between 1 and 5000).");
            }
            
            catch(NegativeArraySizeException ex){
                
                System.out.println(" Oops, check your parameter(s). The first parameter specifies n, "
                +"the number of vertices (at least 3).\n An optional second parameter specifies the number of "
                +"trials to perform (between 1 and 5000).");
            }
            
        }
        
        else if(args.length==2){
        
            try{
            
                n = Integer.parseInt(args[0]);
                trials = Integer.parseInt(args[1]);
            }
            
            catch(NumberFormatException e){
                
                System.out.println(" Oops, check your parameter(s). The first parameter specifies n, "
                +"the number of vertices (at least 3).\n An optional second parameter specifies the number of "
                +"trials to perform (between 1 and 5000).");
            }
        }
        
        if(n<3 || trials<1 || trials>5000){
            
             System.out.println(" Oops, check your parameter(s). The first parameter specifies n, "
                +"the number of vertices (at least 3).\n An optional second parameter specifies the number of "
                +"trials to perform (between 1 and 5000).");
        }
        else{
        
            try{
            
                while(k<trials){
                    
                    total1 = total1 + object1.run(object1.fill(n));
                    total2 = total2 + object1.run(object1.twonegatives(n));
                    total3 = total3 + object2.run(object2.fill(n));
                    total4 = total4 + object2.run(object2.twonegatives(n));
                    k++;
                }
            }
            
            catch(NegativeArraySizeException exception){
                    
                    System.out.println(" Oops, check your parameter(s). The first parameter specifies n, "
                    +"the number of vertices (at least 3).\n An optional second parameter specifies the number of "
                    +"trials to perform (between 1 and 5000).");
            }
        
		
            double average1 = total1/trials;
            double average2 = total2/trials;
            double average3 = total3/trials;
            double average4 = total4/trials;
            
            System.out.println("Cycle of size " + n + " (" + trials + " trials) with one starting -1 value: " + average3);
            System.out.println("Cycle of size " + n + " (" + trials + " trials) with one starting -1 value: " + average4);
            System.out.println("Path of size " + n + " (" + trials + " trials) with one starting -1 value: " + average1);
            System.out.println("Path of size " + n + " (" + trials + " trials) with one starting -1 value: " + average2);
        }
	}
}
