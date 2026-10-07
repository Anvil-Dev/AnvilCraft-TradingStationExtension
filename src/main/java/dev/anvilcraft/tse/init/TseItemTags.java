package dev.anvilcraft.tse.init;

import dev.anvilcraft.tse.AnvilCraftTSE;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class TseItemTags {
    public static TagKey<Item> CARDS = TseItemTags.of("plugins");

    private static TagKey<Item> of(String path) {
        return TagKey.create(Registries.ITEM, AnvilCraftTSE.of(path));
    }
}
