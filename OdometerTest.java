import java.util.Scanner;
public class OdometerTest {
public static void main(String[] args)
{
	Odometer odometer1;
	odometer1 = new Odometer();
	System.out.println("Setting how many miles have been driven: " );
	Scanner input = new Scanner(System.in);
	int additionalMiles = input.nextInt();
	odometer1.addMiles(additionalMiles);
	System.out.println("new value for 'miles': " + odometer1.getMiles());
	System.out.println("Setting Fuel Efficiency (in mpg): ");
	double newMilesPerGallon = input.nextDouble();
	odometer1.setMilesPerGallon(newMilesPerGallon);
	System.out.println("new value for fuel efficiency: " + odometer1.getMilesPerGallon());
	System.out.println("Calling accessor method to return how much gas has been consumed: "
	+ odometer1.getGasConsumed());
	System.out.println("Mutator method to reset miles driven has just been called.");
	odometer1.resetMiles();
	System.out.println("new value for miles driven = " + odometer1.getMiles());
	System.out.println("Calling accessor method to return gas consumed since last odometer reset = " 
	+ odometer1.getGasConsumed());
	input.close();
}
}
