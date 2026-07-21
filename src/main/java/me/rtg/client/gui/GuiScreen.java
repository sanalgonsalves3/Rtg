package me.rtg.client.gui;

/**
 * Base class for GUI screens (main menu, settings, etc.)
 */
public abstract class GuiScreen {
    
    protected String name;
    protected int width;
    protected int height;
    
    public GuiScreen(String name) {
        this.name = name;
    }
    
    /**
     * Called when the screen is opened
     */
    public abstract void onOpen();
    
    /**
     * Called when the screen is closed
     */
    public abstract void onClose();
    
    /**
     * Render the screen
     */
    public abstract void render(int mouseX, int mouseY, float partialTicks);
    
    /**
     * Handle mouse clicks
     */
    public abstract void handleMouseClick(int mouseX, int mouseY, int button);
    
    /**
     * Handle key presses
     */
    public abstract void handleKeyPress(int key, char character);
    
    // Getters
    public String getName() {
        return name;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
}
