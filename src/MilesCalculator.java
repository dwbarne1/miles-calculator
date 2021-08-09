import java.util.Scanner;
public class MilesCalculator {

	public static void main(String[] args) {
		
		String airportCode = "";
		int flyerStatus = 0;
		double distance = 0;
		// The distance will be modified by both future switch statements.
		
		System.out.println("\t\t\tMiles Calculator\n\n");
		System.out.println("This program will calculate how many miles you earn on your Phoenix Air flight");
		
		System.out.println("\nDESTINATIONS");
		System.out.println("Los Angeles (LAX)\nSan Diego (SAN)\nLas Vegas (LAS)");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nEnter destination airport code: ");
		airportCode = scan.nextLine();
		
		switch(airportCode) 
		{
			case "LAX":
				distance = 369;
				break;
			case "SAN":
				distance = 304;
				break;
			case "LAS":
				distance = 255;
				break;
			default:
				distance = 0;
				System.out.printf("\nPhoenix Air does not fly to %s. There will be zero miles earned.\nPress enter to quit...", airportCode);
				scan.nextLine();
				System.exit(0);
				break;
		}
		// The user must enter one of these cases, or else the program will exit.
		
		System.out.println("\nSTATUS");
		System.out.println("1. Bronze\n2. Silver\n3. Gold\n4. Platinum");
		
		System.out.print("\nEnter frequent flyer status option (1-4): ");
		flyerStatus = Integer.parseInt(scan.nextLine());
		
		switch(flyerStatus) 
		{
			case 1:
				distance *= 1;
				break;
			case 2:
				distance *= 1.25;
				break;
			case 3:
				distance *= 1.5;
				break;
			case 4:
				distance *= 2;
				break;
			default:
				break;
		}
		// Not entering a valid frequent flyer status will assume that the distance remains the same.
		
		System.out.printf("\nYou will earn %.2f miles flying from Phoenix to %s.", distance, airportCode);
		scan.close();
	}

}
