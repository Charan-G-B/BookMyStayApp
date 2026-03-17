/**
 * Main Class
 */
public class UseCase3InventorySetup {

    public static void main(String[] args) {

        // Create room objects
        Room single = new SingleRoom();
        Room dbl = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Create inventory
        RoomInventory inventory = new RoomInventory();

        System.out.println("===== Hotel Room Inventory Status =====\n");

        System.out.println("Single Room:");
        single.displayRoomDetails();
        System.out.println("Available Rooms: " + inventory.getRoomAvailability().get("Single"));

        System.out.println("\nDouble Room:");
        dbl.displayRoomDetails();
        System.out.println("Available Rooms: " + inventory.getRoomAvailability().get("Double"));

        System.out.println("\nSuite Room:");
        suite.displayRoomDetails();
        System.out.println("Available Rooms: " + inventory.getRoomAvailability().get("Suite"));
    }
}