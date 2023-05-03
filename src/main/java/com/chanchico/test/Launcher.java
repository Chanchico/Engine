package com.chanchico.test;

import com.chanchico.core.WindowsManager;
import org.lwjgl.Version;

public class Launcher {
    public static void main(String[] args) {
        System.out.println(Version.getVersion());
        WindowsManager windowsManager = new WindowsManager("Test", 800, 600, true);
        windowsManager.init();

        while(!windowsManager.windowShouldClose()){
            windowsManager.update();
        }

        windowsManager.cleanup();
    }
}
