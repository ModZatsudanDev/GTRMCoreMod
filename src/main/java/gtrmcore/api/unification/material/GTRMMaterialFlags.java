package gtrmcore.api.unification.material;

import static gregtech.api.GTValues.ULV;
import static gregtech.api.GTValues.V;
import static gregtech.api.unification.material.info.MaterialFlags.*;

import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.properties.*;
import gregtech.api.unification.ore.OrePrefix;

public class GTRMMaterialFlags {

    public static void init() {
        // Iron
        Materials.Iron.addFlags(GENERATE_DOUBLE_PLATE);

        // Invar
        Materials.Invar.addFlags(GENERATE_SMALL_GEAR);

        // Graphene
        Materials.Graphene.addFlags(GENERATE_FINE_WIRE);

        // Kanthal
        Materials.Kanthal.addFlags(GENERATE_FINE_WIRE);

        // Paper
        Materials.Paper.addFlags(GENERATE_RING);

        // WroughtIron
        Materials.WroughtIron.addFlags(GENERATE_SMALL_GEAR);

        // RedAlloy
        Materials.RedAlloy.addFlags(GENERATE_ROD);
    }
}