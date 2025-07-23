package J0716;

public class Main4 {
    public static void main(String[] args) {
        int[] array = makeArray(3);
        for(int element : array){
            System.out.println(element);
        }
    }

    //引数で指定されたサイズ分の配列を作る
    public static int[] makeArray(int size){
        int[] newArray = new int[size];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = i;
        }
        return newArray;
    }
}
