public class DebugLoopExample {
    public static void main(String[] args) {
        int[] scores = { 80, 95, 72, 68, 88 };
        int sum = 0;
        double average = 0.0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            System.out.println((i + 1) + "番目の点数を加算: " + scores[i]);
        }

        average = (double) sum / scores.length;

        System.out.println("合計点: " + sum);
        System.out.println("平均点: " + average);
    }
}
