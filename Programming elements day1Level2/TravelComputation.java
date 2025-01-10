import java.util.Scanner;

public class TravelComputation{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = input.nextLine(); //taking user name as input
		
		System.out.println("Enter From City");
		String fromCity = input.nextLine(); //taking starting city name as input
		
		System.out.println("Enter Via City");
		String viaCity = input.nextLine(); //taking via City name as input
		
		System.out.println("Enter Final City");
		String toCity = input.nextLine(); //taking final city name
		
		System.out.println("Enter distance from to via miles");
		double distanceFromToVia = input.nextDouble(); //taking distance from starting city to via city as input
		
		System.out.println("Enter distance from via to final in miles");
		double distanceViaToFinalCity = input.nextDouble(); //taking distance from via city to final city as input
		
		System.out.println("Enter time from to via in minutes");
		double timeFromToVia = input.nextDouble(); //taking time from starting city to via city (in minutes)
		
		System.out.println("Enter time from via to final in minutes");
		double timeViaToFinal = input.nextDouble(); //taking time from via city to final city (in minutes)
		
		double totalDistance = distanceFromToVia + distanceViaToFinalCity; // calculating total Distance
		
		double totalTime = timeFromToVia + timeViaToFinal; // calculating total time
		
		System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " miles and the Total Time taken is " + totalTime + " minutes");
		input.close();

   }
   
	
}
