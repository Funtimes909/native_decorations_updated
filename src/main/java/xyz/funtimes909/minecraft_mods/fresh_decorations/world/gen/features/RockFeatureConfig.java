package xyz.funtimes909.minecraft_mods.fresh_decorations.world.gen.features;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public record RockFeatureConfig(IntProvider tries, BlockStateProvider block) implements FeatureConfig {
  public static final Codec<RockFeatureConfig> CODEC = RecordCodecBuilder.create(i -> i.group(
    IntProvider.VALUE_CODEC.fieldOf("tries").forGetter(RockFeatureConfig::tries),
    BlockStateProvider.TYPE_CODEC.fieldOf("block").forGetter(RockFeatureConfig::block)
  ).apply(i, i.stable(RockFeatureConfig::new)));
}
