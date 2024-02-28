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
        // Primitive parts
        ELECTRIC_MOTOR_ULV = addItem(1, "primitive.motor");
        ELECTRIC_PUMP_ULV = addItem(2, "primitive.pump")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.electric.pump.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.fluid_transfer_rate", 1280 / 4));
                }));
        CONVEYOR_MODULE_ULV = addItem(3, "primitive.conveyor")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.conveyor.module.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.item_transfer_rate", 2));
                }));
        ELECTRIC_PISTON_ULV = addItem(4, "primitive.piston");
        ROBOT_ARM_ULV = addItem(5, "primitive.robot.arm")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.robot.arm.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.item_transfer_rate", 2));
                }));
        FLUID_REGULATOR_ULV = addItem(6, "primitive.fluid.regulator")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.fluid.regulator.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.fluid_transfer_rate", 320 / 4));
                }));
        FIELD_GENERATOR_ULV = addItem(7, "primitive.field.generator");
        EMITTER_ULV = addItem(8, "primitive.emitter");
        SENSOR_ULV = addItem(9, "primitive.sensor");

        // GTRMparts 101~200

        // First Age parts 101~110
        WOODEN_HARD_HAMMER_HEAD = addItem(101, "wooden.hard.hammer.head");
        WOODEN_PICKAXE_HEAD = addItem(102, "wooden.pickaxe.head");
        COBBLESTONE_SAW_HEAD = addItem(103, "cobblestone.saw.head");
        WOOD_FIBER = addItem(104, "wood.fiber");

        // Gregtech parts 1001~

        // Circuits

        // steam valves
        STEAM_VALVE = addItem(1001, "valve.steam").setUnificationData(GTRMOrePrefix.valve, GTRMMarkerMaterials.Component.LOW_STEAM);
        ELECTRIC_STEAM_VALVE = addItem(1002,"valve.electric").setUnificationData(GTRMOrePrefix.valve, GTRMMarkerMaterials.Component.LOW_STEAM);
        // high steam valves
        HIGH_STEAM_VALVE = addItem(1003, "valve.high_steam").setUnificationData(GTRMOrePrefix.valve, GTRMMarkerMaterials.Component.HIGH_STEAM);
        ELECTRIC_HIGH_STEAM_VALVE = addItem(1004,"valve.high_electric").setUnificationData(GTRMOrePrefix.valve, GTRMMarkerMaterials.Component.HIGH_STEAM);
    }
}
