package J0625;

public class Main3 {
    public static void main(String[] args) {
        //年齢が18歳以上でかつ(AND)5月生まれかつ10日生まれの人を選別するif文
        int age = 18;
        int month = 6;
        int day = 10;

        if(age == 18 && month == 5){
            System.out.println("今回の対象者です。");
        }else{
            System.out.println("今回の対象者ではありません");
        }

     
    }
}
