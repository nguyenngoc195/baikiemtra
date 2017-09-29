/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lan
 */
public class StudentForm {

    public static void Frame() {
        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        JMenu studentManager = new JMenu("Student manager");
        JMenu classRoom = new JMenu("Class room");
        JMenuItem addStuden = new JMenuItem("Add studen");
        JMenuItem listStudent = new JMenuItem("List studen");
        JMenuItem addClass = new JMenuItem("Add class");
        JMenuItem listClass = new JMenuItem("List class");
        JMenu about = new JMenu("About");
        JMenuItem infor = new JMenuItem("Information");

        frame.setSize(400, 500);

        menuBar.add(studentManager);
        menuBar.add(classRoom);
        menuBar.add(about);

        studentManager.add(addStuden);
        studentManager.add(listStudent);

        classRoom.add(addClass);
        classRoom.add(listClass);
        about.add(infor);
        frame.add(menuBar);

        frame.setJMenuBar(menuBar);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        infor.addActionListener(new show());
        addStuden.addActionListener(new addSt());
        listStudent.addActionListener(new listSt());
        addClass.addActionListener(new addC());
        listClass.addActionListener(new listC());

    }

    public JPanel add() {
        JPanel addPanel = new JPanel();
        addPanel.setSize(300, 400);

        JLabel lbName = new JLabel("Name");
        JLabel lbEmail = new JLabel("Email");
        JLabel lbPhone = new JLabel("Phone");
        JLabel lbBrithday = new JLabel("Brithday");

        JTextField tfName = new JTextField();
        JTextField tfEmail = new JTextField();
        JTextField tfPhone = new JTextField();
        JTextField tfBrithhday = new JTextField();

        lbName.setBounds(10, 10, 80, 30);
        lbEmail.setBounds(10, 60, 80, 30);
        lbPhone.setBounds(10, 110, 80, 30);
        lbBrithday.setBounds(10, 160, 80, 30);

        tfName.setBounds(60, 10, 80, 30);
        tfEmail.setBounds(60, 60, 80, 30);
        tfPhone.setBounds(60, 110, 80, 30);
        tfBrithhday.setBounds(60, 160, 80, 30);

        addPanel.add(lbName);
        addPanel.add(lbEmail);
        addPanel.add(lbPhone);
        addPanel.add(lbBrithday);
        addPanel.add(tfName);
        addPanel.add(tfEmail);
        addPanel.add(tfPhone);
        addPanel.add(tfBrithhday);

        addPanel.setLayout(null);
        addPanel.setVisible(true);

        return addPanel;
    }

    public static void main(String[] args) {
        StudentForm form = new StudentForm();
        form.Frame();

    }
}

class show implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Id: 00435"
                + "\nName: Ngọc"
                + "\nEmail: ngocvd@fpt.edu.vn"
                + "\nPhone: 01669631596"
                + "\nClass: C1702G");

    }

}

class addSt implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "add student!!!"
                + "\nId"
                + "\nName"
                + "\nEmail"
                + "\nPhone"
                + "\nBrithday");
    }

}

class listSt implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Id              Name             Email                             Phone                        Brithday"
                + "\n00435       ngoc           ngoc@gmail.com            01669631596         14/12/1995"
                + "\n00436       toan            toan@gmail.com             01658745466         25/1/1990");
    }

}

class addC implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "A1      A2      A3      A4      A5      A6"
                + "\nB1      B2      B3      B4      B5      B6"
                + "\nC1      C2      C3      C4      C5      C6");
    }

}

class listC implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "C1702G        C1703g      C1704g");
    }

}
