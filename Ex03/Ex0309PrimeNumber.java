/**
 * 2-200の素数を表示(break文とcontinue文を使った処理)
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/06
 */
public class Ex0309PrimeNumber {
    public static void main(String[] args) {
        final int START = 2; // 素数かどうかを調べる最初の値　定数化
        final int END   = 200; //
        int       cnt   = 0; // 素数の数を数えるカウンタ

        for (int i = START; i < END; i++) {
            int j;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {  //　自分自身以外の値で割り切れてしまうか？
                    break;         //　　割り切れてしまったら、内側のループを抜ける
                }
            }
            if (j == i) {   //　内側のループが最後まで回っていたら(途中脱出がなかったら)
                System.out.print(i + "\t"); //　素数を表示
                if (++cnt % 10 == 0) {      // 素数を10個出力したら改行
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("cnt = " + cnt);
        System.out.println("----------");
        //素数を求める　その２
        cnt = 0;
        loop1:   //　ラベル
        for (int i = START; i < END; i++) { //　素数かどうか調べる値のループ
            loop2: // ラベル
            for (int j = 2; j < i; j++) { //　割る数のループ
                if (i % j == 0) {         // 自分自身以外の値で割り切れてしまうかどうか？
                    continue loop1;             //　割り切れてしまったら、外側のループに制御を移す
                }
            }
            System.out.print(i + "\t");   //　素数を表示
            if (++cnt % 10 == 0) {        // 素数を１０個出力したら改行
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("cnt = " + cnt);
        System.out.println("----------");
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> javac Ex0309PrimeNumber.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0309PrimeNumber      
2       3       5       7       11      13      17      19      23      29
31      37      41      43      47      53      59      61      67      71
73      79      83      89      97      101     103     107     109     113
127     131     137     139     149     151     157     163     167     173
179     181     191     193     197     199
cnt = 46
----------
2       3       5       7       11      13      17      19      23      29
31      37      41      43      47      53      59      61      67      71
73      79      83      89      97      101     103     107     109     113
127     131     137     139     149     151     157     163     167     173
179     181     191     193     197     199
cnt = 46
----------
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> 
 */
