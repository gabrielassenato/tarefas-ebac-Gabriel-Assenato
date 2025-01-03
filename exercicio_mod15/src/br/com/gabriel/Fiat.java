package br.com.gabriel;

public class Fiat implements FabricarCarro{
    @Override
    public Carro criarCarroAutomatico() {
        return new CarroAutomatico();
    }

    @Override
    public Carro criarCarroManual() {
        return new CarroManual();
    }
}
