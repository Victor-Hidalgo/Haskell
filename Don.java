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
    
    public double location(int times){
        
        double loc = 1;
        int i = 0;
        int j = 1;
        int max = 0;
        double[] numbers = new double[100];
        double steps = 0;
        double first = 0;
        double rounded = 0;
        
        while(i<times){
            
            steps = takeStep();
            first = Math.random()*100;
            rounded = Math.round(first*10)/10.0;
        
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
            
            numbers[i] = loc;
            
            i++;
        }
        
        while(j<100){
            
            if(numbers[max]<numbers[j]){
                max = j;
            }
            j++;
        }
        
        return numbers[max];
    }
    
    public double topfloor(){
        
        double first = 0;
        double rounded = 0;
        double timestep = 0;
        double loc = 1;
        double steps = 0;
        
        while(loc<102){
            
            timestep = takeStep();
            first = Math.random()*100;
            rounded = Math.round(first*10)/10.0;
        
            if(rounded <= 0.1){
                loc = 1;
            }
            
            else{
                
                if(loc == 1 && timestep<0){
                loc = 1;
                }
                
                else{
                    loc = loc + timestep;
                }
                
            }
            
            steps++;
        }
        
        return steps;
    }
}
