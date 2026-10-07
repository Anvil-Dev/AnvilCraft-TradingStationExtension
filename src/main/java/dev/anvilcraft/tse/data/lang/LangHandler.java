package dev.anvilcraft.tse.data.lang;

import dev.anvilcraft.lib.v2.registrum.providers.RegistrumLangProvider;
import dev.anvilcraft.tse.AnvilCraftTSE;

public class LangHandler {
    public static void init(RegistrumLangProvider provider) {
        provider.add("component_content.anvilcraft.mod_name" + AnvilCraftTSE.MOD_ID, AnvilCraftTSE.MOD_NAME);
    }
}
