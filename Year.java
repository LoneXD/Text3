package text3;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Year:");
		int y = input.nextInt();
		System.out.println("Enter Month:");
		int m = input.nextInt();
		System.out.println("Enter Day:");
		int d = input.nextInt();		

		int k,j,h=0;
		
		if (m>=3) {
			k=y%100;
			j=y/100;
			h=((d+(26*(m+1))/10+k+k/4+j/4+5*j)%7);
		}
		else {
			m=m+12;
			y=y-1;
			k=y%100;
			j=y/100;
			h=((d+(26*(m+1))/10+k+k/4+j/4+5*j)%7);
		}

		if(h==0)
			System.out.println("Saturday");
		else if(h==1)
			System.out.println("Sunday");
		else if(h==2)
			System.out.println("Monday");    
		else if(h==3)
			System.out.println("Tuesday");
		else if(h==4)
			System.out.println("Wednesday");
		else if(h==5)
			System.out.println("Thursday");
		else if(h==6)
			System.out.println("Friday");
	}

}
