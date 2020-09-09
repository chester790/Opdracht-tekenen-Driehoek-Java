import java.awt.*;
import java.applet.*;

public class OpdrachtTekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(50, 120, 100, 60);
        g.drawLine(100, 60, 150, 120);
        g.drawLine(150, 120, 50, 120);
    }
}