package org.design.factorydesign.factory;

import org.design.factorydesign.Button;

public abstract class Dialog {
    
    abstract Button createButton();
    public String render(){
        Button button = createButton();
        return button.render();
    }
}
