package br.com.gabriel;

public class Teste {
    public static void main(String[] args) {
        FabricarCarro fabricarCarro1 = new Fiat();
        System.out.println("Fabricar Fiat: ");
        Carro fiatManual = fabricarCarro1.criarCarroManual();
        fiatManual.exibirInfo();

        System.out.println();

        FabricarCarro fabricarCarro2 = new Fiat();
        System.out.println("Fabricar Fiat: ");
        Carro fiatAutomatico = fabricarCarro2.criarCarroAutomatico();
        fiatAutomatico.exibirInfo();

        System.out.println();

        FabricarCarro fabricarCarro3 = new Volkswagen();
        System.out.println("Fabricar Volkswagen: ");
        Carro volkswagenManual = fabricarCarro3.criarCarroManual();
        volkswagenManual.exibirInfo();

        System.out.println();

        FabricarCarro fabricarCarro4 = new Volkswagen();
        System.out.println("Fabricar Volkswagen: ");
        Carro volkswagenAutomatico = fabricarCarro4.criarCarroAutomatico();
        volkswagenAutomatico.exibirInfo();

    }
}
