package org.lesson5;

import java.util.Collection;

/**
 * Интерфейс BLL(Business Logical Layer)
 */
public interface BusinessLogicalLayer {
    Collection<Model3D> getAllModels();
    Collection<Texture> getAllTextures();
    void renderModel(Model3D model);
    void renderAllModels();
}
