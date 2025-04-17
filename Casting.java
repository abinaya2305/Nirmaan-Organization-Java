package day7;

public class Casting {
	public static void main(String[] args) {
		System.out.println("implicit value");
		byte b =127;
		short s =(short)b;
		System.out.println(b);
		int num=10;
		long lnum=num;
		System.out.println(lnum);
		
		System.out.println("explicit value");
		short S=128;
		byte B=(byte)S;
		System.out.println();
		System.out.println(B);
		long a=230;
		int i=(int)a;
		System.out.println(i);
	}

}
