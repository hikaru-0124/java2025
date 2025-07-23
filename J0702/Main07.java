package J0702;

public class Main07 {
    public static void main(String[] args) {
        int isHungry  = 1;
        String food = "ちんあなご";

        System.out.println("こんにちは");

        if(isHungry == 0){
            System.out.println("おなかがいっぱいです");
        }else{
            System.out.println("腹ペコです");
        }

        if(isHungry == 1){
            System.out.println(food + "をいただきます");
        }

        System.out.println("ごちそうさまでした");
    }
}
