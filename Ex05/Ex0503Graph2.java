/**
 * printgraphメソッドの変更
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/11/10
 */
public class Ex0503Graph2 {
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
            printGraph(iArray1);       // 棒グラフを表示
            System.out.println(
                    "----------------------------------------------------------------");
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

    // 配列の各要素の数だけ棒グラフ（アスタリスク）を表示し、最後に値を表示するメソッド
    public static void printGraph(int[] ar) {
        final int WIDTH_MAX = 50;    // グラフの最大幅数(10の倍数で指定)
        int       scaleMax  = WIDTH_MAX / 10; // メモリに表示する値の最大値を求める
        for (int i = 1; i <= scaleMax; i++) {     // メモリを表示する　//  棒グラフとしてn個分の*を表示
            System.out.print("----+----" + i);
        }
        System.out.println();

        int rate = ((getMax(ar) - 1) / WIDTH_MAX) + 1;
        for (int data : ar) {   //データ数回棒グラフを表示する　拡張for文でdataにデータ数を取得
            int n = data / rate;  // データ数をnにコピー
            for (int i = 0; i < n; i++) {  // 棒グラフとしてn個分の*を表示
                System.out.print("*");
            }
            System.out.println(" : " + data);  // データ数を表示
        }
        System.out.println("※比率 *=" + rate + "で表示");
    }

    // 配列内の最小値を返すメソッド
    public static int getMin(int[] ar) {
        int min = Integer.MAX_VALUE;
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
PS G:\マイドライブ\PG2\PGⅡsrc\Ex05> javac Ex0503Graph2.java   
PS G:\マイドライブ\PG2\PGⅡsrc\Ex05> java Ex0503Graph2      
データ : 29     50      43      11      42      25      8
min = 8
max = 50
----+----1----+----2----+----3----+----4----+----5
***************************** : 29
************************************************** : 50
******************************************* : 43
*********** : 11
****************************************** : 42
************************* : 25
******** : 8
※比率 *=1で表示
----------------------------------------------------------------
データ : 50     100     43      11      42      8       18
min = 8
max = 100
----+----1----+----2----+----3----+----4----+----5
************************* : 50
************************************************** : 100
********************* : 43
***** : 11
********************* : 42
**** : 8
********* : 18
※比率 *=2で表示
----------------------------------------------------------------
データ : 8      100     43      160     42      25      188
min = 8
max = 188
----+----1----+----2----+----3----+----4----+----5
** : 8
************************* : 100
********** : 43
**************************************** : 160
********** : 42
****** : 25
*********************************************** : 188
※比率 *=4で表示
----------------------------------------------------------------
PS G:\マイドライブ\PG2\PGⅡsrc\Ex05> 
*/
