package J0521;

public class Main { //←クラス定義（クラスブロック）
    //メソッド定義（メソッドブロック）
    public static void main(String[] args) {//mainという名前のメソッド
        String name = "すがわら";
        System.out.println(name);
        int num = test(5 ,3 );
        System.out.println(num);
    }
    /*C言語 :　関数(関数を作る)
     * //PHP　：クラスの有無で関数と読んだり、メソッドと読んだり
     * Java：メソッド(メソッドを作る) :method
     */

    //test メソッドを作った
    //　　　　　　戻り値　メソッド　(引数)
    public static int    test     (int x, int y) {
                //voidは戻り値がないということ
        System.out.println("testメソッドが実行された");
        System.out.println(x);
        System.out.println(y);
        return x + y;
    }
}
