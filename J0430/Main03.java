package J0430;

public class Main03 {
    public static void main(String[] args) {
        final double PI = 3.14; //円周率 finalをつけることによって変数内の値を変更できなくなる
        int pie = 5;      //食べられるアップルパイの半径

        System.out.println("半径" + pie + "cm このパイの面積は、");
        System.out.println(pie * pie * PI);
        System.out.println("パイの半径を倍にします");
        pie = 10;  //誤り！代入すべき変数は「pie」
        System.out.println("半径" + pie + "cmのパイの面積は");
        System.out.println(pie * pie * PI);
    }
}
