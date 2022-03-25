package Mouse;

import java.awt.MouseInfo;

public class MouseInfoVo {

    private int locX;

    public int locY;

    public MouseInfoVo(){
    }

    public int getLocX(){
        this.locX = MouseInfo.getPointerInfo().getLocation().x;
        return this.locX;
    }

    public int getLocY(){
        this.locY = MouseInfo.getPointerInfo().getLocation().y;
        return this.locY;
    }


}
