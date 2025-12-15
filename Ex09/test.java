class Point3D extends Point { // Point3DクラスをPointクラスのサブクラスとして定義
    private int z; //追加メンバフィールド　z座標の値

    // デフォルトコンストラクタ
    public Point3D() {
        this.z = 300;
        System.out.println("\t\t----- Point3D()");
    }

    // 引数ありコンストラクタ (+Point3D(int, int, int))
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.print("\t\t----- Point3D(int x, int y, int z)");
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


public class test {
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
    }
}
