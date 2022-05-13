package com.direwolf20.laserio.common.containers.customhandler;

import com.direwolf20.laserio.common.items.filters.FilterCount;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class FilterCountHandler extends FilterBasicHandler {

    public FilterCountHandler(int size, ItemStack itemStack) {
        super(size, itemStack);
    }

    @Override
    protected void onContentsChanged(int slot) {
        if (!stack.equals(ItemStack.EMPTY))
            FilterCount.setInventory(stack, this);
    }

    @Override
    public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
        return super.isItemValid(slot, stack);
    }

    @Override
    public int getSlotLimit(int slot) {
        return 1;
    }
}
