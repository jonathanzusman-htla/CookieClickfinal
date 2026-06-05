import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
todo:


 */

public class GUI implements ActionListener {
    JFrame frame;
    JPanel panel;
    JPanel textPanel;
    JPanel fillerPanel;
    JLabel label;
    JLabel upgrade1Cost;
    JLabel upgrade2Cost;
    JButton cookieButton;
    JButton upgradeButton1;
    JButton upgradeButton2;
    JButton SuperUpgradeButton;
    Game game;
    ActionListener guiUpdate;
    Timer updateTimer;

    public GUI() {
        game = new Game();
        frame = new JFrame();
        panel = new JPanel();
        fillerPanel = new JPanel();
        label = new JLabel("Cookies 0");
        upgrade1Cost = new JLabel("Upgrade cost: " + game.upgrade1Cost);
        upgrade2Cost = new JLabel("Upgrade cost: " + game.upgrade2Cost);
        cookieButton = new JButton("Cookies");
        upgradeButton1 = new JButton("Upgrade");
        upgradeButton2 = new JButton("Slow Cooking");
        SuperUpgradeButton = new JButton("Super Upgrade");

        cookieButton.addActionListener(ActionEvent -> {
            game.cookieClick();
            label.setText("Cookies" + game.cookieCounter);
        });
        upgradeButton1.addActionListener(ActionEvent -> game.upgradeButton1());
        upgradeButton2.addActionListener(ActionEvent -> game.upgradeButton2());


       //panel elements

        panel.add(cookieButton);
        panel.add(upgradeButton1);
        panel.add(upgradeButton2);
        panel.add(label);
        panel.add(upgrade1Cost);
        panel.add(upgrade2Cost);

        //panel properties
        panel.setSize(400,100);
        panel.setBackground(Color.PINK);
        panel.setLayout(new GridLayout(2,3));
        fillerPanel.setBackground(Color.PINK);

        cookieButton.setSize(200, 200);


        frame.add(panel);
        frame.add(fillerPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setBackground(Color.PINK);
        frame.setVisible(true);


        guiUpdate = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Cookies" + game.cookieCounter);
                upgrade1Cost.setText("Upgrade Cost: " + game.upgrade1Cost);
                upgrade2Cost.setText("Upgrade Cost: " + game.upgrade2Cost);
                //figure out name of the label, set the text of the label
            }
        };


    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
