/**
 * 定数のデフォルト型 final 修飾子
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/09/22
 */
public class Ex0102b {
    public static void main(String[] args) {
        int       a = 123;
        final int F = 123; // 定数の宣言

        System.out.println("a = " + a);
        System.out.println("F = " + F);
        a = 456;
        System.out.println("a = " + a);
        //F = 456;
        //System.out.println("F = " + F);
    }
}
/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac -encoding utf-8 Ex0102b.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0102b
a = 123
F = 123
a = 456
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01>
 */

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac -encoding utf-8 Ex0102b.java
Ex0102b.java:16: エラー: final変数Fに値を代入することはできません
       F = 456;
       ^
エラー1個
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01>

finalでは、変数ではなく定数を宣言するため、ほかの変数に代入は可能だが、処理中に値の変更はできず
変更をしようとするとエラーが発生してしまう
 */
