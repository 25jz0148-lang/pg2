import java.util.Scanner;

/**
 * @author 25JZ0148 Yamada taiyou
 * 
 * @version 2025/09/29
 */
public class Ex0106ScanDouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    // 入力先にキーボードを指定
        String  str;
        double  x;
        double  y;

        System.out.print("x 入力 : ");  // 改行無し表示
        str = scan.next();                // キー入力したデータをString型で読み込む
        x   = Double.parseDouble(str);       // double型に変換する

        System.out.print("y 入力 : ");
        y = scan.nextDouble();              // キー入力した値をdouble型に変換してyに代入

        System.out.println("x = " + x);  // 改行あり表示
        System.out.println("y = " + y);
        scan.close();

    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac Ex0106ScanDouble.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0106ScanDouble
x 入力 : 10
y 入力 : 3
x = 10.0
y = 3.0

PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac Ex0106ScanDouble.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0106ScanDouble      
x 入力 : 10
y 入力 : 3.5
x = 10.0
y = 3.5

PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac Ex0106ScanDouble.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0106ScanDouble      
x 入力 : 1.2
y 入力 : 3.5
x = 1.2
y = 3.5

PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac Ex0106ScanDouble.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0106ScanDouble      
x 入力 : 1a
Exception in thread "main" java.lang.NumberFormatException: For input string: "1a"
        at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
        at java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
        at java.base/java.lang.Double.parseDouble(Double.java:651)
        at Ex0106ScanDouble.main(Ex0106ScanDouble.java:18)
エラー発生の理由

このエラーは前回のEx0105の場合と同様で、NumberFormatExceptionと出ているので、
String型の文字列からDouble型に変換するDouble.parseDouble(str);に数値ではない文字列
aが渡されたためエラーが発生した。

PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> 
 */
