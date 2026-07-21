package me.rtg.client.cosmetics.impl;

import me.rtg.client.cosmetics.Cosmetic;

/**
 * Nametag logo cosmetic - shows "RTG CLIENT" above player names
 */
public class NametagLogo extends Cosmetic {
    
    public NametagLogo() {
        super("RTG CLIENT Logo", "Nametag");
    }
    
    @Override
    public void render() {
        // TODO: Implement nametag logo rendering
        // Shows "RTG CLIENT" above player names who use the client
    }
    
    @Override
    public void update() {
        // No animation needed for static nametag logo
    }
}
