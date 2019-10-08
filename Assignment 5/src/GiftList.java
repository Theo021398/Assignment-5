

public class GiftList extends GiftBasket {
	
	private Node head;

	public GiftList() {
		this.head = null;
	}
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}else {
			return false;
		}
	}

	
	@SuppressWarnings("unused")
	public boolean isFull() {
		Node temp = new Node();
		
		if (temp == null) {
			return true;
		}else {
			temp = null;
			return false;
		}
	}
	
	public boolean AddBasketToEnd(GiftBasket giftbasket) {
		
		if (isFull()) {
			System.out.println("List is full!");
			return false;
		}else {
			Node NextBasket = new Node();
			NextBasket.setData(giftbasket);
			Node current = head;
			while(current.getNext()!=null){
				current = current.getNext();
			}
			current.getNext();
		}
		return true;
	}
	
	
	public void ShowAllGiftBaskets() {
		toString();
	}
	
}
