package abstract_factory.concrete_factories;

import abstract_factory.concrete_ui_controls.linux.LinuxAlertDialog;
import abstract_factory.concrete_ui_controls.linux.LinuxButton;
import abstract_factory.factory.IAbstractFactory;
import abstract_factory.ui_interfaces.IAlertDialog;
import abstract_factory.ui_interfaces.IButton;

public class LinuxFactory implements IAbstractFactory {
    @Override
    public IAlertDialog buildPlatformSpecificDialog(String message) {
        return new LinuxAlertDialog();
    }

    @Override
    public IButton buildPlatformSpecificButton() {
        return new LinuxButton();
    }
}
