package J0521;

public class MainString {
    public static void main(String[] args) {
        int a = 10;
        double b = 13.3;
        String msg1 = "変数aは、" +a + "です";
        String msg2 = "変数bは、" +b + "です";
        System.out.println(msg1);
        System.out.println(msg2);
        //C言語の場合
        //printf("変数aは%dです。",a);
        //Javaの場合
        String msg3 = String.format("変数aは%dです。" , a);
        String msg4 = String.format("変数bは%.2fです。" , b);
        System.out.println(msg3);
        System.out.println(msg4);
    }
}
