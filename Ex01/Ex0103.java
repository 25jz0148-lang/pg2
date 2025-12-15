/**
 * 基本演算と表示
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/09/22
 */
public class Ex0103 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a = 10;
        b = 20;

        c = a + b;
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        System.out.println("(a + b) = " + (a + b)); // この行の実行結果と
        System.out.println("a + b = " + a + b);     //　この行の実行結果の違いを確認しなさい
        System.out.println(a + b);               //　この行の実行結果はどうなるでしょう

    }
}
/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac -encoding utf-8 Ex0103.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0103 
a = 10 b = 20 c = 30
(a + b) = 30
a + b = 1020
30
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> 
 */

/*　考察
println("(a + b) = " + (a + b));の場合は、整数型として演算される。
println("a + b = " + a + b);の場合は、文字列型として演算される。
println(a + b);の場合は、整数型として演算される。
 */
