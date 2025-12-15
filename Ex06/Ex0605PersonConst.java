/**
 * Personクラス コンストラクタ
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
}


public class Ex0605PersonConst {
    public static void main(String[] args) {
        Person a = new Person(); // 引数なしコンストラクタによる初期化

        System.out.print("a = ");
        a.println();

        Person b = new Person("aoki", 20); // 引数ありコンストラクタによる初期化

        System.out.print("b = ");
        b.println();
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0605PersonConst.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0605PersonConst
        ----- Person(String name, int age)
        ----- Person()
a = [noname] : 18
        ----- Person(String name, int age)
b = aoki : 20
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 

エラー確認 
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0605PersonConst.java
Ex0605PersonConst.java:64: エラー: クラス Personのコンストラクタ Personは指定された型に適用できません。
        Person a = new Person(); // 引数なしコンストラクタによる初期化
                   ^
  期待値: String,int
  検出値:    引数がありません
  理由: 実引数リストと仮引数リストの長さが異なります
エラー1個
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 
 */
