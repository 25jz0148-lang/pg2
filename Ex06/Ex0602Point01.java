/**
 * Point クラスの作成
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/27
 */
class Point { // Pointクラス
    // 必要なフィールド、メソッドの宣言、定義を行いなさい
    // 必要なフィールド（メンバ変数）の宣言
    private int x;
    private int y;

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
}


public class Ex0602Point01 {
    public static void main(String[] args) {
        //---------------------------------------------step 1
        System.out.println("\t---------- Step 1 メンバ変数宣言, printData()メソッド");
        Point a = new Point();
        Point b;

        System.out.print("a = ");  // 初期化していないオブジェクトの値はいくつ？ -> x=0, y=0
        a.printData(); // x,y 座標表示　改行なし
        System.out.println(); // 改行
        // --------------------------------------------step 2
        System.out.println("\t---------- Step 2 print()メソッド");
        b = new Point();
        System.out.print("b = ");
        b.print();    // ()付き座標表示　改行なし -> (0, 0)
        System.out.println(); // 改行
        // --------------------------------------------step 3
        System.out.println("\t---------- Step 3 setX(int), setY(int), println()メソッド");
        // a.x = 100; // カプセル化の基本　メンバ変数への外部からの直接アクセスはしてはいけない
        // a.y = 200; // 　　　　　　　　　メソッドを通じてメンバデータへアクセスすること
        a.setX(111);   // メンバ変数 x の値設定
        a.setY(222);   // メンバ変数 y の値設定
        System.out.print("a = ");
        a.println();   // ()付き座標表示　改行あり -> (111, 222)
        // --------------------------------------------step 4
        System.out.println("\t---------- Step 4 set(int, int), getX(), getY()メソッド");
        b.set(333, 444);  //メンバ変数x, y の値を設定
        System.out.print("b = ");
        System.out.println("[" + b.getX() + " " + b.getY() + "]"); // 標準とは違った形で出力 -> [333 444]
        b.set(b.getX() + 10, b.getY() + 20);   // xを 10、yを20増やした値を設定
        System.out.print("b = ");
        b.println(); // -> (343, 464)
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0602Point01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0602Point01      
        ---------- Step 1 メンバ変数宣言, printData()メソッド
a = 0, 0
        ---------- Step 2 print()メソッド
b = (0, 0)
        ---------- Step 3 setX(int), setY(int), println()メソッド
a = (111, 222)
        ---------- Step 4 set(int, int), getX(), getY()メソッド
b = [333 444]
b = (343, 464)
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06>

        ----------Step 5 エラーメッセージ
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0602Point01.java
Ex0602Point01.java:74: エラー: xはPointでprivateアクセスされます
        a.x = 100; // カプセル化の基本　メンバ変数への外部からの直接アクセスはしてはいけない
         ^
Ex0602Point01.java:75: エラー: yはPointでprivateアクセスされます
        a.y = 200; // 　　　　　　　　　メソッドを通じてメンバデータへアクセスすること
         ^
エラー2個
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06>  
 */
