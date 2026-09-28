package it.hurts.shatterbyte.immersiveui.fabric.client;

import it.hurts.shatterbyte.immersiveui.ImmersiveUI;
import it.hurts.shatterbyte.shatterlib.module.config.ConfigManager;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public final class ImmersiveUIFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ConfigManager.register(ImmersiveUI.MOD_ID, ImmersiveUI.CONFIG);
        ImmersiveUI.CONFIG.load(FabricLoader.getInstance().getConfigDir());
    }
}
