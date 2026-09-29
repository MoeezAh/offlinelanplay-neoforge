package com.github.moeezah;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(OfflineLanPlay.MODID)
public class OfflineLanPlay {
    public static final String MODID = "offlinelanplay";
    public static final Logger LOGGER = LogUtils.getLogger();

    public OfflineLanPlay() {
        // FMLCommonSetupEvent is fired on the mod event bus in Forge 1.20.x
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::onCommonSetup);

        // Game events (like ServerStartingEvent) are fired on Forge's main event bus;
        // @SubscribeEvent methods must be explicitly registered there.
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void onCommonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM CLIENT SETUP");
        LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info(MODID + ": Server starting.");
    }
}
