import java.util.Scanner;

public class TemperatureTest {
	public static void main(String[] args) {
		TemperatureClass Temp1, Temp2, Temp3, Temp4, Temp5, Temp6, Temp7, Temp8, Temp9, Temp10, Temp11, Temp12;
		Temp1 = new TemperatureClass();
		Temp4 = new TemperatureClass();

		Scanner input = new Scanner(System.in);
		System.out.println("Testing no-argument constructor");
		System.out.println(Temp1.toString());
		System.out.println("Testing constructor with unit as instance variable, please input either C or F.");
		char unit2 = input.next().charAt(0);
		Temp2 = new TemperatureClass(unit2);
		System.out.println(Temp2.toString());
		System.out.println("Testing constructor with temperature as instance variable, please input a number.");
		double temperature3 = input.nextDouble();
		Temp3 = new TemperatureClass(temperature3);
		System.out.println(Temp3.toString());
		System.out
				.println("Testing constructor with both instance variables as parameters. Please input either C or F");
		char unit4 = input.next().charAt(0);
		System.out.println("and a number");
		double temperature4 = input.nextDouble();
		Temp4 = new TemperatureClass(temperature4, unit4);
		System.out.println(Temp4.toString());

		System.out.println("Testing accessor methods on Temp4 class"
				+ "\n(the one created through testing of the constructor that takes both instance variables as parameters)");
		System.out.println("getCelsius method: ");
		System.out.println(Temp4.getCelcius());
		System.out.println("getFahrenheit method: ");
		System.out.println(Temp4.getFahrenheit());

		System.out.println("Testing all 3 mutator methods on Temp4 class object. ");

		System.out.println("Please input a new temperature to test mutator method for temperature: ");
		double temperature41 = input.nextDouble();
		Temp4.setTemperature(temperature41);
		System.out.println("new temperature in the class object is now " + Temp4.getTemperature());
		System.out.println("Please input a new unit to test mutator method for unit: ");
		char unit41 = input.next().charAt(0);
		Temp4.setUnit(unit41);
		System.out.println("new temperature in the class object is now " + Temp4.getUnit());
		System.out.println("Will now test mutator method that sets both instance variables. "
				+ "\n Please input a new temperature:");
		double temperature42 = input.nextDouble();
		System.out.println("Please input a new unit: ");
		char unit42 = input.next().charAt(0);
		Temp4.setAll(temperature42, unit42);
		System.out.println("toString method for class object Temp4 now returns: " + "'" + Temp4.toString() + "'");

		System.out.println("Testing equals method.");
		System.out.println(
				"For this test, 6 new temperature class objects were created. These class objects are the following.");
		Temp5 = new TemperatureClass(0, 'C');
		Temp6 = new TemperatureClass(32, 'F');
		Temp7 = new TemperatureClass(-40, 'C');
		Temp8 = new TemperatureClass(-40, 'F');
		Temp9 = new TemperatureClass(100, 'C');
		Temp10 = new TemperatureClass(212, 'F');
		System.out.println("Temp5 whose " + Temp5.toString());
		System.out.println("Temp6 whose " + Temp6.toString());
		System.out.println("Temp7 whose " + Temp7.toString());
		System.out.println("Temp8 whose " + Temp8.toString());
		System.out.println("Temp9 whose " + Temp9.toString());
		System.out.println("Temp10 whose " + Temp10.toString());
		System.out.println("Temp5 will be compared to 6, 7 to 8, and 9 to 10.");
		if (Temp5.equals(Temp6)) {
			System.out.println("Temp5 is equal to Temp6");
		} else {
			System.out.println("Temp5 is not equal to Temp6");
		}
		if (Temp7.equals(Temp8)) {
			System.out.println("Temp7 is equal to Temp8");
		} else {
			System.out.println("Temp7 is not equal to Temp8");
		}
		if (Temp9.equals(Temp10)) {
			System.out.println("Temp9 is equal to Temp10");
		} else {
			System.out.println("Temp9 is not equal to Temp10");
		}
		Temp11 = new TemperatureClass(112, 'C');
		Temp12 = new TemperatureClass(0, 'F');
		System.out.println("To test the greaterThan and lessThan method, Temp4 will be compared to Temp11, whose "
				+ Temp11.toString() + "and Temp12, whose " + Temp12.toString());
		if (Temp4.greaterThan(Temp11)) {
			System.out.println("Temp4 is greater than Temp11");
		} else if (Temp4.lessThan(Temp11)) {
			System.out.println("Temp4 is less than Temp11");
		} else {
			System.out.println("Temp4 is equal to Temp11");
		}

		if (Temp4.greaterThan(Temp12)) {
			System.out.println("Temp4 is greater than Temp12");
		} else if (Temp4.lessThan(Temp12)) {
			System.out.println("Temp4 is less than Temp12");
		} else {
			System.out.println("Temp4 is equal to Temp12");
		}
	}
}
