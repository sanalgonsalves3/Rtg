package me.rtg.client.event.impl;

import me.rtg.client.event.Event;

/**
 * Called when the player attacks
 */
public class AttackEvent extends Event {
    
    private Object entity;
    
    public AttackEvent(Object entity) {
        this.entity = entity;
    }
    
    public Object getEntity() {
        return entity;
    }
}
