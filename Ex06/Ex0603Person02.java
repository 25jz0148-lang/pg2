/**
 * メソッドのオーバロード 年齢比較のcompメソッドと名前比較のcompメソッドを追加
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/11/10
 */
class Person {
    private String name;  // メンバ変数（フィールド）の宣言
    private int    age;

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


public class Ex0603Person02 {
    public static void main(String[] args) {
        if (args.length >= 4) {  // 引数が4つ以上でなければエラーとする
            Person a = new Person();
            Person b = new Person();

            a.set(args[0], Integer.parseInt(args[1]));  // 引数の最初の２つをaの名前と年齢に設定
            b.setName(args[2]);                         // 次の２つの引数をbの名前と
            b.setAge(Integer.parseInt(args[3]));        // 年齢として設定

            System.out.print("a = ");
            a.println();
            System.out.print("b = ");
            b.println();
            // ------年齢比較
            System.out.println("\t---------- Step 1 年齢比較 a.comp(b.getAge)");
            Person older;  // 年上の人のデータ記憶用
            // if (a.getAge() > b.getAge()) { // getAgeメソッドを使って比較
            if (a.comp(b.getAge()) > 0) {  // compメソッドを使って比較
                older = a;
            }
            else {
                older = b;
            }
            System.out.println(older.getName() + "さんのほうが年上です");
            // ------ 成人チェック
            System.out.println("\t---------- Step 2 aさんの成人チェック a.comp(20)");
            System.out.print(a.getName() + "さんは");
            if (a.comp(20) >= 0) {
                System.out.println("成人しています");
            }
            else {
                System.out.println("未成年です");
            }
            // ------ 名前チェック
            System.out.println("\t---------- Step 3 名前チェック");
            System.out.println("\t---------- Step 3-1 a.comp(\"Suzuki\")による比較");
            System.out.print(a.getName() + "は Suzuki と");
            if (a.comp("Suzuki") == 0) {
                System.out.println("等しいです");
            }
            else {
                System.out.println("等しくありません");
            }
            // ------ 名前順チェック
            System.out.println("\t---------- Step 3-2 a.comp(b.getName())による比較");
            System.out.print(a.getName() + " さんは " + b.getName());
            int result = a.comp(b.getName());
            if (result == 0) {
                System.out.println(" さんと同名です");
            }
            else if (result > 0) {
                System.out.println(" さんより名前順で後ろになります");
            }
            else {
                System.out.println(" さんより名前順で前になります");
            }
        }
        else {
            System.err.println("引数が足りません！！");
        }
    }
}
/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0603Person02.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0603Person02
引数が足りません！！
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 

PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0603Person02.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0603Person02 Suzuki 18 aoki 20
a = Suzuki : 18
b = aoki : 20
        ---------- Step 1 年齢比較 a.comp(b.getAge)
aokiさんのほうが年上です
        ---------- Step 2 aさんの成人チェック a.comp(20)
Suzukiさんは未成年です
        ---------- Step 3 名前チェック
        ---------- Step 3-1 a.comp("Suzuki")による比較
Suzukiは Suzuki と等しいです
        ---------- Step 3-2 a.comp(b.getName())による比較
Suzuki さんは aoki さんより名前順で前になります
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0603Person02 suzuki 22 aoki 20
a = suzuki : 22
b = aoki : 20
        ---------- Step 1 年齢比較 a.comp(b.getAge)
suzukiさんのほうが年上です
        ---------- Step 2 aさんの成人チェック a.comp(20)
suzukiさんは成人しています
        ---------- Step 3 名前チェック
        ---------- Step 3-1 a.comp("Suzuki")による比較
suzukiは Suzuki と等しくありません
        ---------- Step 3-2 a.comp(b.getName())による比較
suzuki さんは aoki さんより名前順で後ろになります
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 
 */
