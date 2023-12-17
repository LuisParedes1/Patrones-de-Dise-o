package org.example;

import org.example.app.Application;
import org.example.factories.*;

public class Demo {

    private static Application configureApplication() throws Exception {
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")){
            factory = new MacOSFactory();
        }
        else if (osName.contains("windows")) {
            factory = new WindowsFactory();
        }
        else if (osName.contains("linux")){
            factory = new LinuxFactory();
        } else{
            throw new Exception("OS not handled");
        }

        return new Application(factory);
    }

    public static void main(String[] args) {
        try{
            Application app = configureApplication();
            app.paint();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}