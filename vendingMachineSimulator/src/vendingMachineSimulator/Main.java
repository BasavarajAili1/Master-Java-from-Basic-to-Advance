package vendingMachineSimulator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the Product Code,,,,");
		String productcode=scan.next();
		getproduct(productcode);
	}
	public static void getproduct(String productcode) {
		switch(productcode) {
		case "p01":
			System.out.println("Coca Cola");
			break;
		case "p02":
			System.out.println("Thums Up");
			break;
		case "p03":
			System.out.println("Appi");
			break;
		case "p04":
			System.out.println("Slice");
			break;
		case "p05":
			System.out.println("Maaza");
			break;
		case "p06":
			System.out.println("Sprite");
			break;
		default:
			System.out.println("Bindu");
		}
	}
}
