import java.applet.Applet;
import java.awt.*;

/* <applet code="demo.class" width="200" height="200"></applet>
*/

public class demo extends Applet {
   public void paint(Graphics g){
     g.setColor(Color.yellow);
      g.fillOval(20,20,150,150);
      g.setColor(Color.black);
      g.fillOval(50,60,15,25);
      g.fillOval(120,60,15,25);
      int x[] = {95,85,106,95};
      int y[] = {85,104,104,85};
      g.drawPolygon(x, y, 4);
      g.drawArc(55,95,78,50,0,-180);
   }
}
