class Algo {
    public static final double PAI = 3.141592653589793;

    private Algo() {
        //処理なし
    }

    /**
     * int型の絶対値を返します
     * 
     * @param data
     * @return 絶対値
     */
    public static int abs(int data) {
        // dataが0より小さい場合（負の場合）は -data を返し、そうでない場合は data を返す
        return (data < 0) ? -data : data;
    }

    /**
     * double型の絶対値を返します
     * 
     * @param data
     * @return 絶対値
     */
    public static double abs(double data) {
        // dataが0.0より小さい場合（負の場合）は -data を返し、そうでない場合は data を返す
        return (data < 0.0) ? -data : data;
    }

    /**
     * 2つのint型のうち、大きい方を返します
     * 
     * @param data1
     * @param data2
     * @return 大きい方の値
     */
    public static int max(int data1, int data2) {
        // data1がdata2より大きい場合は data1 を返し、そうでない場合は data2 を返す
        return (data1 > data2) ? data1 : data2;
    }

    /**
     * 2つのdouble型のうち、大きい方を返します
     * 
     * @param data1
     * @param data2
     * @return 大きい方の値
     */
    public static double max(double data1, double data2) {
        return (data1 > data2) ? data1 : data2;
    }

    /**
     * 2つのint型のうち、小さい方を返します
     * 
     * @param data1
     * @param data2
     * @return 小さい方の値
     */
    public static int min(int data1, int data2) {
        return (data1 < data2) ? data1 : data2;
    }

    /**
     * 2つのdouble型のうち、小さい方を返します
     * 
     * @param data1
     * @param data2
     * @return 小さい方の値
     */
    public static double min(double data1, double data2) {
        return (data1 < data2) ? data1 : data2;
    }
}


public class test {
    public static void main(String[] args) {
        int    ix = -50;
        int    iy = 30;
        double dx = -50.5;
        double dy = 30.6;
        // Algo a = new Algo();

        // Algo.PAI = 3.14;
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
        // ここからは Algo に max, min メソッドを実装する必要があります
        System.out.println("ixとiyの大きいほう : " + Algo.max(ix, iy));
        System.out.println("dxとdyの大きいほう : " + Algo.max(dx, dy));

        System.out.println();
        System.out.println("ixとiyの小さいほう : " + Algo.min(ix, iy));
        System.out.println("dxとdyの小さいほう : " + Algo.min(dx, dy));
    }
}
