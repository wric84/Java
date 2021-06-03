package practice;

import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char onechar;
		String name;
		String otherName;
		String str="the";
		String quote = "“The Lorax: Which way does a tree fall?"
						+ "\r\n"
						+ "The Once-ler: Uh, down?"
						+ "\r\n"
						+ "The Lorax: A tree falls the way it leans. Be careful which way you lean.”";
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Please enter a choice 'R' for the red pill or 'B' for the blue one");
		onechar =scan.next().charAt(0);
		System.out.println("Your choice is: " + onechar);
		
		System.out.println();
		scan.nextLine();
		System.out.println("Enter your name if you were a sith lord: ");
		name = scan.nextLine();
		
		System.out.println("Enter your name if you were born in the 1700's: ");
		otherName=scan.nextLine();
		
		System.out.println("Enter your mood: ");
		str=scan.next();
		
		System.out.println("Do the names match?: " +name.equals(otherName));
		System.out.println();
		System.out.println("Now do the names match?: " + name.equalsIgnoreCase(otherName));
		System.out.println();
		System.out.println(quote);
		System.out.println("this quote contains keyword '" + str + "': " +quote.contains(str));
		System.out.println(quote.substring(0, 17));
		System.out.println(quote.substring(20));
		
		scan.close();
	}

}
