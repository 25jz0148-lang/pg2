/**
 * アップキャストの活用
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/12/15
 */
abstract class Animal {  // 抽象クラス
    private String kind;   // 種別
    private String name;   // 名前
    private int    gender;    // 性別

    public Animal() {
        this("none", "noname", 1);
        System.out.println("\t----- Animal()");
    }

    public Animal(String kind, String name, int gender) {
        setKind(kind);
        setName(name);
        setGender(gender);
        System.out.println("\t----- Animal(String kind, String name, int gender)");
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public String getGenderString() {
        return gender == 1 ? "オス" : "メス";
    }

    public void selfIntroduce() {   // 自己紹介
        System.out.print("私は " + getKind() + " の " + getName() + " " + getGenderString() + "です。");
        System.out.print("鳴き声は ");
        cry();
    }

    public abstract void cry();

    public abstract void goodAction();
}


class Dog extends Animal { //Dog(犬)クラス
    public Dog() {
        this("noname", 1); //引数付きコンストラクタの呼び出し名前："noname"性別：オス
        System.out.println("\t----- Dog()");
    }

    public Dog(String name, int gender) {
        super("犬", name, gender); // スーパークラスのコンストラクタ呼び出し　種類：犬
        System.out.println("\t----- Dog (String name, int gender)");
    }

    @Override
    public void cry() {
        System.out.print("ワンワン");
    }

    @Override
    public void goodAction() {
        System.out.print("駆け回る");
    }
}



class Cat extends Animal { // Cat(猫)クラス 
    public Cat() {
        this("noname", 1); //引数付きコンストラクタの呼び出し名前："noname"性別：オス
        System.out.println("\t----- Cat()");
    }

    public Cat(String name, int gender) {
        super("猫", name, gender); // スーパークラスのコンストラクタ呼び出し　種類：猫
        System.out.println("\t----- Cat (String name, int gender)");
    }

    @Override
    public void cry() {
        System.out.print("ニャーニャー");
    }

    @Override
    public void goodAction() {
        System.out.print("丸くなる");
    }
}


public class Ex1003Animal03 {
    public static void main(String[] args) {
        // ----- Step1
        Dog d1 = new Dog();                      // 1匹目の犬
        Dog d2 = new Dog("ポチ", 2);// 2匹目の犬
        // Dog    d3 = new Cat();                      // 3匹目の犬
        Cat c1 = new Cat();                      // 1匹目の猫
        Cat c2 = new Cat("タマ", 2);// 2匹目の猫
        // Cat    c3 = new Dog();                      // 3匹目の猫
        Animal a1 = new Dog();                      // 4匹目の犬 アップキャスト
        Animal a2 = new Cat();                      // 4匹目の猫 アップキャスト
        // ----- Step2
        System.out.println("\t==========１匹目のペット==========");
        d1.selfIntroduce();
        System.out.println();
        System.out.println("\t==========２匹目のペット==========");
        d2.selfIntroduce();
        System.out.println();
        System.out.println("\t==========３匹目のペット==========");
        c1.selfIntroduce();
        System.out.println();
        System.out.println("\t==========４匹目のペット==========");
        c2.selfIntroduce();
        System.out.println();
        System.out.println("\t==========５匹目のペット==========");
        a1.selfIntroduce();
        System.out.println();  // Animal型からselfIntroduceメソッドの呼び出し
        System.out.println("\t==========６匹目のペット==========");
        a2.selfIntroduce();
        System.out.println();  // Animal型からselfIntroduceメソッドの呼び出し
    }
}

/*
Step1

PS G:\マイドライブ\PG2\PGⅡsrc\Ex10> javac Ex1002Animal02.java
Ex1002Animal02.java:91: エラー: Catはabstractでなく、Animal内のabstractメソッドgoodAction()をオーバーライドしません
class Cat extends Animal { // Cat(猫)クラス 
^
エラー1個
PS G:\マイドライブ\PG2\PGⅡsrc\Ex10> javac Ex1003Animal03.java              
Ex1003Animal03.java:116: エラー: 不適合な型: CatをDogに変換できません:
        Dog    d3 = new Cat();                      // 3匹目の犬
                    ^
Ex1003Animal03.java:119: エラー: 不適合な型: DogをCatに変換できません:
        Cat    c3 = new Dog();                      // 3匹目の猫
                    ^
エラー2個
PS G:\マイドライブ\PG2\PGⅡsrc\Ex10> 

Step2 
PS G:\マイドライブ\PG2\PGⅡsrc\Ex10> javac Ex1003Animal03.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex10> java Ex1003Animal03      
        ----- Animal(String kind, String name, int gender)
        ----- Dog (String name, int gender)
        ----- Dog()
        ----- Animal(String kind, String name, int gender)
        ----- Dog (String name, int gender)
        ----- Animal(String kind, String name, int gender)
        ----- Cat (String name, int gender)
        ----- Cat()
        ----- Animal(String kind, String name, int gender)
        ----- Cat (String name, int gender)
        ----- Animal(String kind, String name, int gender)
        ----- Dog (String name, int gender)
        ----- Dog()
        ----- Animal(String kind, String name, int gender)
        ----- Cat (String name, int gender)
        ----- Cat()
        ==========１匹目のペット==========
私は 犬 の noname オスです。鳴き声は ワンワン
        ==========２匹目のペット==========
私は 犬 の ポチ メスです。鳴き声は ワンワン
        ==========３匹目のペット==========
私は 猫 の noname オスです。鳴き声は ニャーニャー
        ==========４匹目のペット==========
私は 猫 の タマ メスです。鳴き声は ニャーニャー
        ==========５匹目のペット==========
私は 犬 の noname オスです。鳴き声は ワンワン
        ==========６匹目のペット==========
私は 猫 の noname オスです。鳴き声は ニャーニャー
PS G:\マイドライブ\PG2\PGⅡsrc\Ex10> 
*/
