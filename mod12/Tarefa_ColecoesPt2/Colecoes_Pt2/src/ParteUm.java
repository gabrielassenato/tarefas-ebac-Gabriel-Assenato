import java.util.*;

public class ParteUm {
    public static void main(String[] args) {
        //informa que haverá leitura de um dado inserido pelo usuário
        Scanner s = new Scanner(System.in);

        System.out.println("Insira o nome das pessoas separados por virgula: ");

        //vai ler a próxima entrada do usuário como uma string
        String nomes = s.next();

        //faz o slipt e salva cada string que foi cortada pela , em um array.
        String[] arrayNomes = nomes.split(",");

        //com esse metodo Arrays.asList o array já é convertido diretamente para uma lista
        List<String> listaNomes = new ArrayList<>(Arrays.asList(arrayNomes));

        /*
        // percorre o array usando um laço for e adiciona cada nome à lista
        for (int i = 0; i < arrayNomes.length; i++) {
            listaNomes.add(arrayNomes[i]); // adiciona o nome na lista
        }
        */

        Collections.sort(listaNomes); //ordena a lista
        System.out.println("Nomes da lista ordenados: ");
        System.out.println(listaNomes);
    }
}