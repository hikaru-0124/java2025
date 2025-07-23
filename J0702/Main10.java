package J0702;

public class Main10 {
    public static void main(String[] args) {
        System.out.println("[数あてゲーム]");
        //ランダムな値を生成する
        int ans = new java.util.Random().nextInt(10);
         int numcnt = 0;
         int forcnt = 0;

        for(int i = 1; i<=5; i++){
            System.out.println("0から9の数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();
           

            if(ans == num){
                System.out.println("あたり");
                numcnt = num;
                forcnt = i;
                break;
            }else{
                System.out.println("はずれ！");
            }
        }
        System.out.println("ゲーム終了！");
        if(ans == numcnt){
            System.out.println("おめでとう！" + forcnt + "回で当てたね！");
        }else{
            System.out.println("ざこやん。おまえ。");
        }
    }

}
