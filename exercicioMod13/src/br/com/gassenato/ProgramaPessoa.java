package br.com.gassenato;

public class ProgramaPessoa {
    public static void main(String[] args) {
        PessoaFisica pessoa1= new PessoaFisica();
        pessoa1.setNome("Gabriel");
        pessoa1.setCpf("000.000.000-00");
        System.out.println(pessoa1.getNome() + " é uma pessoa física com o cpf " + pessoa1.getCpf());

        PessoaJuridica pessoa2 = new PessoaJuridica();
        pessoa2.setNome("Carlos");
        pessoa2.setCnpj("00.000.000/0001-00");
        System.out.println(pessoa2.getNome() + " é uma pessoa juridica com o cnpj " + pessoa2.getCnpj());
    }

}
