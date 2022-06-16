import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        guest1 = new Guest("Mario", false);
        guest2 = new Guest("Andrew", false);
        guests = new ArrayList<Guest>();
        guests.add(guest1);
        guests.add(guest2);
        bedroom = new Bedroom(RoomType.DOUBLE, guests, 79);
        booking = new Booking(bedroom, 6);
    }

    @Test
    public void canCalculateTotalPrice(){
        assertEquals(540.0, booking.calculateTotalPrice(bedroom), 0.0);
    }
}
