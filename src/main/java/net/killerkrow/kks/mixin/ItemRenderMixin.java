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
        if (stack.isOf(ModItems.CANDLE_SWORD)) {

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