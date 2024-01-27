package me.lucko.helper.shadows.nbt2;

import it.unimi.dsi.fastutil.longs.LongSet;
import me.lucko.shadow.bukkit.BukkitShadowFactory;
import me.lucko.shadow.bukkit.Mapping;
import me.lucko.shadow.bukkit.NmsClassTarget;
import me.lucko.shadow.bukkit.ObfuscatedTarget;
import me.lucko.shadow.bukkit.PackageVersion;

import java.util.List;

@NmsClassTarget("nbt.NBTTagLongArray")
public interface LongArrayShadowTag extends CollectionShadowTag<LongShadowTag> {


    @SuppressWarnings("RedundantCast")
    static LongArrayShadowTag create(long[] data) {
        return BukkitShadowFactory.global().constructShadow(LongArrayShadowTag.class, (Object) data);
    }

    @SuppressWarnings("RedundantCast")
    static LongArrayShadowTag create(LongSet data) {
        return BukkitShadowFactory.global().constructShadow(LongArrayShadowTag.class, (Object) data);
    }

    @SuppressWarnings("RedundantCast")
    static LongArrayShadowTag create(List<Long> data) {
        return BukkitShadowFactory.global().constructShadow(LongArrayShadowTag.class, (Object) data);
    }

    @ObfuscatedTarget({
            @Mapping(value = "g", version = PackageVersion.v1_20_R3)
    })
    long[] value();

}
