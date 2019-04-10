package sutton.golf;
import sutton.physics.Projectile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.concurrent.atomic.AtomicBoolean;


public class GolfFrame extends JFrame{

    public GolfFrame(){
        setTitle("Touro Golf");
        setSize(800,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel root = new JPanel();
        root.setLayout(new BorderLayout());

        JPanel controls = new JPanel();
        controls.setLayout(new FlowLayout());
        JLabel velocity = new JLabel("velocity");
        controls.add(velocity);
        JTextField velocityinput = new JTextField(5);
        controls.add(velocityinput);
        JLabel angle = new JLabel("angle");
        controls.add(angle);
        JTextField angleinput = new JTextField(5);
        controls.add(angleinput);
        JButton go = new JButton("GO");
        controls.add(go);
        JButton reset = new JButton("reset");
        controls.add(reset);
        GolfCourseComponent  golfCourseComponent = new GolfCourseComponent();
        AtomicBoolean resetclicked = new AtomicBoolean(true);
        reset.addActionListener(e->{
            Projectile ball = new Projectile(0,0);
            golfCourseComponent.setBall(ball);
            resetclicked.set(true);
        });
        go.addActionListener(e -> {
            int velocity1 = Integer.parseInt(velocityinput.getText());
            int angle1 = Integer.parseInt(angleinput.getText());
            if (resetclicked.get()){
            Projectile ball = new Projectile(velocity1,angle1);
            golfCourseComponent.setBall(ball);
            resetclicked.set(false);}
        });



        root.add(controls, BorderLayout.SOUTH);



        root.add(golfCourseComponent, BorderLayout.CENTER);

       // JComponent velocityinput =new JComponent();


        setContentPane(root);
    }
    public void printClick(ActionEvent actionEvent){
        System.out.println("CLICK");
    }
    public void Actionpreformed(){


    }
}
