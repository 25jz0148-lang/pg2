/**
 * 定数のデフォルトの型
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/09/22
 */
public class Ex0102 {
    public static void main(String[] args) {
        int   a;
        long  b;
        long  c;
        float d;

        a = 10;
        b = 30;
        c = 10000000000L; // long型変数 c に100億(0が10個)を代入
        d = 1.23F;        // float型変数　d に1.23を代入

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}
/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac -encoding utf-8 Ex0102.java 
Ex0102.java:16: エラー: 整数が大きすぎます。
        c = 10000000000; // long型変数 c に100億(0が10個)を代入
            ^
エラー1個
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01>

int型の範囲を超える値の場合は、最後にL or lをつけないとエラーが発生するため。
 */

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac -encoding utf-8 Ex0102.java
Ex0102.java:17: エラー: 不適合な型: 精度が失われる可能性があるdoubleからfloatへの変換
       d = 1.23;        // float型変数　d に1.23を代入
           ^
エラー1個
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01>

float型の定数には、最後にF　or fをつけないとエラーが発生するため。
 */

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac -encoding utf-8 Ex0102.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0102 
a = 10
b = 30
c = 10000000000
d = 1.23
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> 
 */
