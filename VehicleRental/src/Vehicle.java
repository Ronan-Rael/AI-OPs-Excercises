
public class Vehicle {
	protected String vehicleNumber;
	protected String model;
	protected double ratePerDay;
	protected double days;
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getRatePerDay() {
		return ratePerDay;
	}
	public void setRatePerDay(double ratePerDay) {
		this.ratePerDay = ratePerDay;
	}
	public double getDays() {
		return days;
	}
	public void setDays(double days) {
		this.days = days;
	}
	
	public double calculateRent() {
		return days * ratePerDay;
	}
	public void displayDetails() {
		System.out.println("Unknown Type");
	}
	
	public Vehicle() {
		
	}
	
	public Vehicle(String vehicleNumber, String model, double ratePerDay, double days) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.ratePerDay = ratePerDay;
		this.days = days;
	}
}
