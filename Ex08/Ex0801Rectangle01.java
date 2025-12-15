/**
 * クラス型をメンバに持つクラス
 * has-aの関係(Rectangle has-a Point)
 * またはpart-ofの関係(Point part-of Rectangle)
 * 
 * @author 25JZ0148 Yamada taiyou
 * 
 * @version 2025/11/26
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
        base.set(base.getX() + moveX, base.getY() + moveY);
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


public class Ex0801Rectangle01 {
    public static void main(String[] args) {
        System.out.println("---------- Ex0801Rectangle01 start");

        System.out.println("---------- Step1, 2 ----------");
        Rectangle rect1 = new Rectangle();  // Rectangle 型の領域確保
        System.out.print("rect1 = ");
        rect1.println();

        System.out.println("---------- Step3 ----------");
        Rectangle rect2 = new Rectangle(100, 200, 300, 400);
        System.out.print("rect2 = ");
        rect2.println();

        System.out.println("---------- Step4 ----------");
        rect2.set(500, 900, 600, 300);
        System.out.print("rect2 = ");
        rect2.println();

        System.out.println("---------- Step5 ----------");
        System.out.println("rect1 面積 = " + rect1.getArea());
        System.out.println("rect2 面積 = " + rect2.getArea());

        System.out.println("---------- Step6 ----------");
        System.out.println("rect2.move(10, 20)");
        rect2.move(10, 20);
        System.out.print("rect2 = ");
        rect2.println();
    }
}

/*
Step1

PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> javac Ex0801Rectangle01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> java Ex0801Rectangle01      
---------- Ex0801Rectangle01 start
---------- Step1, 2 ----------
rect1 = 基準点:Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Point.print()" because "this.base" is null
        at Rectangle.print(Ex0801Rectangle01.java:18)
        at Rectangle.println(Ex0801Rectangle01.java:25)
        at Ex0801Rectangle01.main(Ex0801Rectangle01.java:46)
PS G:\マイドライブ\PG2\PGⅡsrc\Ex08>  

Step2
PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> javac Ex0801Rectangle01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> java Ex0801Rectangle01      
---------- Ex0801Rectangle01 start
---------- Step1, 2 ----------
        ----- Point(int, int)
        ----- Point()
        ----- Rectangle()
rect1 = 基準点:(100, 50) 高さ:200 幅:300

Step3

PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> javac Ex0801Rectangle01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> java Ex0801Rectangle01      
---------- Ex0801Rectangle01 start
---------- Step1, 2 ----------
        ----- Point(int, int)
        ----- Point()
        ----- Rectangle()
rect1 = 基準点:(100, 50) 高さ:200 幅:300
---------- Step3 ----------
        ----- Point(int, int)
        ----- Rectangle(x, y, height, width)
rect2 = 基準点:(100, 200) 高さ:300 幅:400
PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> 

Step4

PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> javac Ex0801Rectangle01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> java Ex0801Rectangle01      
---------- Ex0801Rectangle01 start
---------- Step1, 2 ----------
        ----- Point(int, int)
        ----- Point()
        ----- Rectangle()
rect1 = 基準点:(100, 50) 高さ:200 幅:300
---------- Step3 ----------
        ----- Point(int, int)
        ----- Rectangle(x, y, height, width)
rect2 = 基準点:(100, 200) 高さ:300 幅:400
---------- Step4 ----------
rect2 = 基準点:(500, 900) 高さ:600 幅:300
PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> 

Step5

PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> javac Ex0801Rectangle01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> java Ex0801Rectangle01      
---------- Ex0801Rectangle01 start
---------- Step1, 2 ----------
        ----- Point(int, int)
        ----- Point()
        ----- Rectangle()
rect1 = 基準点:(100, 50) 高さ:200 幅:300
---------- Step3 ----------
        ----- Point(int, int)
        ----- Rectangle(x, y, height, width)
rect2 = 基準点:(100, 200) 高さ:300 幅:400
---------- Step4 ----------
rect2 = 基準点:(500, 900) 高さ:600 幅:300
---------- Step5 ----------
rect1 面積 = 60000
rect2 面積 = 180000
PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> 

Step6

PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> javac Ex0801Rectangle01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> java Ex0801Rectangle01      
---------- Ex0801Rectangle01 start
---------- Step1, 2 ----------
        ----- Point(int, int)
        ----- Point()
        ----- Rectangle()
rect1 = 基準点:(100, 50) 高さ:200 幅:300
---------- Step3 ----------
        ----- Point(int, int)
        ----- Rectangle(x, y, height, width)
rect2 = 基準点:(100, 200) 高さ:300 幅:400
---------- Step4 ----------
rect2 = 基準点:(500, 900) 高さ:600 幅:300
---------- Step5 ----------
rect1 面積 = 60000
rect2 面積 = 180000
---------- Step6 ----------
rect2.move(10, 20)
rect2 = 基準点:(510, 920) 高さ:600 幅:300
PS G:\マイドライブ\PG2\PGⅡsrc\Ex08> 
 */
