/**
 * ラベルの使い方
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/02
 */
public class Ex0306Label {
    public static void main(String[] args) {
        loop1:
        for (int i = 0; i < 5; i++) {  //ラベル名 loop1のforブロック
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + " j = " + j);
                if (i == 1 && j == 1) { // i も j　も１ならば
                    break loop1;        // loop1とラベル定義された外側のforから抜け、
                }                       //　　18行目へ制御が移る
            }
        }
        System.out.println("----------");

        loop2:
        for (int i = 0; i < 3; i++) {   //　ラベル名 loop2のforブロック
            for (int j = 0; j < 3; j++) {
                System.out.println("i = " + i + " j = " + j);
                if (i == 1 && j == 1) { //iもjも1ならば
                    continue loop2;   //loop2トラベル定義された外側のfor文の第３式から実行される
                }
            }
        }
        System.out.println("----------");
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> javac Ex0306Label.java   
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0306Label      
i = 0 j = 0
i = 0 j = 1
i = 0 j = 2
i = 0 j = 3
i = 0 j = 4
i = 1 j = 0
i = 1 j = 1
----------
i = 0 j = 0
i = 0 j = 1
i = 0 j = 2
i = 1 j = 0
i = 1 j = 1
i = 2 j = 0
i = 2 j = 1
i = 2 j = 2
----------
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> 
 */
