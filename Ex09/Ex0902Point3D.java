/**
 * クラスの継承 PointクラスからPoint3Dクラスを作成する
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/12/01
 */

class Point3D extends Point { // Point3DクラスをPointクラスのサブクラスとして定義
    private int z; //追加メンバフィールド　z座標の値

    // デフォルトコンストラクタ
    public Point3D() {
        this.z = 300;
        System.out.println("\t----- Point3D()");
    }

    // 引数ありコンストラクタ (+Point3D(int, int, int))
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.println("\t----- Point3D(int x, int y, int z)");
    }

    // getZメソッド (+getz())
    public int getZ() {
        return z;
    }

    // setZメソッド (+setz(int))
    public void setZ(int z) {
        this.z = z;
    }

    // setメソッド (x, y, zすべて変更するオーバーロード) (+set(int, int, int))
    public void set(int x, int y, int z) {
        super.set(x, y);
        this.z = z;
    }

    // printDataメソッドのオーバーライド (+PrintData())
    @Override
    public void printData() {
        super.printData();
        System.out.print(", " + z);
    }

}



public class Ex0902Point3D {
    public static void main(String[] args) {
        System.out.println("\t===== Step 0");
        Point a = new Point();
        a.printData();
        System.out.println();
        // ---- Step1
        System.out.println("\t===== Step 1(デフォルトコンストラクタ、printDataメソッド)");
        Point3D b = new Point3D();
        b.printData();
        System.out.println();
        // ---- Step2
        System.out.println("\t===== Step 2(引数ありコンストラクタ、printメソッド)");
        Point3D c = new Point3D(400, 500, 600);
        c.print();
        System.out.println();
        // ---- Step3
        System.out.println("\t===== Step 3(setメソッドxとyの値だけ変更 printlnメソッド)");
        c.set(111, 222);
        c.println();
        // ---- Step4
        System.out.println("\t===== Step 4(setメソッドx, y, zすべて変更)");
        c.set(10, 20, 30);
        c.println();
    }
}
/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex09> javac Ex0902Point3D.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex09> java Ex0902Point3D       
        ===== Step 0
        ----- Point(int x, int y)
        ----- Point()
100, 50
        ===== Step 1(デフォルトコンストラクタ、printDataメソッド)
        ----- Point(int x, int y)
        ----- Point()
        ----- Point3D()
100, 50, 300
        ===== Step 2(引数ありコンストラクタ、printメソッド)
        ----- Point(int x, int y)
        ----- Point3D(int x, int y, int z)
(400, 500, 600)
        ===== Step 3(setメソッドxとyの値だけ変更 printlnメソッド)
(111, 222, 600)
        ===== Step 4(setメソッドx, y, zすべて変更)
(10, 20, 30)
PS G:\マイドライブ\PG2\PGⅡsrc\Ex09> 
 */

