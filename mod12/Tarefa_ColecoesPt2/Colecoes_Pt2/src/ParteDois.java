import java.util.ArrayList;
import java.util.Scanner;

public class ParteDois {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> homens = new ArrayList<>();
        ArrayList<String> mulheres = new ArrayList<>();
        String opcao = "leia";

        while (opcao.equals("leia")) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = leia.next();

            System.out.print("Informe o sexo (m/f): ");
            String sexo = leia.next();

            if (sexo.equals("m")) {
                homens.add(nome);
            } else if (sexo.equals("f")) {
                mulheres.add(nome);
            } else {
                System.out.println("Por favor, digite m ou f.");
            }

            System.out.print("Deseja adicionar mais ou tentar novamente? (leia/n) ");
            opcao = leia.next();
        }

        System.out.println("*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Lista dos homens:");
        for (String homem : homens) {
            System.out.println(homem);
        }

        System.out.println("*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Lista das mulheres:");
        for (String mulher : mulheres) {
            System.out.println(mulher);
        }
    }
}
