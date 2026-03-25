import java.util.*;

public class RoomInventory {

    private Map<String, Integer> rooms = new HashMap<>();

    public RoomInventory() {
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);
    }

    public int getAvailability(String type) {
        return rooms.getOrDefault(type, 0);
    }

    public void decrement(String type) {
        rooms.put(type, getAvailability(type) - 1);
    }

    public Map<String, Integer> getAll() {
        return rooms;
    }
}
