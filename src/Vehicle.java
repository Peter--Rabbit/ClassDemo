
public class Vehicle {
	private String type;
	private int wheels;
	private boolean isFast;
	
	public Vehicle(String tp, int wls, boolean ifa) {
		type = tp;
		wheels = wls;
		isFast = ifa;
		
	}
	
	public String getType() {
		return type;
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public boolean getIsFast() {
		return isFast;
	}
	
}
