package org.design.factorydesign;

import org.design.factorydesign.factory.Dialog;
import org.design.factorydesign.factory.WebDialog;
import org.design.factorydesign.factory.WindowsDialog;

public class Main {

    public static void main(String[] args) {

        Dialog windowsDialog = new WindowsDialog();
        System.out.println(windowsDialog.render());

        Dialog webDialog=new WebDialog();
        System.out.println(webDialog.render());
    }
}
