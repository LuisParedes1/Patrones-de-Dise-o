package org.example.factories;

import org.example.buttons.Button;
import org.example.buttons.MacOSButton;
import org.example.checkBox.CheckBox;
import org.example.checkBox.MacOSCheckBox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
