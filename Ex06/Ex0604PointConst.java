/**
 * Pointクラス コンストラクタの追加
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/11/05
 */
class Point {
    private int x;    // メンバ変数（フィールド）の宣言
    private int y;

    // コンストラクタを追加しなさい
    public Point() {      //引数なしコンストラクタ
        x = 100;
        y = 50;
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



public class Ex0604PointConst {
    public static void main(String[] args) {
        Point a = new Point();   // 引数なしコンストラクタによる初期化

        System.out.print("a = ");
        a.print();
        System.out.println();

        Point b = new Point(111, 222);  // 引数ありコンストラクタによる初期化
        System.out.print("b = ");
        b.println();
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0604PointConst.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0604PointConst    
        ----- Point()
a = (100, 50)
        ----- Point(int x, int y)
b = (111, 222)
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 
 */
