package trading.broker.order;

import trading.ISIN;

import java.util.Objects;

class SimpleMarketOrder implements MarketOrder {

    private final ISIN isin;
    private final int quantity;
    private final PositionType position;

    public SimpleMarketOrder(ISIN isin, int quantity, PositionType position) {
        this.isin = isin;
        this.quantity = quantity;
        this.position = position;
    }

    @Override
    public ISIN isin() {
        return isin;
    }

    @Override
    public int quantity() {
        return quantity;
    }

    @Override
    public PositionType position() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleMarketOrder that = (SimpleMarketOrder) o;
        return quantity == that.quantity &&
                Objects.equals(isin, that.isin) &&
                position == that.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isin, quantity, position);
    }

    @Override
    public String toString() {
        return "SimpleMarketOrder{" +
                "isin=" + isin +
                ", quantity=" + quantity +
                ", position=" + position +
                '}';
    }

}
