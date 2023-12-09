package gtrmcore.loaders;

import gtrmcore.common.items.GTRMMetaItems;
import gtrmcore.common.metatileentities.MetaTileEntitiesManager;

public class GTRMRecipeManager {

    private GTRMRecipeManager() {}

    public static void preLoad() {}

    public static void load() {
        GTRMMetaItems.init();
        MetaTileEntitiesManager.init();
    }

    public static void loadLow() {}

    public static void loadLowest() {}
}
