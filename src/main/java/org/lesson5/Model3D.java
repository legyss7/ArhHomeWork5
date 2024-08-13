package org.lesson5;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 3D модель
 */
public class Model3D implements Entity {
    private static int counter = 10000;
    private int id;

    private Collection<Texture> textures = new ArrayList<>();

    {
        id = ++counter;
    }

    public Model3D(Collection<Texture> textures) {
        this.textures = textures;
    }

    public Model3D() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("3DModel #%s", id);
    }

    public Collection<Texture> getTextures() {
        return textures;
    }
}
