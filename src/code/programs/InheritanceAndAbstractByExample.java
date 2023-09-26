package code.programs;

public class InheritanceAndAbstractByExample {

	public static void main(String[] args) {
		Integer i = new Integer(264);
		byte b = i.byteValue();
		System.out.println(b);
	}
}

abstract class MyAbstract{
	
	int a=1;
	String b="Test";
	static int aa;
	
	abstract public int getData();
	
    final int getData_1() {
		return 1;
	}
    
    public static int getData_2() {
		return 1;
	}
	
    final public int getData_3() {
		return 1;
	}
}

@FunctionalInterface
interface MyInterface{
	
	int a=0;
	String b="Test";
	static int aa=1;;
	
	public int getData();
	//public int getData_1();
	
	private int getData_() {
		return 1;
	}
	
	public default int getData_2() {
		return 1;
	}
	
	public static int getData_3() {
		return 1;
	}
}