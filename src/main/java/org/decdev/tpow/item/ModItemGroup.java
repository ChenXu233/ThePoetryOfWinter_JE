/*
 * Copyright (c) 2024 DEC-Dev.
 *
 * This code is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this work. If not, see <https://www.gnu.org/licenses/>.
 */

package org.decdev.tpow.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.decdev.tpow.ThePoetryOfWinter;

public class ModItemGroup {

    public static final ItemGroup TPOW_ITEM_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(ThePoetryOfWinter.MOD_ID,"tpow_item_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.tpow_item_group")).icon(
                    ()-> new ItemStack(ModItems.A_BOWL_OF_RICE)
            ).entries(((displayContext, entries) -> {
                entries.add(ModItems.A_BOWL_OF_RICE);
                entries.add(Items.BOWL);
            })).build()
    );

    public static void registerModItemGroup(){
        ThePoetryOfWinter.LOGGER.info("Registering ThePoetryOfWinter Items");
    }
}
