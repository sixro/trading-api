package trading.broker.order;

import trading.Quote;

public interface LimitOrder extends Order {

    Quote limit();

}
