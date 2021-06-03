package practice;

public class Part3 {

	public static void yourMethod() {
		// TODO Auto-generated method stub
		System.out.println("Yay, first");
	}
	private static int arithmetic() {
		return 27%4; 
	}
	static void arithmetic (int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		yourMethod();
		int sum = arithmetic();
		System.out.println(arithmetic());
		
		arithmetic(24, 90);
	}

}
