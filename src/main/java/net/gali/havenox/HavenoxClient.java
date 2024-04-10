package net.gali.havenox;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.gali.havenox.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class HavenoxClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ASHENWOOD_DOOR, RenderLayer.getCutout());
    }
}
