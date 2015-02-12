package net.canarymod.api.world.blocks.properties.helpers;

import net.canarymod.api.world.blocks.Block;
import net.canarymod.api.world.blocks.properties.BlockEnumProperty;

import static net.canarymod.api.world.blocks.BlockType.RedSandstoneSlab;

/**
 * New Stone Slab properties helper
 *
 * @author Jason Jones (darkdiplomat)
 */
public final class StoneSlabNewProperties extends SlabProperties {
    public static final BlockEnumProperty seamless = getInstanceFor(RedSandstoneSlab, "seamless");
    public static final BlockEnumProperty variant = getInstanceFor(RedSandstoneSlab, "variant");

    /**
     * New Stone slab variants
     */
    public enum Variant {
        RED_SANDSTONE;

        public static Variant valueOf(int ordinal) {
            if (ordinal < 0 || ordinal >= values().length) {
                throw new IllegalArgumentException();
            }
            return values()[ordinal];
        }
    }

    /**
     * Applies whether the {@code Stone Slab} is seamless or not
     *
     * @param block
     *         the {@link net.canarymod.api.world.blocks.Block} to be modified
     * @param value
     *         the {@code boolean} value to apply
     *
     * @return the Block with adjusted state (NOTE: Original Block object is also modified, using the return is unnecessary)
     *
     * @throws java.lang.NullPointerException
     *         Should {@code block} or {@code value} be null
     * @throws java.lang.IllegalArgumentException
     *         Should an invalid property be applied
     */
    public static Block applySeamless(Block block, boolean value) {
        return apply(block, seamless, value);
    }

    public static Block applyVariant(Block block, Variant value) {
        return apply(block, variant, value);
    }
}