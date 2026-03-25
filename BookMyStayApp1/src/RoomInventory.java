import java.util.*;

public class RoomInventory {

    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();
        roomAvailability.put("Single", 2);
        roomAvailability.put("Double", 1);
        roomAvailability.put("Suite", 1);
    }

    public int getAvailability(String roomType) {
        return roomAvailability.getOrDefault(roomType, 0);
    }

    public boolean isValidRoomType(String roomType) {
        return roomAvailability.containsKey(roomType);
    }
}