import java.util.*;
import java.io.*;

public class ModelCrypto { 

	
		
	CharNumObject [][] charMatrix = new CharNumObject [6][6];
	CharNumObject objectSearch = new CharNumObject ();
	String template = ""; // this is the String that is the parent strand
	String charStrand = "";
	String pulledString = "";
	String num = "";
	char letter = '*'; // used in letterToString()
	//String encryptFileName = "";

	Scanner keyboard = new Scanner(System.in);

	public void getMatrix (CharNumObject [][] obj) {
		charMatrix = obj;
	} // constructor for compile


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

		return charStrand;
	} // closes letterToString


	public String addToTemplate (String letterStrand) {
		for (int q = 0; q < letterStrand.length(); q++) {
			char pass = letterStrand.charAt(q);
			for (int i = 0; i < 6; i++){
				for (int j = 0; j < 6; j++){
					objectSearch = charMatrix[i][j];
					if (objectSearch.charInEntry(pass) == true){
						num = objectSearch.getNumTriplet(pass);
						//System.out.println(num);
						//System.out.println(" I AM IN charMatrix " + i + "   " + j);
					} //  closes if
					else {
						//System.out.println("character not in matrix entry " + i + "   " + j); // for testing purposes
					} // closes else
				} // closes innr for
			} // closes middle for
			template += num;
		}// closes outter for
		System.out.println(template); // for testing purposes only
		return template;
	} // closes addToTemplate





	public String passTemplate () {
		return template;
	} // closes passTemplate

	public void Decrypt () {} // constructor for complie

	public void makeToTemplate () {
	} // clsoes mateToTemplate
	
} //  closes Encrypt