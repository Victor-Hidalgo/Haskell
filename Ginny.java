import java.util.*;

public class Ginny extends DoorUser{
    
    public Ginny(){
        
        super();
    }
    
    public String name(){
        
        return "Ginny";
    }
    
    public int[] toggling(int[] values, int N){
        
        int[]numbers = new int [N+1];
        int i = 0;
        double k = 0;
        
        while(i<numbers.length){
            
            k = gcd(N, i);
            
            if(k == 1 && values[i] == 0){
                
                numbers[i] = 1;
            }
            
            else if(k == 1 && values[i] == 1){
                
                numbers[i] = 0;
            }
            
            i++;
        }
        
        return numbers;
    }
    
    public double gcd(int number1, int number2){
        
        if(number2 == 0){
            
            return number1;
        }
        
        else{
            
            return gcd(number2, number1 % number2);
        }
    }
}