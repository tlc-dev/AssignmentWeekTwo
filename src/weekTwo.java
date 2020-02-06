
public class weekTwo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			boolean isHotOutside = true;
			boolean isWeekday = false;
			boolean hasMoneyInPocket = true;
				
			double costOfMilk = 4.99;
			double moneyInWallet = 0;
			int thirstLevel = 4;
			
			
			//Ice Cream and Swimming vars
			boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket; //ice cream
			System.out.println("Should buy ice cream evals to: " + shouldBuyIceCream);
			
			boolean willGoSwimming = isHotOutside == true && isWeekday == false;
			System.out.println("Should swim eval: " + willGoSwimming);
		
			boolean isAGoodDay = isHotOutside && hasMoneyInPocket && isWeekday == false;
			System.out.println("Is it a good day? " + isAGoodDay);
			
			boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && (moneyInWallet == (costOfMilk * 2));
			System.out.println("Will buy milk: " + willBuyMilk);
	}

}
