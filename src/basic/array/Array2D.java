package basic.array;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {

//        int[][] arr = new int[3][4]; // [3] : 큰배열의 수 , [4]: 작은 배열에 들어가는 요소의 수
//        arr[1][1] = 5555555;
//        System.out.println(Arrays.deepToString(arr));

        int[][] score = {
                {79, 80, 99},       // a학생
                {89, 60, 59},      //b학생
                {29, 30, 100},      //c학생
                {62, 33, 65},      //d학생
        };

        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};

        /*
         1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
         2. 각 과목의 평균을 출력해 보세요.
         3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
         */

        double totalAvg = 0.0; // 학생들의 평균점수의 총합.

        int idx = 0; //stuName 배열에서 학생 이름을 지목할 용도.

        for (int[] stu : score){// 배열덩어리가 들어옴 {
            int total = 0;
            for (int s : stu) {
                total += s;
            }
            double avg = (double) total / subName.length;
            totalAvg += avg;
            System.out.printf("%s의 평균: %.1f점\n",stuName[idx], avg);
            idx++;
        };

        System.out.println("===================================================");


        for (int j = 0; j < subName.length; j++ ) {
            int total = 0;
            for (int i = 0; i < stuName.length; i++){

                total += score[i][j];


            }
            double avg = (double) total / stuName.length;
            System.out.printf("%s과목의 평균점수는 %.1f점\n", subName[j], avg);
        };

        System.out.println("=================================================");

        //3번

        double classAvg = totalAvg / stuName.length;
        System.out.printf("우리반 평균: %.1f점", classAvg);


    }
}
