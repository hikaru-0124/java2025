package J0625;

public interface Main5 {
    public static void main(String[] args) {
        int a = 1;

        switch (a) {
            case 1:
                System.out.println("大吉");
                break;
            case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("凶");
                break;
            default:
                break;
        }

        switch(a){
            case 1->{
                System.out.println("大吉");
            }
            case 2-> {
                System.out.println("中吉");
            }
            case 3->{
                System.out.println("凶");
            }
        }
    }
}
