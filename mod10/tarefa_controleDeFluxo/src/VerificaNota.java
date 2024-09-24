import java.util.Scanner;

public class VerificaNota {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua nota da av1: ");
        int av1 = s.nextInt();

        System.out.println("Digite sua nota da av2: ");
        int av2 = s.nextInt();

        System.out.println("Digite sua nota da av3: ");
        int av3 = s.nextInt();

        System.out.println("Digite sua nota da av4: ");
        int av4 = s.nextInt();

        int media = (av1+av2+av3+av4) / 4;

        if (media >= 7) {
            System.out.println("Você foi aprovado!");
        } else if (media >= 5) {
            System.out.println("Você está em recuperação. Estude mais.");
        } else {
            System.out.println("Você foi reprovado.");
        }
    }
}