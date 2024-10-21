package org.decdev.thepoetryofwinter.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.decdev.thepoetryofwinter.ThePoetryOfWinter;

public class ModItems {

    public static final Item AA_SWORDMAN = registerItems("aaswordman", new Item(new Item.Settings().maxCount(1)));

    public static Item registerItems(String id, Item item) {
        return Registry.register(
                Registries.ITEM, Identifier.of(ThePoetryOfWinter.MOD_ID,id), item);
    }

    public static void registerModItems(){
        ThePoetryOfWinter.LOGGER.info("Registering ThePoetryOfWinter Items");
    }
}
