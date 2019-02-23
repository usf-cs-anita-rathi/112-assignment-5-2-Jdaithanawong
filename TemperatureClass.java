
public class TemperatureClass {
	public double temperature;
	public char unit;

	public TemperatureClass() {
		temperature = 0;
		unit = 'C';
	}

	public TemperatureClass(char newUnit) {
		temperature = 0;
		unit = newUnit;
	}

	public TemperatureClass(double newTemperature) {
		temperature = newTemperature;
		unit = 'C';
	}

	public TemperatureClass(double newTemperature, char newUnit) {
		temperature = newTemperature;
		unit = newUnit;
	}
	
	public double getCelcius()
	{
		if (unit == 'C')
		{
			return temperature;
		} else 
		{
			return (0.1 * Math.floor(((temperature - 32) / 1.8)*10));
		}
	}
	public double getFahrenheit()
	{
		if (unit == 'F')
		{
			return temperature;
		} else
		{
			return (0.1 * Math.floor(((temperature * 1.8) + 32)*10));
		}
	}
	public void setTemperature(double newTemperature)
	{
		temperature = newTemperature;
	}
	public void setUnit(char newUnit)
	{
		unit = newUnit;
	}
	public void setAll(double newTemperature, char newUnit)
	{
		temperature = newTemperature;
		unit = newUnit;
	}
	public double getTemperature()
	{
		return temperature;
	}
	public char getUnit()
	{
		return unit;
	}
	
	public boolean equals(TemperatureClass a)
	{
		if (this.getCelcius() == a.getCelcius())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean greaterThan(TemperatureClass a)
	{
		if (this.getCelcius() > a.getCelcius())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean lessThan(TemperatureClass a)
	{
		if (this.getCelcius() < a.getCelcius())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public String toString()
	{
		String s = ("Temperature in " + unit + " is: " + temperature);
		return s;
	}
}
