/**
 * 配列のコピー(Shallow copy / Deep copy)
 * 
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/10/20
 */
public class Ex0406ArrayCopy {
    public static void main(String[] args) {
        int[] dim1 = {10, 20, 30}; // 配列の初期化
        int[] dim2;
        //*
        // System.out.println("------浅いコピー(Shallow copy)の実行------");
        //dim2 = dim1;   // 参照値のコピー　dim2 <-- dim1

        System.out.println("------深いコピー(Deep copy)の実行------");
        dim2 = dim1.clone(); // 別の配列領域へのコピー　dim2 <-- dim1
        System.out.println("dim1 配列の内容");
        for (int i = 0; i < dim1.length; i++) {
            System.out.print(" dim1[" + i + "] = " + dim1[i]);
        }
        System.out.println("");

        System.out.println("dim2 配列の内容");
        for (int i = 0; i < dim2.length; i++) {
            System.out.print(" dim2[" + i + "] = " + dim2[i]);
        }
        System.out.println("");
        System.out.println("----------");

        System.out.println("dim1[0] = 123; 実行");
        System.out.println("dim2[1] = 456; 実行");
        dim1[0] = 123;   // dim1　配列に対する変更dim2 配列に与える影響は？
        dim2[1] = 456;   // dim2　配列に対する変更dim1 配列に与える影響は？
        System.out.println("----------");

        System.out.println("dim1 配列の内容");
        for (int i = 0; i < dim1.length; i++) {
            System.out.print(" dim1[" + i + "] = " + dim1[i]);
        }
        System.out.println("");

        for (int data : dim1) {   // 拡張for文でdim1の内容出力
            System.out.print(data);
            System.out.print("\t");
        }
        System.out.println("");

        System.out.println("dim2 配列の内容");
        for (int i = 0; i < dim2.length; i++) {
            System.out.print(" dim2[" + i + "] = " + dim2[i]);
        }
        System.out.println("");

        for (int data : dim2) {   // 拡張for文でdim2の内容出力
            System.out.print(data);
            System.out.print("\t");
        }
        System.out.println("");
    }
}

/*
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> javac Ex0406ArrayCopy.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> java Ex0406ArrayCopy      
------浅いコピー(Shallow copy)の実行------
dim1 配列の内容
dim1[0] = 10dim1[1] = 20dim1[2] = 30
dim2 配列の内容
dim2[0] = 10dim2[1] = 20dim2[2] = 30
----------
dim1[0] = 123; 実行
dim2[1] = 456; 実行
----------
dim1 配列の内容
dim1[0] = 123dim1[1] = 456dim1[2] = 30
123     456     30
dim2 配列の内容
dim2[0] = 123dim2[1] = 456dim2[2] = 30
123     456     30
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> javac Ex0406ArrayCopy.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> java Ex0406ArrayCopy      
------浅いコピー(Shallow copy)の実行------
dim1 配列の内容
 dim1[0] = 10 dim1[1] = 20 dim1[2] = 30
dim2 配列の内容
 dim2[0] = 10 dim2[1] = 20 dim2[2] = 30
----------
dim1[0] = 123; 実行
dim2[1] = 456; 実行
----------
dim1 配列の内容
 dim1[0] = 123 dim1[1] = 456 dim1[2] = 30
123     456     30
dim2 配列の内容
 dim2[0] = 123 dim2[1] = 456 dim2[2] = 30
123     456     30

PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> javac Ex0406ArrayCopy.java
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> java Ex0406ArrayCopy      
------深いコピー(Deep copy)の実行------
dim1 配列の内容
 dim1[0] = 10 dim1[1] = 20 dim1[2] = 30
dim2 配列の内容
 dim2[0] = 10 dim2[1] = 20 dim2[2] = 30
----------
dim1[0] = 123; 実行
dim2[1] = 456; 実行
----------
dim1 配列の内容
 dim1[0] = 123 dim1[1] = 20 dim1[2] = 30
123     20      30
dim2 配列の内容
 dim2[0] = 10 dim2[1] = 456 dim2[2] = 30
10      456     30
PS G:\マイドライブ\PG2\PGⅡsrc\Ex04> 
 */
