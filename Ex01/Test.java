/*
 * 練習プログラム
 * FileName : Test.java
 * Author : yyJZ01xx Suzuki yoshinobu
 * Date : 20yy/mm/dd
 */
public class Test { // Test（メインクラス名）はファイル名と同じ名前とする事
    public static void main(String[] args) {
        System.out.println("Hello java world"); // 文字列は"で囲む
        System.out.println("Hello" + " java" + " world"); // 複数の項目を出力するときは + で連結する
        int x; 		// 変数宣言はブロックの先頭でなくても良い
        x = 100;
        int y; 		// 変数が利用されるより前に宣言されていれば良い
        y = x / 0;
        System.out.println("x = " + x + " y = " + y); // 文字列も数値も + で連続して出力できる
    }
}
