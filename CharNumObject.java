import java.util.*;

public class CharNumObject {
	
	char character1;
	char character2;
	char character3;
	int row;
	int column;
	int entry1;
	int entry2;
	int entry3;
	char charToRetrieve = ' ';
	int numTriplet = 0;

	public CharNumObject ( int r, int c, int e1, char c1, int e2, char c2, int e3, char c3) { // constructor
		character1 = c1;
		character2 = c2;
		character3 = c3;
		entry1 = e1;
		entry2 = e2;
		entry3 = e3;
		column = c;
		row = r;
	}

	public CharNumObject(){} // constructor for compiling


	public char getCharacter (int e) {
		if(e == 1) {
			charToRetrieve = character1;
		} // closes entry 1
		else if (e == 2) {
			charToRetrieve = character2;
		}// closes entry 2
		else if (e == 3) {
			charToRetrieve = character3;
		} // closes entry 3
		return charToRetrieve;
	} // closes getCharacter

	public String getNumTriplet (char character) {
		if (character == character1){
			numTriplet = entry1;
		} // closes char1
		else if(character == character2){
			numTriplet = entry2;
		} // closes char2
		else if (character == character3){
			numTriplet = entry3;
		} // closes char3
		return (row + "" + column + "" + numTriplet);
	} // closes getNumTriplet

	public boolean charInEntry(char boolCharacter) {
		return (boolCharacter == character1 || boolCharacter == character2 || boolCharacter == character3);
	}


} // closes charNumObject class

