package abstract_factory;

import abstract_factory.concrete_factories.MacOsFactory;
import abstract_factory.concrete_ui_controls.mac_os.MacOsAlertDialog;
import abstract_factory.factory.IAbstractFactory;
import abstract_factory.ui_interfaces.IAlertDialog;

public class Main {
    public static void main(String[] args) {
        IAbstractFactory macOsFactory = new MacOsFactory();
        IAlertDialog macOsDialog = macOsFactory.buildPlatformSpecificDialog("flex");


    }
}
