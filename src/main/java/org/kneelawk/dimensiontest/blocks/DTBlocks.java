package org.kneelawk.dimensiontest.blocks;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.oredict.OreDictionary;

import org.kneelawk.dimensiontest.config.DTConfig;
import org.kneelawk.dimensiontest.items.DTItemBlock;
import org.kneelawk.dimensiontest.ref.ModRef;

import cpw.mods.fml.common.registry.GameRegistry;

public class DTBlocks {
	public static HashMap<String, Block> blocks = new HashMap<String, Block>();

	public static void init() {
		addBlock(new DTBlockWMeta(Material.rock, 3), "blockCactosine",
				CreativeTabs.tabBlock, DTItemBlock.class);
		addBlock(new DTBlock(Material.glass), "blockCactosineLamp",
				CreativeTabs.tabBlock, "blockCactosineLamp").setStepSound(
				Block.soundTypeGlass).setLightLevel(1);
	}

	public static Block addBlock(Block block, String name, CreativeTabs tab) {
		if (!DTConfig.isBlockEnabled(name))
			return block;
		block.setBlockName(name);
		block.setCreativeTab(tab);
		block.setBlockTextureName(ModRef.MOD_ID + ":" + name);
		GameRegistry.registerBlock(block, name);
		blocks.put(name, block);

		return block;
	}

	public static Block addBlock(Block block, String name, CreativeTabs tab,
			String oreDictName) {
		block.setBlockName(name);
		block.setCreativeTab(tab);
		block.setBlockTextureName(ModRef.MOD_ID + ":" + name);
		GameRegistry.registerBlock(block, name);
		OreDictionary.registerOre(oreDictName, block);
		blocks.put(name, block);

		return block;
	}

	public static Block addBlock(Block block, String name, CreativeTabs tab,
			Class<? extends ItemBlock> itemClass) {
		if (!DTConfig.isBlockEnabled(name))
			return block;
		block.setBlockName(name);
		block.setCreativeTab(tab);
		block.setBlockTextureName(ModRef.MOD_ID + ":" + name);
		GameRegistry.registerBlock(block, itemClass, name);
		blocks.put(name, block);

		return block;
	}
}
