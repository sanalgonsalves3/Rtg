# RTG Client - Minecraft 1.8.9

## Overview

RTG Client is a lightweight, modern Minecraft 1.8.9 client focused on **performance**, **customization**, and **cosmetics**. Designed for PvP gameplay (BedWars, SkyWars) while maintaining compatibility with multiplayer servers.

## Features

### Performance
- FPS Optimization
- Motion Blur (optional)
- Fullbright Toggle

### Gameplay Enhancements
- Toggle Sprint
- Zoom
- Freelook
- Better Hit and Block Animations

### HUD Elements
- FPS Display
- CPS (Clicks Per Second) Counter
- Ping Display
- Armor Status
- Keystrokes Display

### Customization
- Modern Click GUI
- Custom HUD Editor (drag-and-drop)
- Crosshair Editor
- Theme Customization
- Profile/Account Manager

### Cosmetics (Client-Side)
- Custom Capes
- Wings
- Animations
- RTG CLIENT Nametag Logo (for client users)

## Project Structure

```
Rtg/
├── src/
│   ├── main/
│   │   ├── java/me/rtg/client/
│   │   │   ├── RTGClient.java (Main mod class)
│   │   │   ├── event/ (Event system)
│   │   │   ├── feature/ (Feature/module system)
│   │   │   ├── config/ (Configuration management)
│   │   │   ├── gui/ (GUI components)
│   │   │   └── cosmetics/ (Cosmetic system)
│   │   └── resources/
│   │       └── mcmod.info
├── build.gradle
└── README.md
```

## Architecture

### Event System
All client events (tick, render, key press) flow through the `EventManager`. Features subscribe to events and react accordingly.

### Feature System
Each feature (module) extends `Feature` and can be toggled independently. Features automatically subscribe to events when enabled.

### Configuration
`ConfigManager` handles loading/saving settings (JSON format).

### Cosmetics
Client-side cosmetics are registered in `CosmeticSystem` and rendered when appropriate.

## Getting Started

### Prerequisites
- Java 8+
- Gradle
- Minecraft 1.8.9 + Forge 11.15.1

### Setup

```bash
# Clone the repository
git clone https://github.com/sanalgonsalves3/Rtg.git
cd Rtg

# Setup Forge workspace
gradle setupDecompWorkspace
gradle eclipse # for Eclipse IDE
# or
gradle idea # for IntelliJ IDEA

# Build the mod
gradle build
```

## Development Roadmap

### Phase 1: Core Systems ✅
- [x] Project structure
- [x] Event system
- [x] Feature manager
- [x] Configuration manager
- [x] GUI framework
- [x] Cosmetics system

### Phase 2: Basic Features (In Progress)
- [ ] FPS Counter HUD
- [ ] Ping Display HUD
- [ ] CPS Counter
- [ ] Keystrokes Display
- [ ] Armor Status Display

### Phase 3: Gameplay Features
- [ ] Toggle Sprint
- [ ] Zoom
- [ ] Fullbright
- [ ] Freelook
- [ ] Better block/hit animations

### Phase 4: GUI System
- [ ] Click GUI Main Menu
- [ ] HUD Editor (drag-and-drop)
- [ ] Crosshair Editor
- [ ] Settings Panel

### Phase 5: Cosmetics & Polish
- [ ] Custom Capes
- [ ] Wings
- [ ] Nametag Logo System
- [ ] Theme System
- [ ] Screenshot Manager

### Phase 6: Profile System
- [ ] Account Manager
- [ ] Profile Switching
- [ ] Settings Profiles

## Building

```bash
gradle build
```

The compiled mod will be in `build/libs/`

## Installation

1. Download the latest build
2. Place in `.minecraft/mods/` folder
3. Launch Minecraft with Forge 1.8.9
4. Open the game and press `R` (configurable) to open the click GUI

## License

MIT License - See LICENSE file for details

## Contributing

Contributions are welcome! Please create a feature branch and submit a pull request.

## Support

For issues and feature requests, please open an issue on GitHub.

---

**RTG Client** - Performance, Customization, Excellence
