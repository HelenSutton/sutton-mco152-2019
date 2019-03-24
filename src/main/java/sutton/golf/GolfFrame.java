package sutton.golf;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;


public class GolfFrame extends JFrame{

    public GolfFrame(){
        setTitle("Touro Golf");
        setSize(800,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel root = new JPanel();
        root.setLayout(new BorderLayout());


        GolfCourseComponent  golfCorseComponent = new GolfCourseComponent();
        root.add(golfCorseComponent, BorderLayout.CENTER);


        setContentPane(root);
    }
    public void printClick(ActionEvent actionEvent){
        System.out.println("CLICK");
    }
}
