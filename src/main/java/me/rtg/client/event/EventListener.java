package me.rtg.client.event;

/**
 * Functional interface for event listeners
 */
@FunctionalInterface
public interface EventListener<T extends Event> {
    void onEvent(T event);
}
