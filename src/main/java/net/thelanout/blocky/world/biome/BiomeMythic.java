
package net.thelanout.blocky.world.biome;

import net.thelanout.blocky.ElementsBlocky;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.init.Blocks;

import java.util.Random;

@ElementsBlocky.ModElement.Tag
public class BiomeMythic extends ElementsBlocky.ModElement {
	@GameRegistry.ObjectHolder("blocky:mythic")
	public static final BiomeGenCustom biome = null;
	public BiomeMythic(ElementsBlocky instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 10));
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Mythic").setRainfall(0.5F).setBaseHeight(0.1F).setHeightVariation(0.2F).setTemperature(0.5F));
			setRegistryName("mythic");
			topBlock = Blocks.GRASS.getDefaultState();
			fillerBlock = Blocks.DIRT.getStateFromMeta(0);
			decorator.generateFalls = false;
			decorator.treesPerChunk = 3;
			decorator.flowersPerChunk = 4;
			decorator.grassPerChunk = 4;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return BIG_TREE_FEATURE;
		}
	}
}
