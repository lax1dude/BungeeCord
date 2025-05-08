package net.md_5.bungee.api.event;

import java.net.SocketAddress;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import net.md_5.bungee.api.config.ListenerInfo;
import net.md_5.bungee.api.connection.EndpointType;
import net.md_5.bungee.api.plugin.Event;

/**
 * Event called when a listener is closed
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ProxyUnbindEvent extends Event
{

    /**
     * The local address of the channel
     */
    private SocketAddress bindAddress;
    /**
     * The listener's configuration data
     */
    private ListenerInfo listenerInfo;
    /**
     * The type of connection being listened for
     */
    private EndpointType endpointType;

}
