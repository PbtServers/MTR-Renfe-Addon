package es.joseka.renfemtr.mod.blocks;

import es.joseka.renfemtr.mod.BlockEntityTypes;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mod.block.IBlock;

import javax.annotation.Nonnull;

public class BlockStationNameCercaniasOld extends BlockStationNameCercaniasNewBase {
    public BlockStationNameCercaniasOld(BlockSettings settings) {
        super(settings);
    }
    @Override
    public BlockState getPlacementState2(ItemPlacementContext ctx) {
        final Direction side = ctx.getSide();
        if (side != Direction.UP && side != Direction.DOWN) {
            return getDefaultState2().with(new Property<>(FACING.data), side.getOpposite().data);
        } else {
            return null;
        }
    }



    @Nonnull
    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return IBlock.getVoxelShapeByDirection(0, 0, 0, 16, 16, 2, IBlock.getStatePropertySafe(state, FACING));
    }

    @Nonnull
    @Override
    public BlockEntityExtension createBlockEntity(BlockPos pos, BlockState state) {
        return new BlockStationNameCercaniasOld.TileEntityBlockStationNameCercaniasOld(pos, state);
    }

    public static class TileEntityBlockStationNameCercaniasOld extends TileEntityStationNameCercaniasNewBase {

        public TileEntityBlockStationNameCercaniasOld(BlockPos pos, BlockState state) {
            super(BlockEntityTypes.STATION_NAME_ENTRANCE_CERCANIAS_OLD.get(), pos, state);
        }

        @Override
        public boolean shouldRender() {
            return true;
        }
    }
}