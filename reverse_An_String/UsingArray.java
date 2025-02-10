package reverse_An_String;

public class UsingArray {

	public static void main(String[] args) {
		
		String s = "hello";
		int last = s.length()-1;
		
		char ch[] = new char[last+1];
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = s.charAt(last);
			last--;
		}
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		
	}

}
