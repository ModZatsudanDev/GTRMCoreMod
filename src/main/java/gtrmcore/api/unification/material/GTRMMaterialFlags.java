package gtrmcore.api.unification.material;

import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.ToolProperty;

public class GTRMMaterialFlags {

    public static void init() {

        Materials.Wood.setProperty(PropertyKey.TOOL,
                new ToolProperty(5.0F, 2.0F, 5, 1));
        Materials.Stone.setProperty(PropertyKey.TOOL,
                new ToolProperty(6.0F,2.0F,10,2));
    }
}
