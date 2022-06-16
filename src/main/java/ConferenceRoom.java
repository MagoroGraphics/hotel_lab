import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private String name;
    private int numOfTables;

    public ConferenceRoom(RoomType roomType, ArrayList<Guest> collectionOfGuests, String name, int numOfTables) {
        super(roomType, collectionOfGuests);
        this.name = name;
        this.numOfTables = numOfTables;
    }
}
