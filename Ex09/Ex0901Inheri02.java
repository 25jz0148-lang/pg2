/**
 * クラスの継承 subクラスでSuperクラスのメソッドを明示的に呼び出す)
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/12/01
 */
class A {                   // スーパークラスAの宣言
    private String name;

    public A() {
        this("noname"); //nameに"noname"を設定　引数ありコンストラクタ呼び出しに変更
        System.out.println("\t----- A()");
    }

    // 引数ありコンストラクタを呼び出すように変更しなさい
    public A(String name) { // 引数ありコンストラクタ
        this.name = name;
        System.out.println("\t----- A(String name)");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.print(getName());
    }
}


class H {         // クラスAをメンバに持つクラスHを作る  has-aの関係
    private A   a;          // クラスA型のメンバを宣言
    private int price;

    public H() {
        a = new A();             // メンバクラスの生成
        setPrice(150);    // メンバデータの初期値設定
        System.out.println("\t----- H()");
    }

    H(String name, int price) { // 引数ありコンストラクタ
        a = new A(name);
        setPrice(price);
        System.out.println("\t----- H(String name, int price)");
    }

    public String getName() {
        return a.getName();     // メンバデータ a からクラス A のメソッドの呼び出し
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        a.setName(name);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print() {  // メンバデータ表示メソッド
        a.print();
        System.out.print(" ￥" + getPrice());
    }
}


class B extends A {     // クラスAを継承し、サブクラスBを作る　is-aの関係
    private int price;        // サブクラスで追加するデータ

    public B() {        // コンストラクタ name は"noname", price は 100 に設定
        super();

        price = 100; // price に 100 を設定 or setPrice(100);でも可
        System.out.println("\t----- B()");
    }

    public B(String name, int price) { // 引数ありコンストラクタ
        // setName(name); // スーパークラスのメソッド呼び出し。Step2では直接スーパークラスの引数ありコンストラクタを呼び出すように変更しなさい。
        super(name);

        setPrice(price);
        System.out.println("\t----- B(String name, int price)");
    }

    public int getPrice() {   // サブクラスで追加するメソッド
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print() { // サブクラスでスーパークラスと同名のメソッドを定義（オーバーライド）
        super.print();
        System.out.print(" ￥" + getPrice()); // サブクラスで機能を追加（差分プログラミング)
    }
}


public class Ex0901Inheri02 {
    public static void main(String[] args) {
        System.out.println("------------------------- Step1 A a1 = new A();");
        A a1 = new A();
        System.out.println("-------------------------       a1.print();");
        a1.print(); // printメソッドの実行
        System.out.println();

        System.out.println("------------------------- Step2 A a2 = new A(\"apple\");");
        A a2 = new A("apple"); // 引数ありコンストラクタによるインスタンス化
        System.out.println("-------------------------       a2.print();");
        a2.print(); // printメソッドの実行
        System.out.println();

        System.out.println("------------------------- Step3 H h1 = new H();");
        H h1 = new H();
        System.out.println("-------------------------       h1.print();");
        h1.print(); // printメソッドの実行
        System.out.println();
        System.out.println("------------------------- Step4 h1.setName(\"melon\");");
        System.out.println("-------------------------       h1.setPrice(300);");
        System.out.println("-------------------------       h1.print();");
        h1.setName("melon");
        h1.setPrice(300);
        h1.print(); // printメソッドの実行
        System.out.println();

        System.out.println("------------------------- Step5 h1.setName(\"grape\", 250);");
        H h2 = new H("grape", 250); // 引数ありコンストラクタによるインスタンス化
        System.out.println("-------------------------       h2.print();");
        h2.print(); // printメソッドの実行
        System.out.println();

        System.out.println("------------------------- Step6 B b1 = new B();");
        B b1 = new B();
        System.out.println("-------------------------       b1.print();");
        b1.print(); // サブクラスのprintメソッドの実行
        System.out.println();

        System.out.println("------------------------- Step7 B b2 = new B(\"banana\", 200);");
        B b2 = new B("banana", 200);  //引数ありコンストラクタによるインスタンス化
        System.out.println("-------------------------       b2.print();");
        b2.print(); // サブクラスのprintメソッドの実行
        System.out.println();
    }
}
/*
Step1
PS G:\マイドライブ\PG2\PGⅡsrc\Ex09> javac Ex0901Inheri02.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex09> java Ex0901Inheri02      
------------------------- Step1 A a1 = new A();
        ----- A(String name)
        ----- A()
-------------------------       a1.print();
noname
------------------------- Step2 A a2 = new A("apple");
        ----- A(String name)
-------------------------       a2.print();
apple
------------------------- Step3 H h1 = new H();
        ----- A(String name)
        ----- A()
        ----- H()
-------------------------       h1.print();
noname ￥150
------------------------- Step4 h1.setName("melon");
-------------------------       h1.setPrice(300);
-------------------------       h1.print();
melon ￥300
------------------------- Step5 h1.setName("grape", 250);
        ----- A(String name)
        ----- H(String name, int price)
-------------------------       h2.print();
grape ￥250
------------------------- Step6 B b1 = new B();
        ----- A(String name)
        ----- A()
        ----- B()
-------------------------       b1.print();
noname ￥100
------------------------- Step7 B b2 = new B("banana", 200);
        ----- A(String name)
        ----- A()
        ----- B(String name, int price)
-------------------------       b2.print();
banana ￥200
PS G:\マイドライブ\PG2\PGⅡsrc\Ex09>

Step2

PS G:\マイドライブ\PG2\PGⅡsrc\Ex09> javac Ex0901Inheri02.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex09> java Ex0901Inheri02
------------------------- Step1 A a1 = new A();
        ----- A(String name)
        ----- A()
-------------------------       a1.print();
noname
------------------------- Step2 A a2 = new A("apple");
        ----- A(String name)
-------------------------       a2.print();
apple
------------------------- Step3 H h1 = new H();
        ----- A(String name)
        ----- A()
        ----- H()
-------------------------       h1.print();
noname ￥150
------------------------- Step4 h1.setName("melon");
-------------------------       h1.setPrice(300);
-------------------------       h1.print();
melon ￥300
------------------------- Step5 h1.setName("grape", 250);
        ----- A(String name)
        ----- H(String name, int price)
-------------------------       h2.print();
grape ￥250
------------------------- Step6 B b1 = new B();
        ----- A(String name)
        ----- A()
        ----- B()
-------------------------       b1.print();
noname ￥100
------------------------- Step7 B b2 = new B("banana", 200);
        ----- A(String name)
        ----- B(String name, int price)
-------------------------       b2.print();
banana ￥200
PS G:\マイドライブ\PG2\PGⅡsrc\Ex09> 
*/
