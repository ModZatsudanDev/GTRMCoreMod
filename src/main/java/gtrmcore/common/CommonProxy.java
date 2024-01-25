package gtrmcore.common;

import java.util.function.Function;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import gregtech.api.GregTechAPI;
import gregtech.api.cover.CoverDefinition;
import gtrmcore.api.GTRMValues;
import gtrmcore.api.util.GTRMLog;
import gtrmcore.common.items.GTRMCoverBehaviors;
import gtrmcore.common.items.GTRMMetaItems;
import gtrmcore.loaders.recipe.GTRMRecipeManager;

import static gtrmcore.common.metatileentities.GTRMMetaBlocks.COMPACT_COBBLESTONE;

@Mod.EventBusSubscriber(modid = GTRMValues.MODID)
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        GTRMMetaItems.init();
    }

    public void init(FMLInitializationEvent event) {}

    public void postInit(FMLPostInitializationEvent event) {}

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        GTRMLog.logger.info("Registering Blocks...");
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(COMPACT_COBBLESTONE);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        GTRMLog.logger.info("Registering Items...");
        IForgeRegistry<Item> registry = event.getRegistry();

        // registry.register(createItemBlock(GTRM_BLOCK_METAL_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(COMPACT_COBBLESTONE, ItemBlock::new));
    }

    @SubscribeEvent
    public static void registerCovers(GregTechAPI.RegisterEvent<CoverDefinition> event) {
        GTRMLog.logger.info("Registering Covers...");
        GTRMCoverBehaviors.init();
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        GTRMLog.logger.info("Registering Recipes...");
        GTRMRecipeManager.load();
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void registerRecipesLow(RegistryEvent.Register<IRecipe> event) {
        GTRMLog.logger.info("Registering Recipes...");
        GTRMRecipeManager.loadLow();
    }

    @SubscribeEvent
    public static void syncConfigValues(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(GTRMValues.MODID)) {
            ConfigManager.sync(GTRMValues.MODID, Config.Type.INSTANCE);
        }
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        GTRMLog.logger.info("Registering Recipes...");
        GTRMRecipeManager.loadLowest();
    }

    private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer) {
        ItemBlock itemBlock = producer.apply(block);
        ResourceLocation registryName = block.getRegistryName();
        if (registryName == null) {
            throw new IllegalArgumentException("Block " + block.getTranslationKey() + " has no registry name.");
        }
        itemBlock.setRegistryName(registryName);
        return itemBlock;
    }

    public void onPreLoad() {}

    public void onLoad() {}

    public void onPostLoad() {}

    public void onLoadComplete(FMLLoadCompleteEvent event) {}
}
