import java.util.Scanner;
public class c7numberformat{
	public static void get(String text){
		
		System.out.println(Integer.parseInt(text));
	}
	public static void handle(String text){
		
		try{
			get(text);
		}
		catch (NumberFormatException e){
			
		System.out.println("Exception " + e.getMessage());
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		handle(text);
	}
}
