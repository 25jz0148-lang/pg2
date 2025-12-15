class Person {
    private String name;  // メンバ変数（フィールド）の宣言
    private int    age;

    public Person() {  //引数なしコンストラクタ
        this("[noname]", 18);//引数ありコンストラクタの呼び出し
        System.out.println("\t----- Person()");// 呼び出し確認用メッセージ
    }

    public Person(String name, int age) {// 引数ありコンストラクタ
        set(name, age); // setメソッドにより、name, age を設定
        System.out.println("\t----- Person(String name, int age)"); // 呼び出し確認用
    }

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

    public int comp(int age) { // 年齢比較用compメソッド
        return this.age - age;
    }

    public int comp(String name) {  //　名前比較用compメソッド
        return this.name.compareTo(name);
    }


    /**
     * 成人、未成年表示メソッド (インスタンスメソッドに変更)
     */
    public void printAdult() {
        if (checkAdult()) {
            System.out.println("成人");
        }
        else {
            System.out.println("未成年");
        }
    }

    /**
     * 成人判定メソッド 年齢が２０以上ならばtrue を返す (インスタンスメソッドに変更)
     * 
     * @return 成人であれば true
     */
    public boolean checkAdult() {
        return comp(20) >= 0;
    }

}

