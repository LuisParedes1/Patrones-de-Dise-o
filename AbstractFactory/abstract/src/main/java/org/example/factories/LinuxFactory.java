package org.example.factories;

import org.example.buttons.Button;
import org.example.buttons.LinuxButton;
import org.example.checkBox.CheckBox;
import org.example.checkBox.LinuxCheckBox;

public class LinuxFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
