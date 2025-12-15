/**
 * break文の使い方
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/02
 */
public class Ex0304Break {
    public static void main(String[] args) {
        int i;

        i = 0;
        while (true) { // 条件式がtrueなので永久ループ　for( ; ; ) { も同じ意味
            System.out.println(i);
            if (i >= 5) {
                break; // １番内側のswith,for,while文から抜ける(}の次の行に制御を移す)
            }
            i++;
        }
        System.out.println("----------");
        System.out.println("i = " + i);
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> javac Ex0304Break.java  
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> java Ex0304Break      
0
1
2
3
4
5
----------
i = 5
PS G:\マイドライブ\PG2\PGⅡsrc\Ex03> 
 */
