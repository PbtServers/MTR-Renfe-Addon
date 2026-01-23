package es.joseka.renfemtr.mod.blocks;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.SlabBlockExtension;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.block.PlatformHelper;

import javax.annotation.Nonnull;
import java.util.List;

public class BlockPlatformSlabCustom extends SlabBlockExtension implements PlatformHelper {


    public BlockPlatformSlabCustom(BlockSettings blockSettings) {
        super(blockSettings);
    }

    @Nonnull
    @Override
    public BlockState getStateForNeighborUpdate2(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return PlatformHelper.getActualState(BlockView.cast(world), pos, state);
    }

    @Override
    public BlockState getPlacementState2(ItemPlacementContext ctx) {
        final BlockState slabState = super.getPlacementState2(ctx);
        return (slabState == null ? getDefaultState2() : slabState).with(new Property<>(FACING.data), ctx.getPlayerFacing().data);
    }

    @Nonnull
    @Override

    public VoxelShape getOutlineShape2(BlockState blockState, BlockView world, BlockPos pos, ShapeContext context) {
        SlabType slabType = getType(blockState);

        double minY;
        double maxY;

        if (slabType == SlabType.TOP) {
            minY = 8.1;
            maxY = 16.0;
        } else if (slabType == SlabType.DOUBLE) {
            minY = 0.1;
            maxY = 16.0;
        } else {
            // BOTTOM
            minY = 0.1;
            maxY = 8.0;
        }

        return IBlock.getVoxelShapeByDirection(
                0, minY, 0,
                16, maxY, 16,
                IBlock.getStatePropertySafe(blockState, FACING)
        );

        //return IBlock.getVoxelShapeByDirection(0, 0.1, 0, 16, 8, 16, IBlock.getStatePropertySafe(blockState, FACING));
    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        super.addBlockProperties(properties);
        properties.add(FACING);
        properties.add(DOOR_TYPE);
        properties.add(SIDE);
    }
}
