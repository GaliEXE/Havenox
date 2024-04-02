package net.gali.havenox.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gali.havenox.Havenox;
import net.gali.havenox.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {


    public static void registerItemGroups(){
        Havenox.LOGGER.info("Registering Item Groups for " + Havenox.MOD_ID);
    }
}
