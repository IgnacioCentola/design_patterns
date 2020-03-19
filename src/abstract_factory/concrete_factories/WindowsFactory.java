package abstract_factory.concrete_factories;

import abstract_factory.concrete_ui_controls.windows.WindowsAlertDialog;
import abstract_factory.concrete_ui_controls.windows.WindowsButton;
import abstract_factory.factory.IAbstractFactory;
import abstract_factory.ui_interfaces.IAlertDialog;
import abstract_factory.ui_interfaces.IButton;

public class WindowsFactory implements IAbstractFactory {
    @Override
    public IAlertDialog buildPlatformSpecificDialog(String message) {
        return new WindowsAlertDialog();
    }

    @Override
    public IButton buildPlatformSpecificButton() {
        return new WindowsButton();
    }
}
