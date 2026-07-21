package me.rtg.client;

import me.rtg.client.event.EventManager;
import me.rtg.client.feature.FeatureManager;
import me.rtg.client.gui.GuiManager;
import me.rtg.client.config.ConfigManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * RTG Client - Main entry point for the Minecraft 1.8.9 client
 * Focus: Performance, Cosmetics, and Quality-of-Life enhancements
 */
@Mod(modid = RTGClient.MODID, name = RTGClient.NAME, version = RTGClient.VERSION)
public class RTGClient {
    
    public static final String MODID = "rtgclient";
    public static final String NAME = "RTG Client";
    public static final String VERSION = "1.0.0";
    
    public static RTGClient instance;
    
    private EventManager eventManager;
    private FeatureManager featureManager;
    private ConfigManager configManager;
    private GuiManager guiManager;
    
    public RTGClient() {
        instance = this;
    }
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Initialize managers
        this.eventManager = new EventManager();
        this.configManager = new ConfigManager();
        this.featureManager = new FeatureManager();
        this.guiManager = new GuiManager();
        
        System.out.println("[RTG Client] Pre-initialization complete");
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("[RTG Client] Version " + VERSION + " initialized");
    }
    
    // Getters
    public EventManager getEventManager() {
        return eventManager;
    }
    
    public FeatureManager getFeatureManager() {
        return featureManager;
    }
    
    public ConfigManager getConfigManager() {
        return configManager;
    }
    
    public GuiManager getGuiManager() {
        return guiManager;
    }
}
