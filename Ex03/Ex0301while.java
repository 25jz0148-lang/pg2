/**
 * whileループ
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/02
 */
public class Ex0301while {
    public static void main(String[] args) {
        int i;

        i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("i = " + i); // ループ終了後のカウンタ変数の値は？
    }
}
/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> javac Ex0301while.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0301while          
0
1
2
3
4
5
6
7
8
9
i = 10
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> 
 */
