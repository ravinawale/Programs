package code.programs;

public class NullKeywordPrinting {

	 public static void main(String[] args) {

		String str = null;
		//System.out.println(null);
		int result = getNumber(null);
		System.out.println(result);
	 }
	
	 /*public static int getNumber(Object obj){
		return 1;
	 }*/
	 
	 /*public static int getNumber(String str){
	 	return 2;
	 }*/
	
	 public static int getNumber(Employee str){
		return 3;
	 }
	 
	 /*public int getNumber(StringBuilder str){
		return 3;
	 }*/
}


class Employee{
	int id;
	String name;
}

