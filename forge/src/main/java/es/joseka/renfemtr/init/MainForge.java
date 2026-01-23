package es.joseka.renfemtr.init;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import es.joseka.renfemtr.mod.Init;
import es.joseka.renfemtr.mod.InitClient;

//@Mod(Init.MOD_ID)
@Mod("renfe")

public class MainForge {
	public MainForge() {
		Init.init();
		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> InitClient::init);
	}
}