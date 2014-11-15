import java.util.*;
import java.io.*;

public class CryptoDriver{
	
	public static void main(String[] args)throws IOException{

//*************************
		CharNumObject [] [] charMatrix = new CharNumObject[] [];
		CharNumObject oneOne = new CharNumObject ();
		CharNumObject oneTwo = new CharNumObject ();
		CharNumObject oneThree = new CharNumObject ();
		CharNumObject oneFour = new CharNumObject ();
		CharNumObject oneFive = new CharNumObject ();
		CharNumObject oneSix = new CharNumObject ();
		CharNumObject twoOne = new CharNumObject ();
		CharNumObject twoTwo = new CharNumObject ();
		CharNumObject twoThree = new CharNumObject ();
		CharNumObject twoFour = new CharNumObject ();
		CharNumObject twoFive = new CharNumObject ();
		CharNumObject twoSix = new CharNumObject ();
		CharNumObject threeOne = new CharNumObject ();
		CharNumObject threeTwo = new CharNumObject ();
		CharNumObject threeThree = new CharNumObject ();
		CharNumObject threeFour = new CharNumObject ();
		CharNumObject threeFive = new CharNumObject ();
		CharNumObject threeSix = new CharNumObject ();
		CharNumObject fourOne = new CharNumObject ();
		CharNumObject fourTwo = new CharNumObject ();
		CharNumObject fourThree = new CharNumObject ();
		CharNumObject fourFour = new CharNumObject ();
		CharNumObject fourFive = new CharNumObject ();
		CharNumObject fourSix = new CharNumObject ();
		CharNumObject fiveOne = new CharNumObject ();
		CharNumObject fiveTwo = new CharNumObject ();
		CharNumObject fiveThree = new CharNumObject ();
		CharNumObject fiveFour = new CharNumObject ();
		CharNumObject fiveFive = new CharNumObject ();
		CharNumObject fiveSix = new CharNumObject ();
		CharNumObject sixOne = new CharNumObject ();
		CharNumObject sixTwo = new CharNumObject ();
		CharNumObject sixThree = new CharNumObject ();
		CharNumObject sixFour = new CharNumObject ();
		CharNumObject sixFive = new CharNumObject ();
		CharNumObject sixSix = new CharNumObject ();
		charMatrix [0][0] = oneOne;
		charMatrix [0][1] = oneTwo;
		charMatrix [0][2] = oneThree;
		charMatrix [0][3] = oneFour;
		charMatrix [0][4] = oneFive;
		charMatrix [0][5] = oneSix;
		charMatrix [1][0] = twoOne;
		charMatrix [1][1] = twoTwo;
		charMatrix [1][2] = twoThree;
		charMatrix [1][3] = twoFour;
		charMatrix [1][4] = twoFive;
		charMatrix [1][5] = twoSix;
		charMatrix [2][0] = threeOne;
		charMatrix [2][1] = threeTwo;
		charMatrix [2][2] = threeThree;
		charMatrix [2][3] = threeFour;
		charMatrix [2][4] = threeFive;
		charMatrix [2][5] = threeSix;
		charMatrix [3][0] = fourOne;
		charMatrix [3][1] = fourTwo;
		charMatrix [3][2] = fourThree;
		charMatrix [3][3] = fourFour;
		charMatrix [3][4] = fourFive;
		charMatrix [3][5] = fourSix;
		charMatrix [4][0] = fiveOne;
		charMatrix [4][1] = fiveTwo;
		charMatrix [4][2] = fiveThree;
		charMatrix [4][3] = fiveFour;
		charMatrix [4][4] = fiveFive;
		charMatrix [4][5] = fiveSix;
		charMatrix [5][0] = sixOne;
		charMatrix [5][1] = sixTwo;
		charMatrix [5][2] = sixThree;
		charMatrix [5][3] = sixFour;
		charMatrix [5][4] = sixFive;
		charMatrix [5][5] = sixSix;

		Scanner keyboard = new Scanner (System.in);
		Encrypt encryption = new Encrypt ();
		CryptoIO_Console console = new CryptoIO_Console ();
		
		String encryptFileName = "";
		String decryptFileName = "";
		String charStrand = "";
		char methodMenu;


		do {
			methodMenu = console.getPath(); 
			switch (methodMenu) { // the program switch
				case 'E':
				case 'e':
					encryptFileName = console.getEncryptFileName();
					console.makingTemplate();
					charStrand = encryption.letterToString(encryptFileName);
					System.out.println(charStrand); // for testing purposes only
					break;
				case 'D':
				case 'd':
					decryptFileName = console.getDecryptFileName();
					break;
				default:
					System.out.println("invalid, please enter either D or E");
			} // closes switch
		} while (methodMenu != 'e' && methodMenu != 'E' && methodMenu != 'D' && methodMenu != 'd');

	} // closes main

} // closes CryptoDriver


