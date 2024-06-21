package net.gali.havenox.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gali.havenox.Havenox;
import net.gali.havenox.block.custom.CustomCraftingTableBlock;
import net.gali.havenox.block.custom.CustomFenceBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //Ashenwood Set
    public static final Block ASHENWOOD_LOG = registerBlock("ashenwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE).luminance(state -> 5)));
    public static final Block ASHENWOOD = registerBlock("ashenwood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE)));
    public static final Block STRIPPED_ASHENWOOD_LOG = registerBlock("stripped_ashenwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).luminance(state -> 5)));
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
    public static final Block ASHENWOOD_CRAFTING_TABLE = registerBlock("ashenwood_crafting_table",
            new CustomCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));
//Zephyrwood Set
    public static final Block ZEPHYRWOOD_LOG = registerBlock("zephyrwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LOG).burnable()));
    public static final Block ZEPHYRWOOD = registerBlock("zephyrwood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD).burnable()));
    public static final Block STRIPPED_ZEPHYRWOOD_LOG = registerBlock("stripped_zephyrwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_LOG)));
    public static final Block STRIPPED_ZEPHYRWOOD = registerBlock("stripped_zephyrwood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final Block ZEPHYRWOOD_PLANKS = registerBlock("zephyrwood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS).burnable()));
    public static final Block ZEPHYRWOOD_STAIRS = registerBlock("zephyrwood_stairs",
            new StairsBlock(ModBlocks.ZEPHYRWOOD_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BIRCH_STAIRS).burnable()));
    public static final Block ZEPHYRWOOD_SLAB = registerBlock("zephyrwood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_SLAB).burnable()));
    public static final Block ZEPHYRWOOD_FENCE = registerBlock("zephyrwood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_FENCE).burnable()));
    public static final Block ZEPHYRWOOD_FENCE_GATE = registerBlock("zephyrwood_fence_gate",
            new FenceGateBlock(WoodType.BIRCH, FabricBlockSettings.copyOf(Blocks.BIRCH_FENCE_GATE).burnable()));
    public static final Block ZEPHYRWOOD_BUTTON = registerBlock("zephyrwood_button",
            new ButtonBlock(BlockSetType.BIRCH, 10, FabricBlockSettings.copyOf(Blocks.BIRCH_BUTTON)));
    public static final Block ZEPHYRWOOD_PRESSURE_PLATE = registerBlock("zephyrwood_pressure_plate",
            new PressurePlateBlock(BlockSetType.BIRCH,FabricBlockSettings.copyOf(Blocks.BIRCH_PRESSURE_PLATE)));
    public static final Block ZEPHYRWOOD_DOOR = registerBlock("zephyrwood_door",
            new DoorBlock(BlockSetType.BIRCH, FabricBlockSettings.copyOf(Blocks.BIRCH_DOOR)));
    public static final Block ZEPHYRWOOD_TRAPDOOR = registerBlock("zephyrwood_trapdoor",
            new TrapdoorBlock(BlockSetType.BIRCH, FabricBlockSettings.copyOf(Blocks.BIRCH_TRAPDOOR)));
    //Wisteria Set
    public static final Block WISTERIA_LOG = registerBlock("wisteria_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LOG).burnable()));
    public static final Block WISTERIA_WOOD = registerBlock("wisteria_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD).burnable()));
    public static final Block STRIPPED_WISTERIA_LOG = registerBlock("stripped_wisteria_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_LOG)));
    public static final Block STRIPPED_WISTERIA_WOOD = registerBlock("stripped_wisteria_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final Block WISTERIA_PLANKS = registerBlock("wisteria_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS).burnable()));
    public static final Block WISTERIA_STAIRS = registerBlock("wisteria_stairs",
            new StairsBlock(ModBlocks.ZEPHYRWOOD_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BIRCH_STAIRS).burnable()));
    public static final Block WISTERIA_SLAB = registerBlock("wisteria_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_SLAB).burnable()));
    public static final Block WISTERIA_FENCE = registerBlock("wisteria_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_FENCE).burnable()));
    public static final Block WISTERIA_FENCE_GATE = registerBlock("wisteria_fence_gate",
            new FenceGateBlock(WoodType.BIRCH, FabricBlockSettings.copyOf(Blocks.BIRCH_FENCE_GATE).burnable()));
    public static final Block WISTERIA_BUTTON = registerBlock("wisteria_button",
            new ButtonBlock(BlockSetType.BIRCH, 10, FabricBlockSettings.copyOf(Blocks.BIRCH_BUTTON)));
    public static final Block WISTERIA_PRESSURE_PLATE = registerBlock("wisteria_pressure_plate",
            new PressurePlateBlock(BlockSetType.BIRCH,FabricBlockSettings.copyOf(Blocks.BIRCH_PRESSURE_PLATE)));
    public static final Block WISTERIA_DOOR = registerBlock("wisteria_door",
            new DoorBlock(BlockSetType.BIRCH, FabricBlockSettings.copyOf(Blocks.BIRCH_DOOR)));
    public static final Block WISTERIA_TRAPDOOR = registerBlock("wisteria_trapdoor",
            new TrapdoorBlock(BlockSetType.BIRCH, FabricBlockSettings.copyOf(Blocks.BIRCH_TRAPDOOR)));
    public static final Block WISTERIA_LEAVES = registerBlock("wisteria_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES)));
    public static final Block WISTERIA_SAPLING = registerBlock("wisteria_sapling",
            new SaplingBlock(SaplingGenerator.CHERRY, FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING)));
    //public static final Block POTTED_WISTERIA_SAPLING = Registry.register(Registries.BLOCK, new Identifier(Havenox.MOD_ID, "potted_wisteria_sapling"),
            //new FlowerPotBlock(WISTERIA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_CHERRY_SAPLING).nonOpaque()));


    private static void addItemsToItemGroup(FabricItemGroupEntries entries) {
        //Ashenwood Set
        entries.addAfter(Blocks.BAMBOO_BUTTON, ModBlocks.ASHENWOOD_LOG);
        entries.addAfter(ModBlocks.ASHENWOOD_LOG, ModBlocks.ASHENWOOD);
        entries.addAfter(ModBlocks.ASHENWOOD, ModBlocks.STRIPPED_ASHENWOOD_LOG);
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
        //Zephyrwood Set
        entries.addAfter(Blocks.BIRCH_BUTTON, ModBlocks.ZEPHYRWOOD_LOG);
        entries.addAfter(ModBlocks.ZEPHYRWOOD_LOG, ModBlocks.ZEPHYRWOOD);
        entries.addAfter(ModBlocks.ZEPHYRWOOD, ModBlocks.STRIPPED_ZEPHYRWOOD_LOG);
        entries.addAfter(ModBlocks.STRIPPED_ZEPHYRWOOD_LOG, ModBlocks.STRIPPED_ZEPHYRWOOD);
        entries.addAfter(ModBlocks.STRIPPED_ZEPHYRWOOD, ModBlocks.ZEPHYRWOOD_PLANKS);
        entries.addAfter(ModBlocks.ZEPHYRWOOD_PLANKS, ModBlocks.ZEPHYRWOOD_STAIRS);
        entries.addAfter(ModBlocks.ZEPHYRWOOD_STAIRS, ModBlocks.ZEPHYRWOOD_SLAB);
        entries.addAfter(ModBlocks.ZEPHYRWOOD_SLAB, ModBlocks.ZEPHYRWOOD_FENCE);
        entries.addAfter(ModBlocks.ZEPHYRWOOD_FENCE, ModBlocks.ZEPHYRWOOD_FENCE_GATE);
        entries.addAfter(ModBlocks.ZEPHYRWOOD_FENCE_GATE, ModBlocks.ZEPHYRWOOD_DOOR);
        entries.addAfter(ModBlocks.ZEPHYRWOOD_DOOR, ModBlocks.ZEPHYRWOOD_TRAPDOOR);
        entries.addAfter(ModBlocks.ZEPHYRWOOD_TRAPDOOR, ModBlocks.ZEPHYRWOOD_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.ZEPHYRWOOD_PRESSURE_PLATE, ModBlocks.ZEPHYRWOOD_BUTTON);
        //Wisteria Set
        entries.addAfter(Blocks.MANGROVE_BUTTON, ModBlocks.WISTERIA_LOG);
        entries.addAfter(ModBlocks.WISTERIA_LOG, ModBlocks.WISTERIA_WOOD);
        entries.addAfter(ModBlocks.WISTERIA_WOOD, ModBlocks.STRIPPED_WISTERIA_LOG);
        entries.addAfter(ModBlocks.STRIPPED_WISTERIA_LOG, ModBlocks.STRIPPED_WISTERIA_WOOD);
        entries.addAfter(ModBlocks.STRIPPED_WISTERIA_WOOD, ModBlocks.WISTERIA_PLANKS);
        entries.addAfter(ModBlocks.WISTERIA_PLANKS, ModBlocks.WISTERIA_STAIRS);
        entries.addAfter(ModBlocks.WISTERIA_STAIRS, ModBlocks.WISTERIA_SLAB);
        entries.addAfter(ModBlocks.WISTERIA_SLAB, ModBlocks.WISTERIA_FENCE);
        entries.addAfter(ModBlocks.WISTERIA_FENCE, ModBlocks.WISTERIA_FENCE_GATE);
        entries.addAfter(ModBlocks.WISTERIA_FENCE_GATE, ModBlocks.WISTERIA_DOOR);
        entries.addAfter(ModBlocks.WISTERIA_DOOR, ModBlocks.WISTERIA_TRAPDOOR);
        entries.addAfter(ModBlocks.WISTERIA_TRAPDOOR, ModBlocks.WISTERIA_PRESSURE_PLATE);
        entries.addAfter(ModBlocks.WISTERIA_PRESSURE_PLATE, ModBlocks.WISTERIA_BUTTON);

    }

    private static void addItemsToNatureGroup(FabricItemGroupEntries entries){
        entries.addAfter(Blocks.MANGROVE_LEAVES, ModBlocks.WISTERIA_LEAVES);
        entries.addAfter(Blocks.MANGROVE_PROPAGULE, ModBlocks.WISTERIA_SAPLING);
    }

    private static void addItemsToFunctionalGroup(FabricItemGroupEntries entries){
        entries.addAfter(Blocks.CRAFTING_TABLE, ModBlocks.ASHENWOOD_CRAFTING_TABLE);
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
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addItemsToNatureGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModBlocks::addItemsToFunctionalGroup);
    }
}
