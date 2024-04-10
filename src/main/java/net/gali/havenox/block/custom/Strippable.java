package net.gali.havenox.block.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;

public interface Strippable {
    static ItemConvertible getStripped(Item item) {
        return null;
    }

    ItemConvertible getStripped();
}
