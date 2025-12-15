/**
 * 二次元座標を管理する．
 * x, y座標をint型で管理する
 * 
 * @author Suzuki Yoshinobu
 */
public class Point {
    private int x;           // メンバ変数(フィールド)の宣言
    private int y;

    /**
     * 引数無しコンストラクタ.
     * x = 100, y = 50 で初期化する
     */
    public Point() {        // 引数無しコンストラクタ
        this(100, 50);
        System.out.println("\t----- Point()");  // コンストラクタ呼び出し確認用メッセージ
    }

    /**
     * 引数付きコンストラクタ.
     * 指定された値で初期化
     * 
     * @param x x座標の値
     * @param y y座標の値
     */
    public Point(int x, int y) {        // 引数付き(int, int)コンストラクタ
        this.x = x;
        this.y = y;
        System.out.println("\t----- Point(int x, int y)"); // 呼び出し確認用メッセージ表示
    }

    //  Ex0603Point02.javaで作成したメソッドはすべて残すこと
    /**
     * 座標値表示 x, y の形式で表示（改行なし）
     */
    public void printData() {
        System.out.print(getX() + ", " + getY());
    }

    /**
     * 座標値を (x、y) の形式で表示（改行なし）
     */
    public void print() {
        System.out.print("(");
        printData();
        System.out.print(")");
    }

    /**
     * 座標値を (x、y) の形式で表示（改行あり）
     */
    public void println() {
        print();
        System.out.println();
    }

    /**
     * x座標の値を設定
     * 
     * @param x 設定する値
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * y座標の値を設定
     * 
     * @param y 設定する値
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * x, y座標の値を設定
     * 
     * @param x x座標に設定する値
     * @param y y座標に設定する値
     */
    public void set(int x, int y) {
        setX(x);
        setY(y);
    }

    /**
     * x座標の値を返す
     * 
     * @return x座標の値
     */
    public int getX() {
        return x;
    }

    /**
     * y座標の値を返す
     * 
     * @return y座標の値
     */
    public int getY() {
        return y;
    }

    // ++++++++++++++++++++++++++++++++++++ moveメソッドの追加
    /**
     * 座標を移動する
     * 
     * @param x x座標の移動量
     * @param y y座標の移動量
     */
    public void move(int x, int y) {
        set(getX() + x, getY() + y);
    }

    /**
     * 座標を移動する
     * 
     * @param b 移動量
     */
    public void move(Point b) {
        move(b.getX(), b.getY());
    }

    /**
     * 座標を移動する（x,yに同量移動する）
     * 
     * @param m x, yの移動量
     */
    public void move(int m) {
        move(m, m);
    }
}
