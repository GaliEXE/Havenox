package net.gali.havenox.block.custom;

import net.gali.havenox.screen.custom.CustomCraftingScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomCraftingTableBlock extends CraftingTableBlock {

    public CustomCraftingTableBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        }

        NamedScreenHandlerFactory screenHandlerFactory = new SimpleNamedScreenHandlerFactory(
                (syncId, playerInventory, playerEntity) -> new CustomCraftingScreenHandler(syncId, playerInventory, ScreenHandlerContext.create(world, pos), (CustomCraftingTableBlock) state.getBlock()),
                TEXT_COMPONENT
        );

        player.openHandledScreen(screenHandlerFactory);
        player.incrementStat(Stats.INTERACT_WITH_CRAFTING_TABLE);
        return ActionResult.CONSUME;
    }

    private static final Text TEXT_COMPONENT = Text.translatable("container.crafting");
}
