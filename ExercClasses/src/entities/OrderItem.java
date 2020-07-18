package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.price = product.getPrice();
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}	
	
	//Retorna o SubTotal
	public double subTotal() {
		return price * quantity;
	}
	
	public String toString() {
		String ret = "";
		
		ret += product.getName() + ", $";
		ret += String.format("%.2f", product.getPrice()) + ", Quantity:";
		ret += quantity + " Subtotal: $";
		ret += String.format("%.2f", subTotal());
				
		return ret;
	}
	
	
}
