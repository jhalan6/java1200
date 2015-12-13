package csh.java1200.u3array.demo042;

import sun.tools.tree.CastExpression;

import javax.swing.*;
import java.awt.event.*;

public class Min extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JLabel answer;

    public Min() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        String arrayString=textField1.getText().trim();
        String[] nums=arrayString.split(" +");
        int[] ints=new int[nums.length];
        for(int i=0;i<nums.length;++i){
            try {
                ints[i]=Integer.parseInt(nums[i]);
            }catch (Exception expression){
                JOptionPane.showMessageDialog(this,"请输入数字","错误提示",JOptionPane.QUESTION_MESSAGE);
                break;
            }
        }
        int temp=Integer.MAX_VALUE;
        for (int i:ints){
            temp=temp<i?temp:i;
        }
        answer.setText("数组中最小的数是:"+temp);
    }

    private void onCancel() {
// add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        Min dialog = new Min();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
