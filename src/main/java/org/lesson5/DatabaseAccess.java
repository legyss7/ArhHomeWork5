package org.lesson5;

import java.util.Collection;

/**
 * Интерфейс DAC
 */
public interface DatabaseAccess {
    void addEntity(Entity entity);
    void removeEntity(Entity entity);
    Collection<Texture> getAllTextures();
    Collection<Model3D> getAllModels();
}
