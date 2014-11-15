import java.util.*;
import java.io.*;

public class CryptoDriver{
	
	public static void main(String[] args)throws IOException{

//*************************
	char methodMenu;

		Scanner keyboard = new Scanner (System.in);
		Encrypt encryption = new Encrypt ();
		CryptoIO_Console console = new CryptoIO_Console ();
		
		String encryptFileName = "";
		String decryptFileName = "";
		String charStrand = "";


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


