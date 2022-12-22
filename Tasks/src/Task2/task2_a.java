package Task2;
import java.util.*;
public class task2_a {
    static void swap(int[] arr,int j)
    {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
    static void sort(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr.length-1;j++)
                if(arr[j]>arr[j+1])
                    swap(arr,j);
        }
    }
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        int arr[]={7,845,67,8,2,6,1};
        sort(arr);
        printArray(arr);


    }
}
