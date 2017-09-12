package be.oak3.enums;

public class CoinApp {

	public static void main(String[] args) {
		Coin[] wallet = {Coin.FIFTY_CENTS,Coin.TWO_EURO,Coin.ONE_EURO,Coin.TEN_CENTS};
		
		int total = 0;
		for(Coin c: wallet) {
			total+= c.getValue();
			System.out.println(c);
		}
	
		System.out.println(total);
		
		
	}

}
