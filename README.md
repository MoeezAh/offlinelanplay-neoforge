
# Offline LAN Play

This branch is for Minecraft 1.20.3 and 1.20.4.

Offline LAN Play is a NeoForge mod for Minecraft 1.20.3 and 1.20.4 that lets players join a local LAN world without regular online authentication. When the host opens a single-player world to LAN, the mod disables online-mode checks for that integrated server so trusted players on the same local network can connect more easily.

## What this mod does

- Enables offline-style LAN play for single-player worlds
- Disables authentication when a world is published to LAN
- Sends an in-game message announcing that online mode was turned off
- Keeps the change limited to the LAN server lifecycle and local network use

## Important security note

This mod is intended for trusted local networks only. Offline mode does not verify player identity, so a user can join with a custom username. Do not expose the LAN port outside your private network.

## Supported versions for this branch

- Minecraft: 1.20.3 and 1.20.4
- NeoForge: 20.4.251
- Mod ID: `offlinelanplay`

This repository may maintain separate branches for different Minecraft versions. Use the branch that matches your target version.

## Install

1. Install NeoForge for Minecraft 1.20.3 or 1.20.4.
2. Build or download the mod jar for this branch.
3. Place the jar in your instance's `mods` folder.
4. Start the game and host a world as usual.

## How to use

1. Open a single-player world.
2. Press Escape and choose **Open to LAN**.
3. Choose your LAN settings and start the world.
4. Share the LAN port or server address with trusted players on your local network.
5. Players can join from the multiplayer menu.

The mod does not create a dedicated public server or provide internet matchmaking. It only changes the LAN-integrated server behavior.

## Build from source

### Requirements

- Git
- Java 17
- NeoForge 20.4.251 compatible setup

From the repository root, build the mod with:

```powershell
.\gradlew.bat build
```

On macOS/Linux, use:

```bash
./gradlew build
```

The compiled jar will be placed in the `build/libs` folder, typically as:

```text
build/libs/offlinelanplay-neoforge-1.20.4-1.0.0.jar
```

To run the development client for this branch:

```powershell
.\gradlew.bat runClient
```

## License

This mod is currently marked as **All Rights Reserved** in the project metadata.
