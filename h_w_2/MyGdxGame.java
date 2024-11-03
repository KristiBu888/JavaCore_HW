package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.ModelLoader;
import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;
import com.badlogic.gdx.utils.GdxNativesLoader;

public class MyGdxGame extends ApplicationAdapter {
    private PerspectiveCamera camera;
    private Model model;
    private ModelInstance instance;

    @Override
    public void create() {
        // Инициализация камеры
        camera = new PerspectiveCamera(67, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        camera.position.set(0f, 0f, 10f);
        camera.lookAt(0f, 0f, 0f);
        camera.up.set(0, 1, 0);
        camera.near = 1f;
        camera.far = 300f;
        camera.update();

        // Создание простой 3D-модели (например, куба)
        ModelBuilder modelBuilder = new ModelBuilder();
        model = modelBuilder.createBox(2f, 2f, 2f, 
                                        new Material(ColorAttribute.createDiffuse(Color.RED)), 
                                        VertexAttributes.XYZ | VertexAttributes.NORMals);
        instance = new ModelInstance(model);
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);

        // Установка камеры и рендеринг
        camera.update();
        // Рендеринг модели
        // (не забудьте добавить код рендеринга)
    }

    @Override
    public void dispose() {
        model.dispose();
    }
}
sdk install gradle 8.10.2