package sutton.net;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class LoadPhotos extends JFrame {
    int photonumber= 0;
    PhotoList PhotoList;
    JLabel photonumbers = new JLabel();
    JLabel imageLabel = new JLabel ();
    JList list = new JList();



    public void updatephoto() throws MalformedURLException {
        imageLabel.setIcon(new ImageIcon(new URL(PhotoList.get(photonumber).getUrl())));
        photonumbers.setText(String.valueOf(PhotoList.get(photonumber).getId()));

    }

    public void fillLIst(){
        String[] PhotoTitles = new String[PhotoList.size()];
       for(int i = 0; i<PhotoList.size() - 1; i++) {
           PhotoTitles[i] = PhotoList.get(i).getTitle();
       }
       list.setListData(PhotoTitles);
       list.addListSelectionListener(e->{
           photonumber =  list.getSelectedIndex();
           try {
               updatephoto();
           } catch (MalformedURLException e1) {
               e1.printStackTrace();
           }
       });

    }


    public LoadPhotos() throws MalformedURLException {



        setTitle("Photos");

        setSize(900, 700);
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
                        imageLabel.setIcon(new ImageIcon(new URL(photos.get(photonumber).getUrl())));
                    }
                });

        fillLIst();
        JScrollPane scroll = new JScrollPane(list);


        root.add(scroll, BorderLayout.EAST);


        root.add(imageLabel, BorderLayout.CENTER);
        updatephoto();
        setContentPane(root);
    }

    public static void main(String[] args) throws MalformedURLException {
        new LoadPhotos().setVisible(true);
    }
}