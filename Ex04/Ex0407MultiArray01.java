/**
 * 多次元配列の表示
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/20
 */
public class Ex0407MultiArray01 {
    public static void main(String[] args) {
        // 1. 2次元配列の領域確保と代入
        System.out.println("1. 2次元配列の領域確保と代入");
        int[][] aa = new int[3][4]; // 3行4列の2次元配列の宣言と領域確保
       // @formatter:off;
        aa[0][0] = 0;   aa[0][1] = 1;   aa[0][2] = 2;   aa[0][3] = 3;
        aa[1][0] = 4;   aa[1][1] = 5;   aa[1][2] = 6;   aa[1][3] = 7;
        aa[2][0] = 8;   aa[2][1] = 9;   aa[2][2] = 10;  aa[2][3] = 11;
       // @formatter:on;
        for (int i = 0; i < aa.length; i++) {  // 行数回の繰返し
            for (int j = 0; j < aa[i].length; j++) {    // 列数回の繰返し
                System.out.print("aa[" + i + "][" + j + "] = " + aa[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
        System.out.println("----------");

        // 2. 2次元配列の初期化
        System.out.println("2. 2次元配列の初期化");
        int[][] bb = {
                {10, 11, 12, 13},
                {14, 15, 16, 17},
                {18, 19, 20, 21}
        };

        for (int i = 0; i < bb.length; i++) {
            for (int j = 0; j < bb[i].length; j++) {
                System.out.print("bb[" + i + "][" + j + "] = " + bb[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
        System.out.println("----------");

        // 3. 列数の異なる２次元配列の初期化
        System.out.println("3. 列数の異なる２次元配列の初期化");
        int[][] cc = {
                {10, 11, 12, 13},
                {14, 15},
                {18, 19, 20}
        };

        for (int i = 0; i < cc.length; i++) {
            for (int j = 0; j < cc[i].length; j++) {
                System.out.print("cc[" + i + "][" + j + "] = " + cc[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
        System.out.println("----------");
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> javac Ex0407MultiArray01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> java Ex0407MultiArray01      
1. 2次元配列の領域確保と代入
aa[0][0] = 0    aa[0][1] = 1    aa[0][2] = 2    aa[0][3] = 3
aa[1][0] = 4    aa[1][1] = 5    aa[1][2] = 6    aa[1][3] = 7
aa[2][0] = 8    aa[2][1] = 9    aa[2][2] = 10   aa[2][3] = 11
----------
2. 2次元配列の初期化
bb[0][0] = 10   bb[0][1] = 11   bb[0][2] = 12   bb[0][3] = 13
bb[1][0] = 14   bb[1][1] = 15   bb[1][2] = 16   bb[1][3] = 17
bb[2][0] = 18   bb[2][1] = 19   bb[2][2] = 20   bb[2][3] = 21
----------
3. 列数の異なる２次元配列の初期化
cc[0][0] = 10   cc[0][1] = 11   cc[0][2] = 12   cc[0][3] = 13
cc[1][0] = 14   cc[1][1] = 15
cc[2][0] = 18   cc[2][1] = 19   cc[2][2] = 20
----------
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> 
 */
