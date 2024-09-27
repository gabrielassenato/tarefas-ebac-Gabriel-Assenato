package br.com.gabriel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// a classe NamesList é uma lista dos objetos Person, que exibe os nomes em ordem alfabetica
public class NamesList {

    // metodo principal que chama o metodo ordenaNomes()
    public static void main (String args[]) {
        ordenaNames();
    }

    // metodo que cria a lista de 'Person', adiciona e ordena os nomes da lista
    private static void ordenaNames() {
        System.out.println("***** Lista de nomes em ordem alfabética *****");

        // declara que o tipo da Lista namesList é o objeto Person e implementa o ArrayList
        List<Person> namesList = new ArrayList<Person>();

        // adiciona as pessoas na lista
        Person a = new Person("Gabriel Souza");
        Person b = new Person("Daniel Soares");
        Person c = new Person("Rafaela Almeida");
        Person d = new Person("Alessandra Oliveira");
        namesList.add(a);
        namesList.add(b);
        namesList.add(c);
        namesList.add(d);

        //ordena a lista em ordem alfabética utilizando o metodo compareTo() da classe Person
        Collections.sort(namesList);

        //imprime a lista ordenada
        System.out.println(namesList);
    }
}
