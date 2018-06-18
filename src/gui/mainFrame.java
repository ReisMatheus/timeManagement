/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author ubuntunote
 */
import javax.swing.*;
import java.awt.event.*;

public class mainFrame{
    JFrame opt1 = initFrame();
    JButton add = Buttons(1);
    JButton rm = Buttons(2);
    
    public JFrame initFrame(){
        JFrame main = new JFrame("main");
        main.setSize(250, 250);
        main.setLayout(null);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return main;
    }
    public JButton Buttons(int a){
        switch(a){
            case 1:{
                JButton btAddTask = new JButton(new ImageIcon("/home/ubuntunote/NetBeansProjects/timeManager/src/img/addButton.png"));
                btAddTask.setBounds(100, 60, 50, 50);
                btAddTask.addActionListener((ActionEvent e) -> {
                    opt1.dispose();
                });
                return btAddTask;
            }
            case 2:{
                JButton btRmTask = new JButton(new ImageIcon("/home/ubuntunote/NetBeansProjects/timeManager/src/img/rmButton.png"));
                btRmTask.setBounds(100, 130, 50, 50);
                btRmTask.addActionListener((ActionEvent e) -> {
                    opt1.dispose();
                });
                return btRmTask;
            }
            default:{
                return null;
            }
        }
    }
    
    public JFrame addComponents(int a){
        switch(a){
            case 1:{
                opt1.add(add);
                opt1.add(rm);
                opt1.setVisible(true);
                return opt1;
            }
            default:{
                return null;
            }
        }
    }
}
