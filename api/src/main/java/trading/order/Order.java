package trading.order;

import trading.ISIN;

public interface Order {

    ISIN isin();

    int quantity();

    PositionType position();

}
