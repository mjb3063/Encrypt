import java.util.*;
import java.io.*;

public class Encrypt { 

	String template = "";
	String charStrand = "";
	String pulledString = "";
	char letter = '*'; // used in letterToString()
	//String encryptFileName = "";

	Scanner keyboard = new Scanner(System.in);

	public void Encrypt () {} // constructor for compile


	public String letterToString (String encryptFileName) throws IOException{ // passes in fileName to make file
		int repeat = 0; //0 = no DONT repeat      1 = yes repeat  
		do {
			try {
				File file = new File(encryptFileName);
				Scanner inFile = new Scanner(file);
				while (inFile.hasNext()) {
					pulledString = inFile.nextLine();
						for (int i = 0; i < pulledString.length(); i ++) {
							letter = pulledString.charAt(i);
							charStrand = charStrand + letter;
						} // closes for loop
				} // closes while
				//System.out.println("TESTING PUROPSES (in Encrypt): letterStrand = " + charStrand); // testing purposes only
				repeat = 0;
		} // closes try
			catch(IOException badFileInput) { // check to catch 
				System.out.println("Bad File...enter a new one.  Make sure the file extension is added (Example: .txt)");
				encryptFileName = keyboard.nextLine();
				repeat = 1;
		} // closes on catch
		} while(repeat == 1);

		return letterStrand;
	} // closes letterToString


	public void addToTemplate (String letterStrand) {
		template = template + letterStrand;
	} // closes addToTemplate


	public String passTemplate () {
		return template;
	} // closes passTemplate


	
} //  closes Encrypt