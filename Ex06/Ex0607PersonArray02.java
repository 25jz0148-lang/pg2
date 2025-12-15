/**
 * 実行時引数としてなめと年齢を必要人数分渡す
 * 人数分の配列を確保し、成人・未成年の確認表示を行う
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


public class Ex0607PersonArray02 {
    public static void main(String[] args) {
        if (args.length >= 2) {
            Person[] a = new Person[args.length / 2]; // 引数1/2個分の配列領域を確保
            System.out.println("人数 = " + a.length);
            int i = 0;
            for (int j = 0; j < a.length; j++) {
                // 引数ありコンストラクタを使った初期化に変更
                a[j] = new Person(args[i], Integer.parseInt(args[i + 1]));

                i += 2; // iの値を変化させる
            }
            printAdultAll(a);
        }
        else {
            System.out.println("引数が足りません\n");
        }
    }

    // 配列データ表示メソッド
    public static void printAll(Person[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i].println();
        }
    }

    // 成人、未成年チェックメソッド
    public static void printAdultAll(Person[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i].print();
            System.out.print(" : ");
            a[i].printAdult(); // "成人"か"未成年"かを表示
        }
    }
}

/*
step1

PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0607PersonArray02.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0607PersonArray02 suzuki 19 aoki 20 abe 33
人数 = 3
        ----- Person(String name, int age)
        ----- Person()
        ----- Person(String name, int age)
        ----- Person()
        ----- Person(String name, int age)
        ----- Person()
suzuki : 19 : 未成年
aoki : 20 : 成人
abe : 33 : 成人
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 

PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0607PersonArray02 suzuki                  
引数が足りません

PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 

PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0607PersonArray02 suzuki 19 aoki 20 abe
人数 = 2
        ----- Person(String name, int age)
        ----- Person()
        ----- Person(String name, int age)
        ----- Person()
suzuki : 19 : 未成年
aoki : 20 : 成人
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 

step2

PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0607PersonArray02.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0607PersonArray02 suzuki 19 aoki 20 abe 33
人数 = 3
        ----- Person(String name, int age)
        ----- Person(String name, int age)
        ----- Person(String name, int age)
suzuki : 19 : 未成年
aoki : 20 : 成人
abe : 33 : 成人
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 

PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0607PersonArray02 suzuki
引数が足りません

PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 

PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0607PersonArray02 suzuki 19 aoki 20 abe
人数 = 2
        ----- Person(String name, int age)
        ----- Person(String name, int age)
suzuki : 19 : 未成年
aoki : 20 : 成人
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 
 */
