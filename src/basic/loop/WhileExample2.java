package basic.loop;

public class WhileExample2 {
    public static void main(String[] args) {

        // 48  ~ 150 사이 중 8의 배수만 가로로 출력해 보세요.

        //begin
        //end
        //step

        int i = 48;

        while(i<=150){
            if(i%8==0){
                System.out.print(i + " / ");
            }
            i++;
        }

        System.out.println(); // 단순 줄 개행

        // 1~100까지의 정수 중 4의 배수이면서
        // 8의 배수는 아닌 수를 가로로 출력해 보세요.

        int j = 1;

        while(j<=100){
            if(j%4==0 && j%8 != 0){
                System.out.print(j + " / ");
            }
            j++;
        }

        //1~30000 까지의 정수 중 258의 배수의 개수를 출력.

        int n = 1;
        int total = 0;

        while(n<=30000){

            if(n%258==0){
                total += 1;
            }
            n++;
        }
        System.out.println("\ntotal = " +total);

        // 1000의 약수의 개수를 출력하세요.(나누어 떨어지는 수)

        int k = 1;
        int count = 0;
        while(k<=1000){
            if(1000 % k == 0){
                count++;
            }
                k++;
        }
        System.out.println("count = " + count);

    }

}
