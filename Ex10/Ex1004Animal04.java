/**
 * アップキャストの活用２
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


//　猿(Monkey)　クラスの追加
class Monkey extends Animal {
    public Monkey() {
        this("noname", 1);
        System.out.println("\t----- Monkey()");
    }

    public Monkey(String name, int gender) {
        super("猿", name, gender); // スーパークラスのコンストラクタ呼び出し　種類：猿
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


public class Ex1004Animal04 {
    public static void main(String[] args) {
        Animal[] pets = { // Dog, Cat, Monkey型のインスタンスを保持する配列
                new Dog(),
                new Dog("ポチ", 2),
                new Cat(),
                new Cat("タマ", 2),
                new Monkey("次郎", 1), // 猿(Monkey型)　データ
                new Monkey()
        };
        for (int i = 0; i < pets.length; i++) {
            System.out.println("=============== " + (i + 1) + "番目のペット ===============");
            pets[i].selfIntroduce();
            System.out.println(); // 自己紹介　selfIntroduceメソッドの実行
            actionCry(pets[i]);
            System.out.println();
        }
    }

    public static void actionCry(Animal pet) { // Dog型もCat型もMonkey型も受け取れるようにする
        System.out.print("得意な行動は ");
        pet.goodAction();
        System.out.print("");
        pet.cry();

    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex10> javac Ex1004Animal04.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex10> java Ex1004Animal04      
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
得意な行動は 駆け回るワンワン
=============== 2番目のペット ===============
私は 犬 の ポチ メスです。鳴き声は ワンワン
得意な行動は 駆け回るワンワン
=============== 3番目のペット ===============
私は 猫 の noname オスです。鳴き声は ニャーニャー
得意な行動は 丸くなるニャーニャー
=============== 4番目のペット ===============
私は 猫 の タマ メスです。鳴き声は ニャーニャー
得意な行動は 丸くなるニャーニャー
=============== 5番目のペット ===============
私は 猿 の 次郎 オスです。鳴き声は キーキー
得意な行動は バナナを食べるキーキー
=============== 6番目のペット ===============
私は 猿 の noname オスです。鳴き声は キーキー
得意な行動は バナナを食べるキーキー
PS G:\マイドライブ\PG2\PGⅡsrc\Ex10> 
 */
