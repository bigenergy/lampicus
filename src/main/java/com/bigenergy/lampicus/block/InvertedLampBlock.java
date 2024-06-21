package com.bigenergy.lampicus.block;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class InvertedLampBlock extends RedstoneLampBlock {
    public InvertedLampBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, true));

    }

    public static final BooleanProperty LIT;


    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext p_55659_) {
        return this.defaultBlockState().setValue(LIT, true);
    }

    public void neighborChanged(BlockState blockState, Level level, BlockPos blockPos, Block block, BlockPos p_55670_, boolean p_55671_) {
        if (!level.isClientSide) {
            boolean isOnLamp = blockState.getValue(LIT);
            if (isOnLamp == level.hasNeighborSignal(blockPos)) {
                if (isOnLamp) {
                    level.scheduleTick(blockPos, this, 4);
                } else {
                    level.setBlock(blockPos, blockState.cycle(LIT), 2);
                }
            }

        }
    }

    public void tick(BlockState p_221937_, ServerLevel p_221938_, BlockPos p_221939_, RandomSource p_221940_) {
        if (p_221937_.getValue(LIT) && p_221938_.hasNeighborSignal(p_221939_)) {
            p_221938_.setBlock(p_221939_, p_221937_.cycle(LIT), 2);
        }

    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_55673_) {
        p_55673_.add(LIT);
    }

    static {
        LIT = RedstoneTorchBlock.LIT;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, Item.TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag flagIn) {
        super.appendHoverText(stack, tooltipContext, tooltip, flagIn);
        tooltip.add(Component.translatable("tooltip.lampicus.redstone_lamp_inverted").withStyle(ChatFormatting.GOLD));
    }
}
