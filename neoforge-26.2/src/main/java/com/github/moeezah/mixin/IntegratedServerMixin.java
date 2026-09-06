package com.github.moeezah.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.client.server.IntegratedServer;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.GameType;

@Mixin(IntegratedServer.class)
public class IntegratedServerMixin {
    @Inject(method = "publishServer", at = @At("HEAD"))
    private void onPublishServer(MinecraftServer.MultiplayerScope scope, GameType gameMode,
            boolean allowCommands, int port, CallbackInfoReturnable<Boolean> clr) {
        ((IntegratedServer) (Object) this).setUsesAuthentication(false);

        // Notify stuff
        Component textMessage = Component.literal(
                "§8[§cOffline LAN Play§8]§r Changed §n§6Online Mode§r to False §aSuccessfully§r");

        for (ServerPlayer player : ((MinecraftServer) (Object) this).getPlayerList().getPlayers()) {
            player.sendSystemMessage(textMessage);
        }
    }
}
