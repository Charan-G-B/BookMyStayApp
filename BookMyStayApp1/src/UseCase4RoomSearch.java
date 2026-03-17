public class UseCase4RoomSearch {

    public static void main(String[] args) {

        // Create room objects
        Room single = new SingleRoom();
        Room dbl = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Inventory (centralized)
        RoomInventory inventory = new RoomInventory();

        // Search service (READ ONLY)
        RoomSearchService searchService = new RoomSearchService();

        // Perform search
        searchService.searchAvailableRooms(inventory, single, dbl, suite);
    }
}