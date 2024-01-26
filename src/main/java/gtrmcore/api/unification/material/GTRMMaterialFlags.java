package gtrmcore.api.unification.material;

import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.ToolProperty;

public class GTRMMaterialFlags {

    public static void init() {
        Materials.Wood.setProperty(PropertyKey.TOOL, new ToolProperty(10.0F, 2.0F, 10, 1));
    }
}
