package net.md_5.bungee.api.connection;

/**
 * Specifies the type of a bound port
 */
public enum EndpointType {

    /**
     * Listening for Minecraft connections (TCP)
     */
    SERVER,

    /**
     * Listening for GS4 queries (UDP)
     */
    QUERY;

}
