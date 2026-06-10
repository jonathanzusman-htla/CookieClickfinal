import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
todo:


*/

public class GUI implements ActionListener {
    JFrame frame;
    JPanel buttonPanel;
    JPanel textPanel;
    JButton cookieButton;
    JLabel label;
    JPanel fillerPanel;

    JLabel upgrade1Cost;
    JLabel upgrade2Cost;
    JLabel upgrade3Cost;
    JLabel upgrade4Cost;
    JLabel upgrade5Cost;
    JLabel upgrade6Cost;
    JLabel upgrade7Cost;


    JButton upgradeButton1;
    JButton upgradeButton2;
    JButton upgradeButton3;
    JButton upgradeButton4;
    JButton upgradeButton5;
    JButton upgradeButton6;
    JButton upgradeButton7;
    JButton SuperUpgradeButton;
    Game game;
    ActionListener guiUpdate;
    Timer updateTimer;




    public GUI() {
        game = new Game();
        frame = new JFrame();
        buttonPanel = new JPanel();
        fillerPanel = new JPanel();
        label = new JLabel("Cookies");
        textPanel = new JPanel();

        upgrade1Cost = new JLabel("Upgrade Cost " +game.upgrade1Cost);
        upgrade2Cost = new JLabel("Slow Cooker Cost " +game.upgrade2Cost);
        upgrade3Cost = new JLabel("Fast Cooker Cost " + game.upgrade3Cost);
        upgrade4Cost = new JLabel("Pretty Fast Cooker Cost " + game.upgrade4Cost);
        upgrade5Cost = new JLabel("Good Cooker " + game.upgrade5Cost);
        upgrade6Cost = new JLabel("Second Upgrade Cost " + game.upgrade6Cost);
        upgrade7Cost = new JLabel("Triple Upgrade Cost " + game.upgrade7Cost);


        cookieButton = new JButton("Cookies");
        upgradeButton1 = new JButton("Upgrade");
        upgradeButton2 = new JButton("Slow Cooker");
        upgradeButton3 = new JButton("Fast Cooker");
        upgradeButton4 = new JButton("Pretty Fast Cooker");
        upgradeButton5 = new JButton("Good Cooker");
        upgradeButton6 = new JButton("Second Upgrade");
        upgradeButton7 = new JButton("Triple Upgrade");
        SuperUpgradeButton = new JButton("Super Upgrade");


        cookieButton.addActionListener(ActionEvent -> {
            game.cookieClick();
            label.setText("Cookies: " + game.cookieCounter);
        });



        upgradeButton1.addActionListener(ActionEvent -> game.upgradeButton1());
        upgradeButton2.addActionListener(ActionEvent -> game.upgradeButton2());
        upgradeButton3.addActionListener(ActionEvent -> game.upgradeButton3());
        upgradeButton4.addActionListener(ActionEvent -> game.upgradeButton4());
        upgradeButton5.addActionListener(ActionEvent -> game.upgradeButton5());
        upgradeButton6.addActionListener(ActionEvent -> game.upgradeButton6());
        upgradeButton7.addActionListener(ActionEvent -> game.upgradeButton7());





        textPanel.add(cookieButton);
        textPanel.setBackground(Color.RED);
        textPanel.add(label);
        buttonPanel.add(upgradeButton1);
        buttonPanel.add(upgradeButton2);
        buttonPanel.add(upgradeButton3);
        buttonPanel.add(upgradeButton4);
        buttonPanel.add(upgradeButton5);
        buttonPanel.add(upgradeButton6);
        buttonPanel.add(upgradeButton7);
        buttonPanel.add(upgrade1Cost);
        buttonPanel.add(upgrade2Cost);
        buttonPanel.add(upgrade3Cost);
        buttonPanel.add(upgrade4Cost);
        buttonPanel.add(upgrade5Cost);
        buttonPanel.add(upgrade6Cost);
        buttonPanel.add(upgrade7Cost);


        buttonPanel.setSize(200,300);
        textPanel.setSize(200,100);
        textPanel.setBackground(Color.RED);
        textPanel.setLayout(new GridLayout(1,2));


        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(textPanel, BorderLayout.SOUTH);
        frame.add(fillerPanel, BorderLayout.CENTER);
        frame.add(fillerPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setBackground(Color.RED);
        buttonPanel.setLayout(new GridLayout(4,2));
        fillerPanel.setBackground(Color.RED);
        frame.setVisible(true);


        guiUpdate = new ActionListener() {



            @Override


            public void actionPerformed(ActionEvent e) {
                label.setText("Cookies " + game.cookieCounter);
                upgrade1Cost.setText("Upgrade Cost " + game.upgrade1Cost);
                upgrade2Cost.setText("Slow Cooker Cost " + game.upgrade2Cost);
                upgrade3Cost.setText("FastCooker Cost " + game.upgrade3Cost);
                upgrade4Cost.setText("Pretty Fast Cooking Cost" + game.upgrade4Cost);
                upgrade5Cost.setText("Good Cooker " + game.upgrade5Cost);
                upgrade6Cost.setText("Second Upgrade Cost " + game.upgrade6Cost);
                upgrade7Cost.setText("Triple Upgrade Cost " + game.upgrade7Cost);


                if (game.cookieCounter >= 200) {
                    buttonPanel.add(SuperUpgradeButton);
                }
                //figure out name of the label, set the text of the label
            }
        };


    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
