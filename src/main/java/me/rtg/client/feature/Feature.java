package me.rtg.client.feature;

import me.rtg.client.event.Event;

/**
 * Base class for all client features/modules
 */
public abstract class Feature {
    
    protected String name;
    protected String category;
    protected boolean enabled = false;
    
    public Feature(String name, String category) {
        this.name = name;
        this.category = category;
    }
    
    /**
     * Called when the feature is enabled
     */
    public abstract void onEnable();
    
    /**
     * Called when the feature is disabled
     */
    public abstract void onDisable();
    
    /**
     * Handle events posted by the event manager
     */
    public void onEvent(Event event) {
        // Override in subclasses to handle specific events
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public String getCategory() {
        return category;
    }
    
    public boolean isEnabled() {
        return enabled;
    }
    
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        if (enabled) {
            onEnable();
        } else {
            onDisable();
        }
    }
    
    public void toggle() {
        setEnabled(!enabled);
    }
}
