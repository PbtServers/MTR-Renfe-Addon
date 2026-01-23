package es.joseka.renfemtr.mod.blocks;

import es.joseka.renfemtr.mod.Items;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.DirectionHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.Blocks;
import org.mtr.mod.block.IBlock;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class CercaniasTotem extends BlockExtension implements DirectionHelper  {

    //private final Block[] totemblocks;
    private final Supplier<Block>[] totemblocks;
    public CercaniasTotem() {
        super(Blocks.createDefaultBlockSettings(false, blockState -> 0).nonOpaque());
        /*totemblocks = new Block[] {
                es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_1.get(),
                es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_2.get(),
                es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_1.get(),
                es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_2.get(),
                es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_3.get(),
                es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_4.get(),
                es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_3.get(),
                es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_4.get(),
                es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_3.get(),
                es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_4.get(),
                es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_5.get(),
        };*/
        totemblocks = new Supplier[] {
                () -> es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_2.get(),
                () -> es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_1.get(),
                () -> es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_2.get(),
                () -> es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_3.get(),
                () -> es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_4.get(),
                () -> es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_3.get(),
                () -> es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_4.get(),
                () -> es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_3.get(),
                () -> es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_4.get(),
                () -> es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_3.get(),
                () -> es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_4.get(),
                () -> es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_3.get(),
                () -> es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_4.get(),
                () -> es.joseka.renfemtr.mod.Blocks.CERCANIAS_TOTEM_BLOCK_5.get(),
        };
    }


    @Override
    public void addBlockProperties(List<HolderBase<?>> builder) {
        builder.add(FACING);
    }


    @Nullable
    @Override
    public BlockState getPlacementState2(ItemPlacementContext itemPlacementContext) {
        return this.getDefaultState2().with(new Property<>(FACING.data), itemPlacementContext.getPlayerFacing().data);
    }

    @Nonnull
    @Override
    public Item asItem2() {
        return Items.CERCANIAS_TOTEM.get();
    }

    @Nonnull
    @Override
    public ItemStack getPickStack2(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(new ItemConvertible(asItem2().data));
    }

    @Override
    public void onPlaced2(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        if (!world.isClient()) {
            final Direction facingValue = IBlock.getStatePropertySafe(state, FACING);
            for (int i = 0; i < totemblocks.length; i++) {
                BlockPos up = pos.up(i + 1);
                BlockState newstate = totemblocks[i].get().getDefaultState();
                newstate = newstate.with(new Property<>(FACING.data), facingValue.data);
                world.setBlockState(up, newstate);
            }
        }
    }

    @Override

    public void onBreak2(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBreak2(world, pos, state, player);
        if (!world.isClient()) {
            for (int i = 0; i < totemblocks.length; i++) {
                BlockPos up = pos.up(i + 1);
                if (world.getBlockState(up).isOf(totemblocks[i].get())) {
                    world.breakBlock(up, false);
                }
            }
        }

    }

    @Nonnull
    @Override
    public VoxelShape getOutlineShape2(BlockState blockState, BlockView world, BlockPos pos, ShapeContext context) {
        return IBlock.getVoxelShapeByDirection(0, 0, 0, 16, 16, 16, IBlock.getStatePropertySafe(blockState, FACING));
    }
}
