package itemisInterviewQuestion1;

public class Product {
	private String productName;
	private double productPrice;
	private double productTax;
	private double productUnitPriceAfterTax;
	private double taxAmount;
	 
	 public Product() {
		 
	 }

	public Product(String productName, double productPrice, double productTax, double productUnitPriceAfterTax) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productTax = productTax;
		this.productUnitPriceAfterTax = productUnitPriceAfterTax;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public double getProductTax() {
		return productTax;
	}

	public void setProductTax(double productTax) {
		this.productTax = productTax;
	}

	public double getProductUnitPriceAfterTax() {
		return this.productPrice+(this.productPrice*this.productTax/100);
	}
	
	public double getTaxAmount() {
		return this.productPrice*this.productTax/100;
	}
}
