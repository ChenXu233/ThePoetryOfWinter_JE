package org.decdev.tpow.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.decdev.tpow.ThePoetryOfWinter;

public class ModBlocks {

    public static final Block AA_SWORDMAN_BLOCK = register("aaswordman_block", new Block(AbstractBlock.Settings.create().strength(3.0f,3.0f)));

    public static void registerBlockItems(String id, Block block){
        Item item = Registry.register(Registries.ITEM,Identifier.of(ThePoetryOfWinter.MOD_ID,id),new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS,item);
        }
    }

    public static Block register(String id, Block block){
        registerBlockItems(id,block);
        return Registry.register(Registries.BLOCK, Identifier.of(ThePoetryOfWinter.MOD_ID,id),block);
    }
    public static void registerModBlocks(){
        ThePoetryOfWinter.LOGGER.info("Registering ThePoetryOfWinter Blocks");
    }
}
