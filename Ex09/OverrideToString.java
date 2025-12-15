/**
 * toStringメソッドのオーバーライド例
 * ObjectクラスのtoStringメソッドは"クラス名@ハッシュコード" の形式で文字列を返す
 * これをオーバーライドして便利に使う例
 */
class Student {     // 暗黙で Object クラスを継承している
    String name;

    public Student(String name) {
        this.name = name;
    }

    // toStringをオーバーライドしていない場合
    // クラス型オブジェクトを直接出力した結果は "Student@6d06d69c" のように　
    //           "クラス名@ハッシュコード" となる

    public void println() {
        System.out.println("名前:" + name); // 普通に名前を表示するメソッド
    }
}


class GoodStudent { // toStringをオーバーライドしたクラス
    String name;

    public GoodStudent(String name) {
        this.name = name;
    }

    // String型を返す　toStringをオーバーライド（便利にする）
    @Override
    public String toString() {
        return "名前: " + name;
    }

    public void println() {
        System.out.println(this); // this は this.toString() と同じ意味
    }
}


public class OverrideToString {
    public static void main(String[] args) {
        Student     s1a = new Student("Taro");          // 素直に Student 型で宣言
        GoodStudent s2a = new GoodStudent("Hana");      // 素直に GoodStudent 型で宣言

        // printlnの引数にはString型要求されるので、
        // 　　自動的に toString() が呼ばれる
        System.out.println(s1a);                   // 結果: Student@... (分かりにくい)
        System.out.println("学生情報: " + s1a);     // 結果: 学生情報: Student@... 
        System.out.println("----------------------");

        System.out.println(s2a);                   // 結果: 名前: Hana (分かりやすい！)
        System.out.println("学生情報: " + s2a);     // 結果: 学生情報: 名前: Hana (記述が簡単で便利！)
        System.out.println("----------------------");

        //  Object型で宣言した場合 （多態性の例）
        // Object s1b = new Student("Jiro");          // スーパークラスであるObject 型で宣言（多態性）
        // Object s2b = new GoodStudent("Sakura");    // スーパークラスであるObject 型で宣言（多態性）

        // System.out.println(s1b); // 結果: Student@... (分かりにくい)
        // System.out.println(s2b); // 結果: 名前: Sakura (分かりやすい！)
        // System.out.println("学生情報: " + s1b); // 結果: 学生情報: Student@... 
        // System.out.println("学生情報: " + s2b); // 結果: 学生情報: 名前: Sakura (記述が簡単で便利！)
        System.out.println("----------------------");

        // 補足: クラス内に println() メソッドが定義されている場合の呼び出し例
        s1a.println();           // 結果: 名前: Taro
        s2a.println();           // 結果: 名前: Hana 

        // s1b.println();        // エラー: Object 型には println() メソ
        // s2b.println();        // エラー: Object 型には println() メソッドは無い
    }
}
