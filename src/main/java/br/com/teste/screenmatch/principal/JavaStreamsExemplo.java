package br.com.teste.screenmatch.principal;

import java.util.Optional;
import java.util.stream.Stream;
import java.util.List;

import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

public class JavaStreamsExemplo {
    public static void main(String[] args) {

        System.out.println("Streams Infinitos");
        Stream.iterate(0, n -> n + 1)
                .limit(10)
                .forEach(System.out::println);

        //FlatMap
//        List<List<String>> list = List.of(
//                List.of("a", "b"),
//                List.of("c", "d")
//        );
//
//        Stream<String> stream = list.stream()
//                .flatMap(Collection::stream);
//
//        stream.forEach(System.out::println);

        System.out.println("Redução de Streams");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Optional<Integer> result = numbers.stream().reduce(Integer::sum);
        result.ifPresent(System.out::println); //prints 15
    }
}
