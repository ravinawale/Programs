package code.scenariobased;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		String str = "ravi aarush";
		System.out.println(removeWhiteSpaces(str)); // true
		System.out.println(reverse(str)); // true
	}
	
	static String removeWhiteSpaces(String input) {
		StringBuilder output = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for (char c : charArray) {
			if (!Character.isWhitespace(c))
				output.append(c);
		}
		
		return output.toString();
	}
	
	static String reverse(String input) {
		StringBuilder output = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for (int i = charArray.length-1; i >= 0; i--) {
			char c = charArray[i];
			output.append(c);
		}
		
		return output.toString();
	}
	

}
