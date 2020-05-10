package codingChallange;

public class Char2String2Char_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		System.out.println("Original character is: " + c);
		String s = String.valueOf(c);
		System.out.println("char 2 String coversion: " + s);
		char conversion2Char = s.charAt(0);
		System.out.println("String 2 char conversion: " + conversion2Char);
	}

}
