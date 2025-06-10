package org.design.factorydesign.factory;

import org.design.factorydesign.Button;
import org.design.factorydesign.HTMLButton;

public class WebDialog extends Dialog{
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
