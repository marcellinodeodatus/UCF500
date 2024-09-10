import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input variables
        System.out.println("Enter the number of laps:");
        int numLaps = scanner.nextInt();

        System.out.println("Enter the number of miles per lap:");
        double milesPerLap = scanner.nextDouble();

        System.out.println("Enter the average driving speed (miles per hour):");
        double avgSpeed = scanner.nextDouble();

        System.out.println("Enter the size of the gas tank (gallons):");
        double tankSize = scanner.nextDouble();

        System.out.println("Enter the miles per gallon of gas:");
        double mpg = scanner.nextDouble();

        System.out.println("Enter the refuel time in minutes:");
        double refuelTime = scanner.nextDouble();

        // Calculate total miles in the race
        double totalMiles = numLaps * milesPerLap;

        // Calculate how far the car can go before needing to refuel
        double milesPerTank = tankSize * mpg;

        // Calculate the number of refuels needed
        int numRefuels = (int) Math.floor(totalMiles / milesPerTank);

        // Calculate total refuel time (convert refuel time to hours)
        double totalRefuelTime = numRefuels * (refuelTime / 60.0);

        // Calculate driving time (total miles divided by average speed)
        double totalDrivingTime = totalMiles / avgSpeed;

        // Calculate total race time
        double totalRaceTime = totalDrivingTime + totalRefuelTime;

        // Calculate average speed for the race
        double avgRaceSpeed = totalMiles / totalRaceTime;

        // Output the result
        System.out.printf("The average speed for the race is %.2f miles per hour.%n", avgRaceSpeed);

        scanner.close();
    }
}
