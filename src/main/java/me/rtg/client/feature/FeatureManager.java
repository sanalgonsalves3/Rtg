package me.rtg.client.feature;

import java.util.*;

/**
 * Manages all client features/modules
 */
public class FeatureManager {
    
    private List<Feature> features = new ArrayList<>();
    
    public FeatureManager() {
        // Features will be registered here
    }
    
    /**
     * Register a feature
     */
    public void registerFeature(Feature feature) {
        features.add(feature);
    }
    
    /**
     * Get a feature by name
     */
    public Feature getFeature(String name) {
        return features.stream()
                .filter(f -> f.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
    
    /**
     * Get all features in a category
     */
    public List<Feature> getFeaturesByCategory(String category) {
        return features.stream()
                .filter(f -> f.getCategory().equalsIgnoreCase(category))
                .toList();
    }
    
    /**
     * Get all features
     */
    public List<Feature> getFeatures() {
        return new ArrayList<>(features);
    }
}
