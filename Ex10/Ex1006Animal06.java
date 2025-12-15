/**
 * クラスの汎化練習 スーパークラスとインターフェースの利用
 * 継承と実装
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/12/15
 */
// 動物インタフェース AnimalInterface
// 動物インタフェース AnimalInterface
// 動物インタフェース AnimalInterface
interface AnimalInterface {
    void cry();           // 鳴く (抽象メソッド)

    void goodAction();    // 得意な動作 (抽象メソッド)

    void selfIntroduce(); // 自己紹介 (抽象メソッド)

    // 得意な行動と鳴き声 actionCryメソッドをdefaultメソッドとして定義
    default void actionCry() {
        System.out.print("得意な行動は ");
        goodAction();
        System.out.print("、鳴き声は ");
        cry();
    }
}


// 動物クラス (単独の抽象クラスとして定義、インターフェースは実装しない)
abstract class Animal {
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

    // selfIntroduceはAnimalクラスで具象メソッドとして定義する
    public void selfIntroduce() {   // 自己紹介
        System.out.print(
                "私は " + getKind() + " の " + getName() + " " + getGenderString() + "です。");
        System.out.print("鳴き声は ");
        cry(); // 抽象メソッドを呼び出す
    }

    public abstract void cry();      // 抽象メソッドとして宣言

    public abstract void goodAction(); // 抽象メソッドとして宣言
}


//犬クラス
class Dog extends Animal implements AnimalInterface { // Animalを継承し、AnimalInterfaceを実装
    public Dog() {
        this("noname", 1);
        System.out.println("\t----- Dog()");
    }

    public Dog(String name, int gender) {
        super("犬", name, gender);
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


//猫クラス
class Cat extends Animal implements AnimalInterface { // Animalを継承し、AnimalInterfaceを実装
    public Cat() {
        this("noname", 1);
        System.out.println("\t----- Cat()");
    }

    public Cat(String name, int gender) {
        super("猫", name, gender);
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


//猿クラス
class Monkey extends Animal implements AnimalInterface { // Animalを継承し、AnimalInterfaceを実装
    public Monkey() {
        this("noname", 1);
        System.out.println("\t----- Monkey()");
    }

    public Monkey(String name, int gender) {
        super("猿", name, gender);
        System.out.println("\t----- Monkey (String name, int gender)");
    }

    @Override
    public void cry() {
        System.out.print("キーキー");
    }

    @Override
    public void goodAction() {
        System.out.print("バナナを食べる");
    }
}


public class Ex1006Animal06 {
    public static void main(String[] args) {
        AnimalInterface[] pet = { // インターフェース型の配列宣言
                new Dog(),
                new Dog("ポチ", 2),
                new Cat(),
                new Cat("タマ", 2),
                new Monkey("次郎", 1),
                new Monkey()
        };
        for (int i = 0; i < pet.length; i++) {
            System.out.println("=============== " + (i + 1) + "番目のペット ===============");
            pet[i].selfIntroduce();
            System.out.println();
            //actionCry(pet[i]); System.out.println();
            pet[i].actionCry();
            System.out.println(); // actionCry()をAnimalInterfaceのメソッドに変更
        }
    }
}

/*
Step1

PS G:\マイドライブ\PG2\PGⅡsrc\Ex10> javac Ex1006Animal06.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex10> java Ex1006Animal06      
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
        ----- Monkey (String name, int gender)
        ----- Animal(String kind, String name, int gender)
        ----- Monkey (String name, int gender)
        ----- Monkey()
=============== 1番目のペット ===============
私は 犬 の noname オスです。鳴き声は ワンワン
得意な行動は 駆け回る、鳴き声は ワンワン
=============== 2番目のペット ===============
私は 犬 の ポチ メスです。鳴き声は ワンワン
得意な行動は 駆け回る、鳴き声は ワンワン
=============== 3番目のペット ===============
私は 猫 の noname オスです。鳴き声は ニャーニャー
得意な行動は 丸くなる、鳴き声は ニャーニャー
=============== 4番目のペット ===============
私は 猫 の タマ メスです。鳴き声は ニャーニャー
得意な行動は 丸くなる、鳴き声は ニャーニャー
=============== 5番目のペット ===============
私は 猿 の 次郎 オスです。鳴き声は キーキー
得意な行動は バナナを食べる、鳴き声は キーキー
=============== 6番目のペット ===============
私は 猿 の noname オスです。鳴き声は キーキー
得意な行動は バナナを食べる、鳴き声は キーキー
PS G:\マイドライブ\PG2\PGⅡsrc\Ex10> 

Step2 

PS G:\マイドライブ\PG2\PGⅡsrc\Ex10> javac Ex1006Animal06.java
Ex1006Animal06.java:175: エラー: シンボルを見つけられません
            pet[i].actionCry();
                  ^
  シンボル:   メソッド actionCry()
  場所: クラス Animal
エラー1個
PS G:\マイドライブ\PG2\PGⅡsrc\Ex10> 
 */
