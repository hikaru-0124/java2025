package J0716;

public class Main6 {
    public static void main(String[] args) {
        email("2410027@i-seifu.jp", "ミッキーマウスを無断で使ってしまったため、捕まりました。");
    }

    public static void email(String title,String address,String text){
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("件名 : " + title);
        System.out.println("本文 : " + text);
    }

    public static void email(String address,String text){
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("件名 :  無題");
        System.out.println("本文 : " + text);
    }
}
