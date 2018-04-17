import java.util.*;

public class ProducerConsumer{
    
    public static void main(String[] args){
        
        ArrayList<Integer> shelf = new ArrayList<Integer>();
        
        System.out.println("Potter 1 (Harry) has started");
        System.out.println("The Packer (Macca) has started");
        
        Thread harry = new Thread(new Craftperson1(shelf));
        Thread macca = new Thread(new Packer(shelf));
        harry.start();
        macca.start();
    }
}

class Craftperson1 implements Runnable{
    
    ArrayList<Integer> shelf = null;
    final int limit = 5;
    int i = 0;
    
    public Craftperson1(ArrayList<Integer> shelf){
        super();
        this.shelf = shelf;
    }
    
    public void run(){
        while(true){
            try{
                produce1(i++);
            }
            catch(InterruptedException exception){
                
            }
        }
        
    }
    
    public void produce1(int i) throws InterruptedException{
        
        synchronized(shelf){
            while(shelf.size() == limit){
                System.out.println("Shelf is full. Waiting to insert...");
                shelf.wait();
            }
        }
        
        synchronized(shelf){
            System.out.println("Harry has made a pot");
            shelf.add(i);
            System.out.println("Harry has put his pot on the shelf");
            Thread.sleep(500);
            shelf.notify();
        }
    }
}

class Packer implements Runnable{
    
    ArrayList<Integer> shelf = null;
    final int limit = 5;
    int i = 0;
    
    public Packer(ArrayList<Integer> shelf){
        super();
        this.shelf = shelf;
    }
    
    public void run(){
        while(true){
            try{
                pack();
            }
            catch(InterruptedException exception){
                
            }
        }
        
    }
    
    public void pack() throws InterruptedException{
        
        synchronized(shelf){
            while(shelf.isEmpty()){
                System.out.println("Shelf is empty. Waiting to remove...");
                shelf.wait();
            }
        }
        
        synchronized(shelf){
            Thread.sleep(400);
            System.out.println("Macca has packed a pot. Consumed the element " + shelf.remove(0));
            System.out.println("Macca is ready to pack");
            shelf.notify();
        }
    }
}