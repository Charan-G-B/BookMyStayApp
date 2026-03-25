public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        System.out.println("===== Booking Cancellation =====\n");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Initialize cancellation service
        CancellationService service = new CancellationService();

        // Simulate confirmed booking (from Use Case 6)
        String reservationId = "Single-1";
        String roomType = "Single";

        service.registerBooking(reservationId, roomType);

        // Cancel booking
        service.cancelBooking(reservationId, inventory);

        // Show rollback history
        service.showRollbackHistory();

        // Show updated inventory
        System.out.println("\nUpdated " + roomType + " Room Availability: "
                + inventory.getAvailability(roomType));
    }
}