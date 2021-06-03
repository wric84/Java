package practice;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a choice a number 1-9: ");
		num =scan.nextInt();
	    
		switch (num) {
		case 1:
			System.out.println("This week you will stumble across some extra change lost in your couch");
			break;
		case 2:
			System.out.println("Some homey will reach out and need some help (could be illegal, idk)");
			break;
		case 3:
			System.out.println("Something unexpected will unexpectedly happen");
			break;
		case 4:
			System.out.println("Watch your steps this week...");
			break;
		case 5:
			System.out.println("Question everything");
			break;
		case 6:
			System.out.println("Strangers will not harass you as much, but only if you give the neighborhood homeless dude a couple bucks");
			break;
		case 7:
			System.out.println("Treat yo'self to dessert tonight - you deserve it");
			break;
		case 8:
			System.out.println("Show no self-control by treating yourself - again");
			break;
		case 9:
			System.out.println("Find something positive. Hold onto that. Don't let it get crushed like everything else.");
			break;
		}

	}

}
