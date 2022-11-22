package CashBackHacker;

import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void testRemain900() {
    CashbackHackService service = new CashbackHackService();
    int actual = service.remain(800);
    int expected = 100;
    assertEquals(actual,expected);

    }
    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 1000;
        assertEquals(actual,expected);

    }

}