import java.util.*;

public class BreakCaesar{

	public static void main (String args[]) {

	System.out.println("Hola, soy bata");

	String str = "La vieja";
	
	System.out.println("\n The length is: " + str.length());
	System.out.println("hello");	
	papirruqui("hello", -23);
	System.out.println("aaba maleta");
	System.out.println(count('A', "aaba maletas") + " " + frequency('A', "aaba maletas"));


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

public static double count (char bata, String str){

	double appears = 0;
	int j = 0;
	int diff = 0;
	int capdiff = 0;
	char ch = ' ';
	int diff2 = 0;
	int capdiff2 = 0;	

	while(j<str.length()){

		ch = str.charAt(j);
		diff = ch - 'a';
		capdiff = ch - 'A';
		diff2 = bata - 'a';
		capdiff2 = bata - 'A';		

		
	if((diff >= 0 && diff < 26) || (capdiff >= 0 && capdiff < 26)){
		
		if(diff2 == diff || diff2 == capdiff || capdiff2 == capdiff || capdiff2 == diff){	
			
			appears++;}

	}
		j++;}
	return appears;
	
}

public static double frequency (char bata, String str){

	double freq = 0;
	double letters = 0;
	int j = 0;
	int diff = 0;
	int capdiff = 0;
	char ch = ' ';

	while(j<str.length()){

		ch = str.charAt(j);
		diff = ch - 'a';
		capdiff = ch - 'A';

		if((diff >= 0 && diff < 26) || (capdiff >= 0 && capdiff < 26)){letters++;}
	j++;}

	freq = count(bata, str) / letters;
	
	return freq;	
}
}
