package code.programs;

//Done
public class FibonacciSeries {

	public static void main(String[] args) {
        int num=10, a = 0,b=0, c =1;
        
        System.out.println("Fibonacci Series of the number is:");
        for (int i=0; i<num; i++) {
            a = b;
            b = c;
            c = a+b;
            System.out.println(a + "");    
        }       
    }
}
