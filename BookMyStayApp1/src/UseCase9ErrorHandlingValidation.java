import java.util.Scanner;

public class UseCase9ErrorHandlingValidation {

    public static void main(String[] args) {

        System.out.println("===== Booking Validation =====\n");

        Scanner scanner = new Scanner(System.in);

        RoomInventory inventory = new RoomInventory();
        ReservationValidator validator = new ReservationValidator();
        BookingRequestQueue queue = new BookingRequestQueue();

        try {
            // Take input
            System.out.print("Enter Guest Name: ");
            String guestName = scanner.nextLine();

            System.out.print("Enter Room Type (Single/Double/Suite): ");
            String roomType = scanner.nextLine();

            // Validate input
            validator.validate(guestName, roomType, inventory);

            // If valid → add to queue
            Reservation reservation = new Reservation(guestName, roomType);
            queue.addRequest(reservation);

            System.out.println("Booking request added successfully!");

        } catch (InvalidBookingException e) {

            // Graceful failure handling
            System.out.println("Booking failed: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }
}