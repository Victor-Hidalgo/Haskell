import java.util.*;

public class BreakCaesar{

	public static void main (String args[]) {

	System.out.println("Hola, soy bata");
	
	papirruqui(',', 3);

}

public static void papirruqui (char ch, int shift){

	char newChar = ' ';
	int diff = ch - 'a';
	int capdiff = ch - 'A';

	if(diff >= 0 && diff < 26) {	

		newChar = (char) ((ch - 'a' + shift) % 26 + 'a');
	}
 	
	else if(capdiff >= 0 && diff < 26) {	

		newChar = (char) ((ch - 'A' + shift) % 26 + 'A');
	}

	else {newChar = ch;}

	System.out.println(newChar);

}
}
