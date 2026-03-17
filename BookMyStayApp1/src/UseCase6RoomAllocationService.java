public class UseCase6RoomAllocationService {

    public static void main(String[] args) {

        System.out.println("===== Room Allocation Processing =====\n");

        // Create queue
        BookingRequestQueue queue = new BookingRequestQueue();

        // Add booking requests (FIFO)
        queue.addRequest(new Reservation("Abhi", "Single"));
        queue.addRequest(new Reservation("Subha", "Single"));
        queue.addRequest(new Reservation("Vanmathi", "Suite"));

        // Inventory
        RoomInventory inventory = new RoomInventory();

        // Allocation service
        RoomAllocationService allocator = new RoomAllocationService();

        // Process queue
        while (queue.hasPendingRequests()) {
            Reservation r = queue.getNextRequest();
            allocator.allocateRoom(r, inventory);
        }
    }
}