import java.util.Scanner;

/**
 * 月(1~12)を入力し、入力した月の日数を表示する。
 * 
 */
public class Ex0203GetDays1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int     month;
        int     days;

        System.out.print("月を入力 : ");
        month = scan.nextInt();

        if (month == 2) {       //2月なら
            days = 28;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {    //そうでなくて４，６，９，１１月のいずれなら
            days = 30;
        }
        else {   // そうでもなければ
            days = 31;
        }
        System.out.println(month + "月の日数は" + days + "日です");
        scan.close();
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> javac Ex0203GetDays1.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0203GetDays1
月を入力 : 1
1月の日数は31日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0203GetDays1
月を入力 : 2
2月の日数は28日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0203GetDays1
月を入力 : 3
3月の日数は31日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0203GetDays1
月を入力 : 4
4月の日数は30日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0203GetDays1
月を入力 : 5
5月の日数は31日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0203GetDays1
月を入力 : 6
6月の日数は30日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0203GetDays1
月を入力 : 7
7月の日数は31日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0203GetDays1
月を入力 : 8
8月の日数は31日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0203GetDays1
月を入力 : 9
9月の日数は30日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0203GetDays1
月を入力 : 10
10月の日数は31日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0203GetDays1
月を入力 : 11
11月の日数は30日です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0203GetDays1
月を入力 : 12
12月の日数は31日です
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> 
 */
