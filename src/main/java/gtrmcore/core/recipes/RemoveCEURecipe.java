package gtrmcore.core.recipes;

import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.items.MetaItems;
import gregtech.loaders.recipe.ComponentRecipes;
import gtrmcore.api.GTRMValues;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import gregtech.api.GTValues;
import gregtech.api.recipes.*;

import static gregtech.api.GTValues.LV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.Materials.Copper;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_LV;

public class RemoveCEURecipe {

    public static void init() {
        ModHandler.removeRecipeByName(new ResourceLocation(GTValues.MODID, "workbench_bronze"));
        ModHandler.removeRecipeByName(new ResourceLocation(GTRMValues.MODID_VANILLA, "crafting_table"));
    }
}
