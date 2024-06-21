package net.gali.havenox.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gali.havenox.item.ModItems;
import net.gali.havenox.block.ModBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool ashenwoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ASHENWOOD_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.ASHENWOOD_LOG).log(ModBlocks.ASHENWOOD_LOG).wood(ModBlocks.ASHENWOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ASHENWOOD_LOG).log(ModBlocks.STRIPPED_ASHENWOOD_LOG).wood(ModBlocks.STRIPPED_ASHENWOOD);

        ashenwoodPool.stairs(ModBlocks.ASHENWOOD_STAIRS);
        ashenwoodPool.slab(ModBlocks.ASHENWOOD_SLAB);
        ashenwoodPool.button(ModBlocks.ASHENWOOD_BUTTON);
        ashenwoodPool.pressurePlate(ModBlocks.ASHENWOOD_PRESSURE_PLATE);
        ashenwoodPool.fence(ModBlocks.ASHENWOOD_FENCE);
        ashenwoodPool.fenceGate(ModBlocks.ASHENWOOD_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.ASHENWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ASHENWOOD_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool zephyrwoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ZEPHYRWOOD_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.ZEPHYRWOOD_LOG).log(ModBlocks.ZEPHYRWOOD_LOG).wood(ModBlocks.ZEPHYRWOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ZEPHYRWOOD_LOG).log(ModBlocks.STRIPPED_ZEPHYRWOOD_LOG).wood(ModBlocks.STRIPPED_ZEPHYRWOOD);

        zephyrwoodPool.stairs(ModBlocks.ZEPHYRWOOD_STAIRS);
        zephyrwoodPool.slab(ModBlocks.ZEPHYRWOOD_SLAB);
        zephyrwoodPool.button(ModBlocks.ZEPHYRWOOD_BUTTON);
        zephyrwoodPool.pressurePlate(ModBlocks.ZEPHYRWOOD_PRESSURE_PLATE);
        zephyrwoodPool.fence(ModBlocks.ZEPHYRWOOD_FENCE);
        zephyrwoodPool.fenceGate(ModBlocks.ZEPHYRWOOD_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.ZEPHYRWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ZEPHYRWOOD_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool wisteriaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WISTERIA_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.WISTERIA_LOG).log(ModBlocks.WISTERIA_LOG).wood(ModBlocks.WISTERIA_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_WISTERIA_LOG).log(ModBlocks.STRIPPED_WISTERIA_LOG).wood(ModBlocks.STRIPPED_WISTERIA_WOOD);

        wisteriaPool.stairs(ModBlocks.WISTERIA_STAIRS);
        wisteriaPool.slab(ModBlocks.WISTERIA_SLAB);
        wisteriaPool.button(ModBlocks.WISTERIA_BUTTON);
        wisteriaPool.pressurePlate(ModBlocks.WISTERIA_PRESSURE_PLATE);
        wisteriaPool.fence(ModBlocks.WISTERIA_FENCE);
        wisteriaPool.fenceGate(ModBlocks.WISTERIA_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.WISTERIA_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.WISTERIA_TRAPDOOR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WISTERIA_LEAVES);
        blockStateModelGenerator.registerTintableCross(ModBlocks.WISTERIA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RECALL_SCROLL_BETA, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAMBURGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASHENWOOD_ROD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASHENWOOD_WASTER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ASHENWOOD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ASHENWOOD_HATCHET, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ASHENWOOD_SPADE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ASHENWOOD_HOE, Models.HANDHELD);

    }
}
