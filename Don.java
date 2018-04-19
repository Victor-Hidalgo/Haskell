import java.util.*;

public class Don extends Cockroach{
    
    public Don(){
        super();
    }
    
    public String name(){
        return "Don";
    }
    
    public double takeStep(){
        
        int loc = 0;
        int walk = 0;
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1;
        
        if(dice == 1 || dice == 2){
            walk = -1;
        }
        
        else if(dice==6){
            walk = rand.nextInt(6) + 1;
        }
        
        else {
            walk = 1;
        }
    
    return walk;
    }
    
    public double location(){
        
        double loc = 1;
        double steps = takeStep();
        double first = Math.random()*100;
        double rounded = Math.round(first*10)/10.0;
        
        if(rounded <= 0.1){
            loc = 1;
        }
        
        else{
            
            if(loc == 1 && steps<0){
            loc = 1;
            }
        
            else if(loc==102 && steps>0){
                loc = 102;
            }
            
            else{
                loc = loc + steps;
            }
            
        }
        
        return loc;
    }
} 
