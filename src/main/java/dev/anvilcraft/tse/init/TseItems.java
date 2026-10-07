package dev.anvilcraft.tse.init;

import dev.anvilcraft.lib.v2.registrum.util.entry.ItemEntry;
import dev.anvilcraft.tse.data.recipe.RegistrumItemRecipeLoader;
import dev.anvilcraft.tse.item.PermissionCardItem;
import dev.dubhe.anvilcraft.util.DataGenUtil;

import static dev.anvilcraft.tse.AnvilCraftTSE.REGISTRUM;

public class TseItems {
    public static ItemEntry<PermissionCardItem> PERMISSION_CARD = REGISTRUM
        .item("permission_card", PermissionCardItem::new)
        .tag(TseItemTags.CARDS)
        .model(DataGenUtil::noExtraModelOrState) // TODO: 补全纹理和模型
        .recipe(RegistrumItemRecipeLoader::initPermissionCard)
        .register();

    public static void init() {
    }
}
