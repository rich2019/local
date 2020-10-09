package testOthers;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomeWork extends JFrame {
    private JLabel aLabel, bLabel, cLabel, displayLabel;
    private JTextField aField, bField, cField, displayField;
    private JButton xButton, exitButton;

    public HomeWork() {
        super("计算方程的实数根");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        aLabel = new JLabel("a");
        aField = new JTextField(10);
        container.add(aLabel);
        container.add(aField);
        bLabel = new JLabel("b");
        bField = new JTextField(10);
        container.add(bLabel);
        container.add(bField);
        cLabel = new JLabel("c");
        cField = new JTextField(10);
        container.add(cLabel);
        container.add(cField);
        displayLabel = new JLabel("两实根的结果:");
        displayField = new JTextField(40);
        displayField.setEditable(false);
        container.add(displayLabel);
        container.add(displayField);
        xButton = new JButton("计算结果");
        container.add(xButton);
        exitButton = new JButton("退出");
        container.add(exitButton);
        xButton.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent event) {
                                          double a = Double.parseDouble(aLabel.getText());
                                          double b = Double.parseDouble(bLabel.getText());
                                          double c = Double.parseDouble(cLabel.getText());
                                          double d, e;
                                          double dd = b * b - 4 * a * c;
                                          if (dd >= 0) {
                                              dd = Math.sqrt(dd);
                                              d = (-b + dd) / (2 * a);
                                              e = (-b - dd) / (2 * a);
                                              displayField.setText("x1=" + d + ",x2=" + e);
                                          } else
                                              displayField.setText("无实根");
                                      }
                                  }
        );
        exitButton.addActionListener(new ActionListener() {
                                         public void actionPerformed(ActionEvent event) {
                                             System.exit(0);
                                         }
                                     }
        );
        setSize(400, 140);
        setVisible(true);
    }

    public static void main(String args[]) {
        HomeWork window = new HomeWork();
    }
}


