import java.util.Scanner;

public class Kangaroos {

	public static Scanner keyboard = new Scanner(System.in);
	
	static double sideLength = 0.0;
	static double roadLength = 0.0;
	static double kangaroos = 0.0;
	
	
	
	public static void main(String[] args) {
		System.out.println("Please Input: The length of side of land: ");
		sideLength = keyboard.nextDouble();
		System.out.println("Please Input: The length of road within land: ");
		roadLength = keyboard.nextDouble();
		System.out.println("Please Input: The number of kangaroos in area: ");
		kangaroos = keyboard.nextDouble();
		
		double kan_density = kangaroos/(sideLength*sideLength);
		double road_area = roadLength*0.01;
		double roos_killed = kan_density*road_area*1.47;
		System.out.println("Expected number of Roo's killed is: ");
		System.out.println(roos_killed);

	}

}
