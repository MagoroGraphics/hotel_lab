import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Mario", false);
    }

    @Test
    public void hasName(){
        assertEquals("Mario", guest.getName());
    }

    @Test
    public void hasCheckIn(){
        assertEquals(false, guest.getCheckedIn());
    }

    @Test
    public void hasNotCheckedIn(){
        guest.setCheckedIn(true);
        assertEquals(true, guest.getCheckedIn());
    }

}
