/**
 * コマンドライン引数により、データを渡す 文字列のint型への変換
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/09/22
 */
public class Ex0104MainArg {
    public static void main(String[] args) {   //　コマンドライン引数の値が格納される配列
        System.out.println("args.length = " + args.length);
        System.out.println("args[0] = " + args[0]);
        System.out.println("args[1] = " + args[1]);
        System.out.println("args[2] = " + args[2]);
        System.out.println("(args[1] + args[2]) = " + (args[1] + args[2])); // 文字列の連結

        int a = Integer.parseInt(args[1]);  // 整数型変換(IntegerクラスのperseIntメソッドを利用)
        int b = Integer.parseInt(args[2]);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + (a + b));  // 数値の足し算結果を表示
    }
}
/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac Ex0104MainArg.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0104MainArg abc 10 30
args.length = 3
args[0] = abc
args[1] = 10
args[2] = 30
(args[1] + args[2]) = 1030
a = 10
b = 30
a + b = 40
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01>
 */



/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> javac Ex0104MainArg.java    
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> java Ex0104MainArg def 20.5 40
args.length = 3
args[0] = def
args[1] = 20.5
args[2] = 40
(args[1] + args[2]) = 20.540
Exception in thread "main" java.lang.NumberFormatException: For input string: "20.5"
       at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
       at java.base/java.lang.Integer.parseInt(Integer.java:668)
       at java.base/java.lang.Integer.parseInt(Integer.java:786)
       at Ex0104MainArg.main(Ex0104MainArg.java:15)
PS G:\マイドライブ\PG2\PGⅡsrc\Ex01> 
 */

/*理由
エラーの原因はNumberFormatExceptionという文字列を数値型に変換するときに、
文字列の形式が正しくないときにおこるエラーで、今回の場合だとString型の文字列から
int型に変換するInteger.parseIntというメソッドが整数ではない文字列である小数点
(.)のある文字列が渡されたため、int型に変換できずにエラーが発生した。
 */
