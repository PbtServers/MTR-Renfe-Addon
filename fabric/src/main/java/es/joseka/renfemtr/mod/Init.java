package es.joseka.renfemtr.mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mtr.mapping.registry.Registry;
import org.mtr.mapping.tool.DummyClass;


public class Init {
	public static final String MOD_ID = "renfe";
	public static final Logger LOGGER = LogManager.getLogger("MTRRenfeAddon");
	public static final Registry REGISTRY = new Registry();
	public static void init() {
		Blocks.init();
		Items.init();
		BlockEntityTypes.init();
		//SoundEvents.init();
		//DummyClass.enableLogging();
		CreativeModeTabs.init();

		// Finish registration
		REGISTRY.init();
	}
}
