package org.design.factorydesign.factory;

import org.design.factorydesign.Button;
import org.design.factorydesign.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
