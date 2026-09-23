package com.github.moeezah;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.GameType;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

public class OfflineLanPlay implements ModInitializer {
    public static final String MODID = "offlinelanplay";
    public static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        LOGGER.info("Offline LAN Play initialized");
    }
}
