import java.util.Scanner;

/**
 * キーボード入力した値をint型として扱う
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/09/29
 */
public class Ex0105ScanInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    // 入力先にキーボードを指定
        String  str;
        int     x;
        int     y;

        System.out.print("x 入力 : ");  // 改行無し表示
        str = scan.next();                // キー入力したデータをString型で読み込む
        x   = Integer.parseInt(str);       // int型に変換する

        System.out.print("y 入力 : ");
        y = scan.nextInt();              // キー入力した値をint型に変換してyに代入

        System.out.println("x = " + x);  // 改行あり表示
        System.out.println("y = " + y);
        scan.close();
    }
}
/*
S G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac Ex0105ScanInt.java 
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0105ScanInt            
x 入力 : 10
y 入力 : 3
x = 10
y = 3

PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac Ex0105ScanInt.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0105ScanInt      
x 入力 : 10
y 入力 : 3.5
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.t.hrowFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at Ex0105ScanInt.main(Ex0105ScanInt.java:21)
エラー発生の理由

このエラーでは、InputMismatchExceptionと出ていて、この場合はint型に変更できない文字列を変換しよう
とするときに起きるエラーで、3.5という値の小数点という文字列が変更できないためエラーが発生した。

PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac Ex0105ScanInt.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0105ScanInt      
x 入力 : 1a
Exception in thread "main" java.langNumberFormatException: For input string: "1a"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:786)
        at Ex0105ScanInt.main(Ex0105ScanInt.java:18)
エラー発生の理由

このエラーは、NumberFormatExceptionで、文字列を数値型に変換するとき、
文字列の形式が正しくない場合に発生するエラーであり、今回の場合は、
String型の文字列からint型に変換するInteger.parseInt(str);に整数ではない文字列
であるaが含まれる文字列が渡されたため、int型に変換できずにエラーが発生した。

PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> 
 */
