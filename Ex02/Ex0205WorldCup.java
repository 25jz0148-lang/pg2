import java.util.Scanner;

/**
 * キーボードから西暦を入力し、その年がサッカーワールドカップの開催年かを判定する
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/09/29
 */
public class Ex0205WorldCup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int     year;

        System.out.print("西暦を入力 : ");
        year = scan.nextInt();

        if ((year + 10) % 4 == 0 && 1930 <= year && year != 1942 && year != 1946) {
            System.out.println(year + "年はサッカーワールドカップ開催年です");
        }
        else {
            System.out.println(year + "年はサッカーワールドカップはありません");
        }
        scan.close();
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> javac Ex0205WorldCup.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0205WorldCup
西暦を入力 : 1930
1930年はサッカーワールドカップ開催年です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0205WorldCup
西暦を入力 : 1934
1934年はサッカーワールドカップ開催年です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0205WorldCup
西暦を入力 : 1938
1938年はサッカーワールドカップ開催年です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0205WorldCup
西暦を入力 : 1942
1942年はサッカーワールドカップはありません

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0205WorldCup
西暦を入力 : 1950
1950年はサッカーワールドカップ開催年です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0205WorldCup
西暦を入力 : 2014
2014年はサッカーワールドカップ開催年です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0205WorldCup
西暦を入力 : 2015
2015年はサッカーワールドカップはありません

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0205WorldCup
西暦を入力 : 2017
2017年はサッカーワールドカップはありません

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0205WorldCup
西暦を入力 : 2018
2018年はサッカーワールドカップ開催年です

PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> java Ex0205WorldCup
西暦を入力 : 1926
1926年はサッカーワールドカップはありません
PS G:\マイドライブ\PG2\PGⅡsrc\Ex02> 
 */
