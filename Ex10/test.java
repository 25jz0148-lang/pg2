class Animal { //Animal(動物)クラス
    private String kind; // 種別
    private String name; // 名前
    private int    gender; // 性別

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

    public void cry() {
        System.out.print("シクシク");
    }

    public void goodAction() {
        System.out.print("寝る");
    }
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


public class test {
    public static void main(String[] args) {
        System.out.println("\t==========1匹目の犬===========");
        Dog d1 = new Dog();    // １匹目の犬
        d1.cry();               // 鳴く
        System.out.println();
        d1.selfIntroduce();         // 自己紹介(種類、名前、性別、鳴き声）
        System.out.println();

        d1.setName("タロー");   // 名前を付ける
        d1.selfIntroduce();         // 自己紹介
        System.out.println();

        System.out.println("\t==========2匹目の犬===========");
        Dog d2 = new Dog("ポチ", 2);   // ２匹目の犬
        d2.selfIntroduce();         // 自己紹介
        System.out.println();
        System.out.print("得意な行動は ");
        d2.goodAction();
        System.out.println();

        System.out.println("\t==========1匹目の猫===========");
        Cat c1 = new Cat();     // １匹目の猫
        c1.cry();               // 鳴く
        System.out.println();
        c1.selfIntroduce();         // 自己紹介
        System.out.println();

        System.out.println("\t==========2匹目の猫===========");
        Cat c2 = new Cat("タマ", 2);    // 2匹目の猫
        c2.cry();               // 鳴く
        System.out.println();
        c2.selfIntroduce();         // 自己紹介
        System.out.println();
        System.out.print("得意な行動は ");
        c2.goodAction();
        System.out.println();
    }
}
