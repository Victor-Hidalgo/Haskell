import java.util.*;

public class BreakCaesar{

	public static void main (String args[]) {

	System.out.println("Hola, soy bata");

	String str = "La vieja";
	
	System.out.println("\n The length is: " + str.length());
	System.out.println("hello");	
	papirruqui("hello", -23);
	System.out.println("aaba maleta");
	count('t', "aaba maleta");

	

}

public static void papirruqui (String str, int shift){

	while(shift < 0){
		
		shift = shift + 26;}	

	int i = 0;
	char ch = ' ';
	int diff = 0;
	int capdiff = 0;
	String encrypt = " ";

	while(i<str.length()){

		ch = str.charAt(i);
		diff = ch - 'a';
		capdiff = ch - 'A';	

		if(diff >= 0 && diff < 26) {	

			ch = (char) ((ch - 'a' + shift) % 26 + 'a');
		}
 	
		else if(capdiff >= 0 && capdiff < 26) {	

			ch = (char) ((ch - 'A' + shift) % 26 + 'A');
		}

		else {ch = ch;}
		encrypt = encrypt + ch; i++;}

	System.out.println(encrypt);

}

public static void count (char bata, String str){

	double appears = 0;
	double letters = 0;
	double freq = 0.0;
	int j = 0;
	int diff = 0;
	int capdiff = 0;
	char ch = ' ';	

	while(j<str.length()){

		ch = str.charAt(j);
		diff = ch - 'a';
		capdiff = ch - 'A';	

		if(diff >= 0 && diff < 26) {	
			
			if(ch == bata){appears++;letters++;}

			else{letters++;}
		}
 	
		else if(capdiff >= 0 && capdiff < 26) {	

			if(ch == bata){appears++;letters++;}

			else{letters++;}
		}

		else {ch = ch;}
		j++;}

	freq = appears/letters;

	System.out.println("Appears " + appears + " times \n The frequency is " + freq); 
	
}

}
