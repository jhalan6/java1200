package csh.java1200.u3array.demo043;

/**
 * Created by Alan on 15/12/13.
 */
public class ArrayLineExchange {
    public static void main(String[] args) {
        int[][] ints=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        showArray(ints);
        int[] temp=ints[0];
        ints[0]=ints[1];
        ints[1]=temp;
        System.out.println();
        System.out.println("交换后:");
        showArray(ints);
    }
    public static void showArray(int[][] ints){
        for(int[] i:ints){
            for (int j:i){
                System.out.print(""+j+' ');
            }
            System.out.println();
        }
    }
}