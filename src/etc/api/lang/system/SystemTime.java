package etc.api.lang.system;

public class SystemTime {

    public static void main(String[] args) {

//        System.out.println(System.currentTimeMillis());

// 1970sus 1월 1일을 기준으로 현재까지 소요된 시간을 밀리초로 리턴
        long start = System.currentTimeMillis();




        int total = 0;

        for (int i = 0; i < 2000000000; i++) {
            total += i;
        }
        long end = System.currentTimeMillis();

        System.out.println("실행 소요 시간: " + (end - start) * 0.001 + "초");
        System.out.println(System.getProperties());

    }

}
