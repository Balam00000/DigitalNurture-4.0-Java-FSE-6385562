package invoker;

import command.Command;

public class RemoteControl {

    private Command c;
    
    public void  setRemoteControl(Command c){
        this.c=c;
    }

    public void pressButton(){
        if(c!=null){
            c.execute();
        }
        else{
            System.out.println("No command set.");
        }
    } 

    
}
