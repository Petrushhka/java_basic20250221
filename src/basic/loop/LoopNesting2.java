package basic.loop;

public class LoopNesting2 {
    public static void main(String[] args) {
        /* 별탑

         *
         **
         ***
         ****
         *****

         */

        for(int i = 1; i <= 5; i++){
            for(int j =1; j<=i; j++ ){
                System.out.print("*");
            };
            System.out.println();
        };


        /*

             *
            **
           ***
          ****
         *****

         */

        for(int i = 1; i <= 5; i++){
            //별찍기 전에 공백부터 만드는 for 문
            for(int k = 4; k>=i ; k--){
                System.out.print(" ");
            }

            // 별찍는 for 문
            for(int j =1; j<=i; j++ ){
                System.out.print("*");
            };
            System.out.println();
        };

        /*
        *****
         ****
          ***
           **
            *
         */

        for(int i = 1; i <= 5; i++){
            //공백 넣어주는거
            for(int k = 0; k < i-1; k++){
                System.out.print(" ");
            };

            //별넣어주는거
            for(int j = 5; j>=i; j--){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
