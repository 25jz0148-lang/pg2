/*
 * クラスの継承
 * スーパークラス A からサブクラス B を作る。
 * サブクラスはスーパークラスのメソッドも利用可能
 * ファイル名 : Ex0901Inheri01.java
 */
class A {                   // スーパークラスAの宣言
    private String name;

    public A() {
        name = "noname";
        System.out.println("\t----- A()");
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
}


class B extends A {     // クラスAを継承し、サブクラスBを作る　is-aの関係
    private int price;        // サブクラスで追加するデータ

    public B() {        // コンストラクタ name は"noname", price は 100 に設定
        super();

        price = 100; // price に 100 を設定 or setPrice(100);でも可
        System.out.println("\t----- B()");
    }

    public int getPrice() {   // サブクラスで追加するメソッド
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class Ex0901Inheri01 {
    public static void main(String[] args) {
        System.out.println("------------------------- Stpe1 A a1 = new A();");
        A a1 = new A();
        System.out.println("name : " + a1.getName());

        System.out.println("------------------------- Step2 H h1 = new H();");
        H h1 = new H();
        System.out.println("name : " + h1.getName());
        System.out.println("price : " + h1.getPrice());

        System.out.println("------------------------- Step3 h1.setName(\"melon\");");
        System.out.println("------------------------- h1.setPrice(300);");
        h1.setName("melon");
        h1.setPrice(300);
        System.out.println("name : " + h1.getName());
        System.out.println("price : " + h1.getPrice());
        // H apple = new H();
        //apple.setName("リンゴ");
        //apple.setPrice(250);
        //System.out.println("name : " + apple.getName());
        //System.out.println("price : " + apple.getPrice());

        System.out.println("------------------------- Step4 B b1 = new B();");
        B b1 = new B(); // サブクラスのインスタンス化 どのようなコンストラクタ呼出しになるでしょう
        System.out.println("name : " + b1.getName()); // サブクラスからスーパークラスメソッドの呼び出し
        System.out.println("price : " + b1.getPrice());

        System.out.println("------------------------- Step5 b1.setName(\"banana\");");
        System.out.println("------------------------- b1.setPrice(200);");
        b1.setName("banana"); // サブクラスからスーパークラスのメソッド呼出し
        b1.setPrice(200);
        System.out.println("name : " + b1.getName()); // サブクラスからスーパークラスメソッドの呼び出し
        System.out.println("price : " + b1.getPrice());
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex09> javac Ex0901Inheri01.java                                                                   
PS G:\マイドライブ\PG2\PGⅡsrc\Ex09> java Ex0901Inheri01                                                                         
------------------------- Stpe1 A a1 = new A();                                                                                 
        ----- A()                                                                                                               
name : noname
------------------------- Step2 H h1 = new H();
        ----- A()
        ----- H()
name : noname
price : 150
------------------------- Step3 h1.setName("melon");
------------------------- h1.setPrice(300);
name : melon
price : 300
------------------------- Step4 B b1 = new B();
        ----- A()
        ----- B()
name : noname
price : 100
------------------------- Step5 b1.setName("banana");
------------------------- b1.setPrice(200);
name : banana
price : 200
PS G:\マイドライブ\PG2\PGⅡsrc\Ex09> 
*/
