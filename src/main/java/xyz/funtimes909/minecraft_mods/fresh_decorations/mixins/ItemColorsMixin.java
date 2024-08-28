package xyz.funtimes909.minecraft_mods.fresh_decorations.mixins;

import xyz.funtimes909.minecraft_mods.fresh_decorations.items.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.item.BlockItem;
import net.minecraft.block.BlockState;

@Mixin(ItemColors.class)
public class ItemColorsMixin {
  @Inject(method = "create(Lnet/minecraft/client/color/block/BlockColors;)Lnet/minecraft/client/color/item/ItemColors;", at = @At("RETURN"), cancellable = true)
  private static void register(BlockColors bc, CallbackInfoReturnable<ItemColors> cir) {
    ItemColors ic = cir.getReturnValue();
    ic.register((stack, tintIndex) -> {
      BlockState lv = ((BlockItem)stack.getItem()).getBlock().getDefaultState();
      return bc.getColor(lv, null, null, tintIndex);
    }, Items.oak_bush, Items.spruce_bush, Items.birch_bush, Items.jungle_bush, Items.acacia_bush, Items.dark_oak_bush);
  }
}
