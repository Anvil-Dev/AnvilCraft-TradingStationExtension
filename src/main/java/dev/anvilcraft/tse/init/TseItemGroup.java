package dev.anvilcraft.tse.init;

import dev.anvilcraft.tse.AnvilCraftTSE;
import dev.dubhe.anvilcraft.init.item.ModItemGroups;
import dev.dubhe.anvilcraft.init.item.tabs.DisplayItemsGenerator;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static dev.anvilcraft.tse.AnvilCraftTSE.REGISTRUM;

public class TseItemGroup extends DisplayItemsGenerator {
    private static final DeferredRegister<CreativeModeTab> REGISTER = DeferredRegister.create(
        Registries.CREATIVE_MODE_TAB,
        AnvilCraftTSE.MOD_ID
    );

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> INSTANCE = TseItemGroup.REGISTER.register(
        "tab",
        () -> CreativeModeTab.builder()
            .icon(TseItems.PERMISSION_CARD::asStack)
            .title(REGISTRUM.addLang("itemGroup", AnvilCraftTSE.of("tab"), AnvilCraftTSE.MOD_NAME))
            .displayItems(new TseItemGroup())
            .withTabsBefore(ModItemGroups.ANVILCRAFT_BUILDING_BLOCKS.getId(), ModItemGroups.ANVILCRAFT_ITEMS.getId())
            .build()
    );

    @Override
    public void accept() {
        this.plain(TseItems.PERMISSION_CARD); // 权限卡
    }

    public static void register(IEventBus modEventBus) {
        TseItemGroup.REGISTER.register(modEventBus);
    }
}
