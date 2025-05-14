package day13;


class vehicle {
	void display(){
		System.out.println("Vehicle Engine Started.....");
	}
}
class car extends vehicle {
	void drive() {
		System.out.println("Car is driving....");
	}
}
class electricCar extends car{
	void chargeBattery() {
		System.out.println("Electric Car is charging.....");
	}
}
class bike extends electricCar{
	void kickstart() {
		System.out.println("Vehicle engine started....");
		System.out.println("Bike is kick-started....");
	}
}

public class main{
	public static void main (String[]args) {
		bike b = new bike();
		b.display();
		b.drive();
		b.chargeBattery();
		b.kickstart();
	}

}
