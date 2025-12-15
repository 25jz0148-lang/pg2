import java.util.Scanner;

/**
 * キーボードから入力した値に対して四則演算、および剰余算を行い結果を表示するプログラム
 * 
 * @author 25JZ0148 Yamada taiyou
 * 
 * @version 2025/09/29
 */
public class Ex0107CalcInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    // 入力先にキーボードを指定
        int     x;
        int     y;
        int     result;

        System.out.print("x 入力 : ");
        x = scan.nextInt();

        System.out.print("y 入力 : ");
        y = scan.nextInt();

        result = x + y;
        System.out.println(x + " + " + y + " = " + result);
        result = x - y;
        System.out.println(x + " - " + y + " = " + result);
        result = x * y;
        System.out.println(x + " * " + y + " = " + result);
        result = x / y;
        System.out.println(x + " / " + y + " = " + result);
        result = x % y;
        System.out.println(x + " % " + y + " = " + result);
        scan.close();
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac Ex0107CalcInt.java   
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0107CalcInt      
x 入力 : 10
y 入力 : 3
10 + 3 = 13
10 - 3 = 7
10 * 3 = 30
10 / 3 = 3
10 % 3 = 1

PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac Ex0107CalcInt.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0107CalcInt      
x 入力 : 8
y 入力 : 12
8 + 12 = 20
8 - 12 = -4
8 * 12 = 96
8 / 12 = 0
8 % 12 = 8

PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac Ex0107CalcInt.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0107CalcInt      
x 入力 : 0
y 入力 : 5
0 + 5 = 5
0 - 5 = -5
0 * 5 = 0
0 / 5 = 0
0 % 5 = 0
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> 
 */
