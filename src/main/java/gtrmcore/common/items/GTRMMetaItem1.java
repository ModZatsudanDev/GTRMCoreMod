package gtrmcore.common.items;

import static gtrmcore.common.items.GTRMMetaItems.*;

import gtrmcore.api.unification.material.GTRMMarkerMaterials;
import gtrmcore.api.unification.ore.GTRMOrePrefix;
import net.minecraft.client.resources.I18n;

import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.common.items.behaviors.TooltipBehavior;

public class GTRMMetaItem1 extends StandardMetaItem {

    public GTRMMetaItem1() {}

    @Override
    public void registerSubItems() {

        // GTRMparts 1~200

        // First Age parts 1~100
        WOODEN_HARD_HAMMER_HEAD = addItem(1, "wooden.hard.hammer.head");
        WOODEN_PICKAXE_HEAD = addItem(2, "wooden.pickaxe.head");
        COBBLESTONE_SAW_HEAD = addItem(3, "cobblestone.saw.head");
        WOOD_FIBER = addItem(4, "wood.fiber");

        // -----------------------------Gregtech parts 1001~------------------------------


        // Circuits 1001~1100

        // steam valves
        STEAM_VALVE = addItem(1001, "valve.steam").setUnificationData(GTRMOrePrefix.valve, GTRMMarkerMaterials.Component.LOW_STEAM);
        ELECTRIC_STEAM_VALVE = addItem(1002,"valve.electric").setUnificationData(GTRMOrePrefix.valve, GTRMMarkerMaterials.Component.LOW_STEAM);
        // high steam valves
        HIGH_STEAM_VALVE = addItem(1003, "valve.high_steam").setUnificationData(GTRMOrePrefix.valve, GTRMMarkerMaterials.Component.HIGH_STEAM);
        ELECTRIC_HIGH_STEAM_VALVE = addItem(1004,"valve.high_electric").setUnificationData(GTRMOrePrefix.valve, GTRMMarkerMaterials.Component.HIGH_STEAM);

        // Components 1101~1200

        // ULV
        ELECTRIC_MOTOR_ULV = addItem(1101, "electric.motor.ulv");
        ELECTRIC_PUMP_ULV = addItem(1102, "electric.pump.ulv")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.electric.pump.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.fluid_transfer_rate", 1280 / 4));
                }));
        CONVEYOR_MODULE_ULV = addItem(1103, "conveyor.module.ulv")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.conveyor.module.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.item_transfer_rate", 2));
                }));
        ELECTRIC_PISTON_ULV = addItem(1104, "electric.piston.ulv");
        ROBOT_ARM_ULV = addItem(1105, "robot.arm.ulv")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.robot.arm.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.item_transfer_rate", 2));
                }));
        FLUID_REGULATOR_ULV = addItem(1106, "fluid.regulator.ulv")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.fluid.regulator.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.fluid_transfer_rate", 320 / 4));
                }));
        FIELD_GENERATOR_ULV = addItem(1107, "field.generator.ulv");
        EMITTER_ULV = addItem(1108, "emitter.ulv");
        SENSOR_ULV = addItem(1109, "sensor.ulv");

        // low steam
        ELECTRIC_MOTOR_LOW = addItem(1110, "electric.motor.low");
        ELECTRIC_PUMP_LOW = addItem(1111, "electric.pump.low");
        CONVEYOR_MODULE_LOW = addItem(1112, "conveyor.module.low");
        ELECTRIC_PISTON_LOW = addItem(1113, "electric.piston.low");
        ROBOT_ARM_LOW = addItem(1114, "robot.arm.low");
        FIELD_GENERATOR_LOW = addItem(1115, "field.generator.low");
        EMITTER_LOW = addItem(1116, "emitter.low");
        SENSOR_LOW = addItem(1117, "sensor.low");

        //high steam
        ELECTRIC_MOTOR_HIGH = addItem(1118, "electric.motor.high");
        ELECTRIC_PUMP_HIGH = addItem(1119, "electric.pump.high");
        CONVEYOR_MODULE_HIGH = addItem(1120, "conveyor.module.high");
        ELECTRIC_PISTON_HIGH = addItem(1121, "electric.piston.high");
        ROBOT_ARM_HIGH = addItem(1122, "robot.arm.high");
        FIELD_GENERATOR_HIGH = addItem(1123, "field.generator.high");
        EMITTER_HIGH = addItem(1124, "emitter.high");
        SENSOR_HIGH = addItem(1125, "sensor.high");
    }
}
