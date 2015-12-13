package csh.java1200.u3array.demo045;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;

public class Excel extends JDialog {
    private JPanel contentPane;
    private JTable table;

    public Excel() {
        Toolkit toolkit=getToolkit();
        Dimension screenSize=toolkit.getScreenSize();
        this.setLocation((int)(screenSize.width*0.1),(int)(screenSize.height*0.1));
        this.setSize((int)(screenSize.width*0.8),(int)(screenSize.height*0.8));
        this.setTitle("真.Excel从零开始");
        setContentPane(contentPane);
        setModal(true);
        String[] names=new String[]{"星期一","星期二","星期三","星期四","星期五","星期六","星期七"};
        int[] widths=new int[]{10,20,30,10,20,30,10};
        for(int i:widths){
            System.out.print(i+" ");
        }
        DefaultTableModel model=new DefaultTableModel(names,15);
        table.setModel(model);
        TableColumnModel columnModel=table.getColumnModel();
        int count=columnModel.getColumnCount();
        for(int i=0;i<count;++i){
            TableColumn column=columnModel.getColumn(i);
//            column.setWidth(widths[i]);       //好像没什么用
            column.setPreferredWidth(widths[i]);
        }
    }

    public static void main(String[] args) {
        Excel dialog = new Excel();
        dialog.setVisible(true);
        System.exit(0);
    }
}
