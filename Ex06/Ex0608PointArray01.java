/**
 * Point クラスの配列操作
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/11/17
 */
class Point {
    private int x;    // メンバ変数（フィールド）の宣言
    private int y;

    public Point() {      //引数なしコンストラクタ
        // 引数ありコンストラクタを呼び出すように変更
        this(100, 50);
        System.out.println("\t----- Point()");  // コンストラクタ呼び出し確認用メッセージ
    }

    public Point(int x, int y) {      //引数あり(int, int)コンストラクタ
        this.x = x;
        this.y = y;
        System.out.println("\t----- Point(int x, int y)");    // 呼び出し確認用メッセージ表示
    }

    // メソッドの定義
    // step 1: printData()メソッド
    public void printData() {
        System.out.print(this.x + ", " + this.y);
    }

    // step 2: print()メソッド
    public void print() {
        System.out.print("(");
        printData();
        System.out.print(")");
    }

    // step 3: setX(int), setY(int), println()メソッド
    public void setX(int xData) {
        this.x = xData;
    }

    public void setY(int yData) {
        this.y = yData;
    }

    public void println() {
        print();
        System.out.println();
    }

    // step 4: set(int, int), getX(), getY()メソッド
    public void set(int xData, int yData) {
        setX(xData);
        setY(yData);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // moveメソッドを3つ追加定義しなさい
    public void move(int x_delta, int y_delta) {
        this.x += x_delta;
        this.y += y_delta;
    }

    public void move(Point p) {
        move(p.getX(), p.getY());
    }

    public void move(int delta) {
        move(delta, delta);
    }
}


public class Ex0608PointArray01 {
    public static void main(String[] args) {
        // 引数データの数が2以上かチェック
        if (args.length >= 2) {
            Point[] a = new Point[args.length / 2]; // 座標点分領域確保（引数ペア数分）
            System.out.println("座標数 = " + a.length);

            for (int i = 0, j = 0; j < a.length; i += 2, j++) {
                // 引数ありコンストラクタで初期化
                a[j] = new Point(Integer.parseInt(args[i]), Integer.parseInt(args[i + 1]));
            }
            printAll(a);
        }
        else {
            System.out.println("引数が足りません");
        }
    }

    /**
     * Point型配列を受け取り、全件表示するprintAllメソッド
     * 拡張for文で実装
     * 
     * @param points 表示するPoint型配列
     */
    public static void printAll(Point[] points) {
        
        for (Point p : points) {
            p.println();
        }
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0608PointArray01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0608PointArray01 10 20  33 44  50 60  77 88
座標数 = 4
        ----- Point(int x, int y)
        ----- Point(int x, int y)
        ----- Point(int x, int y)
        ----- Point(int x, int y)
(10, 20)
(33, 44)
(50, 60)
(77, 88)
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0608PointArray01 10 22 33
座標数 = 1
        ----- Point(int x, int y)
(10, 22)
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0608PointArray01 10
引数が足りません
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 
 */
