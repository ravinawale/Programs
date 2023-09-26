package code.scenariobased;

public class VarLenghtWithMainMethod {

	public static void main(String... args) {
		System.out.println("Testing ...");
	}
}

class One {
	public static void main(String... args) {
		System.out.println("One ...");
	}
}

class Two extends One{
	public static void main(String... args) {
		System.out.println("Two .. ");
		main("Test",args);
	}
	public static void main(String r,String... args) {
		System.out.println("Overloaded Main ..."+r);
	}
}
