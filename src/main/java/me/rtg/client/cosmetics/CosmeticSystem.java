package me.rtg.client.cosmetics;

import java.util.*;

/**
 * System for managing cosmetics (capes, wings, animations, etc.)
 */
public class CosmeticSystem {
    
    private Map<String, Cosmetic> cosmetics = new HashMap<>();
    
    public CosmeticSystem() {
        // Initialize cosmetics
        registerCosmetic(new Cape());
        registerCosmetic(new NametagLogo());
    }
    
    /**
     * Register a cosmetic
     */
    public void registerCosmetic(Cosmetic cosmetic) {
        cosmetics.put(cosmetic.getName(), cosmetic);
    }
    
    /**
     * Get a cosmetic by name
     */
    public Cosmetic getCosmetic(String name) {
        return cosmetics.get(name);
    }
    
    /**
     * Get all cosmetics
     */
    public Collection<Cosmetic> getCosmetics() {
        return cosmetics.values();
    }
}
