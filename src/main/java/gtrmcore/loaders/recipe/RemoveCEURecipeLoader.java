package gtrmcore.loaders.recipe;

import gregtech.api.GTValues;
import gregtech.api.recipes.*;
import gtrmcore.api.GTRMValues;
import net.minecraft.util.ResourceLocation;

public class RemoveCEURecipeLoader {

    public static void init() {
        ModHandler.removeRecipeByName(new ResourceLocation(GTValues.MODID,"workbench_bronze"));
    }
}
