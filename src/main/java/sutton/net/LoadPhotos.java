package sutton.net;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class LoadPhotos extends JFrame {
    int photonumber= 0;
    PhotoList PhotoList;
    JLabel photonumbers = new JLabel(String.valueOf(photonumber));
    JLabel imageLabel = new JLabel ();


    public void updatephoto() throws MalformedURLException {
        imageLabel.setIcon(new ImageIcon(new URL(PhotoList.get(photonumber).url)));
        photonumbers.setText(String.valueOf(photonumber));

    }


    public LoadPhotos() throws MalformedURLException {


        setTitle("Photos");

        setSize(700, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        JPanel root = new JPanel();
        root.setLayout(new BorderLayout());
        JPanel controls = new JPanel();
        controls.setLayout(new FlowLayout());
        JButton prev = new JButton("Previous");
        controls.add(prev);

        prev.addActionListener(e->{
            if (photonumber > 0) {
                photonumber--;
                try {
                    updatephoto();
                } catch (MalformedURLException e1) {
                    e1.printStackTrace();
                }
            }


        });

        controls.add(photonumbers);
        JButton next = new JButton("next");
        controls.add(next);
        next.addActionListener(e->{
            if (photonumber+1 <= PhotoList.size())
            photonumber++;
            try {
                updatephoto();
            } catch (MalformedURLException e1) {
                e1.printStackTrace();
            }

        });
        root.add(controls, BorderLayout.SOUTH);


         JsonPlaceholderClient client = new JsonPlaceholderClient();
        Disposable disposable = client.getPhotoList()
               .subscribe(new Consumer<PhotoList>() {
                    @Override
                    public void accept (PhotoList photos) throws MalformedURLException {
                        PhotoList = photos;
                        imageLabel.setIcon(new ImageIcon(new URL(photos.get(photonumber).url)));
                    }
                });


        root.add(imageLabel, BorderLayout.CENTER);
        setContentPane(root);
    }

    public static void main(String[] args) throws MalformedURLException {
        new LoadPhotos().setVisible(true);
    }
}