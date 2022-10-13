import Seguidores.GetFollowers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame{

   static GetFollowers getFollowers = new GetFollowers(719, 128);

    public static void main(String[] args) throws AWTException, InterruptedException {
        startup();
    }

    private static void startup() {
        JFrame f = new JFrame("The Twilight Zone");
        JButton b = new JButton("Submit");
        JButton exitButoom = new JButton("exitButoom");
        f.setSize(390, 300);
        f.setLocation(150, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });

        b.setBounds(50, 150, 100, 30);
        b.addActionListener(e -> {
            getFollowers.run();
        });

        exitButoom.setBounds(50,200,100,30);
        exitButoom.addActionListener(e -> {
            System.exit(0);
        });

        f.setLayout(null);
        f.setVisible(true);
        f.add(b);
        f.add(exitButoom);
    }

}
