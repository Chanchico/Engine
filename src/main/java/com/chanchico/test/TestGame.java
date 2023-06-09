package com.chanchico.test;

import com.chanchico.core.ILogic;
import com.chanchico.core.RenderManager;
import com.chanchico.core.WindowManager;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.CallbackI;

public class TestGame implements ILogic  {

    private int direction = 0;
    private float colour = 0.0f;

    private final RenderManager renderer;
    private final WindowManager  window;

    public TestGame() {
        renderer = new RenderManager();
        window = Launcher.getWindowManager();
    }

    @Override
    public void init() throws Exception {
        renderer.init();
    }

    @Override
    public void input() {
        if(window.isKeyPressed(GLFW.GLFW_KEY_UP)) {
            direction = 1;
        } else if (window.isKeyPressed(GLFW.GLFW_KEY_DOWN)) {
            direction = -1;
        } else {
            direction = 0;
        }
        System.out.println(direction);
    }

    @Override
    public void update() {
        colour += direction * 0.01f;
        if(colour > 1) {
            colour = 1.0f;
        } else if(colour <= 0) {
            colour = 0.0f;
        }
    }

    @Override
    public void render() {
        if(window.isResize()){
            GL11.glViewport(0, 0,  window.getWidth(), window.getHeight());
            window.setResize(true);
        }

        window.setClearColour(colour, colour, colour, 0.0f);
        renderer.clear();
    }

    @Override
    public void cleanup() {
        renderer.cleanup();
    }
}
