package net.gali.havenox.item.custom;

import net.gali.havenox.Havenox;
import net.minecraft.command.argument.EntityAnchorArgumentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Heightmap;
import net.minecraft.world.World;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class RecallScrollBETAItem extends Item {

    public RecallScrollBETAItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        System.out.println("Recall Scroll used!");
        if (!world.isClient) {
            System.out.println("if statement working");
            teleportToCenter(world, user);
        }

        ItemStack stack = user.getStackInHand(hand);
        stack.decrement(1); // Consume the item

        return new TypedActionResult<>(ActionResult.SUCCESS, stack);
    }

    private void teleportToCenter(World world, PlayerEntity player) {
        if (!(world instanceof ServerWorld)) {
            return;
        }

        ServerWorld serverWorld = (ServerWorld) world;

        BlockPos centerPos = new BlockPos(0, (int) player.getY(), 0);
        System.out.println("Center position: " + centerPos.toString());  // Check center position

        for (int y = (int) player.getY(); y >= 0; y--) {
            BlockPos checkPos = new BlockPos(centerPos.getX(), y, centerPos.getZ());

            boolean isOpaque = serverWorld.getBlockState(checkPos).isOpaqueFullCube(serverWorld, checkPos);

            System.out.println("Checking block at " + checkPos.toString() + ", isOpaque: " + isOpaque);  // Debug block check

            if (isOpaque) {
                System.out.println("Teleporting to: " + (centerPos.getX() + 0.5) + ", " + (checkPos.getY() + 1) + ", " + (centerPos.getZ() + 0.5));  // Check teleport coordinates
                player.setPos(centerPos.getX() + 0.5, checkPos.getY() + 1, centerPos.getZ() + 0.5);
                ((ServerPlayerEntity) player).teleport(serverWorld, centerPos.getX() + 0.5, checkPos.getY() + 1, centerPos.getZ() + 0.5, player.getYaw(), player.getPitch());
                break;
            }
        }
    }





}

