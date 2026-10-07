package dev.anvilcraft.tse.data;

import dev.anvilcraft.lib.v2.registrum.providers.ProviderType;
import dev.anvilcraft.tse.data.lang.LangHandler;
import dev.anvilcraft.tse.data.tags.TagsHandler;

import static dev.anvilcraft.tse.AnvilCraftTSE.REGISTRUM;

public class AnvilCraftTSEDatagen {
    public static void init() {
        REGISTRUM.addDataGenerator(ProviderType.ITEM_TAGS, TagsHandler::initItem);
        REGISTRUM.addDataGenerator(ProviderType.LANG, LangHandler::init);
    }
}
