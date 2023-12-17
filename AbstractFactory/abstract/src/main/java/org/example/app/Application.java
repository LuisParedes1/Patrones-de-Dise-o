package org.example.app;

import org.example.buttons.Button;
import org.example.checkBox.CheckBox;
import org.example.factories.GUIFactory;

/**
 * Creates an application using the factory family of components
 *
 * The Application doesn't know what OS the factory uses
 */
public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
