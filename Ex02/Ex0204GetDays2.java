import java.util.Scanner;

/**
 * 月を入力し、入力した月の日数を表示する。
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/09/29
 */
public class Ex0204GetDays2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int     month;     //月
        int     days;      //日数

        System.out.print("月を入力 : ");
        month = scan.nextInt();

        if (1 <= month && month <= 12) {   //入力された月が１から１２なら
            switch (month) {      //月ごとの日数を設定   
                case 2:        //２月なら
                    days = 28;       //日数に２８を設定
                    break;         //２月の日数設定終了
                case 4:    //４月
                case 6:    //６月 
                case 9:     //９月
                case 11:      //１１月     or   case4, 6, 9, 11:でも可能
                    days = 30;      //日数に３０を設定
                    break;          //小の月の日数設定終了
                default:    //その他の月なら
                    days = 31;    //日数に３１を設定
                    break;     //大の月の日数設定終了
            }
            System.out.println(month + "月の日数は" + days + "日です");
        }
        else {
            System.out.println("入力エラー : 月は０～１２です");
        }
        scan.close();
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> javac Ex0204GetDays2.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0204GetDays2      
月を入力 : 1
1月の日数は31日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0204GetDays2
月を入力 : 2
2月の日数は28日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0204GetDays2
月を入力 : 3
3月の日数は31日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0204GetDays2
月を入力 : 4
4月の日数は30日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0204GetDays2
月を入力 : 5
5月の日数は31日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0204GetDays2
月を入力 : 6
6月の日数は30日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0204GetDays2
月を入力 : 7
7月の日数は31日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0204GetDays2
月を入力 : 8
8月の日数は31日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0204GetDays2
月を入力 : 9
9月の日数は30日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0204GetDays2
月を入力 : 10
10月の日数は31日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0204GetDays2
月を入力 : 11
11月の日数は30日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0204GetDays2
月を入力 : 12
12月の日数は31日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0204GetDays2
月を入力 : 0
入力エラー : 月は０～１２です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0204GetDays2
月を入力 : 13
入力エラー : 月は０～１２です
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> 
 */
