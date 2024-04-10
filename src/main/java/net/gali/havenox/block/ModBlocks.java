package net.gali.havenox.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gali.havenox.Havenox;
import net.gali.havenox.block.custom.CustomFenceBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ASHENWOOD_LOG = registerBlock("ashenwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE)));

    public static final Block ASHENWOOD = registerBlock("ashenwood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE)));

    public static final Block STRIPPED_ASHENWOOD_LOG = registerBlock("stripped_ashenwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM)));

    public static final Block STRIPPED_ASHENWOOD = registerBlock("stripped_ashenwood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_HYPHAE)));
    public static final Block ASHENWOOD_PLANKS = registerBlock("ashenwood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));

    public static final Block ASHENWOOD_STAIRS = registerBlock("ashenwood_stairs",
            new StairsBlock(ModBlocks.ASHENWOOD_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CRIMSON_STAIRS)));
    public static final Block ASHENWOOD_SLAB = registerBlock("ashenwood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_SLAB)));
    public static final Block ASHENWOOD_BUTTON = registerBlock("ashenwood_button",
            new ButtonBlock(BlockSetType.CRIMSON, 10, FabricBlockSettings.copyOf(Blocks.CRIMSON_BUTTON)));
    public static final Block ASHENWOOD_PRESSURE_PLATE = registerBlock("ashenwood_pressure_plate",
            new PressurePlateBlock(BlockSetType.CRIMSON, FabricBlockSettings.copyOf(Blocks.CRIMSON_PRESSURE_PLATE)));
    public static final Block ASHENWOOD_FENCE = registerBlock("ashenwood_fence",
            new CustomFenceBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_FENCE)));

    public static final Block ASHENWOOD_FENCE_GATE = registerBlock("ashenwood_fence_gate",
            new FenceGateBlock(WoodType.CRIMSON, FabricBlockSettings.copyOf(Blocks.CRIMSON_FENCE_GATE)));
    public static final Block ASHENWOOD_DOOR = registerBlock("ashenwood_door",
            new DoorBlock(BlockSetType.CRIMSON,FabricBlockSettings.copyOf(Blocks.CRIMSON_DOOR)));
    public static final Block ASHENWOOD_TRAPDOOR = registerBlock("ashenwood_trapdoor",
            new TrapdoorBlock(BlockSetType.CRIMSON, FabricBlockSettings.copyOf(Blocks.CRIMSON_TRAPDOOR)));

    private static void addItemsToItemGroup(FabricItemGroupEntries entries) {
        entries.addAfter(Blocks.BAMBOO_BUTTON, ModBlocks.ASHENWOOD_LOG);
        entries.addAfter(ModBlocks.ASHENWOOD_LOG, ModBlocks.ASHENWOOD);
        entries.addAfter(ModBlocks.ASHENWOOD_LOG, ModBlocks.STRIPPED_ASHENWOOD_LOG);
        entries.addAfter(ModBlocks.STRIPPED_ASHENWOOD_LOG, ModBlocks.STRIPPED_ASHENWOOD);
        entries.addAfter(ModBlocks.STRIPPED_ASHENWOOD, ModBlocks.ASHENWOOD_PLANKS);
        entries.addAfter(ModBlocks.ASHENWOOD_PLANKS, ModBlocks.ASHENWOOD_STAIRS);
        entries.addAfter(ModBlocks.ASHENWOOD_STAIRS, ModBlocks.ASHENWOOD_SLAB);
        entries.addAfter(ModBlocks.ASHENWOOD_SLAB, ModBlocks.ASHENWOOD_FENCE);
        entries.addAfter(ModBlocks.ASHENWOOD_FENCE, ModBlocks.ASHENWOOD_FENCE_GATE);
        entries.addAfter(ModBlocks.ASHENWOOD_FENCE_GATE, ModBlocks.ASHENWOOD_DOOR);
        entries.addAfter(ModBlocks.ASHENWOOD_DOOR, ModBlocks.ASHENWOOD_TRAPDOOR);
        entries.addAfter(ModBlocks.ASHENWOOD_TRAPDOOR, ModBlocks.ASHENWOOD_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.ASHENWOOD_PRESSURE_PLATE, ModBlocks.ASHENWOOD_BUTTON);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Havenox.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Havenox.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Havenox.LOGGER.info("Registering ModBlocks for " + Havenox.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addItemsToItemGroup);
    }
}
