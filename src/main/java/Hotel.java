import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> collectionOfBedrooms;
    private ArrayList<ConferenceRoom> collectionOfConferenceRooms;
    private ArrayList<Guest> guests;
    private ArrayList<Booking> bookings;
    private HashMap<String, DinningRoom> dinningRooms;

    public Hotel(ArrayList<Bedroom> collectionOfBedrooms, ArrayList<ConferenceRoom> collectionOfConferenceRooms, ArrayList<Guest> guests, ArrayList<Booking> bookings) {
        this.collectionOfBedrooms = collectionOfBedrooms;
        this.collectionOfConferenceRooms = collectionOfConferenceRooms;
        this.guests = guests;
        this.bookings = bookings;
        this.dinningRooms = new HashMap<>();
    }

    public int checkGuestListSize(){
        return this.guests.size();
    }

    public void checkIn(Guest guest) {
        this.guests.add(guest);
    }

    public void checkOut(Guest guest) {
        this.guests.remove(guest);
    }

    public void bookRoom(Bedroom bedroom, int nightsBooked){
        Booking booking;
        booking = new Booking(bedroom, nightsBooked);
        this.bookings.add(booking);

    }

    public int getBookings() {
        return bookings.size();
    }

    public void addDinningRoom(DinningRoom dinningRoom) {
        this.dinningRooms.put(dinningRoom.getName(), dinningRoom);
    }

    public int getDinningRoomsLength(){
        return this.dinningRooms.size();
    }
}
