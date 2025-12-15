/**
 * 多次元配列のコピー 配列aaの内容を配列bbにコピー
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/20
 */
public class Ex0408MultiArray02 {
    public static void main(String[] args) {
        int[][] aa = {
                {5, 9, 6, 3, 4},
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 0}
        };
        int[][] bb;

        //System.out.println("２次元配列の浅いコピー");
        //bb = aa;  // bb <- aa

        System.out.println("２次元配列の深いコピー");
        bb = new int[aa.length][]; // 
        for (int i = 0; i < aa.length; i++) {
            bb[i] = aa[i].clone(); // 行のコピー
        }

        bb[0][0] = 0;
        bb[1][1] = 11;
        bb[2][2] = 22;
        System.out.println("bb[0][0] = 0;");
        System.out.println("bb[1][1] = 11;");
        System.out.println("bb[2][2] = 22;");
        System.out.println("２次元配列 aa  の内容");
        for (int x = 0; x < aa.length; x++) {
            for (int y = 0; y < aa[x].length; y++) {
                System.out.print(aa[x][y]);
                System.out.print("\t");
            }
            System.out.println("");
        }

        System.out.println("２次元配列 bb  の内容");
        for (int[] bb1 : bb) {
            for (int data : bb1) {
                System.out.print(data);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> javac Ex0408MultiArray02.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> java Ex0408MultiArray02      
２次元配列の浅いコピー
bb[0][0] = 0;
bb[1][1] = 11;
bb[2][2] = 22;
２次元配列 aa  の内容
0       9       6       3       4
1       11      5       7       9
2       4       22      8       0
２次元配列 bb  の内容
0       9       6       3       4
1       11      5       7       9
2       4       22      8       0
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> 

PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> javac Ex0408MultiArray02.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> java Ex0408MultiArray02      
２次元配列の深いコピー
bb[0][0] = 0;
bb[1][1] = 11;
bb[2][2] = 22;
２次元配列 aa  の内容
5       9       6       3       4
1       3       5       7       9
2       4       6       8       0
２次元配列 bb  の内容
0       9       6       3       4
1       11      5       7       9
2       4       22      8       0
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> 
 */
