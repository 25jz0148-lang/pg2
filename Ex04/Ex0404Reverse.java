/**
 * 初期化した配列の内容の正順表示と逆順表示するプログラムを作りなさい
 * 配列名 data データ型 int 初期値｛ ３，６，９，５｝
 * ループ回数の指定にはlenghtフィールドの値を利用すること
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/16
 */
public class Ex0404Reverse {
    public static void main(String[] args) {
        // 配列の初期化
        int[] data = {3, 6, 9, 5};

        // 配列の正順表示
        System.out.println("正順表示");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println(); // 改行

        // 配列の逆順表示
        System.out.println("逆順表示");
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> javac Ex0404Reverse.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> java Ex0404Reverse      
正順表示
3
6
9
5

逆順表示
5
9
6
3
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> 
 */
