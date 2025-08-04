package Simple_Examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class artist extends JFrame implements ActionListener, MouseListener {
    private JTextField t1;
    private JPasswordField p1;
    private JLabel Label;
    artist() {
        setTitle("Registration");
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel la = new JLabel("WELCOME TO SITCOE");
        la.setBounds(130, 60, 210, 80);
        //la.setSize(40,40);
        add(la);

        JLabel l1 = new JLabel("USERNAME :");
        l1.setBounds(100, 150, 80, 30);
        add(l1);

        JLabel l2 = new JLabel("PASSWARD :");
        l2.setBounds(100, 200, 80, 30);
        add(l2);

        t1 = new JTextField();
        t1.setBounds(190,150,90,30);
        add(t1);

        p1 = new JPasswordField(10);
        p1.setBounds(190,200,90,30);
        //p1.setEchoChar('#');
        add(p1);

        JButton b1 = new JButton("LOGIN");
        b1.setBounds(150,250,80,25);
        add(b1);
        b1.addActionListener(this);
        b1.addMouseListener(this);

        Label = new JLabel("");
        Label.setBounds(155, 290, 150, 20);
        add(Label);
        addMouseListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = t1.getText();
        String pass = new String(p1.getPassword());

        if (user.equals("SITCOE") && pass.equals("123")) {
            Label.setText("Login Successful");
        } else {
            Label.setText("Login Failed");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        getContentPane().setBackground(Color.WHITE);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        getContentPane().setBackground(Color.magenta);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        getContentPane().setBackground(Color.ORANGE);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        getContentPane().setBackground(Color.PINK);
    }
    public static void main(String[] args) {
        new artist();
    }
}

