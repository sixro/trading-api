package trading.broker.order;

import trading.Quote;

public interface StopOrder extends Order {

    Quote stop();
    
}
