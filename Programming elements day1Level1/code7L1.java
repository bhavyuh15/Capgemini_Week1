public class code7L1{
	public static void main(String args[]){
		double radius = 6378.00;
	double kilometers = (4/3 )*3.14*(radius*radius*radius);           //formula of volume of sphere
	double miles = (4/3) * 3.14 * (radius*radius*radius )* 0.621;     // converting in miles
	System.out.println(" The volume of earth in cubic kilometer is " +kilometers + " and cubic mile is " + miles);
}}