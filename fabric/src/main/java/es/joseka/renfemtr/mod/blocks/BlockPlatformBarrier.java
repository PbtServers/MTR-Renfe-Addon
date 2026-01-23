package es.joseka.renfemtr.mod.blocks;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.block.PlatformHelper;

import javax.annotation.Nonnull;
import java.util.List;

public class BlockPlatformBarrier extends BlockExtension implements PlatformHelper {


    public BlockPlatformBarrier(BlockSettings blockSettings) {
        super(blockSettings.nonOpaque());
    }


    @Override
    public boolean isTranslucent2(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }


    @Nonnull
    @Override
    public BlockState getStateForNeighborUpdate2(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return PlatformHelper.getActualState(BlockView.cast(world), pos, state);
    }

    @Override
    public BlockState getPlacementState2(ItemPlacementContext ctx) {
        return getDefaultState2().with(new Property<>(FACING.data), ctx.getPlayerFacing().data);
    }

    @Nonnull
    @Override
    public VoxelShape getOutlineShape2(BlockState blockState, BlockView world, BlockPos pos, ShapeContext context) {
        return IBlock.getVoxelShapeByDirection(0.0, 0.1, 0, 16, 16, 16, IBlock.getStatePropertySafe(blockState, FACING));
    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        properties.add(FACING);
        properties.add(DOOR_TYPE);
        properties.add(SIDE);
    }

}