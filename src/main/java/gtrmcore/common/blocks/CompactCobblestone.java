package gtrmcore.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CompactCobblestone extends Block {

    public CompactCobblestone() {
        super(Material.IRON);
        setTranslationKey("compact_cobblestone");
        setHardness(2.5f);
        setResistance(10.0f);
        setSoundType(SoundType.STONE);
        setHarvestLevel("pickaxe", 0);
        setRegistryName("compact_cobblestone");
        setDefaultState(this.blockState.getBaseState());
    }
}
