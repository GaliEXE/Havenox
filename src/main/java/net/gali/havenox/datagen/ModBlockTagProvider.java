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
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                //ashenwood set
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
                .add(ModBlocks.ASHENWOOD_TRAPDOOR)
                //zephyrwood set
                .add(ModBlocks.ZEPHYRWOOD)
                .add(ModBlocks.ZEPHYRWOOD_LOG)
                .add(ModBlocks.STRIPPED_ZEPHYRWOOD_LOG)
                .add(ModBlocks.STRIPPED_ZEPHYRWOOD)
                .add(ModBlocks.ZEPHYRWOOD_PLANKS)
                .add(ModBlocks.ZEPHYRWOOD_STAIRS)
                .add(ModBlocks.ZEPHYRWOOD_SLAB)
                .add(ModBlocks.ZEPHYRWOOD_FENCE)
                .add(ModBlocks.ZEPHYRWOOD_FENCE_GATE)
                .add(ModBlocks.ZEPHYRWOOD_DOOR)
                .add(ModBlocks.ZEPHYRWOOD_TRAPDOOR)
                .add(ModBlocks.ZEPHYRWOOD_PRESSURE_PLATE)
                .add(ModBlocks.ZEPHYRWOOD_BUTTON)
                //wisteria set
                .add(ModBlocks.WISTERIA_WOOD)
                .add(ModBlocks.WISTERIA_LOG)
                //.add(ModBlocks.STRIPPED_WISTERIA_LOG)
                //.add(ModBlocks.STRIPPED_WISTERIA_WOOD)
                .add(ModBlocks.WISTERIA_PLANKS)
                .add(ModBlocks.WISTERIA_STAIRS)
                .add(ModBlocks.WISTERIA_SLAB)
                .add(ModBlocks.WISTERIA_FENCE)
                .add(ModBlocks.WISTERIA_FENCE_GATE)
                .add(ModBlocks.WISTERIA_DOOR)
                .add(ModBlocks.WISTERIA_TRAPDOOR)
                .add(ModBlocks.WISTERIA_PRESSURE_PLATE)
                .add(ModBlocks.WISTERIA_BUTTON);


        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")));

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.ASHENWOOD_FENCE)
                .add(ModBlocks.ZEPHYRWOOD_FENCE)
                .add(ModBlocks.WISTERIA_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.ASHENWOOD_FENCE)
                .add(ModBlocks.ZEPHYRWOOD_FENCE)
                .add(ModBlocks.WISTERIA_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.ASHENWOOD_FENCE_GATE)
                .add(ModBlocks.ZEPHYRWOOD_FENCE_GATE)
                .add(ModBlocks.WISTERIA_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.ASHENWOOD_LOG)
                .add(ModBlocks.STRIPPED_ASHENWOOD_LOG)
                .add(ModBlocks.ZEPHYRWOOD_LOG)
                .add(ModBlocks.STRIPPED_ZEPHYRWOOD_LOG)
                .add(ModBlocks.WISTERIA_LOG);
                //.add(ModBlocks.STRIPPED_WISTERIA_LOG);
    }
}
