package xyz.funtimes909.minecraft_mods.fresh_decorations.items;

import net.minecraft.registry.Registries;
import xyz.funtimes909.minecraft_mods.fresh_decorations.Main;
import xyz.funtimes909.minecraft_mods.fresh_decorations.blocks.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registry;

public class Items {

  public static Item stone_rock = new BlockItem(Blocks.stone_rock, new Item.Settings());
  public static Item granite_rock = new BlockItem(Blocks.granite_rock, new Item.Settings());
  public static Item diorite_rock = new BlockItem(Blocks.diorite_rock, new Item.Settings());
  public static Item andesite_rock = new BlockItem(Blocks.andesite_rock, new Item.Settings());
  public static Item cobblestone_rock = new BlockItem(Blocks.cobblestone_rock, new Item.Settings());
  public static Item cobbled_deepslate_rock = new BlockItem(Blocks.cobbled_deepslate_rock, new Item.Settings());
  public static Item oak_bush = new BlockItem(Blocks.oak_bush, new Item.Settings());
  public static Item spruce_bush = new BlockItem(Blocks.spruce_bush, new Item.Settings());
  public static Item birch_bush = new BlockItem(Blocks.birch_bush, new Item.Settings());
  public static Item jungle_bush = new BlockItem(Blocks.jungle_bush, new Item.Settings());
  public static Item acacia_bush = new BlockItem(Blocks.acacia_bush, new Item.Settings());
  public static Item dark_oak_bush = new BlockItem(Blocks.dark_oak_bush, new Item.Settings());
  public static Item mangrove_bush = new BlockItem(Blocks.mangrove_bush, new Item.Settings());
  public static Item azalea_bush = new BlockItem(Blocks.azalea_bush, new Item.Settings());
  public static Item flowering_azalea_bush = new BlockItem(Blocks.flowering_azalea_bush, new Item.Settings());
  public static Item oak_log_pile = new BlockItem(Blocks.oak_log_pile, new Item.Settings());
  public static Item spruce_log_pile = new BlockItem(Blocks.spruce_log_pile, new Item.Settings());
  public static Item birch_log_pile = new BlockItem(Blocks.birch_log_pile, new Item.Settings());
  public static Item jungle_log_pile = new BlockItem(Blocks.jungle_log_pile, new Item.Settings());
  public static Item dark_oak_log_pile = new BlockItem(Blocks.dark_oak_log_pile, new Item.Settings());
  public static Item acacia_log_pile = new BlockItem(Blocks.acacia_log_pile, new Item.Settings());
  public static Item crimson_stem_pile = new BlockItem(Blocks.crimson_stem_pile, new Item.Settings());
  public static Item warped_stem_pile = new BlockItem(Blocks.warped_stem_pile, new Item.Settings());
  public static Item paeonia = new BlockItem(Blocks.paeonia, new Item.Settings());
  public static Item twig = new Item(new Item.Settings());

  public static void register() {
    Registry.register(Registries.ITEM, Main.ID, stone_rock);
    Registry.register(Registries.ITEM, Main.ID, granite_rock);
    Registry.register(Registries.ITEM, Main.ID, diorite_rock);
    Registry.register(Registries.ITEM, Main.ID, andesite_rock);
    Registry.register(Registries.ITEM, Main.ID, cobblestone_rock);
    Registry.register(Registries.ITEM, Main.ID, cobbled_deepslate_rock);
    Registry.register(Registries.ITEM, Main.ID, oak_bush);
    Registry.register(Registries.ITEM, Main.ID, spruce_bush);
    Registry.register(Registries.ITEM, Main.ID, birch_bush);
    Registry.register(Registries.ITEM, Main.ID, jungle_bush);
    Registry.register(Registries.ITEM, Main.ID, acacia_bush);
    Registry.register(Registries.ITEM, Main.ID, dark_oak_bush);
    Registry.register(Registries.ITEM, Main.ID, mangrove_bush);
    Registry.register(Registries.ITEM, Main.ID, azalea_bush);
    Registry.register(Registries.ITEM, Main.ID, flowering_azalea_bush);
    Registry.register(Registries.ITEM, Main.ID, oak_log_pile);
    Registry.register(Registries.ITEM, Main.ID, spruce_log_pile);
    Registry.register(Registries.ITEM, Main.ID, birch_log_pile);
    Registry.register(Registries.ITEM, Main.ID, jungle_log_pile);
    Registry.register(Registries.ITEM, Main.ID, acacia_log_pile);
    Registry.register(Registries.ITEM, Main.ID, dark_oak_log_pile);
    Registry.register(Registries.ITEM, Main.ID, crimson_stem_pile);
    Registry.register(Registries.ITEM, Main.ID, warped_stem_pile);
    Registry.register(Registries.ITEM, Main.ID, paeonia);
    Registry.register(Registries.ITEM, Main.ID, twig);
  }

}
