package xyz.funtimes909.minecraft_mods.fresh_decorations;

import xyz.funtimes909.minecraft_mods.fresh_decorations.blocks.Blocks;
import xyz.funtimes909.minecraft_mods.fresh_decorations.items.Items;
import xyz.funtimes909.minecraft_mods.fresh_decorations.loot.LootTablePatcher;
import xyz.funtimes909.minecraft_mods.fresh_decorations.world.gen.features.Features;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {
  public static final String ID = "fresh_decorations";
  public static final Logger LOG = LogManager.getLogger(ID);

  @Override
  public void onInitialize() {
    LOG.debug("Loaded mod {}", ID);
    Blocks.register();
    Items.register();
    LootTablePatcher.patch();
    Features.register();
  }
}
