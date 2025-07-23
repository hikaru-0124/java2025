package J0514;
public class Main5 {
    public static void main(String[] args) {
        /*
         * i++ : 後置インクリメント(+1していく)
         * ++i : 前置インクリメント(+1していく)
         * i-- : 後置デクリメント(-1していく)
         * --i:  前置デクリメント(-1していく)
         */
        for(int i = 0; i <= 5; i++){
            //System.out.println(i);
        }

        // i++ 後置インクリメント(+1していく)
        int i = 10;
        System.out.print(i++ + " ");
        System.out.println(i);
        int j = 10;
        System.out.print(++j + " ");
        System.out.println(j);
    }
}
