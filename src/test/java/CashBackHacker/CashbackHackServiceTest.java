package CashBackHacker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remainfrom900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    void remainfrom1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(1000);

        Assertions.assertEquals(expected,actual);

    }

}