/**
 * クラス型をメンバに持つクラス
 * has-aの関係(Student has-a Person)
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/12/11
 */
// Personクラスを定義します
class Person {
    private String name;
    private int    age;

    // デフォルトコンストラクタ
    public Person() {
        this("noname", 0);
    }

    // 引数付きコンストラクタ
    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    // セッター (setName, setAge)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // ゲッター (getName, getAge)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // printメソッド
    public void print() {
        System.out.print(name + " : " + age);
    }
}


class Student {
    private String studentNo;
    private String classCode;
    private Person person;  // StudentクラスのメンバにPersonクラス型データ

    // Step2: Studentクラスのデフォルトコンストラクタ
    public Student() {
        this.studentNo = "none";
        this.classCode = "none";
        this.person    = new Person();
    }

    // Step4: Studentクラスの引数付きコンストラクタ
    public Student(String studentNo, String classCode, String name, int age) {
        this.studentNo = studentNo;
        this.classCode = classCode;
        this.person    = new Person(name, age);
    }

    // Step3: Studentクラスのセッターメソッド set()
    public void set(String studentNo, String classCode, String name, int age) {
        this.studentNo = studentNo;
        this.classCode = classCode;
        if (this.person == null) {
            this.person = new Person();
        }
        this.person.setName(name);
        this.person.setAge(age);
    }

    // Step5: 成人判定メソッド printAdult()
    public void printAdult() {
        if (person != null) {
            System.out.println(
                    person.getName() + "さんは" + (person.getAge() >= 20 ? "成人" : "未成年") + "です。");
        }
        else {
            System.out.println("Personデータが設定がないです");
        }
    }

    // 既存のメソッド
    public void print() {
        System.out.print(studentNo + " : " + classCode + " : ");
        person.print();  // Personクラスのprintを実行
    }

    public void println() {
        print();
        System.out.println();
    }
}


public class Ex0802Student01 {
    public static void main(String[] args) {
        System.out.println("----- Ex0802Student01 Start");
        System.out.println("\n---------- Step1,2 ----------");
        Student a = new Student();
        System.out.print("a = ");
        a.println();

        System.out.println("\n---------- Step3 ----------");
        a.set("01JZ01xx", "1JZ1", "aoki", 19);
        System.out.print("a = ");
        a.println();

        System.out.println("\n---------- Step4 ----------");
        Student b = new Student("02JZ01xx", "2JZ1", "suzuki", 22);
        System.out.print("b = ");
        b.println();

        System.out.println("\n---------- Step5 ----------");
        System.out.print("a = ");
        a.printAdult();
        System.out.print("b = ");
        b.printAdult();
    }
}

