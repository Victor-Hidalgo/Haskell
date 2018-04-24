import java.util.*;

public class Cycle extends Graph{
    
    public Cycle(){
        super();
    } 
    
    public int[] twonegatives(int size){
        
        int[] vertices = new int[size];
        int i = 0;
        
        while(i<size){
            
            vertices[i] = 1;
            i++;
        }
    
        vertices[0] = -1;
 
        vertices[size/2] = -1;
        
        return vertices;
    }
    
    public int[] oneStep(int[] positions){
        
        Random choose = new Random();
        int i = choose.nextInt(positions.length - 1);
        int j = i + 1;
        
        if(positions[j] == null){
            positions[j] = positions[0];
            
            if(positions[i] == 1 && positions[j] == 1){
            
            positions[i] = 1;
            positions[j] = 1;
            }
            
            else if(positions[i] == 1 && positions[j] == -1){
            
            positions[i] = -1;
            positions[j] = -1;
            }
            
            else if(positions[i] == -1 && positions[j] == -1){
            
            positions[i] = 1;
            positions[j] = 1;
            }
            
            else if(positions[i] == -1 && positions[j] == 1){
            
            positions[i] = -1;
            positions[j] = -1;
            }
        }
        
        else if(positions[i] == 1 && positions[j] == 1){
            
            positions[i] = 1;
            positions[j] = 1;
        }
        
        else if(positions[i] == 1 && positions[j] == -1){
            
            positions[i] = -1;
            positions[j] = -1;
        }
        
        else if(positions[i] == -1 && positions[j] == -1){
            
            positions[i] = 1;
            positions[j] = 1;
        }
        
        else if(positions[i] == -1 && positions[j] == 1){
            
            positions[i] = -1;
            positions[j] = -1;
        }
        
        return positions;
    }
	
	public double time(int[] ones, int repetitions){
		
		double value = 0;
		
		while(){
			
			oneStep(ones);
			value++;
		}
	}
}
