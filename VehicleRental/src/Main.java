import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of vehicles: ");
		int vCount = sc.nextInt();
		System.out.println();
		Vehicle[] vehicles = new Vehicle[vCount];
		
		for(int i = 0; i < vCount; i++) {
			System.out.print("Enter type (1-Car, 2-Bike): ");
			int type = sc.nextInt();
			System.out.println();
			if(type == 1) {
				vehicles[i] = new Car();
			}
			else if(type == 2) {
				vehicles[i] = new Bike();
			}
			else {
				return;
			}
			
			System.out.print("Enter Vehicle Number: ");
			String number = sc.next();
			System.out.println();
			vehicles[i].setVehicleNumber(number);
			
			System.out.print("Enter Model: ");
			String model = sc.next();
			System.out.println();
			vehicles[i].setModel(model);
			
			System.out.print("Enter Rate per Day: ");
			Double rate = sc.nextDouble();
			System.out.println();
			vehicles[i].setRatePerDay(rate);
			
			System.out.print("Enter Days: ");
			Double days = sc.nextDouble();
			System.out.println();
			vehicles[i].setDays(days);
			
			if(type == 1) {
				System.out.print("Enter Insurance per Day: ");
				Double insur = sc.nextDouble();
				System.out.println();
				((Car) vehicles[i]).setInsurancePerDay(insur);
			}
		}
		
		double totalRent = 0.0;
		for(Vehicle v : vehicles) {
			v.displayDetails();
			totalRent += v.calculateRent();
		}
		System.out.println("Total Rent Collected: " + totalRent);
	}

}
