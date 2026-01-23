package es.joseka.renfemtr.mod.blocks;


import es.joseka.renfemtr.mod.items.ItemHold;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.DirectionHelper;
import org.mtr.mapping.tool.HolderBase;


import java.util.List;

public class ModelChangerBase extends BlockExtension implements DirectionHelper {

    public static final IntegerProperty TEXTURE = IntegerProperty.of("texture", 1, 10);
    private final int count;

    public ModelChangerBase(BlockSettings blockSettings, int maxModelNum) {
        super(blockSettings);
        this.count = maxModelNum;
    }
    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        properties.add(FACING);
        properties.add(TEXTURE);
    }

    @Override
    public BlockState getPlacementState2(ItemPlacementContext ctx) {
        final Direction facing = ctx.getPlayerFacing();
        final CompoundTag compoundTag = ctx.getStack().getOrCreateTag();
        final int index = compoundTag.contains(ItemHold.TAG_HOLD) ? compoundTag.getInt(ItemHold.TAG_HOLD) : 1;
        return getDefaultState2().with(new Property<>(FACING.data), facing.data).with(new Property<>(TEXTURE.data), index);
    }



    public int getCount() {
        return count;
    }
}