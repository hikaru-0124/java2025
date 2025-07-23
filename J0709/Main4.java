package J0709;

public class Main4 {
    public static void main(String[] args) {
        int [][] books = {
            {40,50,60},
            {80,60,70}
        };
    

        for(int i = 0; i < books.length; i++){
            int cnm = 0;
            for(int j = 0; j < books[i].length; j++){
                
                System.out.print(books[i][j]);
                if(cnm != 2){
                  System.out.print(",");
                }
                cnm ++;
            }
            System.out.println();
        }

    }
}
