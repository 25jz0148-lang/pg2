/**
 * クラスの継承 MyTimeBaseクラスからMyTimeクラスを作成する
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/12/08
 */
class MyTimeBase {
    protected int hour; //　時 (protectedに変更)
    protected int min; //　分 (protectedに変更)
    protected int sec; // 秒 (protectedに変更)

    public MyTimeBase() {
        /*
        hour = 9;
        min = 0; 
        sec = 0;
        */
        this(9, 0, 0); // 自クラスの引数ありコンストラクタを呼び出し、9:0:0に設定
        System.out.println("\t\t----------MyTimeBase()");
    }

    public MyTimeBase(int hour, int min, int sec) {
        set(hour, min, sec); //setメソッドを呼び出すことで正しい時間に変換する
        System.out.println("\t\t----------MyTimeBase(int hour, int min, int sec)");
    }

    public void set(int hour, int min, int sec) {
        int totalSec = hour * (60 * 60) + min * 60 + sec; // 与えられた時間を総秒数に変換

        this.hour = (int) (totalSec / (60 * 60)); //総秒数から何時間になる計算
        this.min  = (int) ((totalSec % (60 * 60)) / 60); //総秒数から何分になる計算数から何分になる計算
        this.sec  = (int) (totalSec % 60); //総秒数から何秒になる計算
    }

    public void print() { // 時間を　：　で区切って表示
        System.out.print(hour + ":" + min + ":" + sec);
    }

    public void println() {
        print();
        System.out.println();
    }

    //ゲッター
    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }
}


//Step2で作成　MyTimeクラスの作成
class MyTime extends MyTimeBase {
    public MyTime() { // 10:8:42に初期化
        super(10, 8, 42);//スーパークラスの引数ありコンストラクタの呼び出し
        System.out.println("\t\t----------MyTime()");
    }

    public MyTime(int hour, int min, int sec) {
        super(hour, min, sec);  //スーパークラスの引数ありコンストラクタの呼び出し
        System.out.println("\t\t----------MyTime(int hour, int min, int sec)");
    }

    //Step3で作成　時間の加算、減算
    public void add(int hour, int min, int sec) {
        super.set(getHour() + hour, getMin() + min, getSec() + sec);
    }

    public void sub(int hour, int min, int sec) {
        super.set(getHour() - hour, getMin() - min, getSec() - sec);
    }


    //Step4で作成　MyTime型引数メソッド
    public void add(MyTime time) {
        this.add(time.getHour(), time.getMin(), time.getSec());
    }

    public void sub(MyTime time) {
        this.sub(time.getHour(), time.getMin(), time.getSec());
    }

    @Override
    public void print() {
        // System.out.printf("%02d:%02d:%02d", getHour(), getMin(), getSec());
        System.out.printf("%02d:%02d:%02d", hour, min, sec);
    }
}


public class Ex0903MyTime01 {
    public static void main(String[] args) {
        System.out.println("Step1 MyTimeBase クラス ----------");
        MyTimeBase tb1 = new MyTimeBase(); // 9:0:0として初期化
        System.out.print("MyTimeBaseの初期値は  ");
        System.out.printf("%02d:%02d:%02d", tb1.getHour(), tb1.getMin(), tb1.getSec());
        System.out.println();

        tb1.set(20, 100, 200); // 20:100:200を設定。桁上がりを正しく行い、21:43:20として設定
        System.out.print("20:100:200 は  ");
        tb1.println();

        MyTimeBase tb2 = new MyTimeBase(5, 70, 80); //桁上がりを正しく行い、06:11:20として初期化
        System.out.print("5:70:80 は  ");
        tb2.println();
        //---- Step2
        System.out.println("Step2 MyTime クラス ----------");
        MyTime t1 = new MyTime(); // 10:8:42と初期化
        System.out.print("MyTimeの初期値は  ");
        t1.print();
        System.out.println();
        MyTime t2 = new MyTime(10, 90, 80); // 10:90:80と初期化
        System.out.print("10:90:80 は  ");
        t2.println(); // 11:31:20と表示
        //----Step3
        System.out.println("Step3 add, sub メソッド ----------");
        t2.print();
        System.out.print("から 1:30:15 後の時間は ");
        t2.add(1, 30, 15);  // t2の時間を01:30:15進める
        t2.print();
        System.out.println(" です。 ");

        t2.print();
        System.out.print("の 1:30:15 前の時間は ");
        t2.sub(1, 30, 15); // t2の時間を01:30:15戻す
        t2.print();
        System.out.println(" です。 ");
        //-----Step4
        System.out.println("Step4 MyTime型引数のadd, sub メソッド ----------");
        t2.set(11, 31, 20);
        t1.set(1, 30, 15);
        t2.print();
        System.out.print("から");
        t1.print();
        System.out.print(" 後の時間は ");
        t2.add(t1); // t2 += t1 t2の時間をt1分進める 
        t2.print();
        System.out.println(" です。");

        t2.print();
        System.out.print("の ");
        t1.print();
        System.out.print(" 前の時間は ");
        t2.sub(t1); // t2 -= t1 t2の時間をt1分戻す
        t2.print();
        System.out.println(" です。 ");

        MyTime t3 = new MyTime(13, 1, 35);
        t2.print();
        System.out.print(" から");
        t3.print();
        System.out.print("までの経過時間は ");
        t3.sub(t2); // t3 -= t2 t3とt2の差を求める
        t3.print();
        System.out.println(" です。 ");

    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex09> javac Ex0903MyTime01.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex09> java Ex0903MyTime01      
Step1 MyTimeBase クラス ----------
                ----------MyTimeBase(int hour, int min, int sec)
                ----------MyTimeBase()
MyTimeBaseの初期値は  09:00:00
20:100:200 は  21:43:20
                ----------MyTimeBase(int hour, int min, int sec)
5:70:80 は  6:11:20
Step2 MyTime クラス ----------
                ----------MyTimeBase(int hour, int min, int sec)
                ----------MyTime()
MyTimeの初期値は  10:08:42
                ----------MyTimeBase(int hour, int min, int sec)
                ----------MyTime(int hour, int min, int sec)
10:90:80 は  11:31:20
Step3 add, sub メソッド ----------
11:31:20から 1:30:15 後の時間は 13:01:35 です。
13:01:35の 1:30:15 前の時間は 11:31:20 です。
Step4 MyTime型引数のadd, sub メソッド ----------
11:31:20から01:30:15 後の時間は 13:01:35 です。
13:01:35の 01:30:15 前の時間は 11:31:20 です。
                ----------MyTimeBase(int hour, int min, int sec)
                ----------MyTime(int hour, int min, int sec)
11:31:20 から13:01:35までの経過時間は 01:30:15 です。
PS G:\マイドライブ\PG2\PGⅡsrc\Ex09> 
*/
