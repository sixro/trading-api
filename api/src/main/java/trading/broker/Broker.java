package trading.broker;

/**
 * Represents a trading broker.
 *
 * @see BrokerFactory
 * @see DefaultBrokerFactory
 *
 * @author <a href="mailto:me@sixro.net" >Sixro</a>
 * @since 1.0
 */
public interface Broker {

    /**
     * Returns the name of this broker.
     *
     * @see BrokerOptions#getName()
     *
     * @return name of this broker
     */
    String name();

}
