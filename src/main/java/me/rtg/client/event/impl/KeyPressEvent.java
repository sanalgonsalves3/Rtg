package me.rtg.client.event.impl;

import me.rtg.client.event.Event;

/**
 * Called when a key is pressed
 */
public class KeyPressEvent extends Event {
    
    private int key;
    
    public KeyPressEvent(int key) {
        this.key = key;
    }
    
    public int getKey() {
        return key;
    }
}
