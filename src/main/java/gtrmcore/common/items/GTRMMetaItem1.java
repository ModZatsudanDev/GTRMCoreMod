package gtrmcore.common.items;

import static gtrmcore.common.items.GTRMMetaItems.*;

import net.minecraft.client.resources.I18n;

import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.common.items.behaviors.TooltipBehavior;

public class GTRMMetaItem1 extends StandardMetaItem {

    public GTRMMetaItem1() {}

    @Override
    public void registerSubItems() {
        // Primitive parts
        PRIMITIVE_MOTOR = addItem(0, "primitive.motor");
        PRIMITIVE_PUMP = addItem(1, "primitive.pump")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.electric.pump.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.fluid_transfer_rate", 1280 / 4));
                }));
        PRIMITIVE_CONVEYOR = addItem(2, "primitive.conveyor")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.conveyor.module.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.item_transfer_rate", 2));
                }));
        PRIMITIVE_PISTON = addItem(3, "primitive.piston");
        PRIMITIVE_ROBOT_ARM = addItem(4, "primitive.robot.arm")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.robot.arm.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.item_transfer_rate", 2));
                }));
        PRIMITIVE_FLUID_REGULATOR = addItem(5, "primitive.fluid.regulator")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.fluid.regulator.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.fluid_transfer_rate", 320 / 4));
                }));
        PRIMITIVE_FIELD_GENERATOR = addItem(6, "primitive.field.generator");
        PRIMITIVE_EMITTER = addItem(7, "primitive.emitter");
        PRIMITIVE_SENSOR = addItem(8, "primitive.sensor");

        // GTRMparts 100~200
        WOODEN_HARD_HAMMER_HEAD = addItem(101, "wooden.hard.hammer.head");
        WOODEN_HARD_HAMMER = addItem(102, "wooden.hard.hammer");
        WOODEN_PICKAXE_HEAD = addItem(103, "wooden.pickaxe.head");
        COBBLESTONE_SAW_HEAD = addItem(104, "cobblestone.saw.head");
        COBBLESTONE_SAW = addItem(105, "cobblestone.saw");
        WOOD_FIBER = addItem(106, "wood.fiber");
    }
}
