package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;

        do{
            System.out.print("Nhập vào kích thước mảng(tối đa 20): ");
            size = scanner.nextInt();
        }while (size>20);

        array = new int[size];
        System.out.println("Nhập vào các phần tử: ");
        int i = 0;
        while (i<size)
        {
            System.out.print("Phần tử thứ: "+(i+1)+" :");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Danh sách các phần tử khi chưa đảo:");
        for (int j = 0; j < array.length; j++)
        {
            System.out.print(array[j]+"\t");
        }

        for (int j = 0; j < array.length/2; j++)
        {
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;
        }


        System.out.println("\nDanh sách các phần tử sau khi đảo vị trí:");
        for (int j = 0; j < array.length; j++)
        {
            System.out.print(array[j]+"\t");
        }
    }
}
