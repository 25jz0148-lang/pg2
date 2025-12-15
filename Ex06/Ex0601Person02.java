/**
 * クラスのサンプル
 * メソッドの作成 print, println, setName, setAge, set, getName, getAge
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/27
 */
class Person {  // Person　クラスの宣言
    String name;  // メンバ変数（フィールド）の宣言　名前
    int    age; // 年齢

    // -------------------------------------------メソッドの定義
    void print() {  // すべてのメンバ変数の表示（改行無し）
        System.out.print(name + " : " + age);
    }

    void println() {  // すべてのメンバ変数の表示（改行あり）
        print();  //printメソッドの呼び出し
        System.out.println();  //改行出力
    }

    String getName() { // nameのゲッター
        return name;  // メンバ変数nameを返す
    }

    int getAge() {  // ageのゲッター
        return age;  // メンバ変数ageを返す
    }

    void setName(String nameData) {  //nameのセッター
        name = nameData; // 仮引数とメンバ変数を区別するため名前を変えて指定
    }

    void setAge(int age) {  // ageのセッター
        this.age = age;   // メンバ変数と同名の仮引数を指定する場合、thisキーワードを使用
    }

    void set(String name, int age) {  //　name, ageをまとめて設定
        this.setName(name); // 他のメソッドの呼び出し this. を利用　名前を設定
        setAge(age);  // this.は省略可能　年齢を設定
    }
}


public class Ex0601Person02 {
    public static void main(String[] args) {
        Person a = new Person();  // Personオブジェクト（インスタンス）aの宣言と生成
        Person b;   // Personオブジェクト（インスタンス）bの宣言

        a.name = "tanaka"; //オブジェクトaのメンバnameへの値の設定
        a.age  = 19; //  メンバageへの値の設定
        a.print();  // オブジェクトaの内容表示（改行なし）メソッドの呼び出し
        System.out.println();  //　改行出力

        // -----　セッターを利用したメンバデータの設定
        a.setName("suzuki"); // オブジェクトaに対しセッターメソッドを利用したメンバへのデータ設定
        a.setAge(18);   // オブジェクトaに対しセッターメソッドを利用したメンバへのデータ設定
        a.println();  //オブジェクトaの内容表示(改行あり)メソッドの呼び出し

        b = new Person();  //Personオブジェクト b の生成
        b.set("aoki", 20);  //　メソッドを利用したメンバデータへの設定
        b.println();  // オブジェクトbの内容表示（改行あり）メソッドの呼び出し

        // ----- セッターを利用したメンバーデータの取出し
        System.out.println("名前 = " + a.getName() + "\t年齢 = " + a.getAge()); // ゲッターを使うこと
        System.out.println("名前 = " + b.name + "\t年齢 = " + b.age);  // メンバ名による値の取り出し

        String olderName;
        if (a.getAge() > b.getAge()) {  // ゲッターを利用した年齢の比較
            olderName = a.getName();
        }
        else {
            olderName = b.getName();
        }
        a.print();
        System.out.print(" <--> ");
        b.println();
        System.out.println(olderName + "さんの方が年上です。");
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0601Person02.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0601Person02      
tanaka : 19
suzuki : 18
aoki : 20
名前 = suzuki   年齢 = 18
名前 = aoki     年齢 = 20
suzuki : 18 <--> aoki : 20
aokiさんの方が年上です。
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06>
 */
