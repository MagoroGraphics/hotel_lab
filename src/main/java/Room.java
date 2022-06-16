import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private ArrayList<Guest> collectionOfGuests;

    public Room(RoomType roomType, ArrayList<Guest> collectionOfGuests) {
        this.roomType = roomType;
        this.collectionOfGuests = collectionOfGuests;
    }

    public double getPriceFromEnum(){
        return this.roomType.getPrice();
    }

}
