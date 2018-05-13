import java.util.*;

public class Petra extends DoorUser{
    
    public Petra(){
        
        super();
    }
    
     public String name(){
        
        return "Petra";
    }
    
    public int[] toggling(int[] values, int N){
        
        int[]toggle = values;
        int i = 0;
        boolean k;
        int j = 0;
        int count = 0;
        
        while(i<toggle.length){
            
            k = isPrime(i);
            
            if(k == true){
                
                j = 0;
                
                count = i*j;
                
                while(count<toggle.length){
                    
                    if(toggle[count] == 0){
                        
                        toggle[count] = 1;
                    }
                    
                    else if(toggle[count] == 1){
                        
                        toggle[count] = 0;
                    }
                    
                    j++;
                    count = i*j;
                }
                
                j = 0;
                count = 0;
            }
            
            i++;
        }
        
        return toggle;
    }
    
    public boolean isPrime (int number1){
        
        boolean rato = false;
        
        if(number1 == 2 || number1 == 3){
            
            rato = true;
        }
        
        else if(number1 == 0 || number1 == 1){
            
            rato = false;
        }
        
        else{
            for(int i=2; i<number1; i++){
                
                if(number1%i==0){
                    
                    rato = false;
                    break;
                }
                
                else{
                    
                    rato = true;
                }
            }
            
        }
        return rato;
    }
}
