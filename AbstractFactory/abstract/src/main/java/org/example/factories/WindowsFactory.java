package org.example.factories;

import org.example.buttons.Button;
import org.example.buttons.WindowsButton;
import org.example.checkBox.CheckBox;
import org.example.checkBox.WindowsCheckBox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
