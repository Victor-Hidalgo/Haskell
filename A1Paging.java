import java.util.*;
import java.io.*;

class A1Paging {

	private static Scanner keyboardInput = new Scanner (System.in);
	private static final int maxCacheSize = 10;
	private static final int maxRequest = 100;


	// Do NOT change the main method!
	// main program
	public static void main(String[] args) throws Exception {
		int count=0, size=0;
		int[] org_cache = new int[maxCacheSize];
		int[] cache = new int[maxCacheSize];
		int[] request = new int[maxRequest];
		
		init_array(org_cache, maxCacheSize, -1);
		init_array(request, maxRequest, 0);

		// get the cache size and the number of requests 
		// then get the corresponding input in the respective arrays
		try {
			System.out.println();
			System.out.print("Enter the cache size (1-" + maxCacheSize + "): ");
			size = keyboardInput.nextInt();
			System.out.print("Enter the content of the cache (" + size + " different +ve integers): ");
			for (int i=0; i<size; i++)
				org_cache[i] = keyboardInput.nextInt();				
			System.out.println();
			System.out.print("Enter the number of page requests: (1-" + maxRequest + "): ");
			count = keyboardInput.nextInt();
			if (count > maxRequest || count <= 0)
				System.exit(0);
			System.out.print("Enter " + count + " +ve integers: ");
			for (int i=0; i<count; i++)
				request[i] = keyboardInput.nextInt();				
		}
		catch (Exception e) {
			keyboardInput.next();
			System.exit(0);
		}
/*		
		System.out.println();
		System.out.println("Cache content: ");
		print_array(org_cache, size);
		System.out.println("Request sequence: ");
		print_array(request, count);
*/
		
		copy_array(org_cache, cache, size);
		no_evict(cache, size, request, count);
		copy_array(org_cache, cache, size);
		evict_largest(cache, size, request, count);
		copy_array(org_cache, cache, size);
		evict_fifo(cache, size, request, count);
		copy_array(org_cache, cache, size);
		evict_lfu(cache, size, request, count);

	}
	
	// Do NOT change this method!
	// set array[0]..array[n-1] to 0
	static void init_array(int[] array, int n, int value) {
		for (int i=0; i<n; i++) 
			array[i] = value;
	}
	
	// Do NOT change this method!
	// set array[0]..array[n-1] to 0
	static void print_array(int[] array, int n) {
		for (int i=0; i<n; i++) {
			System.out.print(array[i] + " ");
			if (i%10 == 9)
				System.out.println();
		}
		System.out.println();
	}
	
	// Do NOT change this method!
	// copy n numbers from array a1 to array a2, starting from a1[x1] and a2[x2]
	static void copy_array(int[] a1, int[] a2, int n) {
		for (int i=0; i<n; i++) {
			a2[i] = a1[i];
		}
	}	

	static void no_evict(int[] cache, int c_size, int[] request, int r_size) {

	int i = 0;
	int j = 0;
	int hits = 0, misses = 0;
	boolean found = false;
	
	
	while(j<r_size){

		if(cache[i] == request[j]) {
			
		found = true; hits++;}
		
		else {i++;}
		
		if (found == false) {misses++;}
		
		
		if(i == c_size) {
			
			i=0;found=false;j++;
		}
			
		} 
	
	System.out.println(hits + " h " + misses + " m ");
	}

	static void evict_largest(int[] cache, int c_size, int[] request, int r_size) {
	
	}
	
	static void evict_fifo(int[] cache, int c_size, int[] request, int r_size) {
			
	}

	static void evict_lfu(int[] cache, int c_size, int[] request, int r_size) {

	}

}
