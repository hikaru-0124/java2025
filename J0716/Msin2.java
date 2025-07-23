package J0716;

public class Msin2 {
    public static void main(String[] args) {
        methodA();
    }

    public static void methodA(){
        System.out.println("methodAが呼び出されました");
        methodB();
    }

    public static void methodB(){
        System.out.println("methodBが呼び出されました");
        methodC();
    }
    public static void methodC(){
        System.out.println("methodCが呼び出されました");
    }

}
