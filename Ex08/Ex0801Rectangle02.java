/**
 * クラス型をメンバに持つクラス
 * has-aの関係(Rectangle has-a Point) または part-ofの関係(Point part-of Rectangle)
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/12/01
 */
class Rectangle {
    private Point base;       // RectangleクラスメンバにPoint型データ
    private int   height;
    private int   width;

    public Rectangle() {
        base   = new Point();
        height = 200;
        width  = 300;
        System.out.println("\t----- Rectangle()");
    }

    public Rectangle(int x, int y, int height, int width) {
        base        = new Point(x, y);
        this.height = height;
        this.width  = width;
        System.out.println("\t----- Rectangle(x, y, height, width)");
    }

    public void set(int x, int y, int height, int width) {
        // Pointクラスのsetterを使って基準点を更新
        base.set(x, y);
        this.height = height;
        this.width  = width;
    }

    public int getArea() {
        return this.height * this.width;
    }

    public void move(int moveX, int moveY) {
        base.move(moveX, moveY);
    }

    // Step1 print println getHeight getWidthの作成
    public void print() {
        System.out.print("基準点:");
        base.print();  // 基準点の表示 Point 型の base メンバの内容を表示 print メソッドの呼出し
        System.out.print(" 高さ:" + getHeight());  // 高さの表示 getHeight メソッドの呼び出し
        System.out.print(" 幅:" + getWidth());    // 幅の表示 getWidth メソッドの呼び出し
    }

    // Step1 println, getHeight, getWidth メソッドの作成
    public void println() {
        print();
        System.out.println();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}


public class Ex0801Rectangle02 {
    public static void main(String[] args) {
        if (args.length >= 4) {
            Rectangle[] a = new Rectangle[args.length / 4]; // 引数の図形数分の配列生成
            System.out.println("データ数 = " + a.length);
            for (int i = 0, j = 0; i < a.length; i++) {
                a[i] = new Rectangle(Integer.parseInt(args[j++]),
                        Integer.parseInt(args[j++]),
                        Integer.parseInt(args[j++]),
                        Integer.parseInt(args[j++]));
            }
            printAll(a); // 全データ出力
        }
        else {
            System.out.println("引数が足りません\n");
        }
    }

    public static void printAll(Rectangle[] a) {
        //for (int i = 0; i < a.length; i++) {
        //  a[i].print(); // Rectangleのprintメソッド呼び出し
        //System.out.print(" 面積 = " + a[i].getArea()); // RectangleのgetAreaメソッド呼び出し
        for (Rectangle r : a) {
            r.print(); // Rectangleのprintメソッド呼び出し
            System.out.print(" 面積 = " + r.getArea()); // RectangleのgetAreaメソッド呼び出し
            System.out.println(); // 改行
        }
    }
}

/*
Step1

PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> javac Ex0801Rectangle02.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> java Ex0801Rectangle02 0 0 3 5 100 200 300 400 500 900 600 300
データ数 = 3
        ----- Point(int x, int y)
        ----- Rectangle(x, y, height, width)
        ----- Point(int x, int y)
        ----- Rectangle(x, y, height, width)
        ----- Point(int x, int y)
        ----- Rectangle(x, y, height, width)
基準点:(0, 0) 高さ:3 幅:5 面積 = 15
基準点:(100, 200) 高さ:300 幅:400 面積 = 120000
基準点:(500, 900) 高さ:600 幅:300 面積 = 180000

PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> java Ex0801Rectangle02 0 0 3 5 100 200
データ数 = 1
        ----- Point(int x, int y)
        ----- Rectangle(x, y, height, width)
基準点:(0, 0) 高さ:3 幅:5 面積 = 15

PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> java Ex0801Rectangle02      
引数が足りません

PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> 

Step2

PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> javac Ex0801Rectangle02.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> java Ex0801Rectangle02 0 0 3 5 100 200 300 400 500 900 600 300
データ数 = 3
        ----- Point(int x, int y)
        ----- Rectangle(x, y, height, width)
        ----- Point(int x, int y)
        ----- Rectangle(x, y, height, width)
        ----- Point(int x, int y)
        ----- Rectangle(x, y, height, width)
基準点:(0, 0) 高さ:3 幅:5 面積 = 15
基準点:(100, 200) 高さ:300 幅:400 面積 = 120000
基準点:(500, 900) 高さ:600 幅:300 面積 = 180000

PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> java Ex0801Rectangle02 0 0 3 5 100 200
データ数 = 1
        ----- Point(int x, int y)
        ----- Rectangle(x, y, height, width)
基準点:(0, 0) 高さ:3 幅:5 面積 = 15

PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> java Ex0801Rectangle02      
引数が足りません

PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> 
*/
