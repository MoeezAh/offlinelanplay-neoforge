
# Offline LAN Play

This branch is dedicated to Minecraft 1.20.2.

This repository maintains separate branches for different Minecraft versions, and this branch is specifically for Minecraft 1.20.2. Offline LAN Play is a NeoForge mod for this version that disables the authentication check when a single-player world is opened to LAN. This lets trusted players on the same local network join without requiring Mojang account authentication.

## What the mod does

- Hooks into the integrated server publish flow when you open a world to LAN
- Calls `setUsesAuthentication(false)` on the local server
- Sends an in-game chat message confirming that offline mode has been enabled
- Keeps the change limited to LAN hosting for local play

## Important security note

This mod is intended for private, trusted local networks only. Offline mode does not verify player identity, so users can join with any username. Do not expose the LAN port to the internet or untrusted devices.

## Supported version

- Minecraft: 1.20.2
- NeoForge: 20.2.93
- Mod ID: `offlinelanplay`

## How to use

1. Start a single-player world.
2. Open the pause menu and choose **Open to LAN**.
3. Configure the LAN world settings and start it.
4. Share the LAN connection details with players on the same local network.
5. Those players can join from the multiplayer menu.

The mod does not create a public server and is not meant for internet play.

## Build from source

### Requirements

- Java 17
- Git
- NeoForge toolchain configured by the Gradle project

From the repository root, build the mod with:

```powershell
.\gradlew.bat build
```

On macOS or Linux:

```bash
./gradlew build
```

The compiled jar is output to the module's `build/libs` folder.

## Installation

1. Build the mod or obtain the generated jar.
2. Copy it into your Minecraft instance's `mods` folder.
3. Launch the game with NeoForge installed.
4. Host a world using the normal LAN flow.

## License

This project currently declares **All Rights Reserved** in its metadata.
