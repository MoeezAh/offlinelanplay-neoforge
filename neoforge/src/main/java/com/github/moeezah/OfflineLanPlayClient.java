package com.github.moeezah;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

// You can use EventBusSubscriber to automatically register all static methods in the class
// annotated with @SubscribeEvent
@EventBusSubscriber(modid = OfflineLanPlay.MODID, value = Dist.CLIENT,
        bus = EventBusSubscriber.Bus.MOD)
public class OfflineLanPlayClient {

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        // Some client setup code
        OfflineLanPlay.LOGGER.info("HELLO FROM CLIENT SETUP");
        OfflineLanPlay.LOGGER.info("MINECRAFT NAME >> {}",
                Minecraft.getInstance().getUser().getName());
    }
}
