package practice;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Index\tValue");
		int stonks []= {32, 12, 19, 54, 2};
		
		
		for (int counter=0; counter<stonks.length;counter++) {
			System.out.println(counter + "\t" + stonks[counter]);
		}

}
}
