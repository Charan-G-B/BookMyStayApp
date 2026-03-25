public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        System.out.println("===== System Recovery =====\n");

        String filePath = "inventory.txt";

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService persistenceService = new FilePersistenceService();

        // Load previous state
        persistenceService.loadInventory(inventory, filePath);

        // Display current inventory
        System.out.println("\nCurrent Inventory:");
        inventory.getAll().forEach((k, v) ->
                System.out.println(k + ": " + v));

        // Save current state
        persistenceService.saveInventory(inventory, filePath);
    }
}