package Mouse;

import Mouse.MouseInfoVo;

import java.awt.*;

public class MouseMover {

    MouseInfoVo miv;
    Robot robot;

    public MouseMover(){

        try {
            miv = new MouseInfoVo();
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }

    public void xLocMove(){

        int locX = miv.getLocX();
        int locY = miv.getLocY();
        int resultLocX = locX + 10;
        robot.mouseMove(resultLocX, locY);

    }

    public void yLocMove(){

        int locY = miv.getLocY();
        int locX = miv.getLocX();
        int resultLocY = locY + 10;

        robot.mouseMove(locX, resultLocY);

    }

    public void yLocMoveBack(){

        int locY = miv.getLocY();
        int locX = miv.getLocX();
        int resultLocY = locY - 10;

        robot.mouseMove(locX, resultLocY);

    }
}
