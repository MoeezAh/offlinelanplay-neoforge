package com.github.moeezah;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
// Quilt's own entrypoint interface. On Quilt Loader the "init" entrypoint stage
// must implement org.quiltmc.qsl.base.api.entrypoint.ModInitializer (NOT the
// Fabric net.fabricmc.api.ModInitializer) — otherwise the game crashes at launch
// with: "Class ... cannot be cast to org.quiltmc.qsl.base.api.entrypoint.ModInitializer".
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
