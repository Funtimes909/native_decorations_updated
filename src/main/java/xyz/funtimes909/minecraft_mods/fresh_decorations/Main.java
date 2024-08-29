package xyz.funtimes909.minecraft_mods.fresh_decorations;

import xyz.funtimes909.minecraft_mods.fresh_decorations.blocks.Blocks;
import xyz.funtimes909.minecraft_mods.fresh_decorations.items.Items;
import xyz.funtimes909.minecraft_mods.fresh_decorations.loot.LootTablePatcher;
import xyz.funtimes909.minecraft_mods.fresh_decorations.world.gen.features.Features;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.item.ItemGroups;

public class Main implements ModInitializer {
  public static final String ID = "fresh_decorations";
  public static final Logger LOG = LogManager.getLogger(ID);

  @Override
  public void onInitialize() {
    LOG.debug("Loaded {}", ID);
    // Register item groups
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> {
      itemGroup.add(Items.stone_rock);
      itemGroup.add(Items.granite_rock);
      itemGroup.add(Items.diorite_rock);
      itemGroup.add(Items.andesite_rock);
      itemGroup.add(Items.cobblestone_rock);
      itemGroup.add(Items.cobbled_deepslate_rock);
      itemGroup.add(Items.oak_bush);
      itemGroup.add(Items.spruce_bush);
      itemGroup.add(Items.birch_bush);
      itemGroup.add(Items.jungle_bush);
      itemGroup.add(Items.acacia_bush);
      itemGroup.add(Items.dark_oak_bush);
      itemGroup.add(Items.mangrove_bush);
      itemGroup.add(Items.azalea_bush);
      itemGroup.add(Items.flowering_azalea_bush);
      itemGroup.add(Items.oak_log_pile);
      itemGroup.add(Items.spruce_log_pile);
      itemGroup.add(Items.birch_log_pile);
      itemGroup.add(Items.jungle_log_pile);
      itemGroup.add(Items.acacia_log_pile);
      itemGroup.add(Items.dark_oak_log_pile);
      itemGroup.add(Items.crimson_stem_pile);
      itemGroup.add(Items.warped_stem_pile);
      itemGroup.add(Items.paeonia);
      itemGroup.add(Items.twig);
    });
    // Register everything else
    Blocks.register();
    Items.register();
    LootTablePatcher.patch();
    Features.register();
  }
}
