import org.junit.Test;
import xpdays.Basket;

import static org.junit.Assert.assertEquals;

public class BasketTest {
    @Test
    public void shouldAddPrices() {
        Basket basket = new Basket();

        basket.addItemToCart("Shirt", 11.0f);
        basket.addItemToCart("Socks", 1.0f);
        assertEquals(12.0, basket.getSum(), 0.001);


    }
}
