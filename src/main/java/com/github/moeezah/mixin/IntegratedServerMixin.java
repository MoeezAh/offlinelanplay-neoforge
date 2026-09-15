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
    @Inject(method = "publishServer", at = @At("HEAD"))
    private void onPublishServer(GameType gameMode, boolean cheats, int port,
            CallbackInfoReturnable<Boolean> clr) {
        // Target the local class reference directly instead of forcing an object cast
        IntegratedServer server = (IntegratedServer) (Object) this;
        server.setUsesAuthentication(false);

        // Notify stuff
        Component textMessage = Component.literal(
                "§8[§cOffline LAN Play§8]§r Changed §n§6Online Mode§r to False §aSuccessfully§r");

        for (ServerPlayer player : server.getPlayerList().getPlayers()) {
            player.sendSystemMessage(textMessage);
        }
    }
}
