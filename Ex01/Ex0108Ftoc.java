import java.util.Scanner;

/**
 * キーボードから華氏温度を入力し、摂氏温度に変換し結果を表示するプログラム
 *
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/09/29
 */
public class Ex0108Ftoc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int     f;
        double  c;

        System.out.print("華氏温度入力 : ");
        f = scan.nextInt();

        c = (double) (5 * (f - 32)) / 9.0;

        System.out.println("華氏温度 : " + f + " ==> " + "摂氏温度 : " + c);
        scan.close();
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac Ex0108Ftoc.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0108Ftoc      
華氏温度入力 : 80
華氏温度 : 80 ==> 摂氏温度 : 26.666666666666668

PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac Ex0108Ftoc.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0108Ftoc      
華氏温度入力 : 0
華氏温度 : 0 ==> 摂氏温度 : -17.77777777777778
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> 
 */
