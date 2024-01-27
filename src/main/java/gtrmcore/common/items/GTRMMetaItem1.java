package gtrmcore.common.items;

import static gtrmcore.common.items.GTRMMetaItems.*;

import net.minecraft.client.resources.I18n;

import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.common.items.behaviors.TooltipBehavior;

public class GTRMMetaItem1 extends StandardMetaItem {

    public GTRMMetaItem1() {}

    @Override
    public void registerSubItems() {
        // Primitive parts: ID 1-9
        PRIMITIVE_MOTOR = addItem(1, "primitive.motor");
        PRIMITIVE_PUMP = addItem(2, "primitive.pump")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.electric.pump.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.fluid_transfer_rate", 1280 / 4));
                }));
        PRIMITIVE_CONVEYOR = addItem(3, "primitive.conveyor")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.conveyor.module.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.item_transfer_rate", 2));
                }));
        PRIMITIVE_PISTON = addItem(4, "primitive.piston");
        PRIMITIVE_ROBOT_ARM = addItem(5, "primitive.robot.arm")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.robot.arm.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.item_transfer_rate", 2));
                }));
        PRIMITIVE_FLUID_REGULATOR = addItem(6, "primitive.fluid.regulator")
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.fluid.regulator.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.fluid_transfer_rate", 320 / 4));
                }));
        PRIMITIVE_FIELD_GENERATOR = addItem(7, "primitive.field.generator");
        PRIMITIVE_EMITTER = addItem(8, "primitive.emitter");
        PRIMITIVE_SENSOR = addItem(9, "primitive.sensor");
        WOODEN_HARD_HAMMER_HEAD = addItem(10, "wooden.hard.hammer.head");
        WOODEN_PICKAXE_HEAD = addItem(11, "wooden.pickaxe.head");
        COBBLESTONE_SAW_HEAD = addItem(12, "cobblestone.saw.head");
        WOOD_FIBER = addItem(13, "wood.fiber");
    }
}
