package com.github.moeezah.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.client.server.IntegratedServer;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.GameType;

@Mixin(IntegratedServer.class)
public class IntegratedServerMixin {

    @Inject(method = "publishServer", at = @At("HEAD"), cancellable = true)
    private void onPublishServer(GameType gameMode, boolean cheats, int port,
            CallbackInfoReturnable<Boolean> clr) {
        // Target the local class reference directly instead of forcing an object cast
        IntegratedServer server = (IntegratedServer) (Object) this;
        server.setUsesAuthentication(false);

        // Notify stuff
        Component textMessage = Component
                .literal("\u00a78[\u00a7cOffline LAN Play\u00a78]\u00a7r \u00a7n\u00a76Offline Mode\u00a7r has been \u00a7aEnabled\u00a7r");

        for (ServerPlayer player : server.getPlayerList().getPlayers()) {
            player.sendSystemMessage(textMessage);
        }
    }
}
