package trading.broker;

import java.io.Serializable;
import java.util.Objects;

/**
 * Represents broker options used to match the desider {@link Broker}.
 *
 * @see BrokerFactory
 * @see DefaultBrokerFactory
 * @see Broker
 *
 * @author <a href="mailto:me@sixro.net" >Sixro</a>
 * @since 1.0
 */
public class BrokerOptions implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;

    public BrokerOptions(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrokerOptions that = (BrokerOptions) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "BrokerOptions{" +
                "name='" + name + '\'' +
                '}';
    }
}
