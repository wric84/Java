package practice;
import java.util.Scanner;

public class CharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word = new String[3];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your favorite super hero: ");
		for(int i=0; i<word.length; i++) {
			word[i]=scan.nextLine();
		}
		
		System.out.println("Your new hero team is: ");
		for(int i=0; i<word.length;i++) {
			System.out.println(word[i]);
		}
		
	}

}
