import Mouse.MouseInfoVo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.MouseInfo;

import static org.junit.jupiter.api.Assertions.*;

class MouseInfoVoTest{

    MouseInfoVo miv;

    @BeforeEach
    void setUp() {
        miv = new MouseInfoVo();
    }

    @Test
    public void testgetLocX(){
        //given  //when

        int testXLoc = MouseInfo.getPointerInfo().getLocation().x;
        int realXloc = miv.getLocX();

        //then

        assertEquals(testXLoc,realXloc);

    }

    @Test
    public void testgetLocY(){
        //given  //when

        int testYLoc = MouseInfo.getPointerInfo().getLocation().y;
        int realYloc = miv.getLocY();

        //then

        assertEquals(testYLoc,realYloc);

    }
}