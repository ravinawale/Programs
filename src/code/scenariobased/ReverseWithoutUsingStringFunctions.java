package code.scenariobased;

public class ReverseWithoutUsingStringFunctions {
  
     public static void main(String[] args) {
          String str = "Automation";
          
          //using build in
          StringBuilder revString = new StringBuilder(str);
          revString = revString.reverse();     
          System.out.println("revString ==> "+revString);
          
          //Without Builtin
          String tempString="";
          for (int itr = str.length()-1; itr >= 0; --itr) {
        	  tempString += str.charAt(itr);
          }
          
          System.out.println(tempString);
    }
  
}