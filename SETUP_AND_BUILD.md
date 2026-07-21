# RTG Client - Setup & Build Guide

## Prerequisites
- **Java Development Kit (JDK)** 8 or higher
- **Gradle** (included via wrapper)
- **Minecraft 1.8.9** + **Forge 11.15.1.2318**

## Quick Setup & Build

### Step 1: Clone & Enter Directory
```bash
git clone https://github.com/sanalgonsalves3/Rtg.git
cd Rtg
```

### Step 2: Setup Forge Development Environment

**For Windows:**
```bash
gradlew.bat setupDecompWorkspace
gradlew.bat eclipse
```

**For macOS/Linux:**
```bash
./gradlew setupDecompWorkspace
./gradlew eclipse
```

Or for **IntelliJ IDEA** instead:
```bash
./gradlew idea
```

### Step 3: Build the JAR

**For Windows:**
```bash
gradlew.bat build
```

**For macOS/Linux:**
```bash
./gradlew build
```

### Step 4: Find Your JAR File
After building, your mod JAR will be located at:
```
build/libs/RTGClient-1.0.0-release.jar
```

## Installation for Testing

### Method 1: Forge Mods Folder (Easiest)
1. Locate your Minecraft folder (`.minecraft`)
2. Create a `mods` folder if it doesn't exist
3. Copy `RTGClient-1.0.0-release.jar` into the `mods` folder
4. Launch Minecraft with Forge 1.8.9
5. Open to single-player or multiplayer to test

### Method 2: Run Gradle Dev Environment
```bash
./gradlew runClient
```
This will launch Minecraft in development mode with your mod loaded.

## Testing Checklist

- [ ] Client loads without crashes
- [ ] Check console for "[RTG Client]" messages
- [ ] Test in single-player world
- [ ] Test in multiplayer server
- [ ] Verify GUI opens (press `R` key by default)

## Troubleshooting

### Build Fails with "Not a valid Forge distribution"
```bash
./gradlew clean
./gradlew setupDecompWorkspace
./gradlew build
```

### Gradle Command Not Found
- Make sure you're in the `Rtg` directory
- Use `./gradlew` (macOS/Linux) or `gradlew.bat` (Windows)

### Mod doesn't load in Minecraft
1. Verify Forge 11.15.1.2318 is installed for 1.8.9
2. Check Minecraft logs: `.minecraft/logs/latest.log`
3. Look for RTG Client errors in the console

## Development Workflow

1. **Make code changes** in `src/main/java/me/rtg/client/`
2. **Rebuild:** `./gradlew build`
3. **Test:** Copy JAR to mods folder and restart Minecraft
4. Or use `./gradlew runClient` to test directly

## Next Steps
- Start implementing HUD elements
- Add feature modules
- Customize the GUI

---

**Need help?** Check the README.md for more information about the project structure.
