package abstract_factory.factory;

import abstract_factory.ui_interfaces.IAlertDialog;
import abstract_factory.ui_interfaces.IButton;

public interface IAbstractFactory {
    IAlertDialog buildPlatformSpecificDialog(String message);
    IButton buildPlatformSpecificButton();
}
