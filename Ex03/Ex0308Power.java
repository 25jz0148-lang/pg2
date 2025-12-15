import java.util.Scanner;

/**
 * キーボードからxとyの値を入力し、xのｙ乗の値を求めなさい
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/06
 */
public class Ex0308Power {
    public static void main(String[] args) {
        int     i;
        int     x;
        int     y;
        int     ans;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input x  : ");
        x = scan.nextInt();
        System.out.print("Input y : ");
        y = scan.nextInt();

        ans = 1;
        for (i = 0; i < y; i++) {
            ans *= x;
        }
        System.out.println(x + "の" + y + "乗は" + ans);
        scan.close();
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> javac Ex0308Power.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0308Power      
Input x  : 3
Input y : 4
3の4乗は81

PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0308Power
Input x  : 2
Input y : 10
2の10乗は1024

PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0308Power
Input x  : 3
Input y : 0
3の0乗は1
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> 
 */
