package learnStatements;

public class ProductDiscountMain {

	public static void main(String[] args) {

		Productdiscount pd = new Productdiscount();
		pd.price = 100;
		pd.isPromo5 = false;
		pd.isPromo10 = false;
		pd.isPromo20 = true;
		pd.calculateFinalDiscount();

	}

}
