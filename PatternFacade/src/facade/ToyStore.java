package facade;

public class ToyStore 
{
	public static void main(String[] args) {
		Buy bt = new Buy();
		bt.buy("Buzz lightear", 1550);
		bt.buy("Woody", 15500);
		bt.buy("Mr.Potato", 15);
		bt.buy(null, 0);
		
		System.out.println("Thank's and come back =)");
	}
}
