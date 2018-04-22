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
    
    public double location(int times){
        
        int j = 0;
        double loc = 1;
        double steps = 0;
        int i = 0;
        double[] numbers = new double[times];
        int k = 1;
        int max = 0;
        
        while(j<times){
            
            steps = takeStep();
        
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
                    
                    loc = loc + 1;
                    i++;
                }
                
                i=0;
            }
            
            else{
                loc = loc + steps;
            }
            
            numbers[j] = loc;
            
            j++;
        }
        
        while(k<times){
            
           if(numbers[max] < numbers[k]){
               max = k;
           }
           k++;
        }
        
        return numbers[max];
    }
    
    public double topfloor(){
        
        double timestep = 0;
        double loc = 1;
        double steps = 0;
        int i = 0;
        
        while(loc<102){
            
            timestep = takeStep();
        
            if(loc == 1 && timestep<0){
                loc = 1;
            }
            
            else if (timestep>0 && loc!=102) {
                
                if(loc==84 && timestep == 3){
                    loc = 86;
                }
                
                else if((loc==85 && timestep == 3) || (loc==85 && timestep == 2)){
                    loc = 86;
                }
                
                 else{
                loc = loc + timestep;
                }
            }
          
            else{
                loc = loc + timestep;
            }
            
            steps++;  
        }
        
        return steps;
    }
}
