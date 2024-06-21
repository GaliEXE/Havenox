package net.gali.havenox.screen.custom;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;

public class CustomCraftingScreenHandler extends CraftingScreenHandler {
    private final Block block;
    private final ScreenHandlerContext context;

    public CustomCraftingScreenHandler(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context, Block block) {
        super(syncId, playerInventory);
        this.context = context;
        this.block = block;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return canUse(this.context, player, this.block);
    }
}

