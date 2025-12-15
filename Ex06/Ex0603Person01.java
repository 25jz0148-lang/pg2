/**
 * Stringクラスの比較メソッド動作確認
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/11/07
 */
class Person {
    private String name;  // フィールドは外部からのアクセスを禁止する指定
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
}


public class Ex0603Person01 {
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
            // ------名前チェック
            System.out.println("\t----------名前チェック(Stringクラスのメソッド理由)");
            System.out.println("\t---------- Step 1 a.getName() == \"Suzuki\"による比較");
            if (a.getName() == "Suzuki") {
                System.out.println(a.getName() + " == Suzuki");
            }
            else {
                System.out.println(a.getName() + " != Suzuki");
            }
            System.out.println("\t---------- Step 2-1 \"Suzuki\".equals(a.getName())");
            if ("Suzuki".equals(a.getName())) {
                System.out.println(a.getName() + " == Suzuki");
            }
            else {
                System.out.println(a.getName() + " != Suzuki");
            }
            System.out.println("\t---------- Step 2-2 a.getName().equals(\"Suzuki\")");
            if (a.getName().equals("Suzuki")) {
                System.out.println(a.getName() + " == Suzuki");
            }
            else {
                System.out.println(a.getName() + " != Suzuki");
            }
            System.out.println("\t---------- Step 3 a.getName().compareTo(\"Suzuki\")");
            int result = a.getName().compareTo("Suzuki");
            if (result == 0) {
                System.out.println(a.getName() + " == Suzuki");
            }
            else if (result > 0) {
                System.out.println(a.getName() + " > Suzuki");
            }
            else if (result < 0) {
                System.out.println(a.getName() + " < Suzuki");
            }
            System.out.println("\t---------- Step 4 a.getName().compareTo(b.getName())");
            result = a.getName().compareTo(b.getName());
            if (result == 0) {
                System.out.println(a.getName() + " == " + b.getName());
            }
            else if (result > 0) {
                System.out.println(a.getName() + " > " + b.getName());
            }
            else {
                System.out.println(a.getName() + " < " + b.getName());
            }
        }
        else {
            System.err.println("引数が足りません！！");
        }
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0603Person01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0603Person01      
引数が足りません！！

PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0603Person01 Suzuki 18 aoki 19
a = Suzuki : 18
b = aoki : 19
        ----------名前チェック(Stringクラスのメソッド理由)
        ---------- Step 1 a.getName() == "Suzuki"による比較
Suzuki != Suzuki
        ---------- Step 2-1 "Suzuki".equals(a.getName())
Suzuki == Suzuki
        ---------- Step 2-2 a.getName().equals("Suzuki")
Suzuki == Suzuki
        ---------- Step 3 a.getName().compareTo("Suzuki")
Suzuki == Suzuki
        ---------- Step 4 a.getName().compareTo(b.getName())
Suzuki < aoki

PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0603Person01 suzuki 18 aoki 19
a = suzuki : 18
b = aoki : 19
        ----------名前チェック(Stringクラスのメソッド理由)
        ---------- Step 1 a.getName() == "Suzuki"による比較
suzuki != Suzuki
        ---------- Step 2-1 "Suzuki".equals(a.getName())
suzuki != Suzuki
        ---------- Step 2-2 a.getName().equals("Suzuki")
suzuki != Suzuki
        ---------- Step 3 a.getName().compareTo("Suzuki")
suzuki > Suzuki
        ---------- Step 4 a.getName().compareTo(b.getName())
suzuki > aoki
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 
 */
