package practice;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String name;
		String str;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=scan.nextInt();
		
		System.out.println("Enter a word: ");
		str=scan.next();
		
		scan.nextLine();
		System.out.println("Enter your name: ");
		name=scan.nextLine();
		
		System.out.println("The number is: " + num);
		System.out.println("The name you entered is: " + name);
		


	}

}
