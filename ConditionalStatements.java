package day4;

import java.util.Scanner;

public class ConditionalStatements {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your mark: ");
	int mark  = sc.nextInt();
	
	if (mark >=70 && mark <=100) {
		System.out.println("Pass Good");
		if (mark >=90)
			System.out.println("A");
		else if (mark >=80)
			System.out.println("B");
		else 
		System.out.println("C");
	}
	else if (mark >=35 && mark <=70) {
		System.out.println("Pass Average");
		if(mark >=60)
			System.out.println("A");
		else if(mark >=50)
			System.out.println("B");
		else
			System.out.println("c");
	}
	else{
	    System.out.println("Fail");
	   
	}
	
}
}
