import java.util.ArrayList;

public class Bedroom extends Room {

    private int RoomNumber;

    public Bedroom(RoomType roomType , ArrayList<Guest> collectionOfGuests, int roomNumber) {
        super(roomType, collectionOfGuests);
        RoomNumber = roomNumber;
    }


}
