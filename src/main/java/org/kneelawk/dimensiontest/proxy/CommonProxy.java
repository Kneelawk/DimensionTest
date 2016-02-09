package org.kneelawk.dimensiontest.proxy;

import org.kneelawk.dimensiontest.blocks.DTBlocks;
import org.kneelawk.dimensiontest.config.DTConfig;
import org.kneelawk.dimensiontest.log.DTLog;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public abstract class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		DTLog.init(event.getModLog());
		DTConfig.init(event.getSuggestedConfigurationFile());
		DTBlocks.init();
	}

	public void init(FMLInitializationEvent event) {

	}

	public void postInit(FMLPostInitializationEvent event) {

	}
}
