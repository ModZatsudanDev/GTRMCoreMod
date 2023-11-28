package gtrm;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Tags.MODID, name = Tags.MODNAME, version = Tags.VERSION)
public class GTRMCoreMod {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        event.getModLog().info("GTRM CoreMod was working on v" + Tags.VERSION);
    }
}
