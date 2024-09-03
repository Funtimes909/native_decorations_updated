package xyz.funtimes909.minecraft_mods.fresh_decorations.world.biome;

import xyz.funtimes909.minecraft_mods.fresh_decorations.Main;
import xyz.funtimes909.minecraft_mods.fresh_decorations.world.gen.features.Features;
import net.minecraft.util.Identifier;
import net.minecraft.registry.BuiltinRegistries;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.OverworldBiomeCreator;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class Biomes {

  public static Biome biome_oak_forest = null;
  public static final RegistryKey<Biome> key_biome_oak_forest = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(Main.ID, "oak_forest"));

  public static Biome biome_big_oak_forest = null;
  public static final RegistryKey<Biome> key_biome_big_oak_forest = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(Main.ID, "big_oak_forest"));

  public static Biome create_oak_forest() {
    SpawnSettings.Builder sps = new SpawnSettings.Builder();
    DefaultBiomeFeatures.addFarmAnimals(sps);
    DefaultBiomeFeatures.addBatsAndMonsters(sps);

    GenerationSettings.Builder gens = new GenerationSettings.Builder();
    // Defaults
    OverworldBiomeCreator.addBasicFeatures((GenerationSettings.LookupBackedBuilder) gens);

    //  Forest defaults
    DefaultBiomeFeatures.addDefaultOres((GenerationSettings.LookupBackedBuilder) gens);
    DefaultBiomeFeatures.addDefaultDisks((GenerationSettings.LookupBackedBuilder) gens);
    DefaultBiomeFeatures.addDefaultFlowers((GenerationSettings.LookupBackedBuilder) gens);
    DefaultBiomeFeatures.addForestGrass((GenerationSettings.LookupBackedBuilder) gens);

    //  Custom trees (oak only)
    gens.feature(GenerationStep.Feature.VEGETAL_DECORATION, RegistryEntry.of(Features.placed_trees_oak));
    return OverworldBiomeCreator.createBiome(Biome.Precipitation.RAIN, 0.7f, 0.8f, sps, gens, null);
  }

  public static Biome create_big_oak_forest() {
    SpawnSettings.Builder sps = new SpawnSettings.Builder();
    DefaultBiomeFeatures.addFarmAnimals(sps);
    DefaultBiomeFeatures.addBatsAndMonsters(sps);

    GenerationSettings.Builder gens = new GenerationSettings.Builder();
    // Defaults
    OverworldBiomeCreator.addBasicFeatures(gens);

    //  Forest defaults
    DefaultBiomeFeatures.addDefaultOres(gens);
    DefaultBiomeFeatures.addDefaultDisks(gens);
    DefaultBiomeFeatures.addDefaultFlowers(gens);
    DefaultBiomeFeatures.addForestGrass(gens);
    //  Custom trees (oak only)
    gens.feature(GenerationStep.Feature.VEGETAL_DECORATION, RegistryEntry.of(Features.placed_trees_big_oak));
    gens.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.MUSHROOM_ISLAND_VEGETATION);
    return new Biome.Builder().precipitation(Biome.Precipitation.RAIN).temperature(0.7f).downfall(0.8f).effects(new BiomeEffects.Builder().grassColor(0x3ec836).foliageColor(0x1cbd14).waterColor(0x38a5db).waterFogColor(0x032436).fogColor(0xc0d8ff).skyColor(OverworldBiomeCreator.getSkyColor(0.7f)).moodSound(BiomeMoodSound.CAVE).music(null).build()).spawnSettings(sps.build()).generationSettings(gens.build()).build();
  }

  public static void register() {
    biome_oak_forest = create_oak_forest();
    biome_big_oak_forest = create_big_oak_forest();
    Registry.register(BuiltinRegistries.BIOME, key_biome_oak_forest.getValue(), biome_oak_forest);
    Registry.register(BuiltinRegistries.BIOME, key_biome_big_oak_forest.getValue(), biome_big_oak_forest);
  }

}
