package es.joseka.renfemtr.mod;

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
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_120_ADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_120_ADVERTISEMENT_ORANGE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.SIGNAL_120_PREADVERTISEMENT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_ES_1);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_ES_2);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), Blocks.BARRIER_ENTRANCE_CERCANIAS);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), Blocks.BARRIER_ENTRANCE_RODALIES);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), Blocks.BARRIER_EXIT_CERCANIAS);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), Blocks.BARRIER_EXIT_RODALIES);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), Blocks.BARRIER_END);
		REGISTRY_CLIENT.init();
	}

}
