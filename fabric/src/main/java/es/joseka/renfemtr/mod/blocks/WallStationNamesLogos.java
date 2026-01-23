package es.joseka.renfemtr.mod.blocks;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.DirectionHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.Blocks;
import org.mtr.mod.block.IBlock;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;


public class WallStationNamesLogos extends BlockExtension implements DirectionHelper {

    public WallStationNamesLogos() {
        super(Blocks.createDefaultBlockSettings(true, blockState -> 0));
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
    public VoxelShape getOutlineShape2(BlockState blockState, BlockView world, BlockPos pos, ShapeContext context) {
        return IBlock.getVoxelShapeByDirection(0, 0, 0, 16, 16, 2, IBlock.getStatePropertySafe(blockState, FACING));
    }

}
