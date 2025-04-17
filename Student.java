package day9;

public class Student {
	String Name;
	int Rollno;
	long Phone;
	public static void main(String[] args) {
		
		Student std1 = new Student();
		
		std1.Name ="Arun";
		std1.Rollno =01;
		std1.Phone = 8765432109l;
		
		Student std2 = new Student();
		std2.Name ="Pari";
		std2.Rollno =02;
		std2.Phone =7890123456l;
		
		Student std3 = new Student();
		std3.Name ="Santhosh";
		std3.Rollno =03;
		std3.Phone =9012345678l;
		
		System.out.println(std2.Name);
		System.out.println(std2.Rollno);
		System.out.println(std2.Phone);
	}

}
