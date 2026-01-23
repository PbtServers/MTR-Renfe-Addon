package es.joseka.renfemtr.mod;

import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.registry.BlockRegistryObject;
import es.joseka.renfemtr.mod.blocks.*;
import org.mtr.mod.block.BlockPlatform;
import org.mtr.mod.block.BlockPlatformSlab;
import org.mtr.mod.block.BlockTicketBarrier;
import org.mtr.mod.block.BlockTicketMachine;

import static org.mtr.mod.Blocks.createDefaultBlockSettings;

public class Blocks{
    static {
        //Signals
        SIGNAL_TRENCH = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_trench"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_END_TEMP = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_end_temp"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_20 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_20"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_20_ADVERTISEMENT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_20_advertisement"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_20_ADVERTISEMENT_TEMP = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_20_advertisement_temp"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_20_PREADVERTISEMENT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_20_pre_advertisement"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_20_PREADVERTISEMENT_TEMP = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_20_pre_advertisement_temp"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_20_ORANGE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_20_orange"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_20_TEMP = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_20_temp"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_20_ADVERTISEMENT_ORANGE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_20_advertisement_orange"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_20_TEMP_ORANGE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_20_temp_orange"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_20_ADVERTISEMENT_TEMP_ORANGE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_20_advertisement_temp_orange"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_40 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_40"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_40_ADVERTISEMENT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_40_advertisement"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_40_ADVERTISEMENT_TEMP = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_40_advertisement_temp"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_40_PREADVERTISEMENT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_40_pre_advertisement"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_40_PREADVERTISEMENT_TEMP = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_40_pre_advertisement_temp"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_40_ORANGE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_40_orange"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_40_TEMP = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_40_temp"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_40_ADVERTISEMENT_ORANGE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_40_advertisement_orange"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_40_TEMP_ORANGE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_40_temp_orange"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_40_ADVERTISEMENT_TEMP_ORANGE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_40_advertisement_temp_orange"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_60 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_60"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_60_ADVERTISEMENT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_60_advertisement"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_60_PREADVERTISEMENT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_60_pre_advertisement"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_60_ORANGE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_60_orange"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_60_ADVERTISEMENT_ORANGE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_60_advertisement_orange"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_80 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_80"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_80_ADVERTISEMENT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_80_advertisement"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_80_PREADVERTISEMENT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_80_pre_advertisement"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_80_ORANGE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_80_orange"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_80_ADVERTISEMENT_ORANGE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_80_advertisement_orange"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_120 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_120"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_120_ADVERTISEMENT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_120_advertisement"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_120_PREADVERTISEMENT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_120_pre_advertisement"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_120_ORANGE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_120_orange"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_120_ADVERTISEMENT_ORANGE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "signal_120_advertisement_orange"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        SIGNAL_END_CATENARY = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "end_electric_line"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);

        //Station platform number
        PLAT_ADIF_NUMBER = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "plat_adif_number"), () -> new Block(new PlatformsNumber()), CreativeModeTabs.DECORATIONS);
        PLAT_CERCANIAS_NUMBER = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "plat_cercanias_number"), () -> new Block(new PlatformsNumber()), CreativeModeTabs.DECORATIONS);
        PLAT_RODALIES_NUMBER = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "plat_rodalies_number"), () -> new Block(new PlatformsNumber()), CreativeModeTabs.DECORATIONS);

        //Platforms blocks
        PLATFORM_ES_1 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_es_1"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.DECORATIONS);
        PLATFORM_ES_1_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_es_1_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.DECORATIONS);
        PLATFORM_ES_2 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_es_2"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.DECORATIONS);
        PLATFORM_ES_2_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_es_2_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.DECORATIONS);

        PLATFORM_ES_1_45 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_es_1_45"), () -> new Block(new BlockPlatformCustom(createDefaultBlockSettings(false))), CreativeModeTabs.DECORATIONS);
        PLATFORM_ES_1_SLAB_45 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_es_1_slab_45"), () -> new Block(new BlockPlatformSlabCustom(createDefaultBlockSettings(false))), CreativeModeTabs.DECORATIONS);
        PLATFORM_ES_2_45 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_es_2_45"), () -> new Block(new BlockPlatformCustom(createDefaultBlockSettings(false))), CreativeModeTabs.DECORATIONS);
        PLATFORM_ES_2_SLAB_45 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_es_2_slab_45"), () -> new Block(new BlockPlatformSlabCustom(createDefaultBlockSettings(false))), CreativeModeTabs.DECORATIONS);

        PLATFORM_BARRIER = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_barrier"), () -> new Block(new BlockPlatformBarrier(createDefaultBlockSettings(false))), CreativeModeTabs.DECORATIONS);
        PLATFORM_BARRIER_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_barrier_slab"), () -> new Block(new BlockPlatformBarrierSlab(createDefaultBlockSettings(false))), CreativeModeTabs.DECORATIONS);
        //Tickets machines
        RENFE_TICKET_MACHINE_1 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "renfe_ticket_machine_1"), () -> new Block(new BlockTicketMachine(createDefaultBlockSettings(true, blockState -> 5))), CreativeModeTabs.DECORATIONS);

        //Buffer Stop
        BUFFER_STOP = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "buffer_stop"), () -> new Block(new BufferStop()), CreativeModeTabs.DECORATIONS);

        //Barriers
        BARRIER_ENTRANCE_CERCANIAS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "barrier_cercanias_entrance"), () -> new Block(new BlockTicketBarrier(true)), CreativeModeTabs.DECORATIONS);
        BARRIER_ENTRANCE_RODALIES = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "barrier_rodalies_entrance"), () -> new Block(new BlockTicketBarrier(true)), CreativeModeTabs.DECORATIONS);
        BARRIER_EXIT_CERCANIAS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "barrier_cercanias_exit"), () -> new Block(new BlockTicketBarrier(false)), CreativeModeTabs.DECORATIONS);
        BARRIER_EXIT_RODALIES = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "barrier_rodalies_exit"), () -> new Block(new BlockTicketBarrier(false)), CreativeModeTabs.DECORATIONS);
        BARRIER_END = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "barrier_end"), () -> new Block(new DefaultVoxelShape()), CreativeModeTabs.DECORATIONS);

        //Station entrance
        STATION_NAME_ENTRANCE_CERCANIAS_NEW = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "station_name_entrance_cercanias_new"), () -> new Block(new BlockStationNameCercaniasNew(org.mtr.mod.Blocks.createDefaultBlockSettings(true, blockState -> 0).nonOpaque())), CreativeModeTabs.DECORATIONS);
        STATION_CERCANIAS_LOGO_NEW = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "station_cercanias_logo_new"), () -> new Block(new WallStationNamesLogos()), CreativeModeTabs.DECORATIONS);
        STATION_CERCANIAS_TRAIN_NEW = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "station_cercanias_train_new"), () -> new Block(new WallStationNamesLogos()), CreativeModeTabs.DECORATIONS);
        STATION_NAME_ENTRANCE_CERCANIAS_WHITE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "station_name_entrance_cercanias_white"), () -> new Block(new WallStationNamesLogos()), CreativeModeTabs.DECORATIONS);
        STATION_NAME_ENTRANCE_CERCANIAS_OLD = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "station_name_entrance_cercanias_old"), () -> new Block(new BlockStationNameCercaniasOld(org.mtr.mod.Blocks.createDefaultBlockSettings(true, blockState -> 0).nonOpaque())), CreativeModeTabs.DECORATIONS);
        STATION_CERCANIAS_LOGO_OLD = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "station_cercanias_logo_old"), () -> new Block(new WallStationNamesLogos()), CreativeModeTabs.DECORATIONS);
        STATION_CERCANIAS_TRAIN_OLD = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "station_cercanias_train_old"), () -> new Block(new WallStationNamesLogos()), CreativeModeTabs.DECORATIONS);
        STATION_NAME_ENTRANCE_CERCANIAS_RED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "station_name_entrance_cercanias_red"), () -> new Block(new WallStationNamesLogos()), CreativeModeTabs.DECORATIONS);
        STATION_NAME_RODALIES_ENTRANCE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "station_name_entrance_rodalies"), () -> new Block(new WallStationRodaliesLogo()), CreativeModeTabs.DECORATIONS);

        //Only blocks without blockitems

        CERCANIAS_TOTEM_BLOCK_1 = Init.REGISTRY.registerBlock(new Identifier(Init.MOD_ID, "cercanias_totem_station_1"), () -> new Block(new CercaniasTotem()));
        CERCANIAS_TOTEM_BLOCK_2 = Init.REGISTRY.registerBlock(new Identifier(Init.MOD_ID, "cercanias_totem_station_2"), () -> new Block(new DefaultVoxelShape()));
        CERCANIAS_TOTEM_BLOCK_3 = Init.REGISTRY.registerBlock(new Identifier(Init.MOD_ID, "cercanias_totem_station_3"), () -> new Block(new DefaultVoxelShape()));
        CERCANIAS_TOTEM_BLOCK_4 = Init.REGISTRY.registerBlock(new Identifier(Init.MOD_ID, "cercanias_totem_station_4"), () -> new Block(new DefaultVoxelShape()));
        CERCANIAS_TOTEM_BLOCK_5 = Init.REGISTRY.registerBlock(new Identifier(Init.MOD_ID, "cercanias_totem_station_5"), () -> new Block(new DefaultVoxelShape()));




    }

    public static final BlockRegistryObject SIGNAL_TRENCH;
    public static final BlockRegistryObject SIGNAL_END_TEMP;
    public static final BlockRegistryObject SIGNAL_20;
    public static final BlockRegistryObject SIGNAL_20_ADVERTISEMENT;
    public static final BlockRegistryObject SIGNAL_20_ADVERTISEMENT_TEMP;
    public static final BlockRegistryObject SIGNAL_20_PREADVERTISEMENT;
    public static final BlockRegistryObject SIGNAL_20_PREADVERTISEMENT_TEMP;
    public static final BlockRegistryObject SIGNAL_20_ORANGE;
    public static final BlockRegistryObject SIGNAL_20_TEMP;
    public static final BlockRegistryObject SIGNAL_20_ADVERTISEMENT_ORANGE;
    public static final BlockRegistryObject SIGNAL_20_TEMP_ORANGE;
    public static final BlockRegistryObject SIGNAL_20_ADVERTISEMENT_TEMP_ORANGE;
    public static final BlockRegistryObject SIGNAL_40;
    public static final BlockRegistryObject SIGNAL_40_ADVERTISEMENT;
    public static final BlockRegistryObject SIGNAL_40_ADVERTISEMENT_TEMP;
    public static final BlockRegistryObject SIGNAL_40_PREADVERTISEMENT;
    public static final BlockRegistryObject SIGNAL_40_PREADVERTISEMENT_TEMP;
    public static final BlockRegistryObject SIGNAL_40_ORANGE;
    public static final BlockRegistryObject SIGNAL_40_TEMP;
    public static final BlockRegistryObject SIGNAL_40_ADVERTISEMENT_ORANGE;
    public static final BlockRegistryObject SIGNAL_40_TEMP_ORANGE;
    public static final BlockRegistryObject SIGNAL_40_ADVERTISEMENT_TEMP_ORANGE;
    public static final BlockRegistryObject SIGNAL_60;
    public static final BlockRegistryObject SIGNAL_60_ADVERTISEMENT;
    public static final BlockRegistryObject SIGNAL_60_PREADVERTISEMENT;
    public static final BlockRegistryObject SIGNAL_60_ORANGE;
    public static final BlockRegistryObject SIGNAL_60_ADVERTISEMENT_ORANGE;
    public static final BlockRegistryObject SIGNAL_80;
    public static final BlockRegistryObject SIGNAL_80_ADVERTISEMENT;
    public static final BlockRegistryObject SIGNAL_80_PREADVERTISEMENT;
    public static final BlockRegistryObject SIGNAL_80_ORANGE;
    public static final BlockRegistryObject SIGNAL_80_ADVERTISEMENT_ORANGE;
    public static final BlockRegistryObject SIGNAL_120;
    public static final BlockRegistryObject SIGNAL_120_ADVERTISEMENT;
    public static final BlockRegistryObject SIGNAL_120_PREADVERTISEMENT;
    public static final BlockRegistryObject SIGNAL_120_ORANGE;
    public static final BlockRegistryObject SIGNAL_120_ADVERTISEMENT_ORANGE;
    public static final BlockRegistryObject PLAT_ADIF_NUMBER;
    public static final BlockRegistryObject PLAT_CERCANIAS_NUMBER;
    public static final BlockRegistryObject PLAT_RODALIES_NUMBER;
    public static final BlockRegistryObject PLATFORM_ES_1;
    public static final BlockRegistryObject PLATFORM_ES_1_SLAB;
    public static final BlockRegistryObject PLATFORM_ES_2;
    public static final BlockRegistryObject PLATFORM_ES_2_SLAB;
    public static final BlockRegistryObject RENFE_TICKET_MACHINE_1;
    public static final BlockRegistryObject BUFFER_STOP;
    public static final BlockRegistryObject SIGNAL_END_CATENARY;
    public static final BlockRegistryObject BARRIER_ENTRANCE_CERCANIAS;
    public static final BlockRegistryObject BARRIER_ENTRANCE_RODALIES;
    public static final BlockRegistryObject BARRIER_EXIT_CERCANIAS;
    public static final BlockRegistryObject BARRIER_EXIT_RODALIES;
    public static final BlockRegistryObject BARRIER_END;
    public static final BlockRegistryObject STATION_NAME_ENTRANCE_CERCANIAS_NEW;
    public static final BlockRegistryObject STATION_NAME_ENTRANCE_CERCANIAS_WHITE;
    public static final BlockRegistryObject STATION_CERCANIAS_LOGO_NEW;
    public static final BlockRegistryObject STATION_CERCANIAS_TRAIN_NEW;
    public static final BlockRegistryObject STATION_NAME_ENTRANCE_CERCANIAS_OLD;
    public static final BlockRegistryObject STATION_NAME_ENTRANCE_CERCANIAS_RED;
    public static final BlockRegistryObject STATION_CERCANIAS_LOGO_OLD;
    public static final BlockRegistryObject STATION_CERCANIAS_TRAIN_OLD;
    public static final BlockRegistryObject STATION_NAME_RODALIES_ENTRANCE;
    public static final BlockRegistryObject CERCANIAS_TOTEM_BLOCK_1;
    public static final BlockRegistryObject CERCANIAS_TOTEM_BLOCK_2;
    public static final BlockRegistryObject CERCANIAS_TOTEM_BLOCK_3;
    public static final BlockRegistryObject CERCANIAS_TOTEM_BLOCK_4;
    public static final BlockRegistryObject CERCANIAS_TOTEM_BLOCK_5;
    public static final BlockRegistryObject PLATFORM_ES_1_45;
    public static final BlockRegistryObject PLATFORM_ES_1_SLAB_45;
    public static final BlockRegistryObject PLATFORM_ES_2_45;
    public static final BlockRegistryObject PLATFORM_ES_2_SLAB_45;
    public static final BlockRegistryObject PLATFORM_BARRIER;
    public static final BlockRegistryObject PLATFORM_BARRIER_SLAB;





    public static void init() {
		Init.LOGGER.info("Registering MTR Renfe Addon blocks");
	}
}
