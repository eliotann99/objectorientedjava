/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class ForzafProject extends JFrame {

    int gameDifficultyNum, drivatarDifficultyNum, brakingNum, steeringNum, tractionControlNum,
            stabilityControlNum, shiftingNum, drivingLineNum, damageAndTireWearNum, rewindNum;

    JLabel gameDifficulty, drivatarDifficulty, braking, steering, tractionControl,
            stabilityControl, shifting, drivingLine, damageAndTireWear, rewind;

    Font titleFont = new Font("TimesRoman", Font.BOLD, 60);
    Font textFont = new Font("SansSerif", Font.ITALIC, 25);
    Font arrowFont = new Font("TimesRoman", Font.PLAIN, 60);

    LinkedList<JButton> leftButtonList = new LinkedList<>();
    LinkedList<JButton> rightButtonList = new LinkedList<>();
    LinkedList<JLabel> panel1List = new LinkedList<>();

    JPanel p3 = new JPanel();

    public ForzafProject() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p4 = new JPanel();

        p1.setLayout(new GridLayout(10, 1));
        panel1List.add(new JLabel("Difficulty"));
        panel1List.add(new JLabel("Drivatar Difficulty"));
        panel1List.add(new JLabel("Braking"));
        panel1List.add(new JLabel("Stearing"));
        panel1List.add(new JLabel("Traction Control"));
        panel1List.add(new JLabel("Stability Control"));
        panel1List.add(new JLabel("Shifting"));
        panel1List.add(new JLabel("Driving Line"));
        panel1List.add(new JLabel("Damage & Tire Wear"));
        panel1List.add(new JLabel("Rewind"));
        JLabel label;
        for (int i = 0; i < panel1List.size(); i++) {
            label = panel1List.get(i);
            label.setFont(textFont);
            p1.add(label);
        }// close for loop

        ButtonListener listener = new ButtonListener();
        p2.setLayout(new GridLayout(10, 1));
        for (int i = 0; i < 10; i++) {
            JButton jbt = new JButton("<");
            jbt.setFont(arrowFont);
            leftButtonList.add(jbt);
        }//close for loop
        JButton butt;
        for (int i = 0; i < leftButtonList.size(); i++) {
            butt = leftButtonList.get(i);
            butt.addActionListener(listener);
            p2.add(butt);
        }// close for loop

        panel3();

        p4.setLayout(new GridLayout(10, 1));
        for (int i = 0; i < 10; i++) {
            JButton jbt = new JButton(">");
            jbt.setFont(arrowFont);
            rightButtonList.add(jbt);
        }//close for loop
        for (int i = 0; i < leftButtonList.size(); i++) {
            butt = rightButtonList.get(i);
            butt.addActionListener(listener);
            p4.add(butt);
        }// close for
        buttonVisiblity();

        TitledBorder title = BorderFactory.createTitledBorder("DIFFICULTY");
        title.setTitleFont(titleFont);

        JPanel mainGridLayout = new JPanel();
        mainGridLayout.setLayout(new GridLayout(1, 4, 100, 0));
        mainGridLayout.add(p1);
        mainGridLayout.add(p2);
        mainGridLayout.add(p3);
        mainGridLayout.add(p4);
        mainGridLayout.setBorder(title);
        add(mainGridLayout, BorderLayout.WEST);
        
    }// close constructer method

    public void panel3() {
        p3.setLayout(new GridLayout(10, 1));
        p3.add(gameDifficulty());
        p3.add(drivatarDifficulty());
        p3.add(braking());
        p3.add(steering());
        p3.add(tractionControl());
        p3.add(stabilityControl());
        p3.add(shifting());
        p3.add(drivingLine());
        p3.add(damageAndTireWear());
        p3.add(rewind());
    }// close panel method

    public static void main(String[] args) {
        ForzafProject frame = new ForzafProject();
        frame.setTitle("Final Project");
        frame.setSize(1400, 1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }// close main method

    public JLabel gameDifficulty() {
        LinkedList<JLabel> gameDifficultyList = new LinkedList<>();
        gameDifficultyList.add(new JLabel("EASY"));
        gameDifficultyList.add(new JLabel("MEDIUM"));
        gameDifficultyList.add(new JLabel("HARD"));
        gameDifficultyList.add(new JLabel("VERY HARD"));
        gameDifficultyList.add(new JLabel("INSANE"));
        gameDifficultyList.add(new JLabel("CUSTOM"));
        JLabel label;

        if (gameDifficultyNum <= 5 && gameDifficultyNum >= 0) {
            label = gameDifficultyList.get(gameDifficultyNum);
            label.setFont(textFont);
            gameDifficulty = label;
        }// close if else
        return gameDifficulty;
    }// close gameDifficulty

    public JLabel drivatarDifficulty() {
        LinkedList<JLabel> drivatarDifficultyList = new LinkedList<>();
        drivatarDifficultyList.add(new JLabel("NEW RACIER"));
        drivatarDifficultyList.add(new JLabel("INEXPERIENCED"));
        drivatarDifficultyList.add(new JLabel("AVERAGE"));
        drivatarDifficultyList.add(new JLabel("ABOVE AVERAGE"));
        drivatarDifficultyList.add(new JLabel("EXPERT"));
        drivatarDifficultyList.add(new JLabel("PRO"));
        drivatarDifficultyList.add(new JLabel("UNBEATABLE"));
        JLabel label;

        if (drivatarDifficultyNum <=7  && drivatarDifficultyNum >= 0) {
            label = drivatarDifficultyList.get(drivatarDifficultyNum);
            label.setFont(textFont);
            drivatarDifficulty = label;
        }// close if else
        return drivatarDifficulty;
    }// close drivatarDifficulty

    public JLabel braking() {
        LinkedList<JLabel> brakingList = new LinkedList<>();
        brakingList.add(new JLabel("ASSISTED"));
        brakingList.add(new JLabel("ABS ON"));
        brakingList.add(new JLabel("ABS OFF"));
        JLabel label;
        if (brakingNum < 3 && brakingNum >= 0) {
            label = brakingList.get(brakingNum);
            label.setFont(textFont);
            braking = label;
        }// close if else
        return braking;
    }// close braking

    public JLabel steering() {
        LinkedList<JLabel> steeringlist = new LinkedList<>();
        steeringlist.add(new JLabel("ASSISTED"));
        steeringlist.add(new JLabel("NORMAL"));
        steeringlist.add(new JLabel("SIMULATION"));
        JLabel label;
        if (steeringNum < 3 && steeringNum >= 0) {
            label = steeringlist.get(steeringNum);
            label.setFont(textFont);
            steering = label;
        }// close if else
        return steering;
    }// close steering

    public JLabel tractionControl() {
        LinkedList<JLabel> tractionControlList = new LinkedList<>();
        tractionControlList.add(new JLabel("ON"));
        tractionControlList.add(new JLabel("OFF"));
        JLabel label;
        if (tractionControlNum < 2 && tractionControlNum >= 0) {
            label = tractionControlList.get(tractionControlNum);
            label.setFont(textFont);
            tractionControl = label;
        }// close if else
        return tractionControl;
    }// close tracitonControl

    public JLabel stabilityControl() {
        LinkedList<JLabel> stabilityControlList = new LinkedList<>();
        stabilityControlList.add(new JLabel("ON"));
        stabilityControlList.add(new JLabel("OFF"));
        JLabel label;
        if (stabilityControlNum < 2 && stabilityControlNum >= 0) {
            label = stabilityControlList.get(stabilityControlNum);
            label.setFont(textFont);
            stabilityControl = label;
        }// close if else
        return stabilityControl;
    }// close stabilityControl

    public JLabel shifting() {
        LinkedList<JLabel> shiftingList = new LinkedList<>();
        shiftingList.add(new JLabel("AUTOMATIC"));
        shiftingList.add(new JLabel("MANUAL"));
        shiftingList.add(new JLabel("MANUAL/CLUTCH"));
        JLabel label;
        if (shiftingNum < 3 && shiftingNum >= 0) {
            label = shiftingList.get(shiftingNum);
            label.setFont(textFont);
            shifting = label;
        }// close if else
        return shifting;
    }// close shifting

    public JLabel drivingLine() {
        LinkedList<JLabel> drivingLineList = new LinkedList<>();
        drivingLineList.add(new JLabel("ON"));
        drivingLineList.add(new JLabel("BRAKING ONLY"));
        drivingLineList.add(new JLabel("OFF"));
        JLabel label;
        if (drivingLineNum < 3 && drivingLineNum >= 0) {
            label = drivingLineList.get(drivingLineNum);
            label.setFont(textFont);
            drivingLine = label;
        }// close if else
        return drivingLine;
    }// close shifting

    public JLabel damageAndTireWear() {
        LinkedList<JLabel> damageAndTireWearList = new LinkedList<>();
        damageAndTireWearList.add(new JLabel("NONE"));
        damageAndTireWearList.add(new JLabel("COSMETIC"));
        damageAndTireWearList.add(new JLabel("SIMULATION"));
        JLabel label;
        if (damageAndTireWearNum < 3 && damageAndTireWearNum >= 0) {
            label = damageAndTireWearList.get(damageAndTireWearNum);
            label.setFont(textFont);
            damageAndTireWear = label;
        }// close if else
        return damageAndTireWear;
    }// close shifting

    public JLabel rewind() {
        LinkedList<JLabel> rewindList = new LinkedList<>();
        rewindList.add(new JLabel("ON"));
        rewindList.add(new JLabel("OFF"));
        JLabel label;
        if (rewindNum < 2 && rewindNum >= 0) {
            label = rewindList.get(rewindNum);
            label.setFont(textFont);
            rewind = label;
        }// close if else
        return rewind;
    }// close shifting

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == leftButtonList.get(0)) {
                if (gameDifficultyNum > 0) {
                    gameDifficultyNum = gameDifficultyNum - 1;
                }// close if
                gameDifficulty = gameDifficulty();
                difficultyselector();
            } else if (e.getSource() == leftButtonList.get(1)) {
                if (drivatarDifficultyNum > 0) {
                    drivatarDifficultyNum = drivatarDifficultyNum - 1;
                    setGameDifficulty();
                }//close if
                drivatarDifficulty = drivatarDifficulty();
            } else if (e.getSource() == leftButtonList.get(2)) {
                if (brakingNum > 0) {
                    brakingNum = brakingNum - 1;
                    setGameDifficulty();
                }// close if
                braking = braking();
            } else if (e.getSource() == leftButtonList.get(3)) {
                if (steeringNum > 0) {
                    steeringNum = steeringNum - 1;
                    setGameDifficulty();
                }// close if
                steering = steering();
            } else if (e.getSource() == leftButtonList.get(4)) {
                if (tractionControlNum > 0) {
                    tractionControlNum = tractionControlNum - 1;
                    setGameDifficulty();
                }// close if
                tractionControl = tractionControl();
            } else if (e.getSource() == leftButtonList.get(5)) {
                if (stabilityControlNum > 0) {
                    stabilityControlNum = stabilityControlNum - 1;
                    setGameDifficulty();
                }// close if
                stabilityControl = stabilityControl();
            } else if (e.getSource() == leftButtonList.get(6)) {
                if (shiftingNum > 0) {
                    shiftingNum = shiftingNum - 1;
                    setGameDifficulty();
                }// close if
                shifting = shifting();
            } else if (e.getSource() == leftButtonList.get(7)) {
                if (drivingLineNum > 0) {
                    drivingLineNum = drivingLineNum - 1;
                    setGameDifficulty();
                }// close if
                drivingLine = drivingLine();
            } else if (e.getSource() == leftButtonList.get(8)) {
                if (damageAndTireWearNum > 0) {
                    damageAndTireWearNum = damageAndTireWearNum - 1;
                    setGameDifficulty();
                }// close if
                damageAndTireWear = damageAndTireWear();
            } else if (e.getSource() == leftButtonList.get(9)) {
                if (rewindNum > 0) {
                    rewindNum = rewindNum - 1;
                    setGameDifficulty();
                }// close if
                rewind = rewind();
            } else if (e.getSource() == rightButtonList.get(0)) {
                if (gameDifficultyNum < 5) {
                    gameDifficultyNum = gameDifficultyNum + 1;
                }//close if
                gameDifficulty = gameDifficulty();
                difficultyselector();
            } else if (e.getSource() == rightButtonList.get(1)) {
                if (drivatarDifficultyNum < 6) {
                    drivatarDifficultyNum = drivatarDifficultyNum + 1;
                    setGameDifficulty();
                }//close if
                drivatarDifficulty = drivatarDifficulty();
            } else if (e.getSource() == rightButtonList.get(2)) {
                if (brakingNum < 2) {
                    brakingNum = brakingNum + 1;
                    setGameDifficulty();
                }// close if
                braking = braking();
            } else if (e.getSource() == rightButtonList.get(3)) {
                if (steeringNum < 2) {
                    steeringNum = steeringNum + 1;
                    setGameDifficulty();
                }// close if
                steering = steering();
            } else if (e.getSource() == rightButtonList.get(4)) {
                if (tractionControlNum < 1) {
                    tractionControlNum = tractionControlNum + 1;
                    setGameDifficulty();
                }// close if
                tractionControl = tractionControl();
            } else if (e.getSource() == rightButtonList.get(5)) {
                if (stabilityControlNum < 1) {
                    stabilityControlNum = stabilityControlNum + 1;
                    setGameDifficulty();
                }// close if
                stabilityControl = stabilityControl();
            } else if (e.getSource() == rightButtonList.get(6)) {
                if (shiftingNum < 2) {
                    shiftingNum = shiftingNum + 1;
                    setGameDifficulty();
                }// close if
                shifting = shifting();
            } else if (e.getSource() == rightButtonList.get(7)) {
                if (drivingLineNum < 2) {
                    drivingLineNum = drivingLineNum + 1;
                    setGameDifficulty();
                }// close if
                drivingLine = drivingLine();
            } else if (e.getSource() == rightButtonList.get(8)) {
                if (damageAndTireWearNum < 2) {
                    damageAndTireWearNum = damageAndTireWearNum + 1;
                    setGameDifficulty();
                }// close if
                damageAndTireWear = damageAndTireWear();
            } else if (e.getSource() == rightButtonList.get(9)) {
                if (rewindNum < 1) {
                    rewindNum = rewindNum + 1;
                    setGameDifficulty();
                }// close if
                rewind = rewind();
            }// close if else statement
            buttonVisiblity();
            p3.removeAll();
            panel3();
            p3.revalidate();
            p3.repaint();
        }//close actionperformed method
    }// close inner class method

    public void difficultyselector() {
        if (gameDifficultyNum == 0) {
            drivatarDifficultyNum = 0;
            brakingNum = 0;
            steeringNum = 0;
            tractionControlNum = 0;
            stabilityControlNum = 0;
            shiftingNum = 0;
            drivingLineNum = 0;
            damageAndTireWearNum = 0;
            rewindNum = 0;
        } else if (gameDifficultyNum == 1) {
            drivatarDifficultyNum = 1;
            brakingNum = 0;
            steeringNum = 0;
            tractionControlNum = 0;
            stabilityControlNum = 0;
            shiftingNum = 0;
            drivingLineNum = 0;
            damageAndTireWearNum = 0;
            rewindNum = 0;
        } else if (gameDifficultyNum == 2) {
            drivatarDifficultyNum = 3;
            brakingNum = 1;
            steeringNum = 1;
            tractionControlNum = 0;
            stabilityControlNum = 0;
            shiftingNum = 1;
            drivingLineNum = 1;
            damageAndTireWearNum = 1;
            rewindNum = 0;
        } else if (gameDifficultyNum == 3) {
            drivatarDifficultyNum = 5;
            brakingNum = 1;
            steeringNum = 1;
            tractionControlNum = 0;
            stabilityControlNum = 0;
            shiftingNum = 1;
            drivingLineNum = 1;
            damageAndTireWearNum = 1;
            rewindNum = 0;
        } else if (gameDifficultyNum == 4) {
            drivatarDifficultyNum = 6;
            brakingNum = 2;
            steeringNum = 2;
            tractionControlNum = 1;
            stabilityControlNum = 1;
            shiftingNum = 2;
            drivingLineNum = 2;
            damageAndTireWearNum = 2;
            rewindNum = 1;
            rewindNum = 1;
        }// close if else
    }// close difficultyselecter method

    public void setGameDifficulty() {
        gameDifficultyNum = 5;
    }// close customeDifficultySelector() method

    public void buttonVisiblity() {
        if (gameDifficultyNum == 0) {
            leftButtonList.get(0).setVisible(false);
        } else {
            leftButtonList.get(0).setVisible(true);
        } // close if else
        if (drivatarDifficultyNum == 0) {
            leftButtonList.get(1).setVisible(false);
        } else {
            leftButtonList.get(1).setVisible(true);
        }// close if else
        if (brakingNum == 0) {
            leftButtonList.get(2).setVisible(false);
        } else {
            leftButtonList.get(2).setVisible(true);
        }// close if else
        if (steeringNum == 0) {
            leftButtonList.get(3).setVisible(false);
        } else {
            leftButtonList.get(3).setVisible(true);
        }// close if else
        if (tractionControlNum == 0) {
            leftButtonList.get(4).setVisible(false);
        } else {
            leftButtonList.get(4).setVisible(true);
        }// close if else
        if (stabilityControlNum == 0) {
            leftButtonList.get(5).setVisible(false);
        } else {
            leftButtonList.get(5).setVisible(true);
        }// close if else
        if (shiftingNum == 0) {
            leftButtonList.get(6).setVisible(false);
        } else {
            leftButtonList.get(6).setVisible(true);
        }// close if else
        if (drivingLineNum == 0) {
            leftButtonList.get(7).setVisible(false);
        } else {
            leftButtonList.get(7).setVisible(true);
        }// close if else
        if (damageAndTireWearNum == 0) {
            leftButtonList.get(8).setVisible(false);
        } else {
            leftButtonList.get(8).setVisible(true);
        }// close if else
        if (rewindNum == 0) {
            leftButtonList.get(9).setVisible(false);
        } else {
            leftButtonList.get(9).setVisible(true);
        }// close if else
        if (gameDifficultyNum == 5) {
            rightButtonList.get(0).setVisible(false);
        } else {
            rightButtonList.get(0).setVisible(true);
        } // close if else
        if (drivatarDifficultyNum == 6) {
            rightButtonList.get(1).setVisible(false);
        } else {
            rightButtonList.get(1).setVisible(true);
        }// close if else
        if (brakingNum == 2) {
            rightButtonList.get(2).setVisible(false);
        } else {
            rightButtonList.get(2).setVisible(true);
        }// close if else
        if (steeringNum == 2) {
            rightButtonList.get(3).setVisible(false);
        } else {
            rightButtonList.get(3).setVisible(true);
        }// close if else
        if (tractionControlNum == 1) {
            rightButtonList.get(4).setVisible(false);
        } else {
            rightButtonList.get(4).setVisible(true);
        }// close if else
        if (stabilityControlNum == 1) {
            rightButtonList.get(5).setVisible(false);
        } else {
            rightButtonList.get(5).setVisible(true);
        }// close if else
        if (shiftingNum == 2) {
            rightButtonList.get(6).setVisible(false);
        } else {
            rightButtonList.get(6).setVisible(true);
        }// close if else
        if (drivingLineNum == 2) {
            rightButtonList.get(7).setVisible(false);
        } else {
            rightButtonList.get(7).setVisible(true);
        }// close if else
        if (damageAndTireWearNum == 2) {
            rightButtonList.get(8).setVisible(false);
        } else {
            rightButtonList.get(8).setVisible(true);
        }// close if else
        if (rewindNum == 1) {
            rightButtonList.get(9).setVisible(false);
        } else {
            rightButtonList.get(9).setVisible(true);
        }// close if else
    }// close buttonVisiblity
    
    public void description() {
        JTextArea jtaDescription = new JTextArea();
        jtaDescription.setLineWrap(true);
        jtaDescription.setWrapStyleWord(true);
        jtaDescription.setEditable(false);
    }// close decription method
}// close class
