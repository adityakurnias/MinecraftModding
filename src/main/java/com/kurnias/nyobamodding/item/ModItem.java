package com.kurnias.nyobamodding.item;

import com.kurnias.nyobamodding.NyobaModding;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem {
    public static final Item HAMMER = registerItem("hammer", new Item(new Item.Settings()));
    public static final Item SUN = registerItem("sun", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NyobaModding.MOD_ID, name), item);
    }

    public static void registerModItem() {
        NyobaModding.LOGGER.info("Registering Item for" + NyobaModding.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(HAMMER);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SUN);
        });
    }
}
