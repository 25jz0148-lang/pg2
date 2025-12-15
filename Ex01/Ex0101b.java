/**
 * 基本データ型と値 boolean, byte, String
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/09/22
 */
public class Ex0101b {
        public static void main(String[] args) {
                // ----- boolean
                boolean a;

                System.out.println("boolean型のデータ");
                a = true;
                System.out.println("\tture = " + a);
                a = false;
                System.out.println("\tfalse = " + a);

                // -----byte
                byte b;

                System.out.println("byte型のデータ");
                b = 127;
                System.out.println("\t127 = " + b);
                b = -128;
                System.out.println("\t-128 = " + b);
                //b = 128;
                //System.out.println("\t128 = " + b);

                // ----- String
                String s;

                System.out.println("String型のデータ");
                s = "abc";
                System.out.println("\t\"abc\" = " + s);

                int len = s.length();// lengthメソッド　文字数を返す
                System.out.println("\ts.length() = " + len);

        }
}
/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac -encoding utf-8 Ex0101b.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0101b
boolean型のデータ
        ture = true
        false = false
byte型のデータ
        127 = 127
        -128 = -128
String型のデータ
        "abc" = abc
        s.length() = 3
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> 
 */

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac -encoding utf-8 Ex0101b.java
Ex0101b.java:20: エラー: 不適合な型: 精度が失われる可能性があるintからbyteへの変換
       b = 128;
           ^
エラー1個
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01>
 */

/*
byte型の表現できる値の限界が-128～127なのに対してこのプログラムだとbyte型では表現できない
１２８を表示しようとしているからエラーが発生した。
 */
