package CashBackHacker;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain900() {
    CashbackHackService service = new CashbackHackService();
    int actual = service.remain(900);
    int expected = 100;
    assertEquals(actual,expected);

    }
    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 900;
        assertEquals(actual,expected);

    }
}