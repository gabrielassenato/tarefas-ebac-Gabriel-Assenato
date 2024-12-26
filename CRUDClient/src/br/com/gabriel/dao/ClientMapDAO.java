package br.com.gabriel.dao;

import br.com.gabriel.domain.Client;

import java.util.*;

public class ClientMapDAO implements IClientDAO {

    private Map<Long, Client> map;
    private Set<Long> cpfSet;

    public ClientMapDAO() {
        this.map = new HashMap<>();
        this.cpfSet = new HashSet<>();
    }

    @Override
    public Boolean register(Client client) {
        if (this.map.containsKey(client.getCpf())) {
            return false;
        }
        this.map.put(client.getCpf(), client);
        return true;
    }

    @Override
    public Client remove(Long cpf) {
        Client clientRegistered = this.map.get(cpf);

        if (clientRegistered != null) {
            this.map.remove(clientRegistered.getCpf(), clientRegistered);
        }

        return clientRegistered;
    }

    @Override
    public void change(Client client) {
        Client clientRegistered = this.map.get(client.getCpf());
        if (clientRegistered != null) {
            clientRegistered.setName(client.getName());
            clientRegistered.setCel(client.getCel());
            clientRegistered.setNum(client.getNum());
            clientRegistered.setStreet(client.getStreet());
            clientRegistered.setCity(client.getCity());
            clientRegistered.setState(client.getState());
        }
    }

    @Override
    public Client find(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Client> findAll() {
        return this.map.values();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientMapDAO that = (ClientMapDAO) o;
        return Objects.equals(map, that.map) && Objects.equals(cpfSet, that.cpfSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map, cpfSet);
    }
}
