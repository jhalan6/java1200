package csh.java1200.u3array.demo047;

import javax.swing.*;
import java.awt.*;

public class CalculatorBody extends JDialog {
    private JPanel contentPane;
    private JTextField textField;

    public CalculatorBody() {
        BorderLayout borderLayout=(BorderLayout)getContentPane().getLayout();
        borderLayout.setHgap(20);
        borderLayout.setVgap(10);
        setContentPane(contentPane);
        setLayout(borderLayout);
        setModal(true);
        setTitle("计算器");
        setBounds(100,100,290,282);
        textField=new JTextField();
        textField.setHorizontalAlignment(SwingConstants.TRAILING);
        textField.setPreferredSize(new Dimension(12,50));
        this.add(textField,BorderLayout.NORTH);

    }

    public static void main(String[] args) {
        CalculatorBody dialog = new CalculatorBody();
        dialog.setVisible(true);
        System.exit(0);
    }
}
