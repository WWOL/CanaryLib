package net.canarymod.api.world.blocks.properties.helpers;

import net.canarymod.api.world.blocks.Block;
import net.canarymod.api.world.blocks.BlockFace;
import net.canarymod.api.world.blocks.properties.BlockEnumProperty;

import static net.canarymod.api.world.blocks.BlockType.Portal;

/**
 * Portal properties helper
 *
 * @author Jason Jones (darkdiplomat)
 */
public final class PortalProperties extends BlockProperties {

    /**
     * Portal axis property, Values: {@link net.canarymod.api.world.blocks.BlockFace.Axis} (excluding Y)
     */
    public static final BlockEnumProperty axis = getInstanceFor(Portal, "axis");

    /**
     * Applies axis to the {@code Portal}
     *
     * @param block
     *         the {@link net.canarymod.api.world.blocks.Block} to be modified
     * @param value
     *         the {@link net.canarymod.api.world.blocks.BlockFace.Axis} value to apply
     *
     * @return the Block with adjusted state (NOTE: Original Block object is also modified, using the return is unnecessary)
     *
     * @throws java.lang.NullPointerException
     *         Should {@code block} or {@code value} be null
     * @throws java.lang.IllegalArgumentException
     *         Should an invalid property be applied
     */
    public static Block applyAxis(Block block, BlockFace.Axis value) {
        return apply(block, axis, value);
    }
}
