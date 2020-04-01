package trading.broker.order;

/**
 * Represents a <a href="https://en.wikipedia.org/wiki/Order_(exchange)#Market_order" >market order</a>.
 *
 * <p>
 * There is no difference between {@code MarketOrder} and {@code Order} interfaces, but implementation
 * should implement the former to give a more clear situation to the user of the api.
 * </p>
 */
public interface MarketOrder extends Order {
}
