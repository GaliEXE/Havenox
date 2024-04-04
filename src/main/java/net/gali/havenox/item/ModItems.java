package net.gali.havenox.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gali.havenox.Havenox;
import net.gali.havenox.block.ModBlocks;
import net.gali.havenox.item.custom.RecallScrollBETAItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RECALL_SCROLL_ITEM = registerItem("recall_scroll",
            new RecallScrollBETAItem(new FabricItemSettings().maxDamage(12)));

    private static void addItemsToItemGroup(FabricItemGroupEntries entries) {
        entries.add(RECALL_SCROLL_ITEM);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Havenox.MOD_ID, name), item);

    }
    public static void registerModItems(){

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToItemGroup);
        Havenox.LOGGER.info("Registering Mod Items for " + Havenox.MOD_ID);
    }
}
