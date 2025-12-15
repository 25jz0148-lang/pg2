/**
 * 1次元配列の内容を縦グラフとして表示する
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/11/10
 */
public class Ex0504Graph3 {
    public static void main(String[] args) {
        int[][] ar2 = {
                {4, 7, 8, 6, 10, 6, 2, 5, 5, 2, 7, 4},
                {5, 9, 6, 3, 4, 12, 11, 10, 2, 5, 1}
        };

        for (int[] ar : ar2) {
            printVerticalGraph(ar); // １次元配列の内容を縦の棒グラフで表示
            System.out.println();
        }

    }

    /**
     * 1次元配列の内容を縦の棒グラフで表示するメソッド
     *
     * @param ar グラフ化する整数配列
     */
    public static void printVerticalGraph(int[] ar) {

        int max = 0;
        for (int val : ar) {
            if (val > max) {
                max = val;
            }
        }
        for (int i = max; i >= 1; i--) {
            for (int val : ar) {
                if (val >= i) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < ar.length * 3; i++) {
            System.out.print("-");
        }
        System.out.println();

        char ch = 'A';
        for (int i = 0; i < ar.length; i++) {
            System.out.print(" " + ch + " ");
            ch++;
        }
        System.out.println();
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex05> javac Ex0504Graph3.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex05> java Ex0504Graph3      
             *
             *
       *     *
    *  *     *                 *
    *  *  *  *  *              *
    *  *  *  *  *     *  *     *
 *  *  *  *  *  *     *  *     *  *
 *  *  *  *  *  *     *  *     *  *
 *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *
------------------------------------
 A  B  C  D  E  F  G  H  I  J  K  L 

                *
                *  *
                *  *  *
    *           *  *  *
    *           *  *  *
    *           *  *  *
    *  *        *  *  *
 *  *  *        *  *  *     *
 *  *  *     *  *  *  *     *
 *  *  *  *  *  *  *  *     *
 *  *  *  *  *  *  *  *  *  *    
 *  *  *  *  *  *  *  *  *  *  *
---------------------------------
 A  B  C  D  E  F  G  H  I  J  K

PS G:\マイドライブ\PG2\PGⅡsrc\Ex05> 
 */
