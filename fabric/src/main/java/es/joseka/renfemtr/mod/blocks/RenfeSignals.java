package es.joseka.renfemtr.mod.blocks;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.DirectionHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.Blocks;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;


public class RenfeSignals extends BlockExtension implements DirectionHelper {

    public RenfeSignals() {
        super(Blocks.createDefaultBlockSettings(true, blockState -> 5));
        //super(BlockHelper.createBlockSettings(true, (state) -> 0).nonOpaque().strength(2));
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
        return IBlock.getVoxelShapeByDirection(0, 0, -6, 16, 16, -5, IBlock.getStatePropertySafe(blockState, FACING));
    }

}
