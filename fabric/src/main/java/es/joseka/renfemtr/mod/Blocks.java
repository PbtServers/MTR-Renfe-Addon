package es.joseka.renfemtr.mod;

import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mapping.registry.BlockRegistryObject;
import es.joseka.renfemtr.mod.blocks.*;
import org.mtr.mod.block.BlockPlatform;
import org.mtr.mod.block.BlockTicketBarrier;
import org.mtr.mod.block.BlockTicketMachine;

import static org.mtr.mod.Blocks.createDefaultBlockSettings;

public class Blocks{
    static {
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
        PLAT_ADIF_NUMBER = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "plat_adif_number"), () -> new Block(new PlatformsNumber()), CreativeModeTabs.SIGNALS);
        PLAT_CERCANIAS_NUMBER = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "plat_cercanias_number"), () -> new Block(new PlatformsNumber()), CreativeModeTabs.SIGNALS);
        PLAT_RODALIES_NUMBER = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "plat_rodalies_number"), () -> new Block(new PlatformsNumber()), CreativeModeTabs.SIGNALS);
        PLATFORM_ES_1 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_es_1"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.DECORATIONS);
        PLATFORM_ES_2 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_es_2"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.DECORATIONS);
        RENFE_TICKET_MACHINE_1 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "renfe_ticket_machine_1"), () -> new Block(new BlockTicketMachine(createDefaultBlockSettings(true, blockState -> 5))), CreativeModeTabs.DECORATIONS);
        BUFFER_STOP = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "buffer_stop"), () -> new Block(new BufferStop()), CreativeModeTabs.DECORATIONS);
        SIGNAL_END_CATENARY = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "end_electric_line"), () -> new Block(new RenfeSignals()), CreativeModeTabs.SIGNALS);
        BARRIER_ENTRANCE_CERCANIAS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "barrier_cercanias_entrance"), () -> new Block(new BlockTicketBarrier(true)), CreativeModeTabs.DECORATIONS);
        BARRIER_ENTRANCE_RODALIES = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "barrier_rodalies_entrance"), () -> new Block(new BlockTicketBarrier(true)), CreativeModeTabs.DECORATIONS);
        BARRIER_EXIT_CERCANIAS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "barrier_cercanias_exit"), () -> new Block(new BlockTicketBarrier(false)), CreativeModeTabs.DECORATIONS);
        BARRIER_EXIT_RODALIES = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "barrier_rodalies_exit"), () -> new Block(new BlockTicketBarrier(false)), CreativeModeTabs.DECORATIONS);
        BARRIER_END = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "barrier_end"), () -> new Block(new DefaultVoxelShape()), CreativeModeTabs.DECORATIONS);
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
    public static final BlockRegistryObject PLATFORM_ES_2;
    public static final BlockRegistryObject RENFE_TICKET_MACHINE_1;
    public static final BlockRegistryObject BUFFER_STOP;
    public static final BlockRegistryObject SIGNAL_END_CATENARY;
    public static final BlockRegistryObject BARRIER_ENTRANCE_CERCANIAS;
    public static final BlockRegistryObject BARRIER_ENTRANCE_RODALIES;
    public static final BlockRegistryObject BARRIER_EXIT_CERCANIAS;
    public static final BlockRegistryObject BARRIER_EXIT_RODALIES;
    public static final BlockRegistryObject BARRIER_END;



public static void init() {
		Init.LOGGER.info("Registering MTR Renfe Addon blocks");
	}
}
