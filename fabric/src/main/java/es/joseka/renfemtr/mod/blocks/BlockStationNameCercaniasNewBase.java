package es.joseka.renfemtr.mod.blocks;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.*;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.Blocks;
import org.mtr.mod.block.IBlock;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public abstract class BlockStationNameCercaniasNewBase extends BlockExtension implements DirectionHelper, BlockWithEntity {
    public static final IntegerProperty COLOR = IntegerProperty.of("color", 0, 2);

    protected BlockStationNameCercaniasNewBase(BlockSettings settings) {
        super(settings);
    }


    @Nonnull
    @Override
    public ActionResult onUse2(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return IBlock.checkHoldingBrush(world, player, () -> world.setBlockState(pos, state.cycle(new Property<>(COLOR.data))));
    }

    @Nonnull
    @Override
    public VoxelShape getCollisionShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }


    @Override
    public void addBlockProperties(List<HolderBase<?>> builder) {
        builder.add(COLOR);
        builder.add(FACING);
    }

    public abstract static class TileEntityStationNameCercaniasNewBase extends BlockEntityExtension {

        public TileEntityStationNameCercaniasNewBase(BlockEntityType<?> type, BlockPos pos, BlockState state) {
            super(type, pos, state);
        }

        public abstract boolean shouldRender();
    }
}
