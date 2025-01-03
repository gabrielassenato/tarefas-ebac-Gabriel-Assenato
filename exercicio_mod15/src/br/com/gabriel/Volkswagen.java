package br.com.gabriel;

public class Volkswagen implements FabricarCarro{
    @Override
    public Carro criarCarroAutomatico() {
        return new CarroAutomatico();
    }

    @Override
    public Carro criarCarroManual() {
        return new CarroManual();
    }
}
