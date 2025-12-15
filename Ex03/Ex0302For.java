/**
 * forループ
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/02
 */
public class Ex0302For {
    public static void main(String[] args) {
        //----- ①C言語と同様のfor分の書き方　カウンタ変数をあらかじめ宣言
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("i = " + i);
        System.out.println("----------");
        //-----②カウンタ変数をforの第１式で宣言
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }
        //System.out.println("j = " + j);    // 変数jの有効範囲はforブロックの中だけ
        System.out.println("----------");
        //-----③forの第１式を省略
        int k = 0;                                 // 変数宣言は処理の途中でも可能
        for (; k < 5; k++) {
            System.out.println(k);
        }
        System.out.println("k = " + k);
        System.out.println("----------");

        //-----④forの第１式、第３式省略
        int l = 0;
        for (; l < 5;) {
            System.out.println(l++);
        }
        System.out.println("l = " + l);
        System.out.println("----------");
    }
}

/**
 * PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> javac Ex0302For.java
 * PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0302For
 * 0
 * 1
 * 2
 * 3
 * 4
 * i = 5
 * ----------
 * 0
 * 1
 * 2
 * 3
 * 4
 * ----------
 * 0
 * 1
 * 2
 * 3
 * 4
 * k = 5
 * ----------
 * 0
 * 1
 * 2
 * 3
 * 4
 * l = 5
 * ----------
 * PS G:\マイドライブ\PG2\PGⅡsrc\Ex03>
 */

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> javac Ex0302For.java
Ex0302For.java:21: エラー: シンボルを見つけられません
       System.out.println("j = " + j);    // 変数jの有効範囲はforブロックの中だけ
                                   ^
 シンボル:   変数 j
 場所: クラス Ex0302For
エラー1個
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> 
 */
