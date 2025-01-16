import java.util.Scanner;
public class c5outofbound{
	public static void get(String s1){
		char [] a = new char[s1.length()];
		for (int i = 0;i<=s1.length();i++){
			System.out.println(a[i] = s1.charAt(i)); 
		}
	}
	
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		try{
		c5outofbound.get(s1);
	}
	catch(StringIndexOutOfBoundsException e){
		System.out.println("exception = " + e.getMessage());
	}
	}
}