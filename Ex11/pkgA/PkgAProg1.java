package pkgA;

/*
 ** パッケージ ： pkgA
 ** ファイル名 ： PkgAProg1.java
 */
/**
 * @author 25JZ0148 Yamada taiyou
 * @version 2025/12/15
 */
public class PkgAProg1 {
    public static void main(String[] args) {
        PkgA1 dt1 = new PkgA1(); // public な PkgA1 を生成
        dt1.disp();

        PkgA2 dt2 = new PkgA2(); // public な PkgA2 を生成
        dt2.disp();

        PkgA3 dt3 = new PkgA3(); // public な PkgA3 を生成
        dt3.disp();
    }
}
