package sutton.golf;

import sutton.physics.Projectile;

import javax.swing.*;
import java.awt.*;

public class GolfCourseComponent extends JComponent {
    double x = 0.0;
    private Projectile ball = new Projectile(80,45);
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        int ground = getHeight()*2/3;

        //draw sky
        graphics.setColor(Color.cyan);
        graphics.fillRect(0, 0, getWidth(), getHeight());

        //draw sun
        graphics.setColor(Color.yellow);
        graphics.fillOval(getWidth()-60,30,40,40 );

        //background mountains


        //draw ground
        graphics.setColor(Color.green);
        graphics.fillRect(0, ground, getWidth(), getHeight());

        //more ground
        Color brown = new Color(100,50,0);
        graphics.setColor(brown);
        graphics.fillRect(0, getHeight()*11/15, getWidth(), getHeight());
        Color lightbrown =new Color (130,90,70);
        graphics.setColor(lightbrown);
        graphics.fillRect(0, (getHeight()*12/15), getWidth(), getHeight());
        graphics.setColor(brown);
        graphics.fillRect(0, getHeight()*13/15, getWidth(), getHeight());
        graphics.setColor(lightbrown);
        graphics.fillRect(0, getHeight()*14/15, getWidth(), getHeight());




        //draww ball

        graphics.setColor(Color.white);
        double ballX=ball.getX()+30;
        double ballY = (ground-15)-ball.getY();

        graphics.fillOval((int) (ballX), (int) (ballY),15,15);
        if (ball.getY() >= 0) {
            ball.addTime(.02);
        }


        //draw flagg pole
        int poleheight = 40;
        int poleplacement = 700;
        graphics.setColor(Color.gray);
        graphics.fillRect(poleplacement, ground-poleheight, 3,poleheight);

        //draw flag
        int flagheight =14;
        int flaglength =15;
        graphics.setColor(Color.red);
        graphics.fillPolygon(new int[] {poleplacement-flaglength,poleplacement,poleplacement}, new int[] {ground-poleheight+flagheight/2,ground-poleheight,ground-poleheight+flagheight},3);

        repaint();


    }
}
