package text3;

import java.util.Scanner;

public class ISBM {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("Enter:");
		
		long dig = input.nextLong();
		long sum,d1,d2,d3,d4,d5,d6,d7,d8,d9,dig2 = 0;
		
		dig2 = dig;
		d9 = dig % 10;
		dig = dig / 10;
		d8 = dig % 10;
		dig = dig / 10;
		d7 = dig % 10;
		dig = dig / 10;
		d6 = dig % 10;
		dig = dig / 10;
		d5 = dig % 10;
		dig = dig / 10;
		d4 = dig % 10;
		dig = dig / 10;
		d3 = dig % 10;
		dig = dig / 10;
		d2 = dig % 10;
		dig = dig / 10;
		d1 = dig % 10;
		
		sum = d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9;
		System.out.print(dig2);
		if (sum%11 == 10)
			System.out.print("X");
		else 
			System.out.print(sum%11);
		
		
		
	}

}
