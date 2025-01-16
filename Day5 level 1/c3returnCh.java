import java.util.Scanner;
public class c3returnCh{
      public static char[] returnArry(String s1){
		  char [] ret= new char[s1.length()];
		  for (int i = 0; i < s1.length();i++){
		  ret[i] =s1.charAt(i);
		  }
		  return ret;
		  }
		  
      public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		char [] a = new char[s1.length()] ;
		char [] b = new char [s1.length()] ;
		 a=s1.toCharArray();
		 b = returnArry(s1);
		boolean flag = true;
		for(int i = 0;i<s1.length(); i ++){
			if(a[i] != b[i]){
				flag= false;
				break;
			}
			
		}
			if (flag){
				System.out.println("both are equal");
			}
			else {
				System.out.println("both are not equal");
			
		
		}
	  }
}
		
		
        		