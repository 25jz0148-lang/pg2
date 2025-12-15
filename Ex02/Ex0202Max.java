import java.util.Scanner;

/**
 * キーボードから３つの整数を入力し、一番大きい値を表示する。
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/09/29
 */
public class Ex0202Max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int     num1;
        int     num2;
        int     num3;
        int     max;

        System.out.print("値１を入力 : ");
        num1 = scan.nextInt();
        System.out.print("値２を入力 : ");
        num2 = scan.nextInt();
        System.out.print("値３を入力 : ");
        num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            max = num1;
        }
        else if (num2 > num3) {
            max = num2;
        }
        else {
            max = num3;
        }
        System.out.println(num1 + " , " + num2 + " , " + num3 + "の最大値は" + max + "です");
        scan.close();
    }
}
/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> javac Ex0202Max.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0202Max      
値１を入力 : 10
値２を入力 : 20
値３を入力 : 30
10 , 20 , 30の最大値は30です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0202Max
値１を入力 : 10
値２を入力 : 50
値３を入力 : 30
10 , 50 , 30の最大値は50です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0202Max
値１を入力 : -10
値２を入力 : -20
値３を入力 : -30
-10 , -20 , -30の最大値は-10です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0202Max
値１を入力 : 30
値２を入力 : 30
値３を入力 : 30
30 , 30 , 30の最大値は30です
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> 
 */
