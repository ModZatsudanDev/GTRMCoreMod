package gtrmcore.loaders.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.Stone;
import static gregtech.api.unification.material.Materials.Wood;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.loaders.recipe.handlers.ToolRecipeHandler.addToolRecipe;

import java.util.LinkedList;
import java.util.List;

import buildcraft.api.tools.IToolWrench;
import cofh.api.item.IToolHammer;
import gregtech.api.GTValues;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.ToolItems;
import gregtech.tools.enchants.EnchantmentHardHammer;
import gtrmcore.common.items.GTRMMetaItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

import gregtech.api.GregTechAPI;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.items.OreDictNames;
import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.properties.BlastProperty;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.ConfigHolder;
import gregtech.common.items.MetaItems;
import gregtech.common.metatileentities.MetaTileEntities;
import  gregtech.api.items.toolitem.ToolClasses;

import gregicality.multiblocks.api.fluids.GCYMFluidStorageKeys;
import gregicality.multiblocks.api.unification.GCYMMaterialFlags;
import gregicality.multiblocks.api.unification.properties.GCYMPropertyKey;

import gtrmcore.api.GTRMValues;
import gtrmcore.api.unification.material.GTRMMaterials;

public class CEUOverrideRecipeLoader {

    public static void init() {
        materials();
        items();
        blocks();

    }

    private static void materials() {

    }
        private static void items() {
    }

    private static void blocks() {
            }
}