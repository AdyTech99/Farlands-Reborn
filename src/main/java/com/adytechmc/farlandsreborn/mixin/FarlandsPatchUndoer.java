package com.adytechmc.farlandsreborn.mixin;

import net.minecraft.util.math.noise.OctavePerlinNoiseSampler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(OctavePerlinNoiseSampler.class)
public class FarlandsPatchUndoer {
    @Inject(method = "maintainPrecision", at = @At("TAIL"), cancellable = true)
    private static void injectMethod(double value, CallbackInfoReturnable<Double> cir) {
        double newValue = value;
        cir.cancel();
        cir.setReturnValue(newValue);
    }
}
