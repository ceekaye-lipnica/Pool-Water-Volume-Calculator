import java.util.Scanner;
import java.math.BigDecimal;

public class PoolVolume {
	
	static void poolCapacity(double a, double b, double c, double d) {
		
		double volume = (a * b * c);
		double capacity = (volume * 7.48);
		
		poolFillTime(capacity, d);
	}
	
	static double poolFillTime(double x, double y) {
		
		double poolCapacity = x, poolRate = y;
		double fillTime, time;
		int mins;
				
		fillTime = (poolCapacity / poolRate + 0.5);
		time = (fillTime / 60);
		
		BigDecimal toHour = new BigDecimal(String.valueOf(time));
		int hours = toHour.intValue();
				
		mins = (int)(time);
		mins = (int)((time - mins) * 60 ); 
				
		System.out.println("\n");
		System.out.println("= = = = = = = = = = = = = =  ANSWER = = = = = = = = = = = = = =  ");
		System.out.println("\nThe time to fill the pool is approxiamately: " + hours + " hour(s) and " + mins + " minute(s)");
		
		return 0;
	}

	public static void main(String[] args) {
		
		System.out.println("Program by: Chelsea Kate M. Lipnica");
		System.out.println("BSIT 2 - 1");
		System.out.println("Activity 2.2");
				
		System.out.println("\n= = = = = = = = = = = = = =  START = = = = = = = = = = = = = =  ");
		System.out.println("\n");
		
		Scanner pool = new Scanner(System.in);
		double length, width, depth, rate;
		
		System.out.println("Enter the length of the pool: ");
		length = pool.nextDouble();
		
		System.out.println("Enter the width of the pool: ");
		width = pool.nextDouble();
		
		System.out.println("Enter the depth of the pool (in feet): ");
		depth = pool.nextDouble();
		
		System.out.println("Enter the rate of the water (in gallons per minute): ");
		rate = pool.nextDouble();
		
		poolCapacity(length, width, depth, rate);
	}

}
