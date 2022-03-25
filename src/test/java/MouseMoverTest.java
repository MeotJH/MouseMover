import Mouse.MouseMover;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.awt.*;
import java.awt.MouseInfo;

class MouseMoverTest {

    Robot robot;
    MouseMover mm;

    @BeforeEach
    void setUp() throws AWTException {
        robot = new Robot();
        mm = new MouseMover();
    }

    @Test
    void xLocMove() {

        //when
        //given
        int xLoc = MouseInfo.getPointerInfo().getLocation().x;
        int testXLoc = xLoc+10;
        mm.xLocMove();
        //then
    }

    @Test
    void yLocMove() {
    }
}