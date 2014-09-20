package net.canarymod.api.world;

import java.util.Collection;
import java.util.List;

/**
 * This is a container for all of the worlds.
 *
 * @author Jos Kuijpers
 * @author Jason (darkdiplomat)
 */
public interface WorldManager {

    /**
     * Gets the world with the specified name
     *
     * @param name
     * @param autoload
     *
     * @return World dimension object
     *
     * @throws UnknownWorldException
     *         Thrown if the world with {@code name}
     *         doesn't exist, or when the world is not loaded and {@code autoload} is
     *         {@code false}.
     */
    public World getWorld(String name, boolean autoload);

    /**
     * Get world with name by WorldType.
     * Setting autoload true will force the world to be created or loaded,
     * depending on its status
     *
     * @param name
     * @param type
     * @param autoload
     *         true if worlds should be loaded if they are not
     *
     * @return
     *
     * @throws UnknownWorldException
     *         Thrown if the world with {@code name}
     *         doesn't exist, or when the world is not loaded and {@code autoload} is
     *         {@code false}.
     */
    public World getWorld(String name, DimensionType type, boolean autoload);

    /**
     * Create a new world with the given name and seed
     *
     * @param name
     * @param seed
     *
     * @return
     */
    public boolean createWorld(String name, long seed, DimensionType type);

    /**
     * Create a new world with the given name and seed and GeneratorType
     *
     * @param name
     * @param seed
     * @param genType
     *
     * @return
     */
    public boolean createWorld(String name, long seed, DimensionType worldType, WorldType genType);

    /**
     * Create a new world with the given name, seed will be selected randomly
     *
     * @param name
     *
     * @return
     */
    public boolean createWorld(String name, DimensionType type);

    /**
     * Destroys the world with the given name
     *
     * @param name
     */
    public boolean destroyWorld(String name);

    /**
     * Load the world with the given name that is of the given world type.
     * If type is Type.NORMAL then the loaded world will be name_NORMAL
     *
     * @param name
     * @param type
     *
     * @return
     */
    public World loadWorld(String name, DimensionType type);

    /**
     * Unloads a world, effectively removing it from the servers tick loop, until it is loaded again.<br>
     * The world will be saved before it is unloaded. It is NOT unloaded if there are still players tracked in it.<br>
     *
     * @param name
     *         The base name
     * @param type
     *         The dimension type
     * @param force
     *         Will kick players in this world before unloading, making it possible to unload the world.
     */
    public void unloadWorld(String name, DimensionType type, boolean force);

    /**
     * Returns a list of all loaded worlds
     *
     * @return a Collection of World objects
     */
    public Collection<World> getAllWorlds();

    /**
     * Check if a world with the given name is loaded.
     * This will perform a check for the fq name only!
     *
     * @param name
     *         fully qualified world name. For instance default_NORMAL
     *
     * @return true if world exists, false otherwise
     */
    public boolean worldIsLoaded(String name);

    /**
     * Check if a world with the given base name and the DimensionType is loaded.
     * This will perform a check for the name+type.getName()
     *
     * @param name
     *         the base world name. For instance "default"
     * @param type
     *         the dimension type to look for
     *
     * @return
     */
    public boolean worldIsLoaded(String name, DimensionType type);

    /**
     * Check if a world with the given name exists,
     * that doesn't mean it is loaded, it just means it's in the worlds folder
     * and therefore has been used at some point before
     *
     * @param name
     *
     * @return
     */
    public boolean worldExists(String name);

    /**
     * Return a static list of all existing worlds
     *
     * @return
     */
    public List<String> getExistingWorlds();

    /**
     * Returns a {@code String[]} of all existing worlds
     *
     * @return existing world names as a {@code String[]}
     */
    public String[] getExistingWorldsArray();

    /**
     * Gets a {@code String[]} of loaded worlds' names
     *
     * @return array of loaded worlds' names
     */
    public String[] getLoadedWorldsNames();

    /**
     * Gets a {@code String[]} of loaded worlds' names of the specified {@link net.canarymod.api.world.DimensionType}
     *
     * @param dimensionType
     *         the {@link net.canarymod.api.world.DimensionType} of the worlds whose names are to be retrieved
     *
     * @return array of loaded worlds' names
     */
    public String[] getLoadedWorldsNamesOfDimension(DimensionType dimensionType);
}
