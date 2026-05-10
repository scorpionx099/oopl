import java.util.Scanner;

public class HotelBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int floors = 3;
        int rooms = 4;

        int[][] hotel = new int[floors][rooms];

        int choice;

        do {
            System.out.println("\n===== HOTEL BOOKING SYSTEM =====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (int i = 0; i < floors; i++) {
                        System.out.println("Floor " + (i + 1));

                        for (int j = 0; j < rooms; j++) {
                            if (hotel[i][j] == 0)
                                System.out.print("[Available] ");
                            else
                                System.out.print("[Booked] ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Enter floor number (1-3): ");
                    int floor = sc.nextInt() - 1;

                    System.out.print("Enter room number (1-4): ");
                    int room = sc.nextInt() - 1;

                    if (hotel[floor][room] == 0) {
                        hotel[floor][room] = 1;
                        System.out.println("Room booked successfully.");
                    } else {
                        System.out.println("Room already booked.");
                    }
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);

        sc.close();
    }
}