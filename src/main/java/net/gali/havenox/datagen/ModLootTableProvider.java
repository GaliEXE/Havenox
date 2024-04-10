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
        addDrop(ModBlocks.ASHENWOOD_LOG);
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

    }
}
