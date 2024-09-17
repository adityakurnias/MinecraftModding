package com.kurnias.nyobamodding;

import com.kurnias.nyobamodding.item.ModItem;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NyobaModding implements ModInitializer {
	public static final String MOD_ID = "nyobamodding";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItem.registerModItem();
	}
}