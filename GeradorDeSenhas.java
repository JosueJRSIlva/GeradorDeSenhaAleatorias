import java.security.SecureRandom;
import java.util.Scanner;

public class GeradorDeSenhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.println("===== Gerador de Senhas Aleatórias =====");
        System.out.print("Digite o comprimento da senha desejada: ");
        int comprimentoSenha = scanner.nextInt();
        scanner.nextLine();// Limpar o buffer

        System.out.print("Incluir letras maiúsculas? (S/N): ");
        boolean incluirMaiuscula = scanner.nextLine().equalsIgnoreCase("S");

        System.out.print("Incluir letras minúsculas? (S/N): ");
        boolean incluirMinusculas = scanner.nextLine().equalsIgnoreCase("S");

        System.out.print("Incluir números? (S/N: ");
        boolean incluirNumeros = scanner.nextLine().equalsIgnoreCase("S");

        System.out.print("Incluir caracteres especiais? (S/N): ");
        boolean incluirEspeciais = scanner.nextLine().equalsIgnoreCase("S");

        String caracteres ="";
        if (incluirMaiuscula) caracteres += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (incluirMinusculas) caracteres += "abcdefghijklmnopqrstuvwxyz";
        if (incluirNumeros) caracteres += "0123456789";
        if (incluirEspeciais) caracteres += "!@#$%^&*()-_=+[]{}|;:'\",.<>?";

        StringBuilder senha = new StringBuilder();
        for (int i = 0; i <comprimentoSenha; i++) {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }
        System.out.println("Senha gerada: " + senha.toString());

        scanner.close();
    }
}
