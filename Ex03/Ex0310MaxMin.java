import java.util.Scanner;

/**
 * 最大値と最小値
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/06
 */
public class Ex0310MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   //　入力先にキーボードを指定
        int     data;
        int     max;
        int     min;

        max = Integer.MIN_VALUE; // 最大値の初期値を設定
        min = Integer.MAX_VALUE; // 最小値の初期値を設定
        System.out.println("Integer.MIN_VALUE = " + max); // 最大値の確認
        System.out.println("Integer.MAX_VALUE = " + min); // 最小値の確認

        System.out.print("Input data : ");
        while (scan.hasNextInt()) {         //int値の読み込みが可能ならば真を返す
            data = scan.nextInt();
            if (max < data) {
                max = data;
            }
            if (min > data) {
                min = data;
            }
            System.out.print("Input data : ");
        }
        System.out.println("最大値 = " + max);
        System.out.println("最小値 = " + min);
        System.out.println("----------");
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> javac Ex0310MaxMin.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0310MaxMin      
Integer.MIN_VALUE = -2147483648
Integer.MAX_VALUE = 2147483647
Input data : 37
Input data : 43
Input data : 89
Input data : 21
Input data : 94
Input data : 65
Input data : 12
Input data : 44
Input data : ^Z
最大値 = 94
最小値 = 12
----------
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> javac Ex0310MaxMin.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0310MaxMin      
Integer.MIN_VALUE = -2147483648
Integer.MAX_VALUE = 2147483647
Input data : -97
Input data : -23
Input data : -53
Input data : 72
Input data : 45
Input data : 32
Input data : -34
Input data : -10
Input data : ^Z
最大値 = 72
最小値 = -97
----------
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> 
 */
