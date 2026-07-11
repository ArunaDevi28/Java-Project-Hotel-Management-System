import java.util.ArrayList;

public class Hotel {

    private final ArrayList<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
    }

    // Add Room
    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room Added Successfully.");
    }

    // View Available Rooms
    public void viewAvailableRooms() {

        boolean found = false;

        for (Room room : rooms) {

            if (!room.isBooked()) {
                room.displayRoom();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Rooms Available.");
        }
    }

    // Book Room
    public void bookRoom(int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {

                if (!room.isBooked()) {

                    room.setBooked(true);
                    System.out.println("Room Booked Successfully.");

                } else {

                    System.out.println("Room Already Booked.");
                }

                return;
            }
        }

        System.out.println("Room Not Found.");
    }

    // Checkout
    public void checkoutRoom(int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {

                if (room.isBooked()) {

                    room.setBooked(false);
                    System.out.println("Checkout Successful.");

                } else {

                    System.out.println("Room is Already Available.");
                }

                return;
            }
        }

        System.out.println("Room Not Found.");
    }

    // Search Room
    public void searchRoom(int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {

                room.displayRoom();
                return;
            }
        }

        System.out.println("Room Not Found.");
    }

    // Count Available Rooms
    public void totalAvailableRooms() {

        int count = 0;

        for (Room room : rooms) {

            if (!room.isBooked()) {
                count++;
            }
        }

        System.out.println("Available Rooms : " + count);
    }
}