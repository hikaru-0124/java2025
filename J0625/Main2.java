package J0625;

public class Main2 {
    public static void main(String[] args) {
        String msg = "あいうえお";

        //Java では文字列比較するときはこの書き方ではダメ
        if(msg == "あいうえお"){
            System.out.println( "変数の中身は「あいうえお」です。");
        }else{
             System.out.println( "変数の中身は「あいうえお」ではありません。");
        }

        //Javaで文字列比較するときはこの書き方！
        //もし比較で否定を使う場合は下のように == false　にするかmsg の前に！をつける 
        if(msg.equals("あいうえお") == false){
            System.out.println( "変数の中身は「あいうえお」です。");
        }else{
             System.out.println( "変数の中身は「あいうえお」ではありません。");
        }

    }
}
