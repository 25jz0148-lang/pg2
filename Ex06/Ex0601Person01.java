/**
 * クラスのサンプル
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/26
 */
class Person {  // Personクラスの宣言
    String name;  // メンバ変数(フィールド)の宣言
    int    age;
}


public class Ex0601Person01 {
    public static void main(String[] args) {
        Person a;   // Person変数a の宣言

        a      = new Person();      //　Personオブジェクトの生成
        a.name = "suzuki"; // オブジェクトaのメンバ変数nameへの値の設定
        a.age  = 18; //　メンバ変数ageへの値の設定

        Person b = new Person();  // Personオブジェクト(インスタンス)bの宣言と生成
        b.name = "aoki";  // オブジェクトbのメンバ変数nameへの値の設定
        b.age  = 20;      // メンバ変数ageへの値の設定

        System.out.print(a.name + " : " + a.age);  //aオブジェクトの内容表示　suzuki : 18
        System.out.println();

        System.out.print(b.name + " : " + b.age);  //aオブジェクトの内容表示　aoki : 20
        System.out.println();
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> javac Ex0601Person01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> java Ex0601Person01       
suzuki : 18
aoki : 20
PS G:\マイドライブ\PG2\PGⅡsrc\Ex06> 
 */
