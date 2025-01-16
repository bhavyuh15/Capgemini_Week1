import java.util.Scanner;
public class c6illegalargument{
	public static void sub(String s1 , int start , int end){
		if(start>=s1.length() ||end >=s1.length()){
			throw new IllegalArgumentException (" Start and end index should be smaller than the ending index ");
		}
		else{
			String s2= s1.substring(start,end);
			System.out.println(s2);
		}
	}
	public static void handleexception(String s1,int start , int end){
		try{
			sub(s1,start,end);
		}
		catch (IllegalArgumentException e){
			System.out.println("Exception " + e.getMessage());
		}
	}
	
public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();

		
		int start = sc.nextInt();
		int end = sc.nextInt();
		handleexception(s1,start,end);
		
}
}