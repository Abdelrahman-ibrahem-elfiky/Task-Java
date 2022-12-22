package Task2;

import java.util.Scanner;

public class task2_b {
    static void in_arr(int arr[][],int row,int col)
    {
        Scanner in=new Scanner(System.in);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                arr[i][j]=in.nextInt();
        }
    }
    static void inverse (int arr_1[][],int arr_2[][],int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                arr_2[j][i]=arr_1[i][j];
        }

    }
    static void print(int arr_2[][],int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                System.out.print(arr_2[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter row: ");
        int row=in.nextInt();
        System.out.println("enter column: ");
        int column=in.nextInt();
        int arr_1[][]=new int[row][column];
        int arr_2[][]=new int[row][column];
        in_arr(arr_1,row,column);
        inverse(arr_1,arr_2,row,column);
        print(arr_2,row,column);

    }
}
