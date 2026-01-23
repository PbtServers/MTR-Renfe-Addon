package es.joseka.renfemtr.mod;


import es.joseka.renfemtr.mod.data.ExtendedRailType;
import es.joseka.renfemtr.mod.items.*;
import es.joseka.renfemtr.mod.Blocks;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.Item;
import org.mtr.mapping.registry.ItemRegistryObject;
import org.mtr.mod.item.ItemRailModifier;

public class Items {
    static {
        PLAT_NUMBER_CHANGER = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "plat_number_changer"), itemSettings -> new Item(new PlatformChangerNumber(itemSettings.maxCount(1))), CreativeModeTabs.DECORATIONS);
        CERCANIAS_TOTEM = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "cercanias_totem"), itemSettings -> new Item(new TotemItem(Blocks.CERCANIAS_TOTEM_BLOCK_1.get(), itemSettings)), CreativeModeTabs.DECORATIONS);
        RAIL_CONNECTOR_5 = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "rail_connector_5"), itemSettings -> new Item(new ExtendedItemRailModifier(true, false, true, false, ExtendedRailType.PINK, itemSettings)), CreativeModeTabs.RAILWAYS);
        RAIL_CONNECTOR_30 = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "rail_connector_30"), itemSettings -> new Item(new ExtendedItemRailModifier(true, false, true, false, ExtendedRailType.DIRT, itemSettings)), CreativeModeTabs.RAILWAYS);
    }
    public static final ItemRegistryObject PLAT_NUMBER_CHANGER;
    public static final ItemRegistryObject CERCANIAS_TOTEM;
    public static final ItemRegistryObject RAIL_CONNECTOR_5;
    public static final ItemRegistryObject RAIL_CONNECTOR_30;


    public static void init() {
        Init.LOGGER.info("Registering MTR Renfe Addon Items");
    }
}
