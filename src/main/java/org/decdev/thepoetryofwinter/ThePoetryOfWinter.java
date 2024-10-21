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

package org.decdev.thepoetryofwinter;

import net.fabricmc.api.ModInitializer;

import org.decdev.thepoetryofwinter.block.ModBlocks;
import org.decdev.thepoetryofwinter.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThePoetryOfWinter implements ModInitializer {
	public static final String MOD_ID = "thepoetryofwinter";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}