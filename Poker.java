package text3;

public class Poker {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		final int number_card = 52;
	    
	    int number = (int)(Math.random() * number_card);

	    System.out.print("The card you picked is ");
	    if (number % 13 == 0)
	      System.out.print("Ace of ");
	    else if (number % 13 == 10)
	      System.out.print("Jack of ");
	    else if (number % 13 == 11)
	      System.out.print("Queen of ");
	    else if (number % 13 == 12)
	      System.out.print("King of ");
	    else
	      System.out.print((number % 13) + " of ");

	    if (number / 13 == 0)
	      System.out.println("Clubs");
	    else if (number / 13 == 1)
	      System.out.println("Diamonds");
	    else if (number / 13 == 2)
	      System.out.println("Hearts");
	    else if (number / 13 == 3)
	      System.out.println("Spades");
	  }

}
