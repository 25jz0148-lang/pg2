/**
 * Pointクラスの作成
 * moveメソッドのオーバーロード
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/27
 */
class Point {
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


public class Ex0602Point02 {
    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point();

        System.out.print("a =");
        a.print();
        System.out.println();


        System.out.print("b =");
        b.println();

        a.set(111, 222);
        System.out.print("a =");
        a.println();

        b.set(100, 200);
        System.out.print("b =");
        b.println();

        System.out.println("\t---------- Step 1 a.move(10, 20);");
        a.move(10, 20);   // xに10, yに20移動
        System.out.print("a =");
        a.println();

        System.out.println("\t---------- Step 2 a.move(b);");
        a.move(b);   // xに100, yに200移動
        System.out.print("a =");
        a.println();

        System.out.println("\t---------- Step 3 a.move(50);");
        a.move(50);   // x,yともに50移動
        System.out.print("a =");
        a.println();
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0602Point02.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0602Point02      
a =(0, 0)
b =(0, 0)
a =(111, 222)
b =(100, 200)
        ---------- Step 1 a.move(10, 20);
a =(121, 242)
        ---------- Step 2 a.move(b);
a =(221, 442)
        ---------- Step 3 a.move(50);
a =(271, 492)
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 
 */
