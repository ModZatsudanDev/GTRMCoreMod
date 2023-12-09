package gtrmcore.common;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import gregtech.api.unification.material.event.MaterialEvent;
import gtrmcore.api.GTRMValues;
import gtrmcore.api.unification.material.GTRMMaterials;

@Mod.EventBusSubscriber(modid = GTRMValues.MODID)
public class GTRMEventHandlers {

    public GTRMEventHandlers() {}

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerMaterialsHigh(MaterialEvent event) {
        GTRMMaterials.registerMaterialsHigh();
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void registerMaterialsLow(MaterialEvent event) {
        GTRMMaterials.registerMaterialsLow();
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerMaterialsLowest(MaterialEvent event) {
        GTRMMaterials.registerMaterialsLowest();
    }
}
