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

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHENWOOD_SLAB, 6)
                .pattern("AAA")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ASHENWOOD_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHENWOOD_BUTTON, 1)
                .input(ModBlocks.ASHENWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ASHENWOOD_BUTTON)));

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
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ASHENWOOD_WASTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ASHENWOOD_HATCHET, 1)
                .pattern("AA ")
                .pattern("AS ")
                .pattern(" S ")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ASHENWOOD_HATCHET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ASHENWOOD_PICKAXE, 1)
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ASHENWOOD_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ASHENWOOD_SPADE, 1)
                .pattern("A")
                .pattern("S")
                .pattern("S")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ASHENWOOD_SPADE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ASHENWOOD_HOE, 1)
                .pattern("AA ")
                .pattern(" S ")
                .pattern(" S ")
                .input('A', ModBlocks.ASHENWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.ASHENWOOD_PLANKS), conditionsFromItem(ModBlocks.ASHENWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ASHENWOOD_HOE)));

    }
}
