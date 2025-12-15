/**
 * 要素数の指定方法と要素数の調べ方
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/09
 */
public class Ex0403Final {
    public static void main(String[] args) {
        // １．final変数(定数)を使う
        final int SIZE1 = 4;     // final変数(定数)の定義
        int[]     dim1  = new int[SIZE1]; // 要素数をfinal変数で指示
        int       len1;

        len1 = dim1.length;     // 配列の要素数の取得 .length
        System.out.println("dim1.length = " + len1);

        //       SIZE1 = 3;         // final変数は変更不可　コメントを外すとコンパイルエラー？　実行エラー？
        for (int i = 0; i < SIZE1; i++) {  // 繰り返し回数をfinal定数名で指定
            System.out.println("dim1[" + i + "] = " + dim1[i]); // 初期値無しの配列の値はゼロ
        }
        System.out.println("----------");

        //　２．変数を使う
        int size2;

        size2 = 5;  // 変数に値を代入

        int[] dim2 = new int[size2];   // 要素数を変数で指示(動的確保)
        int   len2;

        len2 = dim2.length;      // 配列の要素数の取得.length
        System.out.println("dim2.length = " + len2);

        size2 = 3;    // 変数は後から変更が可能　コメントを外した時の動作も確認せよ
        for (int i = 0; i < size2; i++) {   //　繰り返し回数を変数名で指定
            System.out.println("dim2[" + i + "] = " + dim2[i]); // 初期値無しの配列の値はゼロ
        }
        System.out.println("----------");
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> javac Ex0403Final.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> java Ex0403Final      
dim1.length = 4
dim1[0] = 0
dim1[1] = 0
dim1[2] = 0
dim1[3] = 0
----------
dim2.length = 5
dim2[0] = 0
dim2[1] = 0
dim2[2] = 0
dim2[3] = 0
dim2[4] = 0
----------
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> 4> 


18行目のコメントを外すとコンパイルエラー

PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> javac Ex0403Final.java
Ex0403Final.java:17: エラー: final変数SIZE1に値を代入することはできません
        SIZE1 = 3;         // final変数は変更不可　コメントを外すとコンパイルエラー？　実行エラー？
        ^
エラー1個
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04>  


PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> javac Ex0403Final.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> java Ex0403Final      
dim1.length = 4
dim1[0] = 0
dim1[1] = 0
dim1[2] = 0
dim1[3] = 0
----------
dim2.length = 5
dim2[0] = 0
dim2[1] = 0
dim2[2] = 0
----------
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> 


 */
