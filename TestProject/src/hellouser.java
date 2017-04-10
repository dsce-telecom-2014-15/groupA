

import java.util.Scanner;

public class hellouser {

	public static void main(String[] args) {
		String s1="sai";
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your name:");
		
		String name = scanner.nextLine();
		System.out.println("Hello " + name + "!");
		scanner.close();// TODO Auto-generated method stub

	}

}
