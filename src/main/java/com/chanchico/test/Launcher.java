package com.chanchico.test;

import com.chanchico.core.EngineManager;
import com.chanchico.core.WindowManager;
import com.chanchico.core.utils.Consts;
import org.lwjgl.Version;

public class Launcher {

    private static WindowManager windowManager;

    private static TestGame game;
    public static void main(String[] args) {
        System.out.println(Version.getVersion());
        windowManager = new WindowManager(Consts.TITLE, 1600, 900, false);
        game = new TestGame();
        EngineManager engine = new EngineManager();
        try{
            engine.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static TestGame getGame() {
        return game;
    }

    public static WindowManager getWindowManager(){
        return windowManager;
    }
}
