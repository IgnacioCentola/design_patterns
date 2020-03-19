package command.invoker;

import command.command_interface.ICommand;

public class Invoker {
    ICommand on, off, up, down;

    public Invoker(ICommand on, ICommand off, ICommand up, ICommand down) {
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
    }

    public void executeOn() {
        on.execute();
    }
    public void executeOff() {
        off.execute();
    }
    public void executeUp() {
        up.execute();
    }
    public void executeDown() {
        down.execute();
    }
}
