package itemisInterviewQuestion1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Output1");
		
		ProductTaxFree book= new ProductTaxFree();
		book.setProductName("1 book");
		book.setProductPrice(12.49);
		book.setProductTax(0);
		book.getProductUnitPriceAfterTax();
		book.getTaxAmount();
		
		System.out.println(book.getProductName()+ ": "+ book.getProductUnitPriceAfterTax());
		
		ProductNormal musicCd= new ProductNormal();
		musicCd.setProductName("1 music CD");
		musicCd.setProductPrice(14.99);
		musicCd.setProductTax(10);
		musicCd.getProductUnitPriceAfterTax();
		musicCd.getTaxAmount();
		System.out.println( musicCd.getProductName()+ ": " + musicCd.getProductUnitPriceAfterTax() );
		
		ProductTaxFree chocolateBar= new ProductTaxFree();
		chocolateBar.setProductName("1 chocolate bar");
		chocolateBar.setProductPrice(0.85);
		chocolateBar.setProductTax(0);
		chocolateBar.getProductUnitPriceAfterTax();
		chocolateBar.getTaxAmount();
		System.out.println( chocolateBar.getProductName()+ ": " + chocolateBar.getProductUnitPriceAfterTax() );
		

		double salesTexas =book.getTaxAmount()+ chocolateBar.getTaxAmount()+ musicCd.getTaxAmount();
		int precision=100;
		salesTexas= Math.floor(salesTexas * precision +.2)/precision;
		System.out.println("Sales Taxes: "+ salesTexas);
		
		double total=book.getProductUnitPriceAfterTax() + 
				chocolateBar.getProductUnitPriceAfterTax()+musicCd.getProductUnitPriceAfterTax();
		int precision2=100;
		total= Math.floor(total * precision2 +.5)/precision2;
		System.out.println("Totel "+total);
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("Output2");
		
		ProductImported chocolate = new ProductImported();
		chocolate.setProductName("1 imported box of chocolates");
		chocolate.setProductPrice(10.00);
		chocolate.setProductTax(5);
		chocolate.getProductUnitPriceAfterTax();
		chocolate.getTaxAmount();
		System.out.println( chocolate.getProductName()+ ": " + chocolate.getProductUnitPriceAfterTax() );
		
		
		ProductImported perfume1 = new ProductImported();
		perfume1.setProductName("1 imported bottle of perfume");
		perfume1.setProductPrice(47.5);
		perfume1.setProductTax(10+5);
		perfume1.getTaxAmount();
		perfume1.getProductUnitPriceAfterTax();
		System.out.println(perfume1.getProductName() + ": " + perfume1.getProductUnitPriceAfterTax() );
		
		double salesTexas2 =chocolate.getTaxAmount()+ perfume1.getTaxAmount();
		int precision2A=100;
		salesTexas2= Math.floor(salesTexas2 * precision2A +.2)/precision2A;
		System.out.println("Sales Taxes: "+ salesTexas2);
		
		double total2=chocolate.getProductUnitPriceAfterTax() + perfume1.getProductUnitPriceAfterTax();
		int precision2B=100;
		total2= Math.floor(total2 * precision2B +.5)/precision2B;
		System.out.println("Totel "+total2);
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Output3");
		
		ProductImported perfume2 = new ProductImported();
		perfume2.setProductName("1 imported bottle of perfume");
		perfume2.setProductPrice(27.99);
		perfume2.setProductTax(15);
		perfume2.getTaxAmount();
		perfume2.getProductUnitPriceAfterTax();
		System.out.println(perfume2.getProductName() + ": " + perfume2.getProductUnitPriceAfterTax() );
		
		ProductNormal perfume3 = new ProductNormal();
		perfume3.setProductName("1 bottle of perfume");
		perfume3.setProductPrice(18.99);
		perfume3.setProductTax(10);
		perfume3.getTaxAmount();
		perfume3.getProductUnitPriceAfterTax();
		System.out.println(perfume3.getProductName() + ": " + perfume3.getProductUnitPriceAfterTax() );
		
		ProductTaxFree pills = new ProductTaxFree();
		pills.setProductName("1 packet of headache pills");
		pills.setProductPrice(9.75);
		pills.setProductTax(0);
		pills.getTaxAmount();
		pills.getProductUnitPriceAfterTax();
		System.out.println(pills.getProductName() + ": " + pills.getProductUnitPriceAfterTax() );
		
		ProductImported chocolateBar2 = new ProductImported();
		chocolateBar2.setProductName("1 imported box of chocolates");
		chocolateBar2.setProductPrice(11.25);
		chocolateBar2.setProductTax(5);
		chocolateBar2.getTaxAmount();
		chocolateBar2.getProductUnitPriceAfterTax();
		System.out.println(chocolateBar2.getProductName() + ": " + chocolateBar2.getProductUnitPriceAfterTax() );
		
		
		double salesTexas3 =perfume2.getTaxAmount()+ perfume3.getTaxAmount()+ pills.getTaxAmount()+ chocolateBar2.getTaxAmount();
		int precision3A=100;
		salesTexas3= Math.floor(salesTexas3 * precision3A +.2)/precision3A;
		System.out.println("Sales Taxes: "+ salesTexas3);
		
		double total3=perfume2.getProductUnitPriceAfterTax() + perfume3.getProductUnitPriceAfterTax()+
				pills.getProductUnitPriceAfterTax()+ chocolateBar2.getProductUnitPriceAfterTax();
		int precision3B=100;
		total3= Math.floor(total3 * precision3B +.5)/precision3B;
		System.out.println("Totel "+total3);
		
		System.out.println("-----------------------------------------------------------------");
		
			
	}
}
	
