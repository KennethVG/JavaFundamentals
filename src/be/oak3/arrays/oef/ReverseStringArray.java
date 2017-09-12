package be.oak3.arrays.oef;

public class ReverseStringArray {
	public static void main(String[] args) {
		
		/*** Originele String ***/
		String string = new String("Java Developer");
		System.out.print("Originele String: " + string);
		
		/*** In een array stoppen van karakters ***/
		char [] array = string.toCharArray();
		
		/*** Een andere array aanmaken met dezelfde karakters maar dan in omgekeerde volgorde ***/
		char [] reverseArray = new char[array.length];
			
		System.out.println();
		
		/*** De reverseArray vullen met de correcte waarden ***/
		int n = array.length;
		for (int i = 0; i < array.length; i++) {
			reverseArray[i] = array[--n];
		}		
		
		/*** de reverseArray terug in String formaat plaatsen en afdrukken ***/
		String reverseString = String.copyValueOf(reverseArray);
		System.out.println("Reverse String: " + reverseString);		
	}
}
