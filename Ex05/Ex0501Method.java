/**
 * メソッド作成
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/20
 */

public class Ex0501Method {
    public static void main(String[] args) {
        int[][] iArray2 = {
                {29, 50, 43, 11, 42, 25, 8},
                {50, 100, 43, 11, 42, 8, 18},
                {8, 100, 43, 160, 42, 25, 188}
        };

        for (int[] iArray1 : iArray2) {   // ２次元配列の１行ずつを１次元配列として取り出し
            System.out.print("データ : ");
            print(iArray1);               // int配列のデータを順番に表示
            System.out.println("min = " + getMin(iArray1));
            System.out.println("max = " + getMax(iArray1));
            System.out.println("----------------------------------------------------------------");
        }
    }

    // 配列の内容をすべて表示するメソッド
    public static void print(int[] ar) {
        for (int data : ar) {
            System.out.print(data);
            System.out.print("\t");
        }
        System.out.println("");
    }

    // 配列内の最小値を返すメソッド
    public static int getMin(int[] ar) {
        int min = Integer.MAX_VALUE;
        // 適切な処理を記述しなさい　拡張for文を使って処理を記述しなさい
        for (int data : ar) {
            if (data < min) {
                min = data;
            }
        }
        return min;
    }

    // 配列内の最大値を返すメソッド
    public static int getMax(int[] ar) {
        int max = Integer.MIN_VALUE;
        // 適切な処理を記述しなさい　拡張for文を使って処理を記述しなさい
        for (int data : ar) {
            if (data > max) {
                max = data;
            }
        }
        return max;
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex05> javac Ex0501Method.java      
PS G:\マイドライブ\PG2\PGⅡsrc\Ex05> java Ex0501Method      
データ : 29     50      43      11      42      25      8
min = 8
max = 50
----------------------------------------------------------------
データ : 50     100     43      11      42      8       18
min = 8
max = 100
----------------------------------------------------------------
データ : 8      100     43      160     42      25      188
min = 8
max = 188
----------------------------------------------------------------
PS G:\マイドライブ\PG2\PGⅡsrc\Ex05> 
 */
