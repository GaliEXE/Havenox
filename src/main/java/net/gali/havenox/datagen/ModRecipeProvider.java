package net.gali.havenox.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.gali.havenox.block.ModBlocks;
import net.gali.havenox.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.awt.*;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHENWOOD_STAIRS, 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ASHENWOOD_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHENWOOD, 4)
                .pattern("LL")
                .pattern("LL")
                .input('L', ModBlocks.ASHENWOOD_LOG)
                .criterion(hasItem(ModBlocks.ASHENWOOD_LOG), conditionsFromItem(ModBlocks.ASHENWOOD_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ASHENWOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_ASHENWOOD, 4)
                .pattern("LL")
                .pattern("LL")
                .input('L', ModBlocks.STRIPPED_ASHENWOOD_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_ASHENWOOD_LOG), conditionsFromItem(ModBlocks.STRIPPED_ASHENWOOD_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STRIPPED_ASHENWOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHENWOOD_SLAB, 6)
                .pattern("AAA")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ASHENWOOD_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHENWOOD_BUTTON, 1)
                .input(ModBlocks.ASHENWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ASHENWOOD_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ASHENWOOD_ROD, 4)
                        .input(ModBlocks.ASHENWOOD_PLANKS)
                        .input(Items.STICK)
                        .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                        .offerTo(exporter, new Identifier(getRecipeName(ModItems.ASHENWOOD_ROD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHENWOOD_PRESSURE_PLATE, 1)
                .pattern("AA ")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ASHENWOOD_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHENWOOD_DOOR, 3)
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ASHENWOOD_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHENWOOD_TRAPDOOR, 2)
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ASHENWOOD_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHENWOOD_FENCE, 3)
                .pattern("ASA")
                .pattern("ASA")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ASHENWOOD_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHENWOOD_FENCE_GATE, 1)
                .pattern("SAS")
                .pattern("SAS")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ASHENWOOD_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ASHENWOOD_WASTER, 1)
                .pattern("A")
                .pattern("A")
                .pattern("S")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .input('S', ModItems.ASHENWOOD_ROD)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ASHENWOOD_WASTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ASHENWOOD_HATCHET, 1)
                .pattern("AA ")
                .pattern("AS ")
                .pattern(" S ")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .input('S', ModItems.ASHENWOOD_ROD)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ASHENWOOD_HATCHET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ASHENWOOD_PICKAXE, 1)
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .input('S', ModItems.ASHENWOOD_ROD)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ASHENWOOD_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ASHENWOOD_SPADE, 1)
                .pattern("A")
                .pattern("S")
                .pattern("S")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .input('S', ModItems.ASHENWOOD_ROD)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ASHENWOOD_SPADE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ASHENWOOD_HOE, 1)
                .pattern("AA ")
                .pattern(" S ")
                .pattern(" S ")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .input('S', ModItems.ASHENWOOD_ROD)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ASHENWOOD_HOE)));

        //zephyrwood set

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZEPHYRWOOD_PLANKS, 4)
                .input(ModBlocks.ZEPHYRWOOD_LOG)
                .criterion(hasItem(ModBlocks.ZEPHYRWOOD_LOG), conditionsFromItem(ModBlocks.ZEPHYRWOOD_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ZEPHYRWOOD_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZEPHYRWOOD_STAIRS,4)
                .pattern("Z  ")
                .pattern("ZZ ")
                .pattern("ZZZ")
                .input('Z', ModBlocks.ZEPHYRWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.ZEPHYRWOOD_PLANKS), conditionsFromItem(ModBlocks.ZEPHYRWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ZEPHYRWOOD_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZEPHYRWOOD_SLAB,6)
                .pattern("ZZZ")
                .input('Z',ModBlocks.ZEPHYRWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.ZEPHYRWOOD_PLANKS), conditionsFromItem(ModBlocks.ZEPHYRWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ZEPHYRWOOD_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZEPHYRWOOD_FENCE, 3)
                .pattern("ZSZ")
                .pattern("ZSZ")
                .input('Z', ModBlocks.ZEPHYRWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.ZEPHYRWOOD_PLANKS), conditionsFromItem(ModBlocks.ZEPHYRWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ZEPHYRWOOD_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZEPHYRWOOD_FENCE_GATE, 1)
                .pattern("SZS")
                .pattern("SZS")
                .input('Z', ModBlocks.ZEPHYRWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.ZEPHYRWOOD_PLANKS), conditionsFromItem(ModBlocks.ZEPHYRWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ZEPHYRWOOD_FENCE_GATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ZEPHYRWOOD_BUTTON,1)
                .input(ModBlocks.ZEPHYRWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.ZEPHYRWOOD_PLANKS), conditionsFromItem(ModBlocks.ZEPHYRWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ZEPHYRWOOD_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ZEPHYRWOOD_PRESSURE_PLATE,1)
                .pattern("ZZ")
                .input('Z', ModBlocks.ZEPHYRWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.ZEPHYRWOOD_PLANKS), conditionsFromItem(ModBlocks.ZEPHYRWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ZEPHYRWOOD_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZEPHYRWOOD_DOOR, 3)
                .pattern("ZZ")
                .pattern("ZZ")
                .pattern("ZZ")
                .input('Z', ModBlocks.ZEPHYRWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.ZEPHYRWOOD_PLANKS), conditionsFromItem(ModBlocks.ZEPHYRWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ZEPHYRWOOD_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZEPHYRWOOD_TRAPDOOR, 2)
                .pattern("ZZZ")
                .pattern("ZZZ")
                .input('Z', ModBlocks.ZEPHYRWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.ZEPHYRWOOD_PLANKS), conditionsFromItem(ModBlocks.ZEPHYRWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ZEPHYRWOOD_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZEPHYRWOOD, 4)
                .pattern("LL")
                .pattern("LL")
                .input('L', ModBlocks.ZEPHYRWOOD_LOG)
                .criterion(hasItem(ModBlocks.ZEPHYRWOOD_LOG), conditionsFromItem(ModBlocks.ZEPHYRWOOD_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ZEPHYRWOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_ZEPHYRWOOD, 4)
                .pattern("LL")
                .pattern("LL")
                .input('L', ModBlocks.STRIPPED_ZEPHYRWOOD_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_ZEPHYRWOOD), conditionsFromItem(ModBlocks.STRIPPED_ZEPHYRWOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STRIPPED_ZEPHYRWOOD)));

        //wisteria set

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WISTERIA_PLANKS, 4)
                .input(ModBlocks.WISTERIA_LOG)
                .criterion(hasItem(ModBlocks.WISTERIA_LOG), conditionsFromItem(ModBlocks.WISTERIA_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WISTERIA_STAIRS,4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .input('W', ModBlocks.WISTERIA_PLANKS)
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WISTERIA_SLAB,6)
                .pattern("WWW")
                .input('W',ModBlocks.WISTERIA_PLANKS)
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WISTERIA_FENCE, 3)
                .pattern("WSW")
                .pattern("WSW")
                .input('W', ModBlocks.WISTERIA_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WISTERIA_FENCE_GATE, 1)
                .pattern("SWS")
                .pattern("SWS")
                .input('W', ModBlocks.WISTERIA_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_FENCE_GATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.WISTERIA_BUTTON,1)
                .input(ModBlocks.WISTERIA_PLANKS)
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.WISTERIA_PRESSURE_PLATE,1)
                .pattern("WW")
                .input('W', ModBlocks.WISTERIA_PLANKS)
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WISTERIA_DOOR, 3)
                .pattern("WW")
                .pattern("WW")
                .pattern("WW")
                .input('W', ModBlocks.WISTERIA_PLANKS)
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WISTERIA_TRAPDOOR, 2)
                .pattern("WWW")
                .pattern("WWW")
                .input('W', ModBlocks.WISTERIA_PLANKS)
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WISTERIA_WOOD, 4)
                .pattern("LL")
                .pattern("LL")
                .input('L', ModBlocks.WISTERIA_LOG)
                .criterion(hasItem(ModBlocks.WISTERIA_LOG), conditionsFromItem(ModBlocks.WISTERIA_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_WOOD)));

        /*ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_ZEPHYRWOOD, 4)
                .pattern("LL")
                .pattern("LL")
                .input('L', ModBlocks.STRIPPED_ZEPHYRWOOD_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_ZEPHYRWOOD), conditionsFromItem(ModBlocks.STRIPPED_ZEPHYRWOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STRIPPED_ZEPHYRWOOD)));
        */

    }
}
