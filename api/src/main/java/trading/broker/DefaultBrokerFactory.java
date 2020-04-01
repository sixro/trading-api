package trading.broker;

import java.util.Iterator;
import java.util.ServiceLoader;

public class DefaultBrokerFactory implements BrokerFactory {

    @Override
    public Broker create(BrokerOptions brokerOptions) {
        ServiceLoader<Broker> loader = ServiceLoader.load(Broker.class);
        Iterator<Broker> iterator = loader.iterator();
        while (iterator.hasNext()) {
            Broker broker = iterator.next();
            if (broker.name().equalsIgnoreCase(brokerOptions.getName()))
                return broker;
        }
        throw new IllegalArgumentException("No broker matching specified options " + brokerOptions);
    }

}
