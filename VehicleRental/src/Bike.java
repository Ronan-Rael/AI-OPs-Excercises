
public class Bike extends Vehicle{
	@Override
	public double calculateRent() {
		return days * ratePerDay * 0.9;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Bike | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + calculateRent());
	}
	
	Bike() {
		super();
	}
	
	Bike(String vehicleNumber, String model, double ratePerDay, double days){
		super(vehicleNumber, model, ratePerDay, days);
	}
}
