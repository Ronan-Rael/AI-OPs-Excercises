
public class Car extends Vehicle{
	protected double insurancePerDay;
	
	public double getInsurancePerDay() {
		return insurancePerDay;
	}
	public void setInsurancePerDay(double insurancePerDay) {
		this.insurancePerDay = insurancePerDay;
	}
	@Override
	public double calculateRent() {
		return days * (ratePerDay + insurancePerDay);
	}
	@Override
	public void displayDetails() {
		System.out.println("Car | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + calculateRent());
	}
	
	Car() {
		super();
	}
	
	Car(String vehicleNumber, String model, double ratePerDay, double days){
		super(vehicleNumber, model, ratePerDay, days);
	}
}
