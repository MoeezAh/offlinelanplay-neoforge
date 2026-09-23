package com.github.moeezah;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.GameType;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.bus.api.IEventBus;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(OfflineLanPlay.MODID)
public class OfflineLanPlay {
    public static final String MODID = "offlinelanplay";
    public static final Logger LOGGER = LogUtils.getLogger();

    public OfflineLanPlay(IEventBus modEventBus) {
        modEventBus.addListener(this::onClientSetup);
    }

    public void onClientSetup(net.minecraftforge.event.lifecycle.FMLClientSetupEvent event) {
        LOGGER.info("HELLO FROM CLIENT SETUP");
        LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }

    @net.minecraftforge.eventbus.api.SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info(MODID + ": Server starting.");
    }
}
