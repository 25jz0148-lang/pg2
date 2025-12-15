import java.util.Scanner;

/**
 * キーボードからxとyの値を入力し、xのｙ乗の値を求めなさい 指数yが負の値でも正しく結果を表示しなさい
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/06
 */
public class Ex0308Power2 {
    public static void main(String[] args) {
        int     i;
        int     x;
        int     y;
        double  ans;
        int     tempy;
        Scanner scan = new Scanner(System.in);

        System.out.print("input x  : ");
        x = scan.nextInt();
        System.out.print("input y : ");
        y   = scan.nextInt();
        ans = 1;
        if (y < 0) {
            tempy = -1 * y;
        }
        else {
            tempy = y;
        }
        for (i = 0; i < tempy; i++) {
            ans *= x;
        }

        if (y < 0) {
            ans = 1 / ans;
        }
        System.out.println(x + "の" + y + "乗は" + ans);
        scan.close();
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> javac Ex0308Power2.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0308Power2      
input x  : 3
input y : -4
3の-4乗は0.012345679012345678

PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0308Power2
input x  : 2
input y : -5
2の-5乗は0.03125

PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0308Power2
input x  : 3
input y : 4
3の4乗は81.0
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> 
 */
