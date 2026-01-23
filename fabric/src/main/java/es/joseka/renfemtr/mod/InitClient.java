package es.joseka.renfemtr.mod;

import es.joseka.renfemtr.mod.render.RenderStationNameTiledCercaniasNew;
import org.mtr.mapping.holder.BlockRenderType;
import org.mtr.mapping.holder.RenderLayer;
import org.mtr.mapping.registry.RegistryClient;

public class InitClient {
	public static final RegistryClient REGISTRY_CLIENT = new RegistryClient(Init.REGISTRY);

	public static void init() {
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_20_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_20_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_20_ADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_20_ADVERTISEMENT_TEMP_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_20_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_20_PREADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_40_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_40_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_40_ADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_40_ADVERTISEMENT_TEMP_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_40_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_40_PREADVERTISEMENT_TEMP);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_60_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_60_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_60_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_80_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_80_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_80_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_120_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_120_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.SIGNAL_120_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_1);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_1_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_2);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_2_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.BARRIER_ENTRANCE_CERCANIAS);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.BARRIER_ENTRANCE_RODALIES);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.BARRIER_EXIT_CERCANIAS);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.BARRIER_EXIT_RODALIES);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.BARRIER_END);
		REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.STATION_NAME_ENTRANCE_CERCANIAS_NEW, dispatcher -> new RenderStationNameTiledCercaniasNew<>(dispatcher, 1, 0.24F / 12 , 1 / 16F, 3 / 16F, -6 / 16F, 0,0xFF000000, false, "vialog"));
		REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntityTypes.STATION_NAME_ENTRANCE_CERCANIAS_OLD, dispatcher -> new RenderStationNameTiledCercaniasNew<>(dispatcher, 1, 0.24F / 12 , 1 / 16F, 3 / 16F, -6 / 16F, 0,0xFFFFFFFF, false, "vialog"));
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.CERCANIAS_TOTEM_BLOCK_1);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.CERCANIAS_TOTEM_BLOCK_2);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.CERCANIAS_TOTEM_BLOCK_3);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.CERCANIAS_TOTEM_BLOCK_4);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.CERCANIAS_TOTEM_BLOCK_5);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_1_45);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_1_SLAB_45);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_2_45);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_ES_2_SLAB_45);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_BARRIER);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.PLATFORM_BARRIER_SLAB);
		REGISTRY_CLIENT.init();
	}

}
