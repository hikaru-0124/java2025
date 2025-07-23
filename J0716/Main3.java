package J0716;

public class Main3 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        printArray(array);
    }

    public static void printArray(int[] array){
        //拡張for
        for(int element : array){
            System.out.println(element);
        }
    }
}
