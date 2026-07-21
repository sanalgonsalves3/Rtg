package me.rtg.client.cosmetics;

/**
 * Base class for cosmetic items
 */
public abstract class Cosmetic {
    
    protected String name;
    protected String category; // e.g., "Cape", "Wings", "Animation"
    
    public Cosmetic(String name, String category) {
        this.name = name;
        this.category = category;
    }
    
    /**
     * Render the cosmetic
     */
    public abstract void render();
    
    /**
     * Update cosmetic animation/state
     */
    public abstract void update();
    
    public String getName() {
        return name;
    }
    
    public String getCategory() {
        return category;
    }
}
