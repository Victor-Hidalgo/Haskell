import java.util.*;

public class Sven extends DoorUser{
    
    public Sven(){
        
        super();
    }
    
     public String name(){
        
        return "Sven";
    }
    
    public int[] toggling(int[] values, int N){
        
        int first = 1;
        int second = 2;
        int power1 = 0;
        int power2 = 0;
        int[]toggle = new int [N+1];
        int sum = 0;
        
        while(power1<toggle.length && (power1 + power2) < toggle.length){
        
            power1 = Math.pow(first, 2);
            
            second = first + 1;
        
            while(power2<toggle.length && (power1 + power2) < toggle.length){
                
                power2 = Math.pow(second, 2);
                
                sum = power1;
                
                if(values[sum] == 0){
                    
                    toggle[sum] = 1;
                }
                
                else{
                    
                    toggle[sum] = 0;
                }
                
                sum = power1 + power2;
                
                if(values[sum] == 0){
                    
                    toggle[sum] = 1;
                }
                
                else{
                    
                    toggle[sum] = 0;
                }
                
                second++;
            }
            
            first++;
        }
        
        return toggle;
    }
}