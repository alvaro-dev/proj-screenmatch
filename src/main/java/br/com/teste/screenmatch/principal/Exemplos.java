package br.com.teste.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemplos {
    public static void main(String[] args) {

        //Streams Exemplos
/*
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numerosPares); // Output: [2, 4, 6, 8, 10]


        List<String> palavras = Arrays.asList("Java", "Stream", "Operações", "Intermediárias");

        List<Integer> tamanhos = palavras.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(tamanhos); // Output: [4, 6, 11, 17]


        List<String> nomes = Arrays.asList("João", "Maria", "Pedro", "Ana");

        nomes.stream()
                .forEach(nome -> System.out.println("Olá, " + nome + "!"));
// Output:
// Olá, João!
// Olá, Maria!
// Olá, Pedro!
// Olá, Ana!


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Set<Integer> numbersPares = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println(numbersPares); // Output: [2, 4, 6, 8, 10]
 */

        //ImutabilidadeExemplo
        List<String> listaOriginal = new ArrayList<>();
        listaOriginal.add("A");
        listaOriginal.add("B");

        List<String> listaImutavel = Collections.unmodifiableList(listaOriginal);

        // Tentativa de adicionar um elemento na lista imutável resultará em exceção
        //listaImutavel.add("C"); // Lançará UnsupportedOperationException
    }
}
