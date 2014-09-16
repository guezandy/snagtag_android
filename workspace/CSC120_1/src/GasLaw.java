import java.util.Scanner;

public class GasLaw {

	//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
/*----The gas constant in Joules/mole/K
    private static double GasConstant = 8.3143;
//-----------------------------------------------------------------------------
 */
 
    public static void main(String[] args) {

//----Variables to hold system values
        double Volume = 0.0;
        double Moles= 0.0;
        double Temp= 0.0;
        double pressure =0.0;
        double GasConstant= 3;

//----Gather data
        System.out.print("Enter volume, moles, temperature : ");
        Volume = keyboard.nextDouble();
        Moles  = keyboard.nextDouble();
        Temp   = keyboard.nextDouble();

//----Perform calculation
        pressure = (Moles*GasConstant*Temp)/ Volume;

//----Display results
        System.out.println("Pressure is ");
        System.out.println(pressure);
    }
}

