package gtrmcore.common.items;

import static gtrmcore.common.items.GTRMMetaItems.*;

import gregtech.api.unification.ore.OrePrefix;
import gtrmcore.api.unification.material.GTRMMarkerMaterials;
import gtrmcore.api.unification.material.GTRMMarkerMaterials.Valve;
import gregtech.api.unification.material.MarkerMaterial;
import gregtech.api.unification.material.MarkerMaterials;
import net.minecraft.client.resources.I18n;

import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.common.items.behaviors.TooltipBehavior;

public class GTRMMetaItem1 extends StandardMetaItem {

    public GTRMMetaItem1() {}

    @Override
    public void registerSubItems() {
        // Covers 1~27

        // Low Steam Parts
        VALVE_STEAM = addItem(1, "valve.steam").setUnificationData(OrePrefix.component, Valve.Valve_low);
        VALVE_ELECTRIC = addItem(2, "valve.electric").setUnificationData(OrePrefix.component, Valve.Valve_low);
        ELECTRIC_MOTOR_LOW = addItem(3, "electric.motor.low");
        ELECTRIC_PUMP_LOW = addItem(4, "electric.pump.low");
        CONVEYOR_MODULE_LOW = addItem(5, "conveyor.module.low");
        ELECTRIC_PISTON_LOW = addItem(6, "electric.piston.low");
        ROBOT_ARM_LOW = addItem(7, "robot.arm.low");
        FIELD_GENERATOR_LOW = addItem(8, "field.generator.low");
        EMITTER_LOW = addItem(9, "emitter.low");
        SENSOR_LOW = addItem(10, "sensor.low");

        // High Steam Parts
        VALVE_HIGH_STEAM = addItem(11, "valve.high_steam").setUnificationData(OrePrefix.component, Valve.Valve_high);
        VALVE_HIGH_ELECTRIC = addItem(12, "valve.high_electric").setUnificationData(OrePrefix.component, Valve.Valve_high);
        ELECTRIC_MOTOR_HIGH = addItem(13, "electric.motor.high");
        ELECTRIC_PUMP_HIGH = addItem(14, "electric.pump.high");
        CONVEYOR_MODULE_HIGH = addItem(15, "conveyor.module.high");
        ELECTRIC_PISTON_HIGH = addItem(16, "electric.piston.high");
        ROBOT_ARM_HIGH = addItem(17, "robot.arm.high");
        FIELD_GENERATOR_HIGH = addItem(18, "field.generator.high");
        EMITTER_HIGH = addItem(19, "emitter.high");
        SENSOR_HIGH = addItem(20, "sensor.high");

        // ULV Parts
        ELECTRIC_MOTOR_ULV = addItem(21, "electric.motor.ulv");
        ELECTRIC_PUMP_ULV = addItem(22, "electric.pump.ulv")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.electric.pump.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.fluid_transfer_rate", 1280 / 4));
                }));
        CONVEYOR_MODULE_ULV = addItem(23, "conveyor.module.ulv")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.conveyor.module.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.item_transfer_rate", 2));
                }));
        ELECTRIC_PISTON_ULV = addItem(24, "electric.piston.ulv");
        ROBOT_ARM_ULV = addItem(25, "robot.arm.ulv")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.robot.arm.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.item_transfer_rate", 2));
                }));
        FLUID_REGULATOR_ULV = addItem(26, "fluid.regulator.ulv")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.fluid.regulator.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.fluid_transfer_rate", 320 / 4));
                }));
        FIELD_GENERATOR_ULV = addItem(27, "field.generator.ulv");
        EMITTER_ULV = addItem(28, "emitter.ulv");
        SENSOR_ULV = addItem(29, "sensor.ulv");

        // GTRMparts 100~200
        WOODEN_HARD_HAMMER_HEAD = addItem(101, "wooden.hard.hammer.head");
        WOODEN_PICKAXE_HEAD = addItem(102, "wooden.pickaxe.head");
        COBBLESTONE_SAW_HEAD = addItem(103, "cobblestone.saw.head");
        WOOD_FIBER = addItem(104, "wood.fiber");
    }
}
