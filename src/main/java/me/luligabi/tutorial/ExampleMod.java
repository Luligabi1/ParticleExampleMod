package me.luligabi.tutorial;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {

    @Override
    public void onInitialize() {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier("modid", "green_flame"), GREEN_FLAME);
    }

    public static final DefaultParticleType GREEN_FLAME = FabricParticleTypes.simple();

}