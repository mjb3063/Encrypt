import java.util.*;
import java.io.*;

public class ModelCrypto { 

	
		
	CharNumObject [][] charMatrix = new CharNumObject [6][6];
	CharNumObject objectSearch = new CharNumObject ();
	CharNumObject charGet = new CharNumObject ();
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
						//System.out.println(num); // for testing purposes only
						//System.out.println(" I AM IN charMatrix " + i + "   " + j); // for testing purposes only
					} //  closes if
					else {
						//System.out.println("character not in matrix entry " + i + "   " + j); // for testing purposes
					} // closes else
				} // closes innr for
			} // closes middle for
			template += num;
		}// closes outter for
		//System.out.println(template); // for testing purposes only
		return template;
	} // closes addToTemplate


	public String makeNegativeTemplate(String templ) {
		String negativeTemplate = "";
		char newChar = '*';
		for (int b = 0; b < templ.length(); b++){
			char makeToNegative = templ.charAt(b);
			switch(makeToNegative){
				case '1':
					newChar = '5';
					break;
				case '2':
					newChar = '6';
					break;
				case '3':
					newChar = '4';
					break;
				case '4':
					newChar = '3';
					break;
				case '5':
					newChar = '1';
					break;
				case '6':
					newChar = '2';
					break;
			}//closes switch
			negativeTemplate += newChar;
		}// closes for;
		return negativeTemplate;
	}// closes makeNegativeTemplate


	public String negativeTemplateDecrypt (String negTemp) {
		String fromNegativeTemplate = "";
		char nextChar = '*';
		for (int c = 0; c < negTemp.length(); c++){
			char makeFromNegative = negTemp.charAt(c);
			switch(makeFromNegative){
				case '1':
					nextChar = '5';
					break;
				case '2':
					nextChar = '6';
					break;
				case '3':
					nextChar = '4';
					break;
				case '4':
					nextChar = '3';
					break;
				case '5':
					nextChar = '1';
					break;
				case '6':
					nextChar = '2';
					break;
			}//closes switch
			fromNegativeTemplate += nextChar;
		}// closes for;
		return fromNegativeTemplate;
	} // closes passTemplate


	public String stringToLetter (String toMessage) {
		String decryptedString = "";
		char addToMessage = '?';
		int f = 0;
		for (f = 0; f < toMessage.length(); f++){
			int g = f + 1;
			int h = f + 2;
			String stringRow ="" + toMessage.charAt(f);
			int row  = Integer.parseInt(stringRow);
			String stringCol = "" + toMessage.charAt(g);
			int col = Integer.parseInt(stringCol);
			String stringEntry = "" + toMessage.charAt(h);
			int entry = Integer.parseInt(stringEntry);
			System.out.println("THIS IS THE INT AT ROW" + row);
			System.out.println("THIS IS THE INT AT COL" + col);
			System.out.println("THIS IS THE INT AT ENTRY" + entry);
			charGet = charMatrix[(row)-1][(col)-1];
			addToMessage = charGet.getCharacter(entry);
			decryptedString += addToMessage;
			f = f+2;
		} // closes outer for loop
		return decryptedString;
	} // closes stringToLetter
	
} //  closes Encrypt