package day8;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a word to check Palindrome or not");
	String name = sc.nextLine();
	
	String rss = name.trim();
	String rs ="";
	for(int i = name.length()-1;i>=0;i--) {
		rs = rs+     name.charAt(i);
	}
	if (name.equalsIgnoreCase(rs)) {
		System.out.println("Its a palindrone");
	} else {
		System.out.println("Its not a palindrome");
	}
}
}
