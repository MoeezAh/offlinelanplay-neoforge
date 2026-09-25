package com.github.moeezah;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(OfflineLanPlay.MODID)
public class OfflineLanPlay {
    public static final String MODID = "offlinelanplay";
    public static final Logger LOGGER = LogUtils.getLogger();

    public OfflineLanPlay(IEventBus modEventBus) {
        // FMLCommonSetupEvent is fired on the mod event bus in Forge 1.20.x
        modEventBus.addListener(this::onCommonSetup);
    }

    public void onCommonSetup(net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM CLIENT SETUP");
        LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }

    @net.minecraftforge.eventbus.api.SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info(MODID + ": Server starting.");
    }
}
