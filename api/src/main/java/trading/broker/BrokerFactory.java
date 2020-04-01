package trading.broker;

/**
 * Represents a {@link Broker} factory.
 *
 * @see DefaultBrokerFactory
 *
 * @author <a href="mailto:me@sixro.net" >Sixro</a>
 * @since 1.0
 */
public interface BrokerFactory {

    /**
     * Returns a {@link Broker} matching specified options.
     *
     * @param brokerOptions options used to match a broker
     * @return a {@link Broker}
     */
    Broker create(BrokerOptions brokerOptions);

}
