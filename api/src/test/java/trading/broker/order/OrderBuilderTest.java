package trading.broker.order;

import org.junit.Test;
import trading.ISIN;

import static org.junit.Assert.*;

public class OrderBuilderTest {

    @Test public void create_market_order() {
        Order marketOrder = OrderBuilder.aMarketOrder()
                .withIsin(ISIN.fromString("IE00BKM4GZ66"))
                .withQuantity(100)
                .withPosition(PositionType.LONG)
                .build();
        assertTrue(marketOrder instanceof MarketOrder);
    }

    // TODO test creation limit order
    // TODO test creation stop order
    // TODO test creation stop limit order

}