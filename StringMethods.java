import java.util.*;

public class StringMethods {
	
	static String getFirstHalf(String text) {
		StringBuilder temp = new StringBuilder("");		
		for (int i = 0; i < text.length() / 2; i++) {
			temp.append(text.charAt(i));
		}
		return temp.toString();
	}
	
	static String getSecondHalf(String text) {
		StringBuilder temp = new StringBuilder("");		
		for (int i = text.length()/2; i < text.length(); i++) {
			temp.append(text.charAt(i));
		}
		return temp.toString();
	}
	
	static String interchange(String text) {
		StringBuilder temp = new StringBuilder("");
		temp.append(StringMethods.getSecondHalf(text)).append(StringMethods.getFirstHalf(text));
		return temp.toString();
	}
	
	static Boolean checkPalendrome(String text) {
		StringBuilder ob1 = new StringBuilder(text);
		ob1 = ob1.reverse();
		if (ob1.toString().equals(text)) return true;
		else return false;
	}
	
	static String replace2Chars(String text) {
		  StringBuilder ob = new StringBuilder("");
		  for (int i = 0; i < text.length(); i += 2) {
			  if (i + 1 < text.length() && i < text.length()) {
				  ob.append(text.charAt(i+1));
				  ob.append(text.charAt(i));
			  }
		  }
		  return ob.toString();
	}
	
	static String replaceDoubleChars (String text) {
		StringBuilder ob = new StringBuilder("");
		for (int i = 0; i < text.length(); i += 2) {
			if (i + 2 != text.length()) {
				ob.append(text.charAt(i + 2));
				ob.append(text.charAt(i + 3));
			}
		}
		return ob.toString();
	}
	
	static String getReverse(String text) {
		return new StringBuilder(text).reverse().toString();
	}
	
	static int getHash(String text) {
		return text.hashCode();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		
		if (StringMethods.checkPalendrome(text)) {
			System.out.println("The string is a palendrome");
		} else {
			System.out.println("The string is not a palendrome");
		}
		
		System.out.println("Reverse of the entered string is: " + StringMethods.getReverse(text));
		
		System.out.println("First Half of the entered string is: " + StringMethods.getFirstHalf(text));
		
		System.out.println("Second Half of the entered string is: " + StringMethods.getSecondHalf(text));
		
		System.out.println("Entered String interchanged is: " + StringMethods.interchange(text));
		
		System.out.println("Swapping[EVEN OR ODD] charecters (modified string) is: " + StringMethods.replace2Chars(text));
		
		System.out.println("Replace first 2 chars with next 2 chars: " + StringMethods.replaceDoubleChars(text));
		
		System.out.println("Hash code of the given string is: " + StringMethods.getHash(text));
	}

}
