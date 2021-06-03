package practice;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num1=scan.nextInt();
		System.out.println("Enter another number: ");
		num2=scan.nextInt();
		System.out.println("And one more number: ");
		num3=scan.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1 + " is the largest number.");
			}else {
				System.out.println(num3 + " is the largest number.");
			}
		}else {
			if(num2>num3) {
				System.out.println(num2 + " is the largest number.");
			}else {
				System.out.println(num3 + " is the largest number.");
			}
		}
		scan.close();
	}

}
