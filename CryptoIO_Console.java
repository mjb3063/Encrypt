import java.util.*;


public class CryptoIO_Console {

	Scanner keyboard = new Scanner (System.in);

	public char getPath () {
		System.out.println("(E)ncrypt or (D)ecrypt?");
		char methodMenu = keyboard.nextLine().charAt(0);
		return methodMenu;
	} // closes getPath

	public String getDecryptFileName () { //gets the file that you want to decrypt
		System.out.println("Enter the File to decrypt");
		String decryptFileName = keyboard.nextLine();
		return decryptFileName;
	}// closes getDecryptFileName


	public String getEncryptFileName () { // gets the file you want to encrypt
		System.out.println("Enter the file you want to encrypt");
		String encryptFileName = keyboard.nextLine();
		return encryptFileName;
	} // closes the getEncryptFileName


	public void makingTemplate () {
		System.out.println("Taking file and making it a template");	
	} // closes makingTemplate


	public void negativeTemplate () {
		System.out.println("Getting the template from the negative");
	}


} // closes CryptoIO_Console


