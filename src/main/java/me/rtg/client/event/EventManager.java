package me.rtg.client.event;

import java.util.*;

/**
 * Event system for client events (tick, render, key press, etc.)
 * Allows modules to subscribe to events and react to them
 */
public class EventManager {
    
    private Map<Class<?>, List<EventListener>> listeners = new HashMap<>();
    
    /**
     * Register a listener for a specific event type
     */
    public <T extends Event> void register(Class<T> eventClass, EventListener<T> listener) {
        listeners.computeIfAbsent(eventClass, k -> new ArrayList<>()).add(listener);
    }
    
    /**
     * Unregister a listener
     */
    public <T extends Event> void unregister(Class<T> eventClass, EventListener<T> listener) {
        List<EventListener> eventListeners = listeners.get(eventClass);
        if (eventListeners != null) {
            eventListeners.remove(listener);
        }
    }
    
    /**
     * Post an event to all registered listeners
     */
    @SuppressWarnings("unchecked")
    public void post(Event event) {
        List<EventListener> eventListeners = listeners.get(event.getClass());
        if (eventListeners != null) {
            for (EventListener listener : eventListeners) {
                try {
                    listener.onEvent(event);
                } catch (Exception e) {
                    System.err.println("[RTG Client] Error posting event: " + event.getClass().getSimpleName());
                    e.printStackTrace();
                }
            }
        }
    }
}
