
package net.thelanout.blocky.util;

import net.thelanout.blocky.ElementsBlocky;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

@ElementsBlocky.ModElement.Tag
public class LootTableBasicLootTableBlocky extends ElementsBlocky.ModElement {
	public LootTableBasicLootTableBlocky(ElementsBlocky instance) {
		super(instance, 7);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("blocky", "basicloottableblocky"));
	}
}
