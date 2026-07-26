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

        if (stack.isOf(ModItems.CANDLE_SWORD) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).KSS$getModels().getModelManager().getModel(new ModelIdentifier(KillerSShenanigans.MOD_ID,
                    "candle_sword_handheld", "inventory"));
        }

        return value;
    }
}