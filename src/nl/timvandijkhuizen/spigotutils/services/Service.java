package nl.timvandijkhuizen.spigotutils.services;

public interface Service {

    /**
     * Returns the handle of the service.
     * 
     * @return
     */
    @Deprecated(since = "1.2.0", forRemoval = true)
    public default String getHandle() {
        throw new RuntimeException("Handle has not been set");
    }

    /**
     * Called when the service is created.
     * 
     * @throws Throwable
     */
    public default void init() throws Throwable {
        
    }

    /**
     * Called when the service is loaded.
     * 
     * @throws Throwable
     */
    public default void load() throws Throwable {
        
    }

    /**
     * Called when the service is unloaded.
     * 
     * @throws Throwable
     */
    public default void unload() throws Throwable {
        
    }

}
