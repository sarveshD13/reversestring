package StringPrograms;

public class RevStrTwo {
	
	
	public static void main(String[] args) {

		System.out.println("SARVESH");

		ReverseSTring("Sarvesh");

	}

	

	public static void ReverseSTring(String a1) {

		char[] c=a1.toCharArray();

		for(int i =c.length-1;i>=0;i--) {

			System.out.print(c[i]);

		}

	

	}
}
