package day6;

import java.util.Scanner;

public class ForLoopTask 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int iteration = sc.nextInt();
		for(int i=1; i<=iteration; i++) 
		{
			if(i%4==0)
			System.out.println(i);
		}
		System.out.println();
		for(int i=1; i<=iteration; i++) 
		{
			if(i%4==0)
			System.out.println("Abinaya");
			else
			System.out.println(i);
		}
		System.out.println();
		int count = 0;
        for (int i = 1; i <= iteration; i++) 
        {
            if (i % 3 == 0)
                count++;
        }
        System.out.println("Total numbers divisible by 3: " + count);
		sc.close();
	}
}

