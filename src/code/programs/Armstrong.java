package code.programs;

//Done
public class Armstrong {

	//Armstrong number is the number which is the sum of the cubes of all its unit, tens and hundred digits for three-digit numbers
	
	public static void main(String[] args)  {  
		   int c=0,a,temp;  
		   int n=153;//It is the number to check Armstrong  
		   temp=n;  
		   
		    while(n>0)  
		    {  
			   a=n%10;  //get Number
			   n=n/10;  //get place
			   c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    	System.out.println("armstrong number");   
		    else 
		        System.out.println("Not armstrong number");   
	}  
}
