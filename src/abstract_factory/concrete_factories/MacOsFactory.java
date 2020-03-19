package abstract_factory.concrete_factories;

import abstract_factory.concrete_ui_controls.mac_os.MacOsAlertDialog;
import abstract_factory.concrete_ui_controls.mac_os.MacOsButton;
import abstract_factory.factory.IAbstractFactory;
import abstract_factory.ui_interfaces.IAlertDialog;
import abstract_factory.ui_interfaces.IButton;

public class MacOsFactory implements IAbstractFactory {
    @Override
    public IAlertDialog buildPlatformSpecificDialog(String message) {
        return new MacOsAlertDialog(message);
    }

    @Override
    public IButton buildPlatformSpecificButton() {
        return new MacOsButton();
    }
}
