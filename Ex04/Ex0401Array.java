/**
 * 配列の使い方と初期値の確認
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/06
 */
public class Ex0401Array {
    public static void main(String[] args) {
        // O. 通常変数の宣言と初期値の設定なしでの参照
        int data;
        //　変数に値を代入せずに参照はできない
        data = 123;
        System.out.println("data = " + data);
        System.out.println("----------");

        // 1.配列変数宣言、配列領域の生成
        int[] dim1;      //　配列変数の宣言
        dim1 = new int[3];         //　配列の領域の生成　int３つ分確保

        for (int i = 0; i < 3; i++) {
            System.out.println("dim1[" + i + "] = " + dim1[i]); // 配列の初期値はゼロ
        }
        System.out.println("----------");

        // 2.配列変数宣言と配列領域の生成を同時に行う
        int[] dim2 = new int[4];   // 配列変数の宣言と領域生成(int４つ分)を同時に行う

        for (int i = 0; i < dim2.length; i++) {
            System.out.println("dim2[" + i + "] = " + dim2[i]);
        }
        System.out.println("----------");

        // 3.配列変数宣言と初期値設定
        int[] dim3 = {5, 9, 6, 3, 4};  // 配列に初期値(5, 9, 6, 3, 4)を与え領域生成

        for (int i = 0; i < dim3.length; i++) {
            System.out.println("dim3[" + i + "] = " + dim3[i]);
        }
        System.out.println("----------");
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> javac Ex0401Array.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> java Ex0401Array      
data = 123
----------
dim1[0] = 0
dim1[1] = 0
dim1[2] = 0
----------
dim2[0] = 0
dim2[1] = 0
dim2[2] = 0
dim2[3] = 0
----------
dim3[0] = 5
dim3[1] = 9
dim3[2] = 6
dim3[3] = 3
dim3[4] = 4
----------
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> 
 */
