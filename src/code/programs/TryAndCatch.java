package code.programs;

import java.util.Optional;

public class TryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = getName("test");
		System.out.println(result);
		
		String data = null;
		
		System.out.println("Data >> "+Optional.ofNullable(null));
	}

	
	
	public static int getName(String str){
		try
		{
		   int i=  1/0;
		   //return 1;
		}catch(ArithmeticException ex){
		    return 2;
		}
		catch(Exception ex){
		    return 3;
		}
		finally{
			return 3;
		}
	}
}

class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}

