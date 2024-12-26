package br.com.gabriel.domain;

import java.util.Objects;

public class Client {
    private String name;
    private Long cpf;
    private Long cel;
    private String street;
    private Integer num;
    private String city;
    private String state;

    public Client(String name, Long cpf, Long cel, String street, Integer num, String city, String state) {
        this.name = name;
        this.cpf = cpf;
        this.cel = cel;
        this.street = street;
        this.num = num;
        this.city = city;
        this.state = state;
    }

    public Client(String name, String s, String s1, String street, String s2, String city, String state) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getCel() {
        return cel;
    }

    public void setCel(Long cel) {
        this.cel = cel;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(cpf, client.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public String toString() {
        return "Client{" +
                "cpf=" + cpf +
                ", name='" + name + '\'' +
                '}';
    }
}
