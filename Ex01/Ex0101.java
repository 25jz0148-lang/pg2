/**
 * 基本データ型と値 int, double, char
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/09/22
 */
public class Ex0101 {
    public static void main(String[] args) {
        // ----- int 型変数の宣言と値の代入、表示
        int i;

        System.out.println("int型のデータ");
        i = 365; // 10進数
        System.out.println("\t 365 = " + i);   // \t はタブコードを示す
        i = 0365; // 8進数
        System.out.println(" \t 0365 = " + i);
        i = 0xaf; // 16進数
        System.out.println("\t 0xaf = " + i);
        i = 1_234; // _の利用
        System.out.println("\t1_234 = " + i);

        // ----- double
        double d;

        System.out.println("double型のデータ");
        d = 123.456;
        System.out.println("\t 123.456 = " + d);
        d = 789e-4; //指数指定
        System.out.println("\t 789e-4 = " + d);
        d = 10 / 3.0;
        System.out.println("\t 10 / 3.0 = " + d);
        d = 10 / 3;
        System.out.println("\t 10 / 3 = " + d);

        // ----- char
        char c;

        System.out.println("char型のデータ");
        c = 'A';    //文字リテラル
        System.out.println("\t 'A' = " + c);
        c = 65;     // 10進数
        System.out.println("\t 65 = " + c);
        c = '\u0041';    // Unicode
        System.out.println("\t '\\u0041' = " + c);
    }
}
/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac -encoding utf-8 Ex0101.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0101
int型のデータ
         365 = 365
         0365 = 245
         0xaf = 175
        1_234 = 1234
double型のデータ
         123.456 = 123.456
         789e-4 = 0.0789
         10 / 3.0 = 3.3333333333333335
         10 / 3 = 3.0
char型のデータ
         'A' = A
         65 = A
         '\u0041' = A
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> 
 */
