import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();

        int choice;

        do {
            System.out.println("\n========== HOTEL MANAGEMENT ==========");
            System.out.println("1. Add New Room");
            System.out.println("2. View Available Rooms");
            System.out.println("3. Book Room");
            System.out.println("4. Checkout Room");
            System.out.println("5. Search Room");
            System.out.println("6. Total Available Rooms");
            System.out.println("7. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Room Number: ");
                    int roomNumber = sc.nextInt();
                    sc.nextLine(); // Clear buffer

                    System.out.print("Enter Room Type (Single/Double/Deluxe): ");
                    String roomType = sc.nextLine();

                    System.out.print("Enter Price Per Day: ");
                    double price = sc.nextDouble();

                    Room room = new Room(roomNumber, roomType, price);
                    hotel.addRoom(room);
                    break;

                case 2:
                    hotel.viewAvailableRooms();
                    break;

                case 3:
                    System.out.print("Enter Room Number to Book: ");
                    int bookRoom = sc.nextInt();
                    hotel.bookRoom(bookRoom);
                    break;

                case 4:
                    System.out.print("Enter Room Number to Checkout: ");
                    int checkoutRoom = sc.nextInt();
                    hotel.checkoutRoom(checkoutRoom);
                    break;

                case 5:
                    System.out.print("Enter Room Number to Search: ");
                    int searchRoom = sc.nextInt();
                    hotel.searchRoom(searchRoom);
                    break;

                case 6:
                    hotel.totalAvailableRooms();
                    break;

                case 7:
                    System.out.println("Thank You for Using Hotel Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 7);

        sc.close();
    }
}