package text3;

import java.util.Scanner;

public class SRP {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int computer = (int)(Math.random()*3);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter:");
		int player = input.nextInt();
		
		if ( computer+player == 0||computer+player==4||(computer==1&&player==1))
			System.out.print("It is a draw");
		else if ((computer== 0 && player == 1 )||(computer== 1 && player == 2 )||(computer== 2 && player == 0 ))
			System.out.print("computer win");
		else
			System.out.print("player win");
		
	}

}
