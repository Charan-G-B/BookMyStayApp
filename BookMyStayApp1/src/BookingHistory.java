import java.util.*;

/**
 * Stores confirmed bookings in order
 */
public class BookingHistory {

    private List<Reservation> confirmedReservations;

    public BookingHistory() {
        confirmedReservations = new ArrayList<>();
    }

    // Add confirmed booking
    public void addReservation(Reservation reservation) {
        confirmedReservations.add(reservation);
    }

    // Get all bookings
    public List<Reservation> getConfirmedReservations() {
        return confirmedReservations;
    }
}