package net.gali.havenox.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.gali.havenox.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //ashenwood set
        addDrop(ModBlocks.ASHENWOOD_LOG);
        addDrop(ModBlocks.ASHENWOOD);
        addDrop(ModBlocks.STRIPPED_ASHENWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_ASHENWOOD);
        addDrop(ModBlocks.ASHENWOOD_PLANKS);
        addDrop(ModBlocks.STRIPPED_ASHENWOOD);
        addDrop(ModBlocks.STRIPPED_ASHENWOOD_LOG);
        addDrop(ModBlocks.ASHENWOOD_SLAB, slabDrops(ModBlocks.ASHENWOOD_SLAB));
        addDrop(ModBlocks.ASHENWOOD_STAIRS);
        addDrop(ModBlocks.ASHENWOOD_BUTTON);
        addDrop(ModBlocks.ASHENWOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.ASHENWOOD_FENCE);
        addDrop(ModBlocks.ASHENWOOD_FENCE_GATE);
        addDrop(ModBlocks.ASHENWOOD_DOOR, doorDrops(ModBlocks.ASHENWOOD_DOOR));
        addDrop(ModBlocks.ASHENWOOD_TRAPDOOR);
        addDrop(ModBlocks.ASHENWOOD_CRAFTING_TABLE);
        //zephyrwood set
        addDrop(ModBlocks.ZEPHYRWOOD_LOG);
        addDrop(ModBlocks.ZEPHYRWOOD);
        addDrop(ModBlocks.STRIPPED_ZEPHYRWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_ZEPHYRWOOD);
        addDrop(ModBlocks.ZEPHYRWOOD_PLANKS);
        addDrop(ModBlocks.ZEPHYRWOOD_STAIRS);
        addDrop(ModBlocks.ZEPHYRWOOD_SLAB, slabDrops(ModBlocks.ZEPHYRWOOD_SLAB));
        addDrop(ModBlocks.ZEPHYRWOOD_FENCE);
        addDrop(ModBlocks.ZEPHYRWOOD_FENCE_GATE);
        addDrop(ModBlocks.ZEPHYRWOOD_DOOR, doorDrops(ModBlocks.ZEPHYRWOOD_DOOR));
        addDrop(ModBlocks.ZEPHYRWOOD_TRAPDOOR);
        addDrop(ModBlocks.ZEPHYRWOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.ZEPHYRWOOD_BUTTON);
        //wisteria set
        addDrop(ModBlocks.WISTERIA_LOG);
        addDrop(ModBlocks.WISTERIA_WOOD);
        addDrop(ModBlocks.STRIPPED_WISTERIA_LOG);
        addDrop(ModBlocks.STRIPPED_WISTERIA_WOOD);
        addDrop(ModBlocks.WISTERIA_PLANKS);
        addDrop(ModBlocks.WISTERIA_STAIRS);
        addDrop(ModBlocks.WISTERIA_SLAB, slabDrops(ModBlocks.WISTERIA_SLAB));
        addDrop(ModBlocks.WISTERIA_FENCE);
        addDrop(ModBlocks.WISTERIA_FENCE_GATE);
        addDrop(ModBlocks.WISTERIA_DOOR, doorDrops(ModBlocks.WISTERIA_DOOR));
        addDrop(ModBlocks.WISTERIA_TRAPDOOR);
        addDrop(ModBlocks.WISTERIA_PRESSURE_PLATE);
        addDrop(ModBlocks.WISTERIA_BUTTON);
        addDrop(ModBlocks.WISTERIA_SAPLING);



    }
}
