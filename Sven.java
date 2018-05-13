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
        int[]toggle = values;
        int sum = 0;
        
        while(power1<toggle.length && (power1 + power2) < toggle.length){
        
            power1 = first*first;
            
            second = 0;
            
            second = first + 1;
            power2 = second*second;
        
            while(power2<toggle.length && (power1 + power2) < toggle.length){
                
                sum = power1;
                
                if(toggle[sum] == 0){
                    
                    toggle[sum] = 1;
                }
                
                else{
                    
                    toggle[sum] = 0;
                }
                
                sum = power1 + power2;
                
                if(toggle[sum] == 0){
                    
                    toggle[sum] = 1;
                }
                
                else{
                    
                    toggle[sum] = 0;
                }
                
                sum = 0;
                
                second++;
                
                power2 = second*second;
            }
            
            power2 = 0;
            
            first++;
        }
        
        return toggle;
    }
}
