import java.util.*;
import java.util.ArrayList;

public class BreakCaesar{

	public static void main (String args[]) {

	System.out.println("Hola, soy bata");

	String str = "La vieja";
	
	System.out.println("\n The length is: " + str.length());
	System.out.println("hello");	
	papirruqui("hello", -23);
	System.out.println("aaba maleta");
	System.out.println(count('A', "aaba maletas") + " " + frequency('A', "aaba maletas"));

	double[] papu = new double[2];
	papu[0] = 3.4;
	papu[1] = 8.12;

	double [] mom = {0.1, 0.9};
	double [] dad = {0.8, 0.2};
	chi_squared(mom, dad);

	double[] knownFreq = {0.0855, 0.0160, 0.0316, 0.0387, 0.1210, 0.0218, 0.0209, 0.0496, 0.0733, 0.0022, 0.0081, 0.0421, 0.0253, 0.0717, 0.0747, 0.0207, 0.0010, 0.0633, 0.0673, 0.0894, 0.0268, 0.0106, 0.0183, 0.0019, 0.0172, 0.0011};

	chi_squared(get_freqs("hello"), knownFreq);
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
		else{letters = letters;}
	j++;}

	freq = count(bata, str) / letters;
	
	return freq;	
}

public static double[] get_freqs (String str){

	int k = 0;
	int i = 0;
	char newChar = ' ';
	double[] freqs = new double[26];
	

	while(k<26){
	
	newChar = (char) (('a' - 'a' + i) % 26 + 'a');
	freqs[k] = frequency(newChar, str);
	
k++;i++;}
return freqs;}

public static void chi_squared (double[] freq, double[] english){

	int j = 0;
	double chi = 0;

	while (j < freq.length && j < english.length){
	
	double operation = (freq[j] - english[j]) * (freq[j] - english[j])/ english[j];
	chi = chi + operation;
	j++;	
}
	System.out.println(chi);
}
}
