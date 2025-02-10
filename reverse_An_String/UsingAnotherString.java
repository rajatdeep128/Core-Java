package reverse_An_String;

public class UsingAnotherString {

	public static void main(String[] args) {

		String s = "Hello";
		String s1 = "";	
		for (int i = s.length()-1; i>=0; i--) {
			s1 = s1+s.charAt(i);
		}
		System.out.print(s1);				
	}
}
