import java.util.*;
import java.io.*;

public class Encrypt {

	Scanner keyboard = new Scanner (System.in);

	String template = "";
	String tempString = "";
	String pulledString = "";
	char letter = '*';

	public void Encrypt () {} // constructor for compile


	public String letterToString (String fileName) { // passes in fileName to make file
		File file = new File (fileName);
		while (file.hasNext()) {
			pulledString = file.nextLine();
			for (int i = 0; i < pulledString.length(); i ++) {
				letter = pulledString.charAt(i);
				tempString = tempString + letter;
			} // closes for loop
		} // closes while
		System.out.println("TESTING PUROPSES (in Encrypt): tempString = " + tempString);
		return tempString;
	} // closes letterToString


	public void addToTemplate (String letterStrand) {
		template = template + letterStrand;
	} // closes addToTemplate


	public String passTemplate () {
		return template;
	} // closes passTemplate


	
} //  closes Encrypt