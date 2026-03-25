import java.util.*;

public class RoomInventory {

    private Map<String, Integer> rooms = new HashMap<>();

    public RoomInventory() {
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);
    }

    public Map<String, Integer> getAll() {
        return rooms;
    }

    public void setRoom(String type, int count) {
        rooms.put(type, count);
    }
}