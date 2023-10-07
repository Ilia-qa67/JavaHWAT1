import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainIfAmountIsZero() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(500);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfAmountIsDevisibleByThousand() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);

    }
}
