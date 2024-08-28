package xyz.funtimes909.minecraft_mods.fresh_decorations.mixins;

import xyz.funtimes909.minecraft_mods.fresh_decorations.blocks.Blocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.world.BiomeColors;

@Mixin(BlockColors.class)
public class BlockColorsMixin {
  @Inject(method = "create()Lnet/minecraft/client/color/block/BlockColors;", at = @At("RETURN"), cancellable = true)
  private static void register(CallbackInfoReturnable<BlockColors> cir) {
    BlockColors bc = cir.getReturnValue();
    bc.registerColorProvider((state, world, pos, tintIndex) -> BiomeColors.getFoliageColor(), Blocks.spruce_bush);
    bc.registerColorProvider((state, world, pos, tintIndex) -> BiomeColors.getFoliageColor(), Blocks.birch_bush);
    bc.registerColorProvider((state, world, pos, tintIndex) -> {
      if (world == null || pos == null) {
        return BiomeColors.getFoliageColor();
      }
      return BiomeColors.getFoliageColor(world, pos);
    }, Blocks.oak_bush, Blocks.jungle_bush, Blocks.acacia_bush, Blocks.dark_oak_bush);
  }
}
