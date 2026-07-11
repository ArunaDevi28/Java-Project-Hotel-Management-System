public class Room {

    private final int roomNumber;
    private final String roomType;
    private final double pricePerDay;
    private boolean booked;

    // Constructor
    public Room(int roomNumber, String roomType, double pricePerDay) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerDay = pricePerDay;
        this.booked = false;
    }

    // Getter Methods
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public boolean isBooked() {
        return booked;
    }

    // Setter Method
    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    // Display Room Details
    public void displayRoom() {
        System.out.println("----------------------------------");
        System.out.println("Room Number : " + roomNumber);
        System.out.println("Room Type   : " + roomType);
        System.out.println("Price/Day   : " + pricePerDay);
        System.out.println("Status      : " + (booked ? "Booked" : "Available"));
        System.out.println("----------------------------------");
    }
}