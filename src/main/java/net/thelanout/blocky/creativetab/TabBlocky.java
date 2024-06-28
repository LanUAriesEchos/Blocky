
package net.thelanout.blocky.creativetab;

import net.thelanout.blocky.item.ItemBlockyitem;
import net.thelanout.blocky.ElementsBlocky;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsBlocky.ModElement.Tag
public class TabBlocky extends ElementsBlocky.ModElement {
	public TabBlocky(ElementsBlocky instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabblocky") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemBlockyitem.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
