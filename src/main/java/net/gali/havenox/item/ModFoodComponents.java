package net.gali.havenox.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent HAMBURGER = new FoodComponent.Builder().hunger(9).saturationModifier(0.75f)
            .build();
}
