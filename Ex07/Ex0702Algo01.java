/**
 * クラス変数とクラスメソッド Algoクラスの作成
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
}


public class Ex0702Algo01 {
    public static void main(String[] args) {
        int    ix = -50;
        int    iy = 30;
        double dx = -50.5;
        double dy = 30.6;
        //Algo   a  = new Algo();

        //Algo.PAI = 3.14;
        System.out.println("PAI = " + Algo.PAI);
        System.out.println();

        System.out.println("ix = " + ix);
        System.out.println("iy = " + iy);

        System.out.println();
        System.out.println("dx = " + dx);
        System.out.println("dy = " + dy);

        System.out.println();
        System.out.println("ixの絶対値 : " + Algo.abs(ix));
        System.out.println("iyの絶対値 : " + Algo.abs(iy));
        System.out.println("dxの絶対値 : " + Algo.abs(dx));
        System.out.println("dyの絶対値 : " + Algo.abs(dy));

        System.out.println();
        System.out.println("ixとiyの大きいほう : " + Algo.max(ix, iy));
        System.out.println("dxとdyの大きいほう : " + Algo.max(dx, dy));

        System.out.println();
        System.out.println("ixとiyの小さいほう : " + Algo.min(ix, iy));
        System.out.println("dxとdyの小さいほう : " + Algo.min(dx, dy));
    }
}

/*
実行結果

PS G:\マイドライブ\PG2\PGⅡsrc\Ex07> javac Ex0702Algo01.java     
PS G:\マイドライブ\PG2\PGⅡsrc\Ex07> java Ex0702Algo01      
PAI = 3.141592653589793

ix = -50
iy = 30

dx = -50.5
dy = 30.6

ixの絶対値 : 50
iyの絶対値 : 30
dxの絶対値 : 50.5
dyの絶対値 : 30.6

ixとiyの大きいほう : 30
dxとdyの大きいほう : 30.6

ixとiyの小さいほう : -50
dxとdyの小さいほう : -50.5
PS G:\マイドライブ\PG2\PGⅡsrc\Ex07> 

エラー確認

PS G:\マイドライブ\PG2\PGⅡsrc\Ex07> javac Ex0702Algo01.java
Ex0702Algo01.java:46: エラー: Algo()はAlgoでprivateアクセスされます
        Algo   a  = new Algo();
                    ^
Ex0702Algo01.java:48: エラー: final変数PAIに値を代入することはできません
        Algo.PAI = 3.14;
            ^
エラー2個
PS G:\マイドライブ\PG2\PGⅡsrc\Ex07> 
*/
