package org.example.factories;

import org.example.buttons.Button;
import org.example.checkBox.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
