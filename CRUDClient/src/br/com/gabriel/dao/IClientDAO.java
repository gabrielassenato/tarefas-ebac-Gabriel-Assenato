package br.com.gabriel.dao;

import br.com.gabriel.domain.Client;

import java.util.Collection;

public interface IClientDAO {

    public Boolean register(Client client);

    public Client remove(Long cpf);

    public void change(Client client);

    public Client find(Long cpf);

    public Collection<Client> findAll();

}
