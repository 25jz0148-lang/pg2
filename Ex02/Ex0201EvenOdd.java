import java.util.Scanner;

/**
 * キーボードから整数を入力し、偶数か奇数かを判定し表示する。０は偶数とします。
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/09/29
 */

public class Ex0201EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int     x;
        int     y;
        String  result;

        System.out.print("整数を入力 : ");
        x = scan.nextInt();

        y = x % 2;    //　num1を2で割った余りをmodに求める
        if (y != 0) {
            result = "奇数";
        }
        else {
            result = "偶数";
        }
        System.out.println(x + "は" + result + "です");
        scan.close();
    }
}
/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> javac Ex0201EvenOdd.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0201EvenOdd      
整数を入力 : 7
7は奇数です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0201EvenOdd
整数を入力 : 10
10は偶数です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0201EvenOdd
整数を入力 : 0
0は偶数です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0201EvenOdd
整数を入力 : -3
-3は奇数です
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> 
 */
