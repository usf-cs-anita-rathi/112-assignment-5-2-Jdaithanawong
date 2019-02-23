
public class Odometer {

	public int milesDriven;
	public double milesPerGallon;
	public double gasConsumed;

	public Odometer()
		{
			milesDriven = 0;
			milesPerGallon = 0;
		}
	public Odometer(int newMiles, double newMilesPerGallon)
	{
		milesDriven = newMiles;
		milesPerGallon = newMilesPerGallon;
	}
			
	
	public void resetMiles() {
		milesDriven = 0;
	}

	public int getMiles()
	{
		return milesDriven;
	}
	
	public void addMiles(int newMiles)
	{
		milesDriven += newMiles;
	}	
	
	public void setMilesPerGallon(double newMilesPerGallon) {
		 milesPerGallon = newMilesPerGallon;
	}
	public double getMilesPerGallon()
	{
		return milesPerGallon;
	}
	
	public double getGasConsumed()
	{
		return (milesDriven/milesPerGallon);
	}
}

