package gtrmcore.common.items;

import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class CobbleStoneSaw extends BaseItem {
    public CobbleStoneSaw() {
        super("cobblestone_saw");
        setMaxDamage(4);
    }

    @Override
    public boolean isEnchantable(@NotNull ItemStack stack) {
        return false;
    }
}
