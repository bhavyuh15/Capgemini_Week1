import java.util.Scanner;
class c2possiblehandshakes{
	public void handshakes(int numberOfStudents){
		int totalhandshakes= (numberOfStudents*(numberOfStudents - 1))/2;
		System.out.println("possible number of handshakes are " +totalhandshakes);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of students : ");
		int numberOfStudents=sc.nextInt();
		
		c2possiblehandshakes obj = new c2possiblehandshakes();
		obj.handshakes(numberOfStudents);
	}
}