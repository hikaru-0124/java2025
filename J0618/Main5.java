package J0618;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください＞");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.print("あなたの年齢を入力してください＞");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4);
        fortune ++;
        System.out.println("占いの結果が出ました");
        String result ="";
        /*if(fortune == 1){
            result = "大吉"; 
        }else if(fortune == 2){
            result = "中吉";
        }else if(fortune == 3){
            result = "吉";
        }else{
            result = "凶";
        }*/
        switch (fortune) {
            case 1:
                result = "大吉";
                break;
            case 2:
                result = "中吉";
                break;
            case 3:
                result = "吉";
                break;
            case 4:
                result = "凶";
                break;
            default:
                break;
        }
        System.out.println(age+"歳の" + name + "さん、あなたの運気番号は" + result + "です。");
        //System.out.println("(1:大吉2:中吉3:吉4:凶");


    }
}
