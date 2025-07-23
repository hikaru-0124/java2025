package J0716;

public class Main {
    // Javaは、mainメソッドからプログラムが始まるというルール
    public static void main(String[] args) {
        //helloメソッド呼び出す(call)
        hello();

        int number;
        number = displayHelloWorld("ようこそ");
        System.out.println(number);

        int sum;
        int x = 4;
        int y = 40;//実引数
        sum =      tasu(x,y);
        System.out.println(sum);
    }

    //helloメソッド作成
    //void : 戻り値なしという意味
              //戻り値の型  メソッド名(引数)
    public static void     hello(){
         System.out.println("Hello");
    }

    //                                         message = "上の呼び出しの文字　ようこそ"
    public static int displayHelloWorld(String message) {
        System.out.println(message);
        return 100;
    }
//                          仮引数
    public static int tasu(int x,int y){
            int num = x+y;
            return num;
    }
}
