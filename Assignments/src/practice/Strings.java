package practice;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		String str1 = "con";
		String str2 = "cat";
		String str3 = "How it happened that Mastro Cherry, carpenter, found a piece of wood that wept and laughed like a child.\r\n"
				+ "\r\n"
				+ "Centuries ago there lived—\r\n"
				+ "\r\n"
				+ "“A king!” my little readers will say immediately.\r\n"
				+ "\r\n"
				+ "No, children, you are mistaken. Once upon a time there was a piece of wood. It was not an expensive piece of wood. Far from it. Just a common block of firewood, one of those thick, solid logs that are put on the fire in winter to make cold rooms cozy and warm.\r\n"
				+ "\r\n"
				+ "I do not know how this really happened, yet the fact remains that one fine day this piece of wood found itself in the shop of an old carpenter. His real name was Mastro Antonio, but everyone called him Mastro Cherry, for the tip of his nose was so round and red and shiny that it looked like a ripe cherry.\r\n"
				+ "\r\n"
				+ "As soon as he saw that piece of wood, Mastro Cherry was filled with joy. Rubbing his hands together happily, he mumbled half to himself:\r\n"
				+ "\r\n"
				+ "“This has come in the nick of time. I shall use it to make the leg of a table.”\r\n"
				+ "\r\n"
				+ "He grasped the hatchet quickly to peel off the bark and shape the wood. But as he was about to give it the first blow, he stood still with arm uplifted, for he had heard a wee, little voice say in a beseeching tone: “Please be careful! Do not hit me so hard!”\r\n"
				+ "\r\n"
				+ "What a look of surprise shone on Mastro Cherry’s face! His funny face became still funnier.\r\n"
				+ "\r\n"
				+ "He turned frightened eyes about the room to find out where that wee, little voice had come from and he saw no one! He looked under the bench—no one! He peeped inside the closet—no one! He searched among the shavings—no one! He opened the door to look up and down the street—and still no one!\r\n"
				+ "\r\n"
				+ "“Oh, I see!” he then said, laughing and scratching his Wig. “It can easily be seen that I only thought I heard the tiny voice say the words! Well, well—to work once more.”\r\n"
				+ "\r\n"
				+ "He struck a most solemn blow upon the piece of wood.\r\n"
				+ "\r\n"
				+ "“Oh, oh! You hurt!” cried the same far-away little voice.\r\n"
				+ "\r\n"
				+ "Mastro Cherry grew dumb, his eyes popped out of his head, his mouth opened wide, and his tongue hung down on his chin.\r\n"
				+ "\r\n"
				+ "As soon as he regained the use of his senses, he said, trembling and stuttering from fright:\r\n"
				+ "\r\n"
				+ "“Where did that voice come from, when there is no one around? Might it be that this piece of wood has learned to weep and cry like a child? I can hardly believe it. Here it is—a piece of common firewood, good only to burn in the stove, the same as any other. Yet—might someone be hidden in it? If so, the worse for him. I’ll fix him!”\r\n"
				+ "\r\n"
				+ "With these words, he grabbed the log with both hands and started to knock it about unmercifully. He threw it to the floor, against the walls of the room, and even up to the ceiling.\r\n"
				+ "\r\n"
				+ "He listened for the tiny voice to moan and cry. He waited two minutes—nothing; five minutes—nothing; ten minutes—nothing.\r\n"
				+ "\r\n"
				+ "“Oh, I see,” he said, trying bravely to laugh and ruffling up his wig with his hand. “It can easily be seen I only imagined I heard the tiny voice! Well, well—to work once more!”\r\n"
				+ "\r\n"
				+ "The poor fellow was scared half to death, so he tried to sing a gay song in order to gain courage.\r\n"
				+ "\r\n"
				+ "He set aside the hatchet and picked up the plane to make the wood smooth and even, but as he drew it to and fro, he heard the same tiny voice. This time it giggled as it spoke:\r\n"
				+ "\r\n"
				+ "“Stop it! Oh, stop it! Ha, ha, ha! You tickle my stomach.”\r\n"
				+ "\r\n"
				+ "This time poor Mastro Cherry fell as if shot. When he opened his eyes, he found himself sitting on the floor.\r\n"
				+ "\r\n"
				+ "His face had changed; fright had turned even the tip of his nose from red to deepest purple.\r\n"
				+ "\r\n"
				+ "\r\n";
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a random couple of words: ");
		str=scan.nextLine();
		
		char ch1 = str3.charAt(0);
				
		System.out.println();
		//charAt
		System.out.println(ch1);
		System.out.println();
		//concat
		System.out.println(str.concat(str2));
		//replace
		System.out.println(str.replace(ch1, 'z'));
		//Uppercase
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		//Replace all replaces string
		System.out.println(str.replaceAll(str1, "sad"));
		//Boolean of string
		System.out.println(str.startsWith("cat"));
		System.out.println(str.endsWith("red"));
		System.out.println(str.trim());
		System.out.println(str3.indexOf(ch1));
		System.out.println(str3.lastIndexOf(str2));
		System.out.println(str3.length());
		System.out.println(str3.toUpperCase().replace(ch1, 'Z'));
		System.out.println(str3.indexOf(7));

	}

}
