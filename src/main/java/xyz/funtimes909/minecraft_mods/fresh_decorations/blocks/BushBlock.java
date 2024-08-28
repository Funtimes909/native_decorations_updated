package xyz.funtimes909.minecraft_mods.fresh_decorations.blocks;

import net.minecraft.util.math.random.Random;
import java.lang.SuppressWarnings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.Fertilizable;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.BlockView;
import net.minecraft.server.world.ServerWorld;

public class BushBlock extends Block implements Fertilizable {

  public static Block.Settings DEFAULT_SETTINGS = Block.Settings.of(Material.LEAVES).noCollision().strength(0.2f).nonOpaque().sounds(BlockSoundGroup.GRASS);

  public BushBlock() {
    this(DEFAULT_SETTINGS);
  }
  public BushBlock(Block.Settings settings) {
    super(settings);
  }

  public boolean isFertilizable(BlockView worldIn, BlockPos pos, BlockState state, boolean isClient) {
    return false;
  }

  public boolean canGrow(World world, Random rand, BlockPos pos, BlockState state) {
    return false;
  }

  public void grow(ServerWorld world, Random rand, BlockPos pos, BlockState state) {
  }

  @Override
  @SuppressWarnings("deprecation")
  public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
    entity.slowMovement(state, new Vec3d(0.85D, 0.65D, 0.85D));
  }

  @Override
  public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
  }

}
