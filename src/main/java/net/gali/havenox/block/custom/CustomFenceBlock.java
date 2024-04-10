package net.gali.havenox.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.Direction;


public class CustomFenceBlock extends FenceBlock {
    public CustomFenceBlock(Settings settings) {
        super(settings);
    }

    private boolean canConnectToFence(BlockState state) {
        return state.isIn(BlockTags.FENCES) && state.isIn(BlockTags.WOODEN_FENCES) == this.getDefaultState().isIn(BlockTags.WOODEN_FENCES);
    }

    @Override
    public boolean canConnect(BlockState state, boolean neighborIsFullSquare, Direction dir) {
        Block block = state.getBlock();
        boolean bl = this.canConnectToFence(state);
        boolean bl2 = block instanceof FenceGateBlock && FenceGateBlock.canWallConnect(state, dir);
        return !FenceBlock.cannotConnect(state) && neighborIsFullSquare || bl || bl2;
    }
}
