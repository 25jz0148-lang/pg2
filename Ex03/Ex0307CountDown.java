/**
 * 10~1までを順に出力する処理をfor文を使って記述しなさい
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/06
 */
public class Ex0307CountDown {
    public static void main(String[] args) {
        int i;

        for (i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> javac Ex0307CountDown.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0307CountDown   
10
9
8
7
6
5
4
3
2
1
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03>  
 */
