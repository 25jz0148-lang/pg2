/**
 * String型配列の利用法
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/19
 */
public class Ex0405ArrayString {
    public static void main(String[] args) {
        // 1. Stringh型配列の宣言と領域確保
        String[] strdim1 = new String[3];   // 要素数３で領域確保

        strdim1[0] = "Hello";
        strdim1[1] = "java";
        strdim1[2] = "World";

        System.out.println("strdim1.length = " + strdim1.length);
        for (int i = 0; i < strdim1.length; i++) {
            System.out.println("strdim1[" + i + "] = " + strdim1[i]);
        }
        System.out.println("----------");

        // 2. String型配列の宣言と初期化
        String[] strdim2 = {"jec", "ac", "jp"}; // "jec", "ac", "jp" の３つの値で初期化

        System.out.println("strdim2.length = " + strdim2.length);
        for (int i = 0; i < strdim2.length; i++) {
            System.out.println("strdim2[" + i + "] = " + strdim2[i]);
        }
        System.out.println("----------");
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> javac Ex0405ArrayString.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> java Ex0405ArrayString
strdim1.length = 3
strdim1[0] = Hello
strdim1[1] = java
strdim1[2] = World
----------
strdim2.length = 3
strdim2[0] = jec
strdim2[1] = ac
strdim2[2] = jp
----------
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> 
 */
