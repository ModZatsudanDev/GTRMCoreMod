package gtrmcore.loaders;

import gtrmcore.common.items.GTRMMetaItems;
import gtrmcore.common.metatileentities.MetaTileEntitiesManager;
import gtrmcore.core.recipes.*;
// import gtrmcore.loaders.recipe.ingredients.*;

public class GTRMRecipeManager {

    private GTRMRecipeManager() {}

    public static void preLoad() {}

    public static void load() {
        GTRMMetaItems.init();
        MetaTileEntitiesManager.init();
    }

    public static void loadLow() {
        VanillaOverrideRecipes.init();
        CEUOverrideRecipe.init();
        GTRMRecipe.init();
        GTRMWoodRecipe.init();
        RemoveCEURecipe.init();
    }

    public static void loadLowest() {
        // LowestOverrideRecipeLoader.init();
        //
        // if (Loader.isModLoaded(GTRMValues.MODID_EIO)) {
        // EIORecipeLoader.init();
        // EIOSoulRecipeLoader.init();
        // }
        // if (Loader.isModLoaded(GTRMValues.MODID_AE)) {
        // AERecipeLoader.init();
        // }
        // if (GTEValues.isModLoadedDEDA()) {
        // DraconicRecipeLoader.init();
        // DraconicUpgradeRecipeLoader.init();
        // }
        // if (Loader.isModLoaded(GTEValues.MODID_GTFO)) {
        // GTFORecipeLoader.init();
        // }
        // if (Loader.isModLoaded(GTEValues.MODID_CHISEL)) {
        // ChiselRecipeLoader.init();
        // }
    }
}
