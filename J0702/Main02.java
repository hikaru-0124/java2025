package J0702;

public class Main02 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++ ){
                int ans = i * j;
                System.out.println(i + "×" + j + "=" +ans);
            }
            System.out.println();
        }
    }
}
