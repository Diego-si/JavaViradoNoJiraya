package academy.devdojo.maratonajava.javacore.streams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class SteamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        System.out.println("-----");
        sumStreamIterate(num);
        System.out.println("-----");
        sumParallelStreamIterate(num);
        System.out.println("-----");
        sumLongStreamIterate(num);
        System.out.println("-----");
        sumParallelLongStreamIterate(num);
    }

    private static void sumFor(Long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (int i = 1; i < num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(Long num) {
        System.out.println("Sum StreamIterate");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
    // [1,2,3,4,5,6,7,8,9,0]
    // 1 1-5
    // 2 6-0
    private static void sumParallelStreamIterate(Long num) {
        System.out.println("Sum ParallelStreamIterate");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(Long num) {
        System.out.println("Sum LongStreamIterate");
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelLongStreamIterate(Long num) {
        System.out.println("Sum ParallelLongStreamIterate");
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
