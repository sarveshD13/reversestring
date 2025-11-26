package StringPrograms;

public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println("Original String : SARVESH");
		System.out.print("Reverse String : ");
		reverseString("SARVESH");
	}
	
	public static void reverseString(String name) {
		char[] characters=name.toCharArray();
		for(int i =characters.length-1;i>=0;i--) {
			System.out.print(characters[i]);
		}
	}
}


