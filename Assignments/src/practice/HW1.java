package practice;
import java.util.Scanner;

public class HW1 {

	static int num1;
	static int num2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String method;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num1=scan.nextInt();
		System.out.println("Enter another number: ");
		num2=scan.nextInt();
		System.out.println("What form of math would you like to do with these numbers?: ");
		method=scan.next();
	    
//		if(method == "add" || method == "subtract" || method == "multiply" || method == "divide" || method == "exit") {
			switch (method) {
			case "add":
				Addition();
				break;
			case "subtract":
				Subtraction();
				break;
			case "multiply":
				Multiplication();
				break;
			case "divide":
				Division();
				break;
			case "exit":
				System.out.println("Thank you for using Colton's mathematical caluculation method. Please come again!");
				System.exit(0);
				break;
			default:
				System.out.println("Sorry, incorrect input. Please try again");	
				break;
			}
//		}else {
//			System.out.println("Sorry, incorrect input. Please try again");	
//		}
		scan.close();
	}
	public static void Addition() {
		System.out.println("When you add these together you get: " + (num1 + num2));
	}
	public static void Subtraction() {
		System.out.println("When you subtract these numbers you get: " + (num1-num2));
	}
	public static void Multiplication() {
		System.out.println("When you multiply these numbers you get: " + (num1*num2));
	}
	public static void Division() {
		System.out.println("When you divide these numbers you get: " + (num1/num2) + "." + (num1%num2));
	}
}
