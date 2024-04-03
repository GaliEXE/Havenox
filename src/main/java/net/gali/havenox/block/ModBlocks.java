package net.gali.havenox.block;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.block.v1.FabricBlockState;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gali.havenox.Havenox;
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
    public static final Block ASHENWOOD_PLANKS = registerBlock("ashenwood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));

    public static final Block ASHENWOOD_SLAB = registerBlock("ashenwood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_SLAB)));
    

    private static void addItemsToItemGroup(FabricItemGroupEntries entries){
        entries.add(ASHENWOOD_LOG);
        entries.add(ASHENWOOD_PLANKS);
        entries.add(ASHENWOOD_SLAB);
    }

    private static Block registerBlock(String name, Block block){
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
