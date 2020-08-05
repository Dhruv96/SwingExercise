package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;


public class Main implements ActionListener {
    JRadioButton model1, model2, model3;
    JLabel imageLabel,compute;
    JCheckBox c1, c2;
    JTextField textField2;
    public static void main(String[] args) {
	// write your code here
        Main obj1 = new Main();
        obj1.form1();
    }

    public void form1() {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(4,0));
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("Enter Customer name");
        JTextField textField1 = new JTextField(20);
        JLabel label2 = new JLabel("Enter number of days");
        textField2 = new JTextField(20);
        panel1.add(label1);
        panel1.add(textField1);
        panel1.add(label2);
        panel1.add(textField2);
        frame.add(panel1);


        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        imageLabel = new JLabel();
        imageLabel.setIcon(new ImageIcon(new ImageIcon("c1.jpg").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT)));
        imageLabel.setVisible(true);
        panel2.add(imageLabel);
         model1 = new JRadioButton("Model 1");
         model2 = new JRadioButton("Model 2");
         model3 = new JRadioButton("Model 3");
        ButtonGroup group = new ButtonGroup();
        group.add(model1);
        group.add(model2);
        group.add(model3);
        panel2.add(model1);
        panel2.add(model2);
        panel2.add(model3);
        frame.add(panel2);
        model1.addActionListener(this);
        model2.addActionListener(this);
        model3.addActionListener(this);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        c1 = new JCheckBox("Senior Citizen");
        c2 = new JCheckBox("Member");
        panel3.add(c1);
        panel3.add(c2);
        panel3.setBorder(BorderFactory.createEmptyBorder(30, 10, 10, 10));
        frame.add(panel3);

        JPanel panel4 = new JPanel();
        panel4.setLayout(new FlowLayout());
        compute = new JLabel("Compute");

        JButton computeBtn = new JButton("Compute");
        computeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int days = Integer.parseInt(textField2.getText());
                if(model1.isSelected())
                {
                    compute.setText(String.valueOf(14*days));
                }
                else if(model2.isSelected())
                {
                    compute.setText(String.valueOf(12*days));
                }
                else if(model3.isSelected())
                {
                    compute.setText(String.valueOf(10*days));
                }
            }
        });

        panel4.add(compute);
        panel4.add(computeBtn);
        frame.add(panel4);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == model1)
        {
            imageLabel.setIcon(new ImageIcon(new ImageIcon("c1.jpg").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT)));
        }
        else if(e.getSource() == model2)
        {
            imageLabel.setIcon(new ImageIcon(new ImageIcon("c2.jpg").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT)));
        }
        else if(e.getSource() == model3)
        {
            imageLabel.setIcon(new ImageIcon(new ImageIcon("c3.jpg").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT)));
        }
    }
}
