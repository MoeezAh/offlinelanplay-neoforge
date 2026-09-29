package com.github.moeezah;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class OfflineLanPlay implements ModInitializer {
    public static final String MODID = "offlinelanplay";
    public static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Offline LAN Play initialized");
    }
}
