package net.killerkrow.kks.mixin;

import net.killerkrow.kks.KillerSShenanigans;
import net.killerkrow.kks.init.ModItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useItem(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded,
                              MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {

        if (stack.isOf(ModItems.BLACK_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "black_candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.BLUE_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "blue_candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.BROWN_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "brown_candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.CYAN_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "cyan_candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.GRAY_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "gray_candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.GREEN_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "green_candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.LIGHT_BLUE_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "light_blue_candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.LIGHT_GRAY_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "light_gray_candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.LIME_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "lime_candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.MAGENTA_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "magenta_candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.ORANGE_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "orange_candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.PINK_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "pink_candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.PURPLE_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "purple_candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.RED_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "red_candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.WHITE_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "white_candle_sword_held", "inventory"));
        }
        if (stack.isOf(ModItems.YELLOW_CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "yellow_candle_sword_held", "inventory"));
        }
        return value;
    }
}