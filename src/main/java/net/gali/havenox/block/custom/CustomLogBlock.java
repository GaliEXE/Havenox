package net.gali.havenox.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class CustomLogBlock extends PillarBlock implements Strippable {
    public static final BooleanProperty STRIPPED = BooleanProperty.of("stripped");

    public CustomLogBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(AXIS, Direction.Axis.Y).with(STRIPPED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AXIS, STRIPPED);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        ItemConvertible itemConvertible = Strippable.getStripped(this.asItem());
        if (itemConvertible != null && itemStack.getItem() == Items.AXOLOTL_BUCKET) {
            if (!world.isClient) {
                world.setBlockState(pos, (BlockState) state.with(STRIPPED, true), 11);
                player.getStackInHand(hand).decrement(1);
            }
            return ActionResult.success(world.isClient);
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    public ItemConvertible getStripped() {
        return null;  // Return the stripped log block item here
    }
}
