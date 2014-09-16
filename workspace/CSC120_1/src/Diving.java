import java.util.Scanner;

public class Diving {
	public static Scanner keyboard = new Scanner(System.in);
	static double dive_depth = 0.0;
	static double percent_oxygen = 0.0;
	static double ambient_pressure = 0.0;
	static double ft_per_atm_constant = 33.0;
	static double PP_oxygen = 0.0;
	static boolean maximal_pressure = false;
	
	public static void main(String[] args) {
		
		System.out.println(65);
		System.out.print("Enter Depth and Percentage 02:   ");
		dive_depth = keyboard.nextDouble();
		percent_oxygen = keyboard.nextDouble();
		
		ambient_pressure= 1+(dive_depth/ft_per_atm_constant);
		System.out.print("Ambient Pressure: ");
		System.out.println(ambient_pressure);
		PP_oxygen = (percent_oxygen/100.0)*ambient_pressure;
		System.out.print("02 Pressure:  ");
		System.out.println(PP_oxygen);
		
		if (PP_oxygen >1.4 ) {
			maximal_pressure = true;
		}
		else {
			maximal_pressure = false;
		}
		
		System.out.print("Exceeds Maximal 02 Pressure: ");
		System.out.println(maximal_pressure);

	}

}
