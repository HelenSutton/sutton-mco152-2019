package sutton.golf;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GolfFrame extends JFrame{

    public GolfFrame(){
        setTitle("TOuro Golf");
        setSize(600,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel root = new JPanel();
        root.setLayout(new BorderLayout());

        JLabel north = new JLabel(new ImageIcon("im-batman.jpg"));
        north.setBackground(Color.pink);
        north.setOpaque(true);
        root.add(north, BorderLayout.NORTH);

        JLabel south = new JLabel("SOUTH");
        south.setBackground(Color.magenta);
        south.setOpaque(true);
        root.add(south, BorderLayout.SOUTH);

        JLabel west = new JLabel("WEST");
        west.setBackground(Color.cyan);
        west.setOpaque(true);
        root.add(west, BorderLayout.WEST);

        JButton center = new JButton("CENTER");
        center.setBackground(Color.lightGray);
        center.setOpaque(true);

        center.addActionListener(this::printClick);
        root.add(center, BorderLayout.CENTER);

        setContentPane(root);
    }
    public void printClick(ActionEvent actionEvent){
        System.out.println("CLICK");
    }
}
