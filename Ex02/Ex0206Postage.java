import java.util.Scanner;

/**
 * 定形外(規格内)郵便物の重さ(g)を入力し、定形外郵便の料金を表示せよ。
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/06
 */
public class Ex0206Postage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("重さ（g）を入力 : ");
        int weight = scanner.nextInt(); // 例外処理なし

        int postage = 0;

        if (weight <= 50) {
            postage = 120;
        }
        else if (weight <= 100) {
            postage = 140;
        }
        else if (weight <= 150) {
            postage = 210;
        }
        else if (weight <= 250) {
            postage = 250;
        }
        else if (weight <= 500) {
            postage = 390;
        }
        else if (weight <= 1000) {
            postage = 580;
        }


        if (weight <= 1000) {
            System.out.println("定形外郵便料金 : " + postage + "円");
        }
        else {
            System.out.println("定形外の規格外です");
        }

        scanner.close();
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> javac Ex0206Postage.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0206Postage      
重さ（g）を入力 : 40
定形外郵便料金 : 120円

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0206Postage
重さ（g）を入力 : 75
定形外郵便料金 : 140円

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0206Postage
重さ（g）を入力 : 130
定形外郵便料金 : 210円

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0206Postage
重さ（g）を入力 : 220
定形外郵便料金 : 250円

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0206Postage
重さ（g）を入力 : 473
定形外郵便料金 : 390円

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0206Postage
重さ（g）を入力 : 1000
定形外郵便料金 : 580円

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0206Postage
重さ（g）を入力 : 1001
定形外の規格外です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0206Postage
重さ（g）を入力 : 4200
定形外の規格外です
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> 
 */
