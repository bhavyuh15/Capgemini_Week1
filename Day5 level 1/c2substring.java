import java.util.Scanner;
public class c2substring{

public static String ss(String s1 , int start , int end){
      String store = "";
       for (int i = start ; i <end ; i ++ ){
    	char ch = s1.charAt(i);
	   store +=ch;
	   }
	   return store;
}
  //public static boolean compare(String s1,String s2){
//	if(s1.equals(s2)){
	//	return true;
//	}
	//return false;


public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		String s2 = s1.substring(start,end);
		
String s3 = c2substring.ss(s1,start,end);
//System.out.println("the string is equal " + s2);
//System.out.println("the string is equal " + s3);
if(s2.equals(s3)){
	System.out.println("the string is equal " + s2);
}
else{
	System.out.println("the string is not equal " + s2);
}
}
}


		