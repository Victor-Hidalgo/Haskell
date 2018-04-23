import java.util.*;

public class Graph{
    
    public int[] fill(int size){
        
        int[] vertices = new int[size];
        int i = 0;
        Random negative = new Random();
        int j = 0;
        
        while(i<size){
            
            vertices[i] = 1;
            i++;
        }
        
        j = negative.nextInt(2) + 1;
        
        if(j==1){
            vertices[0] = -1;
        }
        
        else{
            vertices[size - 1] = -1;
        }
        
        return vertices;
    }
    
}