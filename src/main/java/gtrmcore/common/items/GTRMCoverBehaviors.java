package gtrmcore.common.items;

import static gregtech.common.covers.CoverBehaviors.registerBehavior;
import static gtrmcore.api.util.GTRMUtility.gtrmId;

import gregtech.api.GTValues;
import gregtech.common.covers.CoverConveyor;
import gregtech.common.covers.CoverFluidRegulator;
import gregtech.common.covers.CoverPump;
import gregtech.common.covers.CoverRoboticArm;

public class GTRMCoverBehaviors {

    public static void init() {
        registerBehavior(gtrmId("primitive.conveyor"), GTRMMetaItems.CONVEYOR_MODULE_ULV,
                (def, tile, side) -> new CoverConveyor(def, tile, side, GTValues.ULV, 2));
        registerBehavior(gtrmId("primitive.pump"), GTRMMetaItems.ELECTRIC_PUMP_ULV,
                (def, tile, side) -> new CoverPump(def, tile, side, GTValues.ULV, 320));
        registerBehavior(gtrmId("primitive.robot.arm"), GTRMMetaItems.ROBOT_ARM_ULV,
                (def, tile, side) -> new CoverRoboticArm(def, tile, side, GTValues.ULV, 2));
        registerBehavior(gtrmId("primitive.fluid.regulator"), GTRMMetaItems.FLUID_REGULATOR_ULV,
                (def, tile, side) -> new CoverFluidRegulator(def, tile, side, GTValues.ULV, 16));
    }
}
