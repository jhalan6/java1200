package csh.java1200.u3array.demo044;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class RandomAudience extends JDialog {
    private JPanel contentPane;
    private JTextField inputText;
    private JTextArea resultArea;
    private JButton cancelButton;
    private JButton getButton;
    private JTextPane audiencesList;
    private Random random;
    ArrayList<String> audiences;

    public RandomAudience() {
        Toolkit toolkit=getToolkit();
        Dimension screenSize=toolkit.getScreenSize();
        setBounds((int)(screenSize.width*0.1),(int)(screenSize.height*0.1),(int)(screenSize.width*0.8),(int)(screenSize.height*0.8));
        contentPane.setSize((int)(screenSize.width*0.8),(int)(screenSize.height*0.8));

        this.setTitle("幸运观众大抽奖");
        random=new Random();
        setContentPane(contentPane);
        setModal(true);
        audiences=new ArrayList<String>();
        inputText.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar()==10){
                    audiencesList.setText(audiencesList.getText()+ inputText.getText().trim()+"\n");
                    audiences.add(inputText.getText().trim());
                    inputText.setText("");
                }
            }

            @Override
            public void keyPressed(KeyEvent e) { }

            @Override
            public void keyReleased(KeyEvent e) { }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        getButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randomAudience();
            }
        });
    }
    private void randomAudience(){
        resultArea.setText("恭喜"+audiences.get(random.nextInt(audiences.size()))+"先生/女士,获得"+getPresent()+"!\n感谢对我们的支持,欢迎再来!");
    }

    private String getPresent() {
        return "矿泉水一瓶";
    }

    public static void main(String[] args) {
        RandomAudience dialog = new RandomAudience();
        dialog.setVisible(true);
        System.exit(0);
    }
}
