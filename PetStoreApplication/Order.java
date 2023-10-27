package PetStoreApplication;

//Order (orderId, petId, quantity, status)
public class Order {

	private int OrderId;
	private int petId;
	private int quantity;
	private Status status;
	private static int idGenerator = 0;

	public Order(int petId, int quantity) {
		super();

		OrderId = ++idGenerator;
		this.petId = petId;
		this.quantity = quantity;
		this.status = Status.PLACED;
	}

	
	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public static int getIdGenerator() {
		return idGenerator;
	}

	public static void setIdGenerator(int idGenerator) {
		Order.idGenerator = idGenerator;
	}

	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", petId=" + petId + ", quantity=" + quantity + ", status=" + status + "]";
	}

}
