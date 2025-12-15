/**
 * クラス変数とクラスメソッド Algoクラスの作成
 * 配列に対する計算メソッドの追加
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/11/26
 */
class Algo {
    public static final double PAI = 3.141592653589793;

    private Algo() {
        //処理なし
    }

    public static int abs(int data) {
        return (data < 0) ? -data : data;
    }

    public static double abs(double data) {
        return (data < 0.0) ? -data : data;
    }

    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    public static double max(double x, double y) {
        return (x > y) ? x : y;
    }

    public static int min(int x, int y) {
        return (x < y) ? x : y;
    }

    public static double min(double x, double y) {
        return (x < y) ? x : y;
    }

    public static int total(int[] a) {
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        return sum;
    }

    public static double total(double[] a) {
        double sum = 0.0;
        for (double value : a) {
            sum += value;
        }
        return sum;
    }

    public static int max(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }
        int maxValue = a[0];
        for (int i = 1; i < a.length; i++) {
            maxValue = max(maxValue, a[i]);
        }
        return maxValue;
    }

    public static double max(double[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }
        double maxValue = a[0];
        for (int i = 1; i < a.length; i++) {
            maxValue = max(maxValue, a[i]);
        }
        return maxValue;
    }

    public static int min(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }
        int minValue = a[0];
        for (int i = 1; i < a.length; i++) {
            minValue = min(minValue, a[i]);
        }
        return minValue;
    }

    public static double min(double[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }
        double minValue = a[0];
        for (int i = 1; i < a.length; i++) {
            minValue = min(minValue, a[i]);
        }
        return minValue;
    }
}



public class Ex0702Algo02 {
    public static void main(String[] args) {
        int[]    intArray    = {30, 40, 60, 50, 10, 20};
        double[] doubleArray = {30.5, 40.6, 60.4, 50.7, 10.3, 20.4};

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray[" + i + "] = " + intArray[i]);
        }
        System.out.println();
        System.out.println("合計値 : " + Algo.total(intArray));
        System.out.println("最大値 : " + Algo.max(intArray));
        System.out.println("最小値 : " + Algo.min(intArray));
        System.out.println("--------------------");
        System.out.println();

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println("doubleArray[" + i + "] = " + doubleArray[i]);
        }
        System.out.println();
        System.out.println("合計値 : " + Algo.total(doubleArray));
        System.out.println("最大値 : " + Algo.max(doubleArray));
        System.out.println("最小値 : " + Algo.min(doubleArray));
        System.out.println("--------------------");
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex07> javac Ex0702Algo02.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex07> java Ex0702Algo02      
intArray[0] = 30
intArray[1] = 40
intArray[2] = 60
intArray[3] = 50
intArray[4] = 10
intArray[5] = 20

合計値 : 210
最大値 : 60
最小値 : 10
--------------------

doubleArray[0] = 30.5
doubleArray[1] = 40.6
doubleArray[2] = 60.4
doubleArray[3] = 50.7
doubleArray[4] = 10.3
doubleArray[5] = 20.4

合計値 : 212.9
最大値 : 60.4
最小値 : 10.3
--------------------
PS G:\マイドライブ\PG2\PGⅡsrc\Ex07> 
 */
