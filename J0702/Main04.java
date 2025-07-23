package J0702;

public class Main04 {
    public static void main(String[] args) {
        while(true){
            System.out.println("こんにちわっさ");
            try{
                Thread.sleep(1000);//1秒(1000ミリ秒)間だけ処理を止める
            }catch(InterruptedException e){

            }
        }
        
    }
}
