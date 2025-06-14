package es.joseka.renfemtr.mod;

import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.ItemConvertible;
import org.mtr.mapping.holder.ItemStack;
import org.mtr.mapping.registry.CreativeModeTabHolder;

public final class CreativeModeTabs {
    static {
        SIGNALS = Init.REGISTRY.createCreativeModeTabHolder(new Identifier(Init.MOD_ID, "signals"), () -> new ItemStack(new ItemConvertible(Blocks.SIGNAL_TRENCH.get().data)));
        DECORATIONS = Init.REGISTRY.createCreativeModeTabHolder(new Identifier(Init.MOD_ID, "decoration"), () -> new ItemStack(new ItemConvertible(Blocks.PLATFORM_ES_1.get().data)));
        RAILWAYS = Init.REGISTRY.createCreativeModeTabHolder(new Identifier(Init.MOD_ID, "railways"), () -> new ItemStack(new ItemConvertible(Items.RAIL_CONNECTOR_30.get().data)));
    }
    public static final CreativeModeTabHolder SIGNALS;
    public static final CreativeModeTabHolder DECORATIONS;
    public static final CreativeModeTabHolder RAILWAYS;

	public static void init() {
		Init.LOGGER.info("Registering MTR Renfe Addon creative mode tabs");
	}
}
