package code.programs;

//Done 
public class PalindromeNumber {

	public static void main (String[] args) {
        
		String original="tata";
        String reverse =  new StringBuilder(original).reverse().toString();
        
        if(original.equals(reverse)) 
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not a palindrome");
        
        /*String rev="";
        for (int i = original.length()-1; i >= 0; i--) {
        	rev = rev+original.charAt(i);
		}
        System.out.println("rev "+rev);*/
    }
}
