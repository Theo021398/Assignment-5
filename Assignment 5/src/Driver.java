
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GiftBasket  giftlist = new GiftBasket();
		for(int i=1;i<3;i++) {
			GiftList list = new GiftList();
			list.AddBasketToEnd(giftlist);
			list.ShowAllGiftBaskets();
		}

	}

}
