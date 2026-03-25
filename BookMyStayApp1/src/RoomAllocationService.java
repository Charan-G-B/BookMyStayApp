public class RoomAllocationService {

    public void allocateRoom(Reservation r, RoomInventory inventory) {

        String type = r.getRoomType();

        if (inventory.getAvailability(type) > 0) {
            inventory.decrement(type);
            System.out.println("Booking confirmed for Guest: "
                    + r.getGuestName()
                    + ", Room ID: " + type + "-X");
        } else {
            System.out.println("No rooms available for " + r.getGuestName());
        }
    }
}