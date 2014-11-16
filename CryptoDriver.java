import java.util.*;
import java.io.*;

public class CryptoDriver{
	
	public static void main(String[] args)throws IOException{

		CharNumObject [] [] charMatrix = new CharNumObject[6] [6];
		CharNumObject oneOne = new CharNumObject (1,1,1,'"',2,'6',3,'/');
		CharNumObject oneTwo = new CharNumObject (1,2,1,'a',2,'w',3,'D');
		CharNumObject oneThree = new CharNumObject (1,3,1,'P',2,'*',3,'-');
		CharNumObject oneFour = new CharNumObject (1,4,1,'%',2,'*',3,'[');
		CharNumObject oneFive = new CharNumObject (1,5,1,'Q',2,'0',3,'.');
		CharNumObject oneSix = new CharNumObject (1,6,1,'<',2,'|',3,'H');
		CharNumObject twoOne = new CharNumObject (2,1,1,'A',2,'r',3,'+');
		CharNumObject twoTwo = new CharNumObject (2,2,1,'O',2,'j',3,'*');
		CharNumObject twoThree = new CharNumObject (2,3,1,'C',2,'*',3,'5');
		CharNumObject twoFour = new CharNumObject (2,4,1,'!',2,'x',3,'S');
		CharNumObject twoFive = new CharNumObject (2,5,1,')',2,'*',3,'U');
		CharNumObject twoSix = new CharNumObject (2,6,1,'o',2,'*',3,'G');
		CharNumObject threeOne = new CharNumObject (3,1,1,'l',2,'B',3,'~');
		CharNumObject threeTwo = new CharNumObject (3,2,1,'(',2,'q',3,'7');
		CharNumObject threeThree = new CharNumObject (3,3,1,'i',2,'>',3,'p');
		CharNumObject threeFour = new CharNumObject (3,4,1,'e',2,'}',3,',');
		CharNumObject threeFive = new CharNumObject (3,5,1,'n',2,'\'',3,'_');
		CharNumObject threeSix = new CharNumObject (3,6,1,'\\',2,'1',3,'z');
		CharNumObject fourOne = new CharNumObject (4,1,1,'*',2,'#',3,'g');
		CharNumObject fourTwo = new CharNumObject (4,2,1,'h',2,'8',3,'*');
		CharNumObject fourThree = new CharNumObject (4,3,1,'W',2,'$',3,'v');
		CharNumObject fourFour = new CharNumObject (4,4,1,'R',2,'d',3,'u');
		CharNumObject fourFive = new CharNumObject (4,5,1,'F',2,'*',3,'@');
		CharNumObject fourSix = new CharNumObject (4,6,1,'V',2,'*',3,'I');
		CharNumObject fiveOne = new CharNumObject (5,1,1,'E',2,'{',3,':');
		CharNumObject fiveTwo = new CharNumObject (5,2,1,'M',2,'s',3,'N');
		CharNumObject fiveThree = new CharNumObject (5,3,1,'c',2,'4',3,'t');
		CharNumObject fiveFour = new CharNumObject (5,4,1,';',2,'m',3,'Z');
		CharNumObject fiveFive = new CharNumObject (5,5,1,'J',2,'y',3,'T');
		CharNumObject fiveSix = new CharNumObject (5,6,1,'2',2,'f',3,'L');
		CharNumObject sixOne = new CharNumObject (6,1,1,']',2,'*',3,'&');
		CharNumObject sixTwo = new CharNumObject (6,2,1,'9',2,'b',3,'*');
		CharNumObject sixThree = new CharNumObject (6,3,1,'X',2,'Y',3,'*');
		CharNumObject sixFour = new CharNumObject (6,4,1,'*',2,'?',3,'^');
		CharNumObject sixFive = new CharNumObject (6,5,1,'K',2,'*',3,' ');
		CharNumObject sixSix = new CharNumObject (6,6,1,'=',2,'*',3,'3');
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
		ModelCrypto encryption = new ModelCrypto ();
		CryptoIO_Console console = new CryptoIO_Console ();
		
		String encryptFileName = "";
		String decryptFileName = "";
		String messageString = "";
		String charStrand = "";
		String template = "";
		String negativeTemplate = "";
		String fromNegativeTemplate = "";
		char methodMenu;
		char testing = '?';
		char pass = 'E';


		do {
			methodMenu = console.getPath(); 
			switch (methodMenu) { // the program switch
				case 'E':
				case 'e':
					encryptFileName = console.getEncryptFileName();
					console.makingTemplate();
					encryption.getMatrix(charMatrix);
					charStrand = encryption.letterToString(encryptFileName);
					//System.out.println(charStrand); // for testing purposes only
					template = encryption.addToTemplate(charStrand);
					negativeTemplate = encryption.makeNegativeTemplate(template);
					System.out.println(negativeTemplate); // for testing purposes only
					break;
				case 'D':
				case 'd':
					decryptFileName = console.getDecryptFileName();
					console.negativeTemplate();
					encryption.getMatrix(charMatrix);
					charStrand = encryption.letterToString(decryptFileName);
					fromNegativeTemplate = encryption.negativeTemplateDecrypt(charStrand);
					System.out.println(fromNegativeTemplate); // for testing purposes only
					messageString = encryption.stringToLetter(fromNegativeTemplate);
					System.out.println(messageString); // for testing purposes only
					break;
				default:
					System.out.println("invalid, please enter either D or E");
			} // closes switch
		} while (methodMenu != 'e' && methodMenu != 'E' && methodMenu != 'D' && methodMenu != 'd');

	} // closes main

} // closes CryptoDriver


