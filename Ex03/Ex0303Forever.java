/**
 * 永久ループのプログラム ctrl+cで実行を止めること
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/02
 */
public class Ex0303Forever {
    public static void main(String[] args) {
        //-----カウンタ変数をforの第２式で宣言
        for (int i = 0;; i++) { // 条件式を書かないと永久ループ
            System.out.println(i);
            for (int j = 0; j < 1000000000; j++) { //時間待ちループ
                for (int k = 0; k < 1000000000; k++) {
                    ;
                }
            }
        }
        //System.out.println("----------"); //この行を有効にするとコンパイルエラー？
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> javac Ex0303Forever.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0303Forever      
0
1
2
3
4
5
6
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> 
 */

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> javac Ex0303Forever.java
Ex0303Forever.java:18: エラー: この文に制御が移ることはありません
       System.out.println("----------"); //この行を有効にするとコンパイルエラー？
       ^
エラー1個
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> 
 */
