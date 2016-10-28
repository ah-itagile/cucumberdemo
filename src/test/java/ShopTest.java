import org.junit.Test;
import xpdays.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    @Test
    public void shouldAddPrices() {
        Shop shop = new Shop();
        assertEquals(0.0, shop.getSum(), 0.001);
    }
}
