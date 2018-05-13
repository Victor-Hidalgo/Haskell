import java.util.*;
import java.io.*;

public class Doors{
    
    public static void main (String args[]) {
        
        int N = Integer.parseInt(args[0]);
        int[] closed = new int[N+1];
        int[] after;
        int i = 0;
        int open = 0;
        
        Ginny object1 = new Ginny();
        Petra object2 = new Petra();
        Sven object3 = new Sven();
        
        while(i<closed.length){
            
            closed[i] = 0;
            i++;
        }
        
        after = object1.toggling(closed, N);
        i = 0;
        
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
