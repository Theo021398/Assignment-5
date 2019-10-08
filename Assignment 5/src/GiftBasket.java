
public class GiftBasket {

	public int id;
	public String type;
	public float cost;
	
	public GiftBasket() {
		this.id = 1234;
		this.type = "";
		this.cost = 0;
	}
	
	public GiftBasket(int id, String type, float cost) {
		super();
		this.id = id;
		this.type = type;
		this.cost = cost;
	}
	
	public GiftBasket (GiftBasket giftbasket) {
		this.id = giftbasket.id;
		this.type = giftbasket.type;
		this.cost = giftbasket.cost;
	}
	
	//Getters and setters 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "GiftBasket [id=" + id + ", type=" + type + ", cost=" + cost + "]";
	}
	
	public void display() {
		toString();
	}
}
