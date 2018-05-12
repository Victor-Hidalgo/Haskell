import java.util.*;

public class Petra extends DoorUser{
    
    public Petra(){
        
        super();
    }
    
     public String name(){
        
        return "Petra";
    }
    
    public int[] toggling(int[] values, int N){
        
        int[]toggle = new int [N+1];
        int i = 0;
        boolean k;
        int j = 0;
        int count = 0;
        
        while(i<numbers.length){
            
            k = isPrime(i);
            
            if(k == true){
                
                while(count<toggle.length){
                    
                    count = i*j;
                    
                    if(values[count] == 0){
                        
                        toggle[count] = 1;
                    }
                    
                    else if(values[count] == 1){
                        
                        toggle[count] = 0;
                    }
                    
                    j++;
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