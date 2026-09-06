
# Offline LAN Play

Offline LAN Play is a NeoForge mod that lets players join a single-player world opened to LAN without Minecraft account authentication.

When the host selects **Open to LAN**, the mod disables authentication for that integrated server. This allows players on the same local network to connect without requiring an online account. The host and existing players receive an in-game message confirming that online mode was disabled.

## Important security note

Offline mode does not verify player identities. A connecting player can choose any username, including the name of another player. Use this mod only on a private, trusted network and do not expose the LAN port to the public internet.

## Supported versions

This repository contains separate builds for these Minecraft and NeoForge versions:

| Module | Minecraft | NeoForge |
| --- | --- | --- |
| `neoforge-1.20.5-1.21.11` | 1.20.5 through 1.21.11 | 21.0.167 |
| `neoforge-26.1-26.1.2` | 26.1.2 | 26.1.2.102 |
| `neoforge-26.2` | 26.2 | 26.2.0.76 |

Install the jar built for the exact Minecraft and NeoForge version you are running. The mod id is `offlinelanplay`.

## Installing the mod

1. Install the matching NeoForge version for your Minecraft instance.
2. Download or build the corresponding `offlinelanplay-neoforge-*.jar`.
3. Place the jar in the instance's `mods` folder.
4. Start Minecraft with NeoForge on the host and every player who will connect.

## Using the mod

1. Open a single-player world.
2. Open the pause menu and choose **Open to LAN**.
3. Configure the game mode and commands, then select **Start LAN World**.
4. Share the displayed port with trusted players on the same network. They can join from **Multiplayer**.

The mod does not create a dedicated server, change world permissions, or provide internet matchmaking. It only changes authentication when an integrated server is published to LAN.

## Building from source

### Requirements

- Git
- Java 21 or newer for the 1.20.5-1.21.11 module
- Java 25 for the 26.1.2 and 26.2 modules

The project includes a Gradle wrapper, so a separate Gradle installation is not required. From the repository root, run the module-specific build you need:

```powershell
.\gradlew.bat :neoforge-1.20.5-1.21.11:build
.\gradlew.bat :neoforge-26.1-26.1.2:build
.\gradlew.bat :neoforge-26.2:build
```

On macOS or Linux, use `./gradlew` instead of `./gradlew.bat`.

The compiled jar is written to the selected module's `build/libs` directory. For example:

```text
neoforge-26.2/build/libs/offlinelanplay-neoforge-26.2-1.0.0.jar
```

To launch the development client for a module, run its client task:

```powershell
.\gradlew.bat :neoforge-26.2:runClient
```

Replace `neoforge-26.2` with the module you are developing.

## License and project links

This mod is currently marked **All Rights Reserved** in its NeoForge metadata. NeoForge documentation is available at <https://docs.neoforged.net/>.
