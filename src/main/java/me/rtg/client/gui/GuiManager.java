package me.rtg.client.gui;

import java.util.*;

/**
 * Manages all GUI screens and HUD elements
 */
public class GuiManager {
    
    private List<HudElement> hudElements = new ArrayList<>();
    private List<GuiScreen> screens = new ArrayList<>();
    
    public GuiManager() {
        // GUI initialization
    }
    
    /**
     * Register a HUD element
     */
    public void registerHudElement(HudElement element) {
        hudElements.add(element);
    }
    
    /**
     * Register a GUI screen
     */
    public void registerScreen(GuiScreen screen) {
        screens.add(screen);
    }
    
    /**
     * Get all HUD elements
     */
    public List<HudElement> getHudElements() {
        return new ArrayList<>(hudElements);
    }
    
    /**
     * Get all screens
     */
    public List<GuiScreen> getScreens() {
        return new ArrayList<>(screens);
    }
}
