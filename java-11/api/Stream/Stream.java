import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Stream {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> integerPool = new HashSet<>();
        for (int i = 0; i < 100_000_000; i++) {
            integerPool.add(random.nextInt() / 235252);
        }

        long start = System.currentTimeMillis();
        long answer = integerPool.stream().reduce(0, (a, b) -> a + b).longValue();
        long time = System.currentTimeMillis() - start;
        System.out.println("순차 덧셈 결과 : " + answer);
        System.out.println("순차 스트림 reduce 연산 경과시간 : " + time);

        start = System.currentTimeMillis();
        answer = integerPool.parallelStream().reduce(0, (a, b) -> a + b).longValue();
        time = System.currentTimeMillis() - start;
        System.out.println("병렬 덧셈 결과 : " + answer);
        System.out.println("병렬 스트림 reduce 연산 경과시간 : " + time);

        // foreach
        start = System.currentTimeMillis();
        answer = integerPool.stream().filter(i -> i % 2 == 1).reduce(0, (a, b) -> a + b).longValue();
        time = System.currentTimeMillis() - start;
        System.out.println("순차 filter+덧셈 결과 : " + answer);
        System.out.println("순차 스트림 filter + reduce 연산 경과시간 : " + time);

        start = System.currentTimeMillis();
        answer = integerPool.parallelStream().filter(i -> i % 2 == 1).parallel().reduce(0, (a, b) -> a + b).longValue();
        time = System.currentTimeMillis() - start;
        System.out.println("병렬 filter + 덧셈 결과 : " + answer);
        System.out.println("병렬 스트림 filter + reduce 연산 경과시간 : " + time);

    }
}