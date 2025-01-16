import java.util.*;
public class c1length{
	public static void length(String inputText){
		char str;
		int count = 0;
		
		for(int i = 0 ;   ; i++){
			try{
			str = inputText.charAt(i);
			count++;
			}
			catch (Exception e){
				break;
			}
		}
		System.out.println(count);
	}
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the text:");
        String inputText = scanner.next();
		length(inputText);
		
}
		}