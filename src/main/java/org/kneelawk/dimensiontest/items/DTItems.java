package org.kneelawk.dimensiontest.items;

import java.util.HashMap;

import org.kneelawk.dimensiontest.ref.ModRef;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class DTItems {
	public static HashMap<String, Item> items = new HashMap<String, Item>();

	public static void init() {

	}

	public static Item addItem(Item item, String name, CreativeTabs tab) {
		item.setUnlocalizedName(name);
		item.setCreativeTab(tab);
		item.setTextureName(ModRef.MOD_ID + ":" + name);
		items.put(name, item);

		return item;
	}

	public static Item addItem(Item item, String name, CreativeTabs tab,
			String oreDictName) {
		item.setUnlocalizedName(name);
		item.setCreativeTab(tab);
		item.setTextureName(ModRef.MOD_ID + ":" + name);
		OreDictionary.registerOre(oreDictName, item);
		items.put(name, item);

		return item;
	}
}
