package text3;

import java.util.Scanner;

public class point {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("Enter a point with two coordinates: ");
		
		Scanner input = new Scanner(System.in);
		
	    double x = input.nextDouble();
	    double y = input.nextDouble();

	    double distance = Math.pow(x * x +  y * y, 0.5);
	    
	    if (distance <= 10)
	      System.out.println("Point (" + x + ", " + y + 
	        ") is in the circle");
	    else
	      System.out.println("Point (" + x + ", " + y + 
	        ") is not in the circle");
	}

}
