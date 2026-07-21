package me.rtg.client.event;

/**
 * Base class for all events in RTG Client
 */
public abstract class Event {
    
    private boolean cancelled = false;
    
    /**
     * Cancel this event, preventing further processing
     */
    public void cancel() {
        this.cancelled = true;
    }
    
    /**
     * Check if this event was cancelled
     */
    public boolean isCancelled() {
        return cancelled;
    }
}
