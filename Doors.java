import java.util.*;
import java.io.*;

public class Doors{
    
    public static void main (String args[]) {
        
        int N = 0;
        int[] after;
        int[] closed = new int[1];
        int i = 0;
        int open = 0;
        
        Ginny object1 = new Ginny();
        Petra object2 = new Petra();
        Sven object3 = new Sven();
        
        if(args.length == 0){
            
            System.out.println("Oops, not enough arguments");
        }
        
        else if(args.length == 1){
            
            try{
                
                N = Integer.parseInt(args[0]);
            }
                
            catch(NumberFormatException e){ //deals with doubles and any input which is not a number.
                 
                System.out.println("The argument must be a positive integer between 1 and 1000000");
            }
            
            if(N<1 || N>1000000){
                
                System.out.println("The argument must be a positive integer between 1 and 1000000");
            }
            
            else{
                
                try{
                    closed = new int[N+1];
                }
                
                catch(NegativeArraySizeException exception){ // deals with negative values.
                
                    System.out.println("The argument must be a positive integer between 1 and 1000000");
                }
            
                while(i<closed.length){
                    
                    closed[i] = 0;
                    i++;
                }
            
                after = object1.toggling(closed, N);
                i = 0;
                open = 0;
                
                while(i<after.length){
                    
                    if(after[i] == 1){
                        
                        open++;
                    }
                    i++;
                }
            
                i = 0;
                
                System.out.println(object1.name());
                System.out.println(open + " doors open");
                
                while(i<closed.length){
                    
                    closed[i] = 0;
                    i++;
                }
                
                after = object2.toggling(closed, N);
                i = 0;
                open = 0;
                
                while(i<after.length){
                    
                    if(after[i] == 1){
                        
                        open++;
                    }
                    i++;
                }
                
                i = 0;
            
                System.out.println(object2.name());
                System.out.println(open + " doors open");
                
                while(i<closed.length){
                    
                    closed[i] = 0;
                    i++;
                }
                
                open = 0;
                after = object3.toggling(closed, N);
                i = 0;
                
                while(i<after.length){
                    
                    if(after[i] == 1){
                        
                        open++;
                    }
                    i++;
                }
                
                i = 0;
                
                System.out.println(object3.name());
                System.out.println(open + " doors open");
                open = 0;
            }
        }
        
        else if(args.length == 2){
            
            try{
                
                N = Integer.parseInt(args[0]);
            }
                
            catch(NumberFormatException e){ //deals with doubles and any input which is not a number.
                 
                System.out.println("The argument must be a positive integer between 1 and 1000000");
            }
            
            if(N<1 || N>1000000){
                
                System.out.println("The argument must be a positive integer between 1 and 1000000");
            }
            
            else{
                
                try{
                    closed = new int[N+1];
                }
                
                catch(NegativeArraySizeException exception){ // deals with negative values.
                
                    System.out.println("The argument must be a positive integer between 1 and 1000000");
                }
            
                while(i<closed.length){
                    
                    closed[i] = 0;
                    i++;
                }
                
                open = 0;
                i = 0;
                String str = args[1];
                char ch = ' ';
                boolean wrong = false;
                
                while(i<str.length()){
                    
                    ch = str.charAt(i);
                    
                    if(ch == 'g' || ch == 'G'){
                        
                        closed = object1.toggling(closed, N);
                    }
                    
                    else if(ch == 'p' || ch == 'P'){
                        
                        closed = object2.toggling(closed, N);
                    }
                    
                    else if(ch == 's' || ch == 'S'){
                        
                        closed = object3.toggling(closed, N);
                    }
                    
                    else{
                        
                        System.out.println("Invalid character");
                        wrong = true;
                        break;
                    }
                        
                    i++;
                }
            
                i = 0;
                
                while(i<closed.length){
                    
                    if(closed[i] == 1){
                        
                        open++;
                    }
                    i++;
                }
                
                if(wrong == false){
                
                    System.out.println(open + " doors open");
                }
            }
        }
    }
    
}
