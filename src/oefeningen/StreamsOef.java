package oefeningen;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by vangike on 20/04/2017.
 */
public class StreamsOef {

    public static void main(String[] args) {
        IntStream.rangeClosed(0,10).forEach(System.out::println);

        String k = "Kenneth";
        Stream.of("  Mijn String  ").map(String::toUpperCase).map(String::trim).forEach(System.out::println);


    }
}
