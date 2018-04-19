import java.util.*;

public class Bella extends Cockroach{
    
    public String name(){
        return "Bella";
    }
    
    public double takeStep(){
        
        int loc = 1;
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1;
        int walk = 0;
        int i = 0;
        
        if(dice == 4){
            
            while(i<2){
                
                if(loc==102 || loc == 86){
                    break;
                }
                walk++;loc = loc + 1;i++;
            }
        }
        
        else if(dice == 5){
            while(i<3){
                
                if(loc==102 || loc==86){
                    break;
                }
                walk++;loc = loc + 1;i++;
            }
        }
        
        else if(dice == 6){
            loc= loc;
            walk =0;
        }
        
        else{
            loc = loc -1;
            walk = -1;
        }
        
        if(loc == 1 && walk < 0){
            loc = 1;
        }
        
        else if(loc == 102 && walk > 0){
            
            loc = loc;
            
        }
        
        return loc;
    }
}