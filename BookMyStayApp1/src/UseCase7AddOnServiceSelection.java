public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        System.out.println("===== Add-On Service Selection =====\n");

        // Example reservation ID (from Use Case 6)
        String reservationId = "Single-1";

        // Create service manager
        AddOnServiceManager manager = new AddOnServiceManager();

        // Create services
        AddOnService breakfast = new AddOnService("Breakfast", 500);
        AddOnService spa = new AddOnService("Spa", 1000);

        // Add services to reservation
        manager.addService(reservationId, breakfast);
        manager.addService(reservationId, spa);

        // Calculate total cost
        double totalCost = manager.calculateTotalServiceCost(reservationId);

        // Display result
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + totalCost);
    }
}