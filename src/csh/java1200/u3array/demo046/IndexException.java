package csh.java1200.u3array.demo046;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndexException extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField textField1;
    private JButton checkButton;
    private JLabel Label;
    private JTextField textField2;

    public IndexException() {
        String[] questions=new String[]{"嘿","嘿嘿","嘿嘿嘿","嘿嘿嘿嘿","嘿嘿嘿嘿嘿","嘿嘿嘿嘿嘿嘿"};
        setTitle("输入6以内的数字进行抽奖!");
        Toolkit toolkit=getToolkit();
        Dimension screenSize=toolkit.getScreenSize();
        this.setLocation((int)(screenSize.width*0.4),(int)(screenSize.height*0.4));
        setSize(280,118);
        setContentPane(contentPane);
        setModal(true);
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textField2.setText(questions[Integer.parseInt(textField1.getText().trim())]);
                }catch (Exception e1){
                    setSize(390,118);
                    textField2.setText(String.valueOf(e1));
                }
            }
        });
    }

    public static void main(String[] args) {
        IndexException dialog = new IndexException();
        dialog.setVisible(true);
        System.exit(0);
    }
}
