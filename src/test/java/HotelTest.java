import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Guest guest1;
    Guest guest2;
    ConferenceRoom conferenceRoom1;
    ArrayList<ConferenceRoom> conferenceRoomList;
    ArrayList<Guest> guests;
    ArrayList<Bedroom> bedrooms;
    ArrayList<Booking> bookings;
    DinningRoom dinningRoom1;
    DinningRoom dinningRoom2;

    @Before
    public void before(){
        guest1 = new Guest("Mario", false);
        guest2 = new Guest("Andrew", false);
        guests = new ArrayList<Guest>();
        guests.add(guest1);
        guests.add(guest2);
        bedroom1 = new Bedroom(RoomType.SINGLE, guests, 50);
        bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroom1);
        conferenceRoom1 = new ConferenceRoom(RoomType.GROUP, guests, "Conference room1", 1);
        conferenceRoomList = new ArrayList<ConferenceRoom>();
        conferenceRoomList.add(conferenceRoom1);
        bookings = new ArrayList<Booking>();
        dinningRoom1 = new DinningRoom("Best Dinning Room", 20, guests);
        dinningRoom2 = new DinningRoom("Not so good dinning room", 5, guests);

        hotel = new Hotel(bedrooms, conferenceRoomList, guests, bookings);
    }

    @Test
    public void canCheckinGuest(){
        Guest guest3 = new Guest("John", false);
        hotel.checkIn(guest3);
        assertEquals(3, hotel.checkGuestListSize());
    }

    @Test
    public void canCheckoutGuest(){
        hotel.checkOut(guest1);
        assertEquals(1, hotel.checkGuestListSize());
    }

    @Test
    public void hasGuests(){
        assertEquals(2, hotel.checkGuestListSize());
    }

    @Test
    public void canMakeBooking(){
        hotel.bookRoom(bedroom1, 5);
        assertEquals(1, hotel.getBookings());
    }

    @Test
    public void canGetDinningRooms(){
        hotel.addDinningRoom(dinningRoom1);
        hotel.addDinningRoom(dinningRoom2);
        assertEquals(2, hotel.getDinningRoomsLength());
    }

}
