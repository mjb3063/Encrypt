import java.util.*;

public class CryptoDriver{
	
	public static void main(String[] args){

//*************************
	char methodMenu;

		Scanner keyboard = new Scanner (System.in);
		Encrypt encryption = new Encrypt ();
		CryptoIO_Console console = new CryptoIO_Console ();
		
		String encryptFileName = "";
		String decryptFileName = "";


		do {
			methodMenu = console.getPath(); 
			switch (methodMenu) { // the program switch
				case 'E':
				case 'e':
					encryptFileName = console.getEncryptFileName();
					console.makingTemplate();
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


