package J0618;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        int age = new java.util.Scanner(System.in).nextInt();
        System.out.println("おまえは"+ name + "というんじゃな！で年齢が" +age + "歳じゃな");
        if(age >= 60){
            System.out.println("わしより年齢高いんじゃな！じじいじゃな（笑）");
        }
    }
}
