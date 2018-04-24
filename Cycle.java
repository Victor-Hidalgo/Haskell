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
        
        if(j == positions.length){
            j = 0;
            
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
	
	public boolean check(int[] ones){
		
		int i = 0;
		boolean positive = true; 
		
		while(i<ones.length){
			
			if(ones[i] !=1){
				positive = false;
			}
			
			i++;
		}
		
		return positive;
	}
	
	public double run(int[] ones){
		
		boolean condition = check(ones);
		int[] myarray = ones; 
		
		int value = 0;
		
		while(condition == false){
			
			myarray = oneStep(myarray);
			condition = check(myarray);
			value++;
		}
		
		return value;
	}
}
