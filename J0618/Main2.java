package J0618;

public class Main2 {
    public static void main(String[] args) {
        //31(数値)　と "31"(数字)
        String age = "31";
        int n = Integer.parseInt(age);
        System.out.println(n + 10);

        int r = new java.util.Random().nextInt(1000);
        System.out.println("あなたはたぶん、" + r + "歳ですね");

    }
}
