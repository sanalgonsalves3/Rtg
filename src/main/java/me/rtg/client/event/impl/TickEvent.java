package me.rtg.client.event.impl;

import me.rtg.client.event.Event;

/**
 * Called every game tick
 */
public class TickEvent extends Event {
    
    public enum Phase {
        PRE, POST
    }
    
    private Phase phase;
    
    public TickEvent(Phase phase) {
        this.phase = phase;
    }
    
    public Phase getPhase() {
        return phase;
    }
}
