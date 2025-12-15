/**
 * Personクラス クラス型の配列の利用方法
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/11/17
 */
class Person {
    private String name;  // メンバ変数（フィールド）の宣言
    private int    age;

    public Person() {  //引数なしコンストラクタ
        this("[noname]", 18);//引数ありコンストラクタの呼び出し
        System.out.println("\t----- Person()");// 呼び出し確認用メッセージ
    }

    public Person(String name, int age) {// 引数ありコンストラクタ
        set(name, age); // setメソッドにより、name, age を設定
        System.out.println("\t----- Person(String name, int age)"); // 呼び出し確認用
    }

    //　メソッドは外部からのアクセス可能な指定
    public void print() {  // すべてのメンバ変数の表示（改行無し）
        System.out.print(name + " : " + age);
    }

    public void println() {  // すべてのメンバ変数の表示（改行あり）
        print();  //printメソッドの呼び出し
        System.out.println();  //改行出力
    }

    public String getName() { // nameのゲッター
        return name;  // メンバ変数nameを返す
    }

    public int getAge() {  // ageのゲッター
        return age;  // メンバ変数ageを返す
    }

    public void setName(String nameData) {  //nameのセッター
        name = nameData; // 仮引数とメンバ変数を区別するため名前を変えて指定
    }

    public void setAge(int age) {  // ageのセッター
        this.age = age;   // メンバ変数と同名の仮引数を指定する場合、thisキーワードを使用
    }

    public void set(String name, int age) {  //　name, ageをまとめて設定
        this.setName(name); // 他のメソッドの呼び出し this. を利用　名前を設定
        setAge(age);  // this.は省略可能　年齢を設定
    }

    public int comp(int age) { // 年齢比較用compメソッド
        return this.age - age;
    }

    public int comp(String name) {  //　名前比較用compメソッド
        return this.name.compareTo(name);
    }


    /**
     * 成人、未成年表示メソッド (インスタンスメソッドに変更)
     */
    public void printAdult() {
        if (checkAdult()) {
            System.out.println("成人");
        }
        else {
            System.out.println("未成年");
        }
    }

    /**
     * 成人判定メソッド 年齢が２０以上ならばtrue を返す (インスタンスメソッドに変更)
     * 
     * @return 成人であれば true
     */
    public boolean checkAdult() {
        return comp(20) >= 0;
    }

}


public class Ex0606PersonArray01 {
    public static void main(String[] args) {
        System.out.println("-------------------------------- 配列宣言１");
        Person[] a;  // １．Person クラス配列 a の宣言

        a = new Person[3]; // a配列の領域　要素数[3]として確保
        // a[0]-a[2]の領域確保　引数無しコンストラクタにより初期化
        for (int i = 0; i < a.length; i++) {
            a[i] = new Person();
        }

        a[0].set("suzuki", 18); // 配列へのデータ設定
        a[1].set("aoki", 20);
        a[2].set("abe", 19);

        printAll(a);

        System.out.println("-------------------------------- 配列宣言２");
        Person[] b = new Person[3]; //２．Personクラス配列 b の宣言
        // b[0]-b[2]の領域確保と同時にデータ設定
        b[0] = new Person("Suzuki", 18); // 引数ありコンストラクタにより初期化
        b[1] = new Person("Aoki", 20);
        b[2] = new Person("Abe", 19);

        printAll(b);

        System.out.println("-------------------------------- 配列宣言３");
        Person[] c = {  // 引数ありコンストラクタにより初期化
                new Person("SUZUKI", 18),   //　引数ありコンストラクタにより初期化
                new Person("AOKI", 20),
                new Person("ABE", 19),
        };
        printAll(c);

        System.out.println("-------------------------------- 成人・未成年確認表示");
        printAdult(c);
    }

    // 配列データ表示メソッド
    public static void printAll(Person[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i].println();  // Personクラスのprintlnメソッド呼び出し
        }
    }

    // 成人、未成年チェックメソッド
    public static void printAdult(Person[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i].print();
            System.out.print(" : ");
            a[i].printAdult();
        }
    }
}

/*
step1

PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0606PersonArray01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0606PersonArray01      
-------------------------------- 配列宣言１
        ----- Person(String name, int age)
        ----- Person()
        ----- Person(String name, int age)
        ----- Person()
        ----- Person(String name, int age)
        ----- Person()
suzuki : 18
aoki : 20
abe : 19
-------------------------------- 配列宣言２
        ----- Person(String name, int age)
        ----- Person(String name, int age)
        ----- Person(String name, int age)
Suzuki : 18
Aoki : 20
Abe : 19
-------------------------------- 配列宣言３
        ----- Person(String name, int age)
        ----- Person(String name, int age)
        ----- Person(String name, int age)
SUZUKI : 18
AOKI : 20
ABE : 19
-------------------------------- 成人・未成年確認表示
SUZUKI : 18 : 未成年
AOKI : 20 : 成人
ABE : 19 : 未成年
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 

step2
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0606PersonArray01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0606PersonArray01      
-------------------------------- 配列宣言１
        ----- Person(String name, int age)
        ----- Person()
        ----- Person(String name, int age)
        ----- Person()
        ----- Person(String name, int age)
        ----- Person()
suzuki : 18
aoki : 20
abe : 19
-------------------------------- 配列宣言２
        ----- Person(String name, int age)
        ----- Person(String name, int age)
        ----- Person(String name, int age)
suzuki : 18
aoki : 20
abe : 19
-------------------------------- 配列宣言３
        ----- Person(String name, int age)
        ----- Person(String name, int age)
        ----- Person(String name, int age)
suzuki : 18
aoki : 20
abe : 19
-------------------------------- 成人・未成年確認表示
suzuki : 18 : 未成年
aoki : 20 : 成人
abe : 19 : 未成年
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06>

step3
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0606PersonArray01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0606PersonArray01      
-------------------------------- 配列宣言１
        ----- Person(String name, int age)
        ----- Person()
        ----- Person(String name, int age)
        ----- Person()
        ----- Person(String name, int age)
        ----- Person()
suzuki : 18
aoki : 20
abe : 19
-------------------------------- 配列宣言２
        ----- Person(String name, int age)
        ----- Person(String name, int age)
        ----- Person(String name, int age)
Suzuki : 18
Aoki : 20
Abe : 19
-------------------------------- 配列宣言３
        ----- Person(String name, int age)
        ----- Person(String name, int age)
        ----- Person(String name, int age)
SUZUKI : 18
AOKI : 20
ABE : 19
-------------------------------- 成人・未成年確認表示
SUZUKI : 18 : 未成年
AOKI : 20 : 成人
ABE : 19 : 未成年
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 
*/
