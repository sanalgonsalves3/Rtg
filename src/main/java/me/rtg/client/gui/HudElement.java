package me.rtg.client.gui;

/**
 * Base class for HUD elements (FPS, CPS, Ping, Armor Status, etc.)
 */
public abstract class HudElement {
    
    protected String name;
    protected float x, y;
    protected float width, height;
    protected boolean visible = true;
    
    public HudElement(String name, float x, float y, float width, float height) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    /**
     * Render the HUD element
     */
    public abstract void render();
    
    /**
     * Update HUD element data
     */
    public abstract void update();
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public float getX() {
        return x;
    }
    
    public void setX(float x) {
        this.x = x;
    }
    
    public float getY() {
        return y;
    }
    
    public void setY(float y) {
        this.y = y;
    }
    
    public float getWidth() {
        return width;
    }
    
    public float getHeight() {
        return height;
    }
    
    public boolean isVisible() {
        return visible;
    }
    
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
