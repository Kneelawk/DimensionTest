package org.kneelawk.dimensiontest;

import org.kneelawk.dimensiontest.proxy.CommonProxy;
import org.kneelawk.dimensiontest.ref.ModRef;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModRef.MOD_ID)
public class DimensionTest {
	@Instance
	private static DimensionTest instance;

	@SidedProxy(clientSide = "org.kneelawk.dimensiontest.proxy.ClientProxy", serverSide = "org.kneelawk.dimensiontest.proxy.ServerProxy")
	private static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
