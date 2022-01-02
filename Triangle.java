package text3;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("Enter:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if (a+b>c&&b+c>a&&a+c>b)
			System.out.print(a+b+c);
		else 
			System.out.print("illegal");
	}

}
