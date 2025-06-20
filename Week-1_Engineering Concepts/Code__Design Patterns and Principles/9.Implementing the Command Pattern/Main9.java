

import command.LightOffCommand;
import command.LightOnCommand;
import invoker.RemoteControl;
import receiver.Light;

public class Main9 {

    public static void main(String[] args) {
        Light l=new Light();

        LightOnCommand lightOn=new LightOnCommand(l);
        LightOffCommand lightOff=new LightOffCommand(l);

        RemoteControl r=new RemoteControl();
        r.setRemoteControl(lightOn);
        r.pressButton();

        r.setRemoteControl(lightOff);
        r.pressButton();

    }
}