/**
 * continue文の使い方
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/02
 */
public class Ex0305Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) { // iが偶数ならば
                continue;    //１番内側のループ(for)ブロックの残りの処理をスキップし、
                //１番内側のループ(for文の第３式)に制御を移す(iを増やす)
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------");

        int j = 0;
        while (j < 10) {
            if (j % 2 == 0) {  //jが偶数ならば
                j++;          //jを増やした後で
                continue;    //１番内側のループ(while)ブロックの残りの処理をスキップし、
            }                 //１番内側のループ(while分の判定)に制御を移す
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
        System.out.println("----------");
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> javac Ex0305Continue.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0305Continue
1 3 5 7 9 
----------
1 3 5 7 9
----------
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> 
 */
