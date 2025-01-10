import java.util.Scanner;
public class code12L1{
	public  static void main(String args[]){
		Scanner input = new Scanner(System.in);
			System.out.println("enter height"); 
			double height = input.nextDouble();
			System.out.println("enter base");
			double base = input.nextDouble();
			double area = 0.5 * height * base; // formula of area of triangle
			double inches = area * 0.3937;     //converting area in inches
			System.out.println("your area of triangle in cm is " +area+ " and in inches is " + inches );
		}
}