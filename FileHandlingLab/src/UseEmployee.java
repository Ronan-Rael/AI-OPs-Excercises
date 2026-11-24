import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UseEmployee {

	public static void main(String[] args) {
		Employee[] empArr = {
				new Employee(1, "Sakuya", "Janitorial", 99999),
				new Employee(2, "Youmu", "Gardening", 88200),
				new Employee(3, "Reimu", "Religious", 0),
				new Employee(4, "Marisa", "Arcane", 20000000),
				new Employee(5, "Sanae", "Religious", 44444)
		};
		
		try (FileOutputStream fos = new FileOutputStream("twohus.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(empArr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("twohus.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);){
			Employee[] recovered = (Employee[]) ois.readObject();
			for(Employee emp : recovered) {
				System.out.println(emp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
