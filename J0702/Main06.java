package J0702;

public class Main06 {
    public static void main(String[] args) {
        // A : 不適切
        //if(cost = 300 * 1.05){}

        // B :不適切
        //if(3){}

        //c 適切
        int age = 30;
        if(age != 30){}

        //D 適切
        if(true){}

        //E
        int b = 5;
        if((b + 5) < 20){}

        //F:適切　場合によっては不正留津
        boolean isNumeric = true;
        if(isNumeric = true){}
    }
}
