import java.util.*;

public class Bella extends Cockroach{
    
    public String name(){
        return "Bella";
    }
    
    public double takeStep(){
        
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1;
        int walk = 0;
        
        if(dice == 4){
            
            walk = 2;
        }
        
        else if(dice == 5){
            
            walk = 3;
        }
        
        else if(dice == 6){
            
            walk = 0;
        }
        
        else{
            
            walk = -1;
        }
        
        return walk;
    }
    
    public double location(){
        
        double loc = 1;
        double steps = takeStep();
        int i = 0;
        
        if(loc == 1 && steps<0){
            loc = 1;
        }
        
        else if(loc==102 && steps>0){
            loc = 102;
        }
        
        else if(loc==86){
            loc = loc;
        }
        
        else if (steps>0 && loc!=102) {
            
            while(i < steps){
                
                if(loc==86){
                    break;
                }
                
                loc++;i++;
            }
        }
        
        else{
            loc = loc + steps;
        }
        
        return loc;
    }
}
