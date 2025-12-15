/**
 * static変数とstaticメソッド
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/11/25
 */
class A {
    public int        iVal = 100; // インスタンス変数
    public static int sVal = 200; // static変数(クラス変数)

    public void iPrint() { // インスタンスメソッド
        System.out.println("iPrint() iVal: " + iVal);
        System.out.println("iPrint() sVal: " + sVal);
    }

    public static void sPrint() { // staticメソッド(クラスメソッド)
        // System.out.println("sPrint() iVal: " + iVal);
        System.out.println("sPrint() sVal: " + sVal);
    }
}


public class Ex0701StaticMem01 {
    public static void main(String[] args) {
        System.out.println("インスタンス変数、static変数の値表示");
        System.out.println("\t\t-----クラス名で参照");
        // System.out.println("A.iVal = " + A.iVal);
        System.out.println("A.sVal = " + A.sVal);

        System.out.println("\t\t-----インスタンス化してインスタンス名で参照");
        A a1 = new A();
        System.out.println("a1.iVal = " + a1.iVal);
        System.out.println("a1.sVal = " + a1.sVal);

        System.out.println("\t\t-----インスタンス名で値変更後");
        a1.iVal = 110;
        a1.sVal = 220;

        System.out.println("a1.iVal = " + a1.iVal);
        System.out.println("a1.sVal = " + a1.sVal);

        System.out.println("\t\t-----インスタンス化してインスタンス名で参照");
        A a2 = new A();
        System.out.println("a2.iVal = " + a2.iVal);
        System.out.println("a2.sVal = " + a2.sVal);

        System.out.println("\t\t-----インスタンスメソッドの実行");
        a2.iPrint();
        //  A.iPrint();

        System.out.println("\t\t-----staticメソッドの実行");
        A.sPrint();
        a2.sPrint();
        System.out.println("--------------------");
    }
}
/*
エラー確認

PS G:\マイドライブ\PG2\PGⅡsrc\Ex07> javac Ex0701StaticMem01.java
Ex0701StaticMem01.java:17: エラー: staticでない変数 iValをstaticコンテキストから参照することはできません
        System.out.println("sPrint() iVal: " + iVal);
                                               ^
Ex0701StaticMem01.java:18: エラー: staticでない変数 sValをstaticコンテキストから参照することはできません
        System.out.println("sPrint() sVal: " + sVal);
                                               ^
Ex0701StaticMem01.java:27: エラー: staticでない変数 iValをstaticコンテキストから参照することはできません
        System.out.println("A.iVal = " + A.iVal);
                                          ^
Ex0701StaticMem01.java:28: エラー: staticでない変数 sValをstaticコンテキストから参照することはできません
        System.out.println("A.sVal = " + A.sVal);
                                          ^
Ex0701StaticMem01.java:49: エラー: staticでないメソッド iPrint()をstaticコンテキストから参照することはできません
        A.iPrint();
         ^
エラー5個
PS G:\マイドライブ\PG2\PGⅡsrc\Ex07>  


エラー理由
staticメソッドはインスタンスに紐づかないため、特定のインスタンスに属するインスタンス変数 (iVal) に直接アクセスすることはできないため

mainメソッドで、クラス名 Aを通じてインスタンス変数 iVal にアクセスしようとしているため

mainメソッドで、クラス名 A を通じてインスタンスメソッド iPrint() を呼び出そうとしているため

実行結果

PS G:\マイドライブ\PG2\PGⅡsrc\Ex07> javac Ex0701StaticMem01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex07> java Ex0701StaticMem01      
インスタンス変数、static変数の値表示
                -----クラス名で参照
A.sVal = 200
                -----インスタンス化してインスタンス名で参照
a1.iVal = 100
a1.sVal = 200
                -----インスタンス名で値変更後
a1.iVal = 110
a1.sVal = 220
                -----インスタンス化してインスタンス名で参照
a2.iVal = 100
a2.sVal = 220
                -----インスタンスメソッドの実行
iPrint() iVal: 100
iPrint() sVal: 220
                -----staticメソッドの実行
sPrint() sVal: 220
sPrint() sVal: 220
--------------------
PS G:\マイドライブ\PG2\PGⅡsrc\Ex07>
 */
