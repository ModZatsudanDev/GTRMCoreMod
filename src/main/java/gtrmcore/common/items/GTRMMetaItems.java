package gtrmcore.common.items;

import gregtech.api.items.metaitem.MetaItem;

public class GTRMMetaItems {

    private GTRMMetaItems() {}

    public static MetaItem<?>.MetaValueItem PRIMITIVE_MOTOR;
    public static MetaItem<?>.MetaValueItem PRIMITIVE_PUMP;
    public static MetaItem<?>.MetaValueItem PRIMITIVE_CONVEYOR;
    public static MetaItem<?>.MetaValueItem PRIMITIVE_PISTON;
    public static MetaItem<?>.MetaValueItem PRIMITIVE_ROBOT_ARM;
    public static MetaItem<?>.MetaValueItem PRIMITIVE_FLUID_REGULATOR;
    public static MetaItem<?>.MetaValueItem PRIMITIVE_FIELD_GENERATOR;
    public static MetaItem<?>.MetaValueItem PRIMITIVE_EMITTER;
    public static MetaItem<?>.MetaValueItem PRIMITIVE_SENSOR;
    public static MetaItem<?>.MetaValueItem COBBLESTONE_SAW_HEAD;
    public static MetaItem<?>.MetaValueItem WOODEN_HARD_HAMMER_HEAD;
    public static MetaItem<?>.MetaValueItem WOODEN_PICKAXE_HEAD;
    public static MetaItem<?>.MetaValueItem WOOD_FIBER;
    public static MetaItem<?>.MetaValueItem STEAM_VALVE;
    public static MetaItem<?>.MetaValueItem ELECTRIC_STEAM_VALVE;
    public static MetaItem<?>.MetaValueItem HIGH_STEAM_VALVE;
    public static MetaItem<?>.MetaValueItem ELECTRIC_HIGH_STEAM_VALVE;


    public static void init() {
        GTRMMetaItem1 metaItem1 = new GTRMMetaItem1();
        metaItem1.setRegistryName("meta_item_1");
    }
}
