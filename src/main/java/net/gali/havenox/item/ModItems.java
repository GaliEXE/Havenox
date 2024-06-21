package net.gali.havenox.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gali.havenox.Havenox;
import net.gali.havenox.block.ModBlocks;
import net.gali.havenox.item.custom.RecallScrollBETAItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.awt.image.PixelGrabber;

public class ModItems {

    public static final Item RECALL_SCROLL_BETA = registerItem("recall_scroll",
            new RecallScrollBETAItem(new FabricItemSettings().maxDamage(12)));

    public static final Item ASHENWOOD_ROD = registerItem("ashenwood_rod",
            new Item(new FabricItemSettings()));
    public static final Item ASHENWOOD_PICKAXE = registerItem("ashenwood_pickaxe",
            new PickaxeItem(ModToolMaterial.ASHENWOOD, 1, 2f, new FabricItemSettings()));
    public static final Item ASHENWOOD_HATCHET = registerItem("ashenwood_hatchet",
            new AxeItem(ModToolMaterial.ASHENWOOD, 6.5f, -3.2f, new FabricItemSettings()));
    public static final Item ASHENWOOD_WASTER = registerItem("ashenwood_waster",
            new SwordItem(ModToolMaterial.ASHENWOOD, 4, -2.4f, new FabricItemSettings()));
    public static final Item ASHENWOOD_SPADE = registerItem("ashenwood_spade",
            new ShovelItem(ModToolMaterial.ASHENWOOD, 1.5f, 3f, new FabricItemSettings()));
    public static final Item ASHENWOOD_HOE = registerItem("ashenwood_hoe",
            new HoeItem(ModToolMaterial.ASHENWOOD, 0, 3f, new FabricItemSettings()));

    public static final Item HAMBURGER = registerItem("hamburger", new Item(new FabricItemSettings().food(ModFoodComponents.HAMBURGER)));

    private static void addItemsToBuildItemGroup(FabricItemGroupEntries entries) {
        entries.add(RECALL_SCROLL_BETA);
    }
    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(HAMBURGER);
    }

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries){
        entries.addAfter(Items.WOODEN_SWORD, ModItems.ASHENWOOD_WASTER);
        entries.addAfter(Items.WOODEN_AXE, ModItems.ASHENWOOD_HATCHET);
    }

    private static void addItemsToIngrItemGroup(FabricItemGroupEntries entries){
        entries.addAfter(Items.STICK, ModItems.ASHENWOOD_ROD);
    }

    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries){
        entries.addAfter(Items.WOODEN_HOE, ModItems.ASHENWOOD_SPADE);
        entries.addAfter(ModItems.ASHENWOOD_SPADE, ModItems.ASHENWOOD_PICKAXE);
        entries.addAfter(ModItems.ASHENWOOD_PICKAXE, ModItems.ASHENWOOD_HATCHET);
        entries.addAfter(ModItems.ASHENWOOD_HATCHET, ModItems.ASHENWOOD_HOE);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Havenox.MOD_ID, name), item);

    }
    public static void registerModItems(){

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToBuildItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngrItemGroup);
        Havenox.LOGGER.info("Registering Mod Items for " + Havenox.MOD_ID);
    }
}
