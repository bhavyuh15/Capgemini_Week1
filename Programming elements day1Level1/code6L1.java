public class code6L1{
	public static void main(String args[]){
		int fee = 125000;
		int discountPercent = 10;
		int discount = (125000*10)/100;    //finding the discount
		int finalPrice=125000-discount;    // finding the final price
		System.out.println("The discount amount is INR " + discount+ " and the final discounted ffee is INR " + finalPrice);
}}