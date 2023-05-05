package com.chanchico.core;

import com.chanchico.test.Launcher;
import org.lwjgl.opengl.GL11;

public class RenderManager {
    private final WindowManager window;
    public RenderManager(){
        window = Launcher.getWindowManager();
    }

    public void init() throws Exception{

    }

    public void render() {

    }

    public void clear(){
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
    }

    public void cleanup(){

    }
}
