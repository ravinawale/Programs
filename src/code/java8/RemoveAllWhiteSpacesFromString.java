package code.java8;

public class RemoveAllWhiteSpacesFromString {
	
	public static void main(String[] args)
    {
        String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
        char[] chars = str1.toCharArray();
  
        StringBuffer sb = new StringBuffer();
  
        for (int i = 0; i <chars.length; i++){
            if( (chars[i] != ' ') && (chars[i] != '\t') ){
                sb.append(chars[i]);
            }
        } 
        
        //1. Using replaceAll() Method
        String str2 = str1.replaceAll("\\s", "");
        
        System.out.println(sb); 
    }

}
