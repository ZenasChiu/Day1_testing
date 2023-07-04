public class Q2 {
    void answer(int num){
        //System.out.println(num);
        aa:{
            for(int i = 1; i <= num; i++){
                for(int space = num-i; space > 0; space--){
                    System.out.print(" ");
                }
                for(int star = 0; star < i; star++){
                    System.out.print("*");
                }
                for(int star = 1; star < i; star++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
             for (int i = num-1; i >= 1; i--) {
                 for (int j = 1; j <= num - i; j++) {
                     System.out.print(" ");
                 }
                 for (int k = 1; k <= 2 * i - 1; k++) {
                     System.out.print("*");
                 }
                System.out.println("");
            }

            }


    }

