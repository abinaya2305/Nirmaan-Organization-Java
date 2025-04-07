package day3;

import java.util.Scanner;

public class VariablesAndOpertors {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the first number:  ");
		int num1 = a. nextInt();
		System.out.print("Enter the second number:  ");
		int num2 = a. nextInt();
		System.out.println();
		System.out.println("Arithmetic Operations: ");
		System.out.println("Addition: "+(num1 + num2));
		System.out.println("Subtraction: "+(num1 - num2));
		System.out.println("Multipulacation: "+(num1 * num2));
		System.out.println("Division: "+(num1 / num2));
		System.out.println("Modulus: "+(num1 % num2));
		System.out.println();
		System.out.println("Relational Operations: ");
		System.out.println("12 > 25: "+(num1 > num2));
		System.out.println("12 < 25: "+(num1 < num2));
		System.out.println("12 >= 25: "+(num1 >= num2));
		System.out.println("12 <= 25: "+(num1 <= num2));
		System.out.println("12 == 25: "+(num1 == num2));
		System.out.println("12 != 25: "+(num1 != num2));
		System.out.println();
		System.out.println("Logical Operations:");
		System.out.println(("(12 > 10 AND 25 < 50): ") + ((num1 > 10)&&(num2 < 50)));
		System.out.println(("(12 < 5 OR 25 > 100): ") + ((num1 < 5)||(num2 > 100)));
		System.out.println();
		System.out.println("Assignment Operation:");
		int c = 10;
		System.out.println("Initial value: "+ c);
		c += 12;
		System.out.println("After += :"+(c));
		c -= 12;
		System.out.println("After -= :"+(c));
		c *= 12;
		System.out.println("After *= :"+(c));
		c /= 12;
		System.out.println("After /= :"+(c));
		c %= 12;
		System.out.println("After %= :"+ (c));
		System.out.println();
		System.out.println("Unary Operations:");
		int d =12;
		System.out.println("Intial value: "+ d);
		d++;
		System.out.println("After increment: "+ d);
		d--;
		System.out.println("After decrement: "+ --d);
		
	}

}
