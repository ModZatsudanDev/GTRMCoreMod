package gtrmcore.core.recipes;

import gtrmcore.api.GTRMValues;
import net.minecraft.util.ResourceLocation;

import gregtech.api.GTValues;
import gregtech.api.recipes.*;

public class RemoveCEURecipes {

    public static void init() {
        ModHandler.removeRecipeByName(new ResourceLocation(GTValues.MODID, "workbench_bronze"));
        ModHandler.removeRecipeByName(new ResourceLocation(GTRMValues.MODID_VANILLA, "crafting_table"));
    }
}
