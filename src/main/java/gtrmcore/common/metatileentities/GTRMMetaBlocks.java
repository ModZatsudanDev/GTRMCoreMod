package gtrmcore.common.metatileentities;

import static gregtech.client.model.modelfactories.MaterialBlockModelLoader.registerItemModel;
import static gregtech.common.blocks.MetaBlocks.statePropertiesToString;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;

import gtrmcore.common.blocks.CompactCobblestone;

public class GTRMMetaBlocks {

    public static final CompactCobblestone COMPACT_COBBLESTONE = new CompactCobblestone();

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(COMPACT_COBBLESTONE);
    }

    @SideOnly(Side.CLIENT)
    private static void registerItemModel(@NotNull Block block) {
        for (IBlockState state : block.getBlockState().getValidStates()) {
            // noinspection ConstantConditions
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),
                    block.getMetaFromState(state),
                    new ModelResourceLocation(block.getRegistryName(),
                            statePropertiesToString(state.getProperties())));
        }
    }
}
