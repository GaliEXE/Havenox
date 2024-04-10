package net.gali.havenox.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.mininglevel.v1.FabricMineableTags;
import net.gali.havenox.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg){
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.ASHENWOOD)
                .add(ModBlocks.STRIPPED_ASHENWOOD_LOG)
                .add(ModBlocks.STRIPPED_ASHENWOOD)
                .add(ModBlocks.ASHENWOOD_PLANKS)
                .add(ModBlocks.ASHENWOOD_SLAB)
                .add(ModBlocks.ASHENWOOD_LOG)
                .add(ModBlocks.ASHENWOOD_STAIRS)
                .add(ModBlocks.ASHENWOOD_PRESSURE_PLATE)
                .add(ModBlocks.ASHENWOOD_BUTTON)
                .add(ModBlocks.ASHENWOOD_FENCE)
                .add(ModBlocks.ASHENWOOD_FENCE_GATE)
                .add(ModBlocks.ASHENWOOD_DOOR)
                .add(ModBlocks.ASHENWOOD_TRAPDOOR);


        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")));

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.ASHENWOOD_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.ASHENWOOD_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.ASHENWOOD_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.ASHENWOOD_LOG)
                .add(ModBlocks.STRIPPED_ASHENWOOD_LOG);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("havenoxsmp", "blocks")))
                .add(ModBlocks.ASHENWOOD_FENCE);

    }
}
