package me.lucko.helper.shadows.nbt;

import me.lucko.shadow.Shadow;
import me.lucko.shadow.Static;
import me.lucko.shadow.bukkit.BukkitShadowFactory;
import me.lucko.shadow.bukkit.Mapping;
import me.lucko.shadow.bukkit.NmsClassTarget;
import me.lucko.shadow.bukkit.ObfuscatedTarget;
import me.lucko.shadow.bukkit.PackageVersion;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.framework.qual.DefaultQualifier;

@NmsClassTarget("nbt.NBTTagInt")
@DefaultQualifier(NonNull.class)
public interface IntShadowTag extends Shadow, ShadowTag, NumberShadowTag {

    static IntShadowTag valueOf(int value) {
        return BukkitShadowFactory.global().staticShadow(IntShadowTag.class).intValueOf(value);
    }

    @Static
    @ObfuscatedTarget({
            @Mapping(value = "a", version = PackageVersion.v1_20_R3)
    })
    IntShadowTag intValueOf(int value);

}
