package gtrmcore.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class BaseItem extends Item {
    public BaseItem(String registryName) {
        super();
        setRegistryName(registryName);
        setTranslationKey(registryName);
    }
}
