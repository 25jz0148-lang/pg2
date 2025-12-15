public class DebugMethodExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int result = calculateSum(a, b); // ★ここにブレークポイント

        System.out.println("合計は " + result + " です。");
    }

    public static int calculateSum(int num1, int num2) {
        System.out.println("calculateSum メソッドが呼び出されました。");
        int sum = num1 + num2;
        return sum;
    }
}
