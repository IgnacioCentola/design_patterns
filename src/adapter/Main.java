package adapter;

import adapter._adapter.Adapter;
import adapter.adaptee.Adaptee;
import adapter.target_interface.ITarget;

public class Main {
    public static void main(String[] args) {
        ITarget target = new Adapter(new Adaptee());
        target.request();
    }
}
