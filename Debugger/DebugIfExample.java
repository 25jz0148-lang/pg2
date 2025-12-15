public class DebugIfExample {
    public static void main(String[] args) {
        int    age  = 20;
        String name = "Taro";

        System.out.println("プログラムを開始します。");

        if (age >= 20) { // ★ここにブレークポイント
            System.out.println(name + "さんは成人です。");
        }
        else {
            System.out.println(name + "さんは未成年です。");
        }

        System.out.println("プログラムを終了します。");
    }
}
