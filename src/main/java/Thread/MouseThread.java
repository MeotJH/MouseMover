package Thread;

import Mouse.MouseMover;
import jFrame.Frame;

public class MouseThread implements Runnable{

    private boolean flag = false;

    public MouseThread(boolean flag){
        this.flag = flag;
    };

    public MouseThread(){
    };

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run(){

        MouseMover mouseMover = new MouseMover();

        System.out.println("run flag is : " + flag);

        while(flag){
            System.out.println("flag true");
            mouseMover.yLocMove();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            mouseMover.yLocMoveBack();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }

        System.out.println("loop Out");



    };
}
