package practice;
import java.util.Scanner;

public class CountingVowels {
   public static void main(String args[]){
      int countVowels = 0;
      int countConts = 0;
      System.out.println("Enter a sentence :");
      Scanner sc = new Scanner(System.in);
      String sentence = sc.nextLine();

      for (int i=0 ; i<sentence.length(); i++){
         char ch = sentence.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
            countVowels ++;
         }else{
        	 countConts++;
         }
      }
      System.out.println("Number of vowels in the given sentence is "+countVowels);
      System.out.println("Number of vowels in the given sentence is "+countConts);
   }
}
