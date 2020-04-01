package trading.broker.order;

import trading.ISIN;
import trading.Quote;

public class OrderBuilder {

    private enum OrderType { MARKET, LIMIT, STOP, STOP_LIMIT };

    private final OrderType orderType;
    private ISIN isin;
    private int quantity;
    private PositionType position;
    private Quote stop;
    private Quote limit;

    private OrderBuilder(OrderType orderType) {
        this.orderType = orderType;
    }

    public static OrderBuilder aMarketOrder() {
        return new OrderBuilder(OrderType.MARKET);
    }

    public static OrderBuilder aLimitOrder() {
        return new OrderBuilder(OrderType.LIMIT);
    }

    public static OrderBuilder aStopOrder() {
        return new OrderBuilder(OrderType.STOP);
    }

    public static OrderBuilder aStopLimitOrder() {
        return new OrderBuilder(OrderType.STOP_LIMIT);
    }

    public OrderBuilder withIsin(ISIN isin) {
        this.isin = isin;
        return this;
    }

    public OrderBuilder withQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public OrderBuilder withPosition(PositionType position) {
        this.position = position;
        return this;
    }

    public OrderBuilder withStop(Quote stop) {
        this.stop = stop;
        return this;
    }

    public OrderBuilder withLimit(Quote limit) {
        this.limit = limit;
        return this;
    }

    public Order build() {
        return new SimpleMarketOrder(isin, quantity, position);
    }

}
