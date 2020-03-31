package trading.order;

import trading.Quote;

public interface LimitOrder extends Order {

    Quote limit();

}
