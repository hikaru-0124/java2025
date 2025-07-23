package J0709;

public class Main {
    public static void main(String[] args) {
        //配列
        int[] scores1 = new int[]{20,30,40,50,60};
        

        System.out.println(scores1 [0]);
        System.out.println(scores1 [1]);
        System.out.println(scores1 [2]);
        System.out.println(scores1 [3]);
        System.out.println(scores1 [4]);
        
        int num = scores1.length;
        System.out.println("配列scores1の要素数は" + num + "です。");

        for(int i = 0; i < num; i++){
            System.out.println("score1の要素番号"+ i +"の中身は" + scores1[i]);
        }
        
    }
}
