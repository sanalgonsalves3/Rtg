package me.rtg.client.event.impl;

import me.rtg.client.event.Event;

/**
 * Called every frame for rendering
 */
public class RenderEvent extends Event {
    
    private float partialTicks;
    
    public RenderEvent(float partialTicks) {
        this.partialTicks = partialTicks;
    }
    
    public float getPartialTicks() {
        return partialTicks;
    }
}
