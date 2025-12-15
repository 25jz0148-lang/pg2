
public class iArray1 {
    /**
     * printgraphメソッドの変更
     * 
     * @author 25JZ0148 Yamada taiyou
     * @version 2025/11/10
     */
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
        int       maxData   = getMax(ar);    // データの最大値を取得

        // 指定された条件に基づいて比率(rate)を決定する
        int rate;
        if (maxData <= 50) {
            rate = 1;
        }
        else if (maxData <= 100) {
            rate = 2;
        }
        else if (maxData <= 150) {
            rate = 3;
        }
        else if (maxData <= 200) {
            rate = 4;
        }
        else {
            // 200を超える場合は、データの最大値をWIDTH_MAXで割った値（切り上げ）を比率とする
            rate = (int) Math.ceil((double) maxData / WIDTH_MAX);
        }

        int scaleMax = WIDTH_MAX / 10; // 目盛りの表示回数を求める

        // 目盛りの表示
        for (int i = 0; i < scaleMax; i++) {
            System.out.print("----+----" + i);
        }
        System.out.println(); // 改行


        for (int data : ar) {   //データ数回棒グラフを表示する　拡張for文
            int n = data / rate;  // *の表示数を求める
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
