package es.joseka.renfemtr.mod.items;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockItemExtension;

public class ItemHold extends BlockItemExtension {
    public static final String TAG_HOLD = "hold_num";

    private final int max_count;

    public ItemHold(Block block, ItemSettings itemSettings, int max_count) {
        super(block, itemSettings);
        this.max_count = max_count;
    }

    @Override
    public void useWithoutResult(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient()) {
            CompoundTag tag = user.getStackInHand(hand).getOrCreateTag();
            if (tag.contains(TAG_HOLD)) {
                int num = tag.getInt(TAG_HOLD);
                if (num == (max_count - 1)) {
                    num = 0;
                } else {
                    num++;
                }
                tag.putInt(TAG_HOLD, num);
                //System.out.println("TAG_HOLD actual: " + tag.getInt(TAG_HOLD));
            } else {
                tag.putInt(TAG_HOLD, 0);
            }
        }
    }
}