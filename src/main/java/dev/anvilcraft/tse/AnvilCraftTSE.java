package dev.anvilcraft.tse;

import dev.anvilcraft.lib.v2.registrum.Registrum;
import dev.anvilcraft.tse.data.AnvilCraftTSEDatagen;
import dev.anvilcraft.tse.init.TseItemGroup;
import dev.anvilcraft.tse.init.TseItems;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(AnvilCraftTSE.MOD_ID)
public class AnvilCraftTSE {
    public static final String MOD_ID = "anvilcraft_tse";
    public static final String MOD_NAME = "AnvilCraft: Trading Station Extension";
    public static final Registrum REGISTRUM = Registrum.create(AnvilCraftTSE.MOD_ID).defaultCreativeTab((ResourceKey<CreativeModeTab>) null);

    public AnvilCraftTSE(IEventBus modEventBus, ModContainer container) {
        TseItems.init();
        TseItemGroup.register(modEventBus);

        AnvilCraftTSEDatagen.init();
    }

    public static ResourceLocation of(String path) {
        return ResourceLocation.fromNamespaceAndPath(AnvilCraftTSE.MOD_ID, path);
    }
}
