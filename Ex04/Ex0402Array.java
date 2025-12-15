/**
 * 配列の初期値を確認表示
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/06
 */
public class Ex0402Array {
    public static void main(String[] args) {
        int[] dim1;        //配列変数の宣言
        dim1 = new int[3]; //配列の領域確保

        for (int i = 0; i < dim1.length; i++) {  // 配列の要素数を取得し繰り返し回数とする
            System.out.println("dim1[" + i + "] = " + dim1[i]); // 初期値無しの配列の値はゼロ
        }
        System.out.println("----------");

        dim1[0] = 10;    //　配列の各要素にデータ設定。添え字は０から始まる
        dim1[1] = 3;
        dim1[2] = 8;
        // 範囲外参照はチェックされる
        dim1[3] = 2;    //     コメント外した時は、コンパイルエラー？それとも実行エラー？

        for (int i = 0; i < dim1.length; i++) {  // 卑劣の要素数を取得し繰り返し回数とする
            System.out.println("dim1[" + i + "] = " + dim1[i]);
        }
        System.out.println("----------");
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> javac Ex0402Array.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> java Ex0402Array      
dim1[0] = 0
dim1[1] = 0
dim1[2] = 0
----------
dim1[0] = 10
dim1[1] = 3
dim1[2] = 8
----------
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> 
 */

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> javac Ex0402Array.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> java Ex0402Array      
dim1[0] = 0
dim1[1] = 0
dim1[2] = 0
----------
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
       at Ex0402Array.main(Ex0402Array.java:21)
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> 

実行エラーである

理由:dim1[3]は４つ目の要素数になるため配列で設定した要素数である３を超えたため実行エラーが発生した
 */
