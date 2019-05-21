import java.util.Scanner;
public class AirplaneTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double total = 0.0;
		int count = 0;
		Double highestTicket = 0.0;
		Double lowestTicket = Double.MAX_VALUE;
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter Number of Passengers: "); //prompt user to enter number of passengers
		int passengers = ip.nextInt();
		
		for(count = 0; count < passengers; count++) //loops for each number of passenger
		{
			System.out.print("Enter Ticket Price: $"); //prompts user to enter ticket price
			Double ticketPrice = ip.nextDouble();
			total = total + ticketPrice; //adds up total of ticket prices
			
			if(ticketPrice > highestTicket)
			{
				highestTicket = ticketPrice;
			}
			
			if(ticketPrice < lowestTicket)
			{
				lowestTicket = ticketPrice;
			}
		}
		
		//displays results
		System.out.println("Total Cost of Tickets: $" +total);
		System.out.println("Average Price of Ticket: $" +total/count);
		System.out.println("Lowest Ticket Price: $" +lowestTicket);
		System.out.println("Highest Ticket Price: $" +highestTicket);
	}

}
