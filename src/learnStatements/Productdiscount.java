package learnStatements;

public class Productdiscount {
	double price;
	double discount;
	boolean isPromo5;
	boolean isPromo10;
	boolean isPromo20;
   
	void calculateFinalDiscount(){
		if(isPromo5)
			{
			discount=(price*50)/100 - (price*5)/100;
			System.out.println("the final price is" + discount);
			}
		else if (isPromo10)
			{
		discount=(price*50)/100 - (price*10)/100;
			System.out.println("the final price is" + discount);
			}
			else if (isPromo20)
			{
		discount=(price*50)/100 - (price*20)/100;
			System.out.println("the final price is" + discount);
			}
			else
			{
			discount=(price*50)/100;
			System.out.println("the final price is" + discount);
			}	
	}
}

		
	
// *************** another method *************** //

 // public class Productdiscount {
//	double price;
//	String promoCode;
//	double discount;
// 		void calculateFinalDiscount(){

        //    if(promoCode="promo5")
        //   {
        //    	discount=(price*50)/100 - (price*5)/100;
        //    	system.out.println("the final price is" + discount);
        //    }
       //     else if (promoCode="promo10")
       //    {
       //     	discount=(price*50)/100 - (price*10)/100;
       //     	system.out.println("the final price is" + discount);
       //     }
        //    else if (promoCode="promo20")
        //    {
        //    	discount=(price*50)/100 - (price*20)/100;
        //    	system.out.println("the final price is" + discount);
        //   }
       //     else
       //     {
       //     	discount=(price*50)/100;
       //     	system.out.println("the final price is" + discount);
		//	}
        //    }




	
