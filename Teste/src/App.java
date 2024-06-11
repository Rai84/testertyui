import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int option;
        try (Scanner scan = new Scanner(System.in)) {
            TributosFederais tributosFederais = new TributosFederais();
            TributosEstaduais tributosEstaduais = new TributosEstaduais();
            clearConsole();

            System.out.println("Bem-vindo ao sistema de cálculo de tributos!");

            do {

                System.out.println("");
                System.out.println("---- Menu Principal ------------");
                System.out.println("1 -- Tributos Federais: --------");
                System.out.println("2 -- Tributos Estaduais: -------");
                System.out.println("3 -- Sair: ---------------------");
                System.out.println("---- Digite a opção desejada: --");
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        clearConsole();
                        tributosFederais.federais();
                        break;
                    case 2:
                        clearConsole();
                        tributosEstaduais.Estado();
                        break;
                    case 3:
                        clearConsole();
                        System.out.println("Programa encerrado.");
                        break;
                    case 4:
                        clearConsole();
                        System.out.println("Bem-vindo administrador!");
                        System.out.println("\n");
                        login();
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (option != 3);
        }
    }

    public static void clearConsole() {
        try {
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {
                // Se o sistema operacional for Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Se for Unix (Linux ou macOS)
                new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // Lidar com exceções, se houver
            e.printStackTrace();
        }
    }

    private static void login() {
        try (Scanner scan = new Scanner(System.in)) {
            String login, senha;

            String login1 = "teste";
            String senha1 = "1234";
            
            do {
                System.out.println("Digite seu login: ");
                login = scan.nextLine();
                System.out.println("Digite sua senha: ");
                senha = scan.nextLine();
    
                if (login.equals(login1) && senha.equals(senha1)) {
                    clearConsole();
                    System.out.println("Bem-vindo administrador!");
                    clearConsole();
                } else {
                    clearConsole();
                    System.err.println("Login ou senha incorretos.\n Tente novamente.");
                }
            } while (!login.equals(login1) || !senha.equals(senha1));
        }
    }
    
}