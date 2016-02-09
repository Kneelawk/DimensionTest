package org.kneelawk.dimensiontest.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DTBlockWMeta extends Block {

	@SideOnly(Side.CLIENT)
	protected IIcon[] icons;
	protected int numBlocks;

	protected DTBlockWMeta(Material material, int numBlocks) {
		super(material);
		this.numBlocks = numBlocks;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return icons[meta % icons.length];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister ir) {
		icons = new IIcon[numBlocks];
		for (int i = 0; i < icons.length; i++) {
			icons[i] = ir.registerIcon(getTextureName() + "." + i);
		}
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < numBlocks; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
}
