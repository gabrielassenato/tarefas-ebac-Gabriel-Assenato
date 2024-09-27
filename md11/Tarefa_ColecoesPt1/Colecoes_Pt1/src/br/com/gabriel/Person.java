package br.com.gabriel;

/**
 * A classe Person representa uma pessoa com um nome e
 * implementa a interface Comparable para permitir a
 * comparação de pessoas com base no nome.
 *
 * @author gabriel.souza
 */
public class Person implements Comparable<Person> {

    //atributo que  guarda o nome da pessoa
    private String name;

    //constructor que inicializa o objeto Person e recebe o nome da pessoa
    public Person(String name)  {
        this.name = name;
    }

    //o get vai retornar o nome da pessoa
    public String getName() {
        return name;
    }

    //o set vai setar o nome da pessoa
    public void setName(String name) {
        this.name = name;
    }

    // sobrescreve o metodo toString para retornar o nome (inves da ref. de memoria) quando o objeto for impresso
    public String toString() {
        return this.name;
    }

    // sobrescreve o metodo compareTo para comparar os objetos Person pelo nome
    public int compareTo(Person person) {
        return this.name.compareTo(person.getName());
    }
}