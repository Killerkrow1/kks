package net.killerkrow.kks.mixin;

import net.killerkrow.kks.init.ModItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemRenderer.class)
public class ItemRenderMixin {
    @Inject(
            method = "renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IILnet/minecraft/client/render/model/BakedModel;)V",
            at = @At("HEAD")
    )
    private void makeItemLarger(
            ItemStack stack,
            ModelTransformationMode renderMode,
            boolean leftHanded,
            MatrixStack matrices,
            VertexConsumerProvider vertexConsumers,
            int light,
            int overlay,
            BakedModel model,
            CallbackInfo ci
    ) {
        if (stack.isOf(ModItems.CANDLE_SWORD) || stack.isOf(ModItems.BLACK_CANDLE_SWORD) || stack.isOf(ModItems.BLUE_CANDLE_SWORD) ||
                stack.isOf(ModItems.BROWN_CANDLE_SWORD) || stack.isOf(ModItems.CYAN_CANDLE_SWORD) || stack.isOf(ModItems.GRAY_CANDLE_SWORD)
                || stack.isOf(ModItems.GREEN_CANDLE_SWORD) || stack.isOf(ModItems.LIGHT_BLUE_CANDLE_SWORD) || stack.isOf(ModItems.LIGHT_GRAY_CANDLE_SWORD)
                || stack.isOf(ModItems.LIME_CANDLE_SWORD) || stack.isOf(ModItems.MAGENTA_CANDLE_SWORD) || stack.isOf(ModItems.ORANGE_CANDLE_SWORD)
                || stack.isOf(ModItems.PINK_CANDLE_SWORD) || stack.isOf(ModItems.PURPLE_CANDLE_SWORD) || stack.isOf(ModItems.RED_CANDLE_SWORD)
                || stack.isOf(ModItems.WHITE_CANDLE_SWORD)|| stack.isOf(ModItems.YELLOW_CANDLE_SWORD)) {

            if (renderMode == ModelTransformationMode.FIRST_PERSON_RIGHT_HAND ||
                    renderMode == ModelTransformationMode.FIRST_PERSON_LEFT_HAND ||
                    renderMode == ModelTransformationMode.THIRD_PERSON_RIGHT_HAND ||
                    renderMode == ModelTransformationMode.THIRD_PERSON_LEFT_HAND ||
                    renderMode == ModelTransformationMode.GROUND) {

                float scaleFactor = 2.0f;
                matrices.scale(scaleFactor, scaleFactor, scaleFactor);
            }
        }
    }
}