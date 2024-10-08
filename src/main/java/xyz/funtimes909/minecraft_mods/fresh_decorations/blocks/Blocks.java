package xyz.funtimes909.minecraft_mods.fresh_decorations.blocks;

import xyz.funtimes909.minecraft_mods.fresh_decorations.Main;
import net.minecraft.registry.Registries;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class Blocks {
  public static RockBlock stone_rock = new RockBlock();
  public static RockBlock granite_rock = new RockBlock();
  public static RockBlock diorite_rock = new RockBlock();
  public static RockBlock andesite_rock = new RockBlock();
  public static RockBlock cobblestone_rock = new RockBlock();
  public static RockBlock cobbled_deepslate_rock = new RockBlock();
  public static BushyBushBlock oak_bush = new BushyBushBlock();
  public static BushyBushBlock spruce_bush = new BushyBushBlock();
  public static BushyBushBlock birch_bush = new BushyBushBlock();
  public static BushyBushBlock jungle_bush = new BushyBushBlock();
  public static BushyBushBlock acacia_bush = new BushyBushBlock();
  public static BushyBushBlock dark_oak_bush = new BushyBushBlock();
  public static BushyBushBlock mangrove_bush = new BushyBushBlock();
  public static BushyBushBlock azalea_bush = new BushyBushBlock(BushBlock.DEFAULT_SETTINGS.sounds(BlockSoundGroup.AZALEA_LEAVES));
  public static BushyBushBlock flowering_azalea_bush = new BushyBushBlock(BushBlock.DEFAULT_SETTINGS.sounds(BlockSoundGroup.AZALEA_LEAVES));
  public static LogPileBlock oak_log_pile = new LogPileBlock();
  public static LogPileBlock spruce_log_pile = new LogPileBlock();
  public static LogPileBlock birch_log_pile = new LogPileBlock();
  public static LogPileBlock jungle_log_pile = new LogPileBlock();
  public static LogPileBlock acacia_log_pile = new LogPileBlock();
  public static LogPileBlock dark_oak_log_pile = new LogPileBlock();
  public static LogPileBlock mangrove_log_pile = new LogPileBlock();
  public static LogPileBlock crimson_stem_pile = new LogPileBlock(LogPileBlock.NETHER_SETTINGS);
  public static LogPileBlock warped_stem_pile = new LogPileBlock(LogPileBlock.NETHER_SETTINGS);
  public static FlowerBlock paeonia = new FlowerBlock(StatusEffects.REGENERATION, 8, Block.Settings.create().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offsetType(AbstractBlock.OffsetType.XZ));
  public static FlowerPotBlock potted_paeonia = new FlowerPotBlock(paeonia, Block.Settings.create().breakInstantly().nonOpaque());

  public static void register() {
    Registry.register(Registries.BLOCK, Main.ID, stone_rock);
    Registry.register(Registries.BLOCK, Main.ID, granite_rock);
    Registry.register(Registries.BLOCK, Main.ID, andesite_rock);
    Registry.register(Registries.BLOCK, Main.ID, diorite_rock);
    Registry.register(Registries.BLOCK, Main.ID, cobblestone_rock);
    Registry.register(Registries.BLOCK, Main.ID, cobbled_deepslate_rock);
    Registry.register(Registries.BLOCK, Main.ID, oak_bush);
    Registry.register(Registries.BLOCK, Main.ID, spruce_bush);
    Registry.register(Registries.BLOCK, Main.ID, birch_bush);
    Registry.register(Registries.BLOCK, Main.ID, jungle_bush);
    Registry.register(Registries.BLOCK, Main.ID, acacia_bush);
    Registry.register(Registries.BLOCK, Main.ID, dark_oak_bush);
    Registry.register(Registries.BLOCK, Main.ID, mangrove_bush);
    Registry.register(Registries.BLOCK, Main.ID, azalea_bush);
    Registry.register(Registries.BLOCK, Main.ID, flowering_azalea_bush);
    Registry.register(Registries.BLOCK, Main.ID, oak_log_pile);
    Registry.register(Registries.BLOCK, Main.ID, spruce_log_pile);
    Registry.register(Registries.BLOCK, Main.ID, birch_log_pile);
    Registry.register(Registries.BLOCK, Main.ID, jungle_log_pile);
    Registry.register(Registries.BLOCK, Main.ID, acacia_log_pile);
    Registry.register(Registries.BLOCK, Main.ID, dark_oak_log_pile);
    Registry.register(Registries.BLOCK, Main.ID, mangrove_log_pile);
    Registry.register(Registries.BLOCK, Main.ID, crimson_stem_pile);
    Registry.register(Registries.BLOCK, Main.ID, warped_stem_pile);
    Registry.register(Registries.BLOCK, Main.ID, paeonia);
    Registry.register(Registries.BLOCK, Main.ID, potted_paeonia);
  }
}
