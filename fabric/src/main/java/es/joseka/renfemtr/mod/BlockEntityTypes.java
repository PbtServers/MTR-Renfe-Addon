package es.joseka.renfemtr.mod;


import es.joseka.renfemtr.mod.blocks.BlockStationNameCercaniasNew;
import es.joseka.renfemtr.mod.blocks.BlockStationNameCercaniasOld;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.registry.BlockEntityTypeRegistryObject;
import org.mtr.mod.block.BlockStationNameEntrance;

@SuppressWarnings("unchecked")

public class BlockEntityTypes {
    static {
        STATION_NAME_ENTRANCE_CERCANIAS_NEW = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "station_name_entrance_cercanias_new"), BlockStationNameCercaniasNew.TileEntityBlockStationNameCercaniasNew::new, Blocks.STATION_NAME_ENTRANCE_CERCANIAS_NEW::get);
        STATION_NAME_ENTRANCE_CERCANIAS_OLD = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "station_name_entrance_cercanias_old"), BlockStationNameCercaniasOld.TileEntityBlockStationNameCercaniasOld::new, Blocks.STATION_NAME_ENTRANCE_CERCANIAS_OLD::get);
    }
    public static final BlockEntityTypeRegistryObject<BlockStationNameCercaniasNew.TileEntityBlockStationNameCercaniasNew> STATION_NAME_ENTRANCE_CERCANIAS_NEW;
    public static final BlockEntityTypeRegistryObject<BlockStationNameCercaniasOld.TileEntityBlockStationNameCercaniasOld> STATION_NAME_ENTRANCE_CERCANIAS_OLD;

    public static void init() {
        Init.LOGGER.info("Registering MTR Renfe Addon block entity types");
    }
}
