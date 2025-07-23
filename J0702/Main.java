package J0702;

public class Main {
    public static void main(String[] args) {
        //while文
        int cnt = 1;
        while(cnt <= 10){
            System.out.println("こんにちはa " + cnt);
            cnt ++;
        }
        //do while
        cnt = 1;
        do{
            System.out.println("こんにちはb " + cnt);
            cnt ++;
        }while(cnt <= 10);


        for(int i = 1; i <= 10; i++){
            System.out.println("こんにちはc " + i);
        }
    }
    
}
