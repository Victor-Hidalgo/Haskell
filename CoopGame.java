import java.util.*;

public class CoopGame{
	
	public static void main (String args[]) {
		
		int n = 100;
		int trials = 2000;
		double total1 = 0;
		double total2 = 0;
		double total3 = 0;
		double total4 = 0;
		int k = 0;
		Path object1 = new Path();
		Cycle object2 = new Cycle();
		
		while(k<trials){
			
			total1 = total1 + object1.run(object1.fill(n));
			total2 = total2 + object1.run(object1.twonegatives(n));
			total3 = total3 + object2.run(object2.fill(n));
			total4 = total4 + object2.run(object2.twonegatives(n));
			k++;
		}
		
		double average1 = total1/trials;
		double average2 = total2/trials;
		double average3 = total3/trials;
		double average4 = total4/trials;
		
		System.out.println(average1 + "\n" + average2 + "\n" + average3 + "\n" + average4);
		
	}
}