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
    public JFrame firstLayer = initFrame();
    public JFrame secondLayer = initFrame();
    public JFrame mainFrame = initFrame();
    public JTextField nameField = textManage();
    public JButton add = Buttons(1);
    public JButton rm = Buttons(2);
    public JButton input = Buttons(3);
    public String txt;
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
                JButton btAddTask = new JButton(new ImageIcon("src/img/addButton.png"));
                btAddTask.setBounds(100, 50, 50, 50);
                btAddTask.addActionListener((ActionEvent evt) -> {
                    firstLayer.setVisible(false);
                    firstLayer.dispose();
                    secondLayer();
                });
                return btAddTask;
            }
            case 2:{
                JButton btRmTask = new JButton(new ImageIcon("src/img/rmButton.png"));
                btRmTask.setBounds(100, 100, 50, 50);
                btRmTask.addActionListener((ActionEvent evt) -> {
                    //frameManager(2);
                });
                return btRmTask;
            }
            case 3:{
                JButton btInputName = new JButton(new ImageIcon("src/img/ok.png"));
                btInputName.setBounds(100, 100, 50, 50);
                btInputName.addActionListener((ActionEvent evt) ->{
                    secondLayer.setVisible(false);
                    secondLayer.dispose();
                });
                return btInputName;
            }
            default:{
                return null;
            }
        }
    }
    public JTextField textManage(){
        JTextField inputName = new JTextField();
        inputName.setBounds(75, 75, 100, 20);
        inputName.addActionListener((ActionEvent evt) -> {
            this.txt = inputName.getText();
        });
        return inputName;
    }
    public void firstLayer(){
        firstLayer.add(add);
        firstLayer.add(rm);
        firstLayer.setVisible(true);
    }
    public void secondLayer(){
        secondLayer.add(nameField);
        secondLayer.add(input);
        secondLayer.setVisible(true);
    }
    public void runGUI(){
        firstLayer();
    }
}
