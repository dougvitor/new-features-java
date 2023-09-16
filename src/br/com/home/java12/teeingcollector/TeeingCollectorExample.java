package br.com.home.java12.teeingcollector;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollectorExample {

    public static void main(String[] args) {

        final double mediaOnlyCollector = Stream.of(20, 70, 90, 15, 35, 60, 10, 25).collect(Collectors.averagingDouble(i -> i));

        System.out.println(mediaOnlyCollector);

        final double mediaWithTeeingCollector = Stream.of(20, 70, 90, 15, 35, 60, 10, 25).collect(
                Collectors.teeing(
                        Collectors.summingDouble(i -> i),
                        Collectors.counting(),
                        (soma, quantidade) -> soma / quantidade)
        );

        System.out.println(mediaWithTeeingCollector);

    }
}
