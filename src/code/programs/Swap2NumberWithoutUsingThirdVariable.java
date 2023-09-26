package code.programs;

public class Swap2NumberWithoutUsingThirdVariable {
	
	   public static void main(String args[])
	   {
	      int x=10, y=20;
	  
	      x = x + y; //30
	      y = x - y; //10
	      x = x - y; //30 - 10 = 20
	  
	      System.out.println("Swapping \nx = "+x+"\ny = "+y);
	   }
}
