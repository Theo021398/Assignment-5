
public class Node  extends GiftBasket{
	private GiftBasket data;
	private Node next;
	
	public Node() {this(null, null);}
	
	public Node(GiftBasket gift) {this(gift, null);}
	
//	public Node(GiftBasket giftbasket){
//		this.data = giftbasket;
//		this.next = null;
//	}
	
	public Node(GiftBasket data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	//Getters and Setters 
	public GiftBasket getData() {
		return data;
	}

	public void setData(GiftBasket data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	

}
