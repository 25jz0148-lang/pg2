/**
 * クラスのサンプル カプセル化の実現
 * 可視性（アクセス修飾子）の設定
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/27
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


public class Ex0601Person03 {
    public static void main(String[] args) {
        Person a = new Person();
        Person b;

        a.setName("tanaka");
        a.setAge(19);
        a.print();  // オブジェクトaの内容表示（改行なし）メソッドの呼び出し
        System.out.println();  //　改行出力

        // -----　セッターを利用したメンバデータの設定
        a.setName("suzuki"); // オブジェクトaに対しセッターメソッドを利用したメンバへのデータ設定
        a.setAge(18);   // オブジェクトaに対しセッターメソッドを利用したメンバへのデータ設定
        a.println();  //オブジェクトaの内容表示(改行あり)メソッドの呼び出し

        b = new Person();  //Personオブジェクト b の生成
        b.set("aoki", 20);  //　メソッドを利用したメンバデータへの設定
        b.println();  // オブジェクトbの内容表示（改行あり）メソッドの呼び出し

        // ----- ゲッターを利用したメンバーデータの取出し
        System.out.println("名前 = " + a.getName() + "\t年齢 = " + a.getAge()); // ゲッターを使うこと
        System.out.println("名前 = " + b.getName() + "\t年齢 = " + b.getAge()); // ゲッターを使うこと

        String olderName;
        if (a.getAge() > b.getAge()) {  // ゲッターを利用した年齢の比較
            olderName = a.getName();
        }
        else {
            olderName = b.getName();
        }
        a.print();   // オブジェクトaの内容表示（改行なし）メソッドの呼び出し
        System.out.print(" <--> ");
        b.println();
        System.out.println(olderName + "さんの方が年上です。");
    }
}


/*
Step 1  
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0601Person03.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0601Person03      
null : 0
suzuki : 18
aoki : 20
名前 = suzuki   年齢 = 18
suzuki : 18 <--> aoki : 20
aokiさんの方が年上です。
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 

Step 2
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0601Person03.java
Ex0601Person03.java:51: エラー: nameはPersonでprivateアクセスされます
        a.name = "tanaka"; //オブジェクトaのメンバnameへの値の設定
         ^
Ex0601Person03.java:52: エラー: ageはPersonでprivateアクセスされます
        a.age  = 19; //  メンバageへの値の設定
         ^
Ex0601Person03.java:67: エラー: nameはPersonでprivateアクセスされます
        System.out.println("名前 = " + b.name + "\t年齢 = " + b.age);  // メンバ名による値の取り出し（privateなた めコンパイルエラーになる）
                                      ^
Ex0601Person03.java:67: エラー: ageはPersonでprivateアクセスされます
        System.out.println("名前 = " + b.name + "\t年齢 = " + b.age);  // メンバ名による値の取り出し（privateなた めコンパイルエラーになる）
                                                           ^
エラー4個
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06>    

エラー理由：　privateで保護しているのに、カプセル化の原則に反して、privateのフィールドに外部から直接アクセスしよう
としたためコンパイルエラーが発生した

Step 3
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0601Person03.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0601Person03      
tanaka : 19
suzuki : 18
aoki : 20
名前 = suzuki   年齢 = 18
名前 = aoki     年齢 = 20
suzuki : 18 <--> aoki : 20
aokiさんの方が年上です。
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 
 */
