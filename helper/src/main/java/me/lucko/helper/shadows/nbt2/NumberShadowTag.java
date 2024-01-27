package me.lucko.helper.shadows.nbt2;

import me.lucko.shadow.bukkit.Mapping;
import me.lucko.shadow.bukkit.NmsClassTarget;
import me.lucko.shadow.bukkit.ObfuscatedTarget;
import me.lucko.shadow.bukkit.PackageVersion;

@SuppressWarnings("unused")
@NmsClassTarget("nbt.NBTNumber")
public interface NumberShadowTag {

    @ObfuscatedTarget({
            @Mapping(value = "f", version = PackageVersion.v1_20_R3)
    })
    long longValue();

    @ObfuscatedTarget({
            @Mapping(value = "g", version = PackageVersion.v1_20_R3)
    })
    int intValue();

    @ObfuscatedTarget({
            @Mapping(value = "h", version = PackageVersion.v1_20_R3)
    })
    short shortValue();

    @ObfuscatedTarget({
            @Mapping(value = "i", version = PackageVersion.v1_20_R3)
    })
    byte byteValue();

    @ObfuscatedTarget({
            @Mapping(value = "j", version = PackageVersion.v1_20_R3)
    })
    double doubleValue();

    @ObfuscatedTarget({
            @Mapping(value = "k", version = PackageVersion.v1_20_R3)
    })
    float floatValue();

}
