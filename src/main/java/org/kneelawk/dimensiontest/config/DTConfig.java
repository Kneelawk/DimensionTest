package org.kneelawk.dimensiontest.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class DTConfig {
	public static Configuration cfg;

	public static void init(File cfgFile) {
		cfg = new Configuration(cfgFile);
	}

	public static void save() {
		cfg.save();
	}

	public static boolean isBlockEnabled(String name) {
		return cfg.getBoolean(name, "blocks", true, "Is " + name + " enabled");
	}
}
