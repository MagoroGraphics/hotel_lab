import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DinningRoomTest {

    DinningRoom dinningRoom;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        guest1 = new Guest("Mario", false);
        guest2 = new Guest("Andrew", false);
        guests = new ArrayList<Guest>();
        guests.add(guest1);
        dinningRoom = new DinningRoom("Best Dinning Room", 10, guests);
    }

    @Test
    public void hasName(){
        assertEquals("Best Dinning Room", dinningRoom.getName());
    }
}
