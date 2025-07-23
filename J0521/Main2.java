package J0521;

public class Main2 {
    /*
     * mainメソッドを作成
     * mainメソッドからtestメソッドを実行する
     * testメソッドを作成
     * testメソッドは、引数を二つ持っている
     * testメソッドの処理はこの二つの引数の掛け算の結果を実行し
     * mainメソッドに返してきてその値を画面に表示
     */

    public static void main(String[] args) {
        int num = test(10 , 5);
        System.out.println(num);
    }

    public static int test(int a ,int  b) {
        System.out.println(a);
        System.out.println(b);
        return a * b;
    }
}
