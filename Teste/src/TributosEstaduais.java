import java.util.Scanner;

public class TributosEstaduais {

    private int option;
    private String option2;
    private Scanner scan = new Scanner(System.in);
    double N1;

    private CalculadoraEstaduais calcularICMS = new CalculadoraEstaduais();
    private CalculadoraEstaduais calcularIPVA = new CalculadoraEstaduais();
    private CalculadoraEstaduais calcularITCMD = new CalculadoraEstaduais();
    private CalculadoraEstaduais calcularITBI = new CalculadoraEstaduais();
    

    public void Estado() {
        
        do{

            System.out.println("Bem-vindo ao menu de Tributos Estatuais!");
            System.out.println("");
            System.out.println("---------------------------------Tributos Estatuais --------------------------------");
            System.out.println("1 -- Imposto sobre Circulação de Mercadorias e Serviços (ICMS) ---------------------");
            System.out.println("2 -- Imposto sobre a Propriedade de Veículos Automotores (IPVA)---------------------");
            System.out.println("3 -- Imposto sobre Transmissão Causa Mortis e Doação (ITCMD)------------------------");
            System.out.println("4 -- Imposto sobre Transmissão de Bens Imóveis (ITBI)-------------------------------");
            System.out.println("5 -- Voltar para o menu inicial: ---------------------------------------------------");
            System.out.println("6 -- Sair --------------------------------------------------------------------------");
            System.out.println("--------------------------- Digite a opção desejada: -------------------------------");

            option = scan.nextInt();

            switch (option) {
            case 1:
                clearConsole();
                System.out.println("Imposto sobre Circulação de Mercadorias e Serviços (ICMS)");
                System.out.println("Digite o valor: ");
                N1 = scan.nextDouble();
                double resultadoICMS = calcularICMS.calcularICMS(N1);
                System.out.println("Resultado: " + resultadoICMS);
                System.out.printf("\n");
                System.out.println("Deseja calcular outro tributo? (s/n)");
                option2 = scan.next();

                if (option2.equals("s")) {
                    clearConsole();
                    Estado();
                }else{
                    clearConsole();
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                }
                break;

            case 2:
                clearConsole();
                System.out.println("Imposto sobre a Propriedade de Veículos Automotores (IPVA)");
                System.out.println("Digite o valor: ");
                N1 = scan.nextDouble();
                double resultadoIPVA = calcularIPVA.calcularIPVA(N1);
                System.out.println("Resultado: " + resultadoIPVA);
                System.out.printf("\n");
                System.out.println("Deseja calcular outro tributo? (s/n)");
                option2 = scan.next();

                if (option2.equals("s")) {
                    clearConsole();
                    Estado();
                }else{
                    clearConsole();
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                }
                break;

            case 3:
                clearConsole();
                System.out.println("Imposto sobre Transmissão Causa Mortis e Doação (ITCMD)");
                System.out.println("Digite o valor: ");
                N1 = scan.nextDouble();
                double resultadoITCMD = calcularITCMD.calcularITCMD(N1);
                System.out.println("Resultado: " + resultadoITCMD);
                System.out.printf("\n");
                System.out.println("Deseja calcular outro tributo? (s/n)");
                option2 = scan.next();

                if (option2.equals("s")) {
                    clearConsole();
                    Estado();
                }else{
                    clearConsole();
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                }
                break;

            case 4:
                clearConsole();
                System.out.println("Imposto sobre Transmissão de Bens Imóveis (ITBI)");
                System.out.println("Digite o valor: ");
                N1 = scan.nextDouble();
                double resultadoITBI = calcularITBI.calcularITBI(N1);
                System.out.println("Resultado: " + resultadoITBI);
                System.out.printf("\n");
                System.out.println("Deseja calcular outro tributo? (s/n)");
                option2 = scan.next();

                if (option2.equals("s")) {
                    clearConsole();
                    Estado();
                }else{
                    clearConsole();
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                }
                break;
            case 5:
                clearConsole();
                System.out.println("Voltando para o menu inicial...");
                break;
            case 6:
                clearConsole();
                System.out.println("Programa encerrado.");
                break;
            default:
                clearConsole();
                System.out.println("Opção inválida. Tente novamente.");
                break;
            }
        }
        while (option != 7);
        
    }

    public static void clearConsole() { // Limpa o console
        try {
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

