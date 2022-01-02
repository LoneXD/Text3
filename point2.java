package text3;

import java.util.Scanner;

public class point2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);

	    System.out.print("Enter a point with two coordinates: ");
	    double x = input.nextDouble();
	    double y = input.nextDouble();

	    double hDistance = Math.pow(x * x, 0.5);
	    
	    double vDistance = Math.pow(y * y, 0.5);

	    if (hDistance <= 5 && vDistance <= 2.5)
	      System.out.println("Point (" + x + ", " + y + 
	        ") is in the rectangle");
	    else
	      System.out.println("Point (" + x + ", " + y + 
	        ") is not in the rectangle");
	  }

}
