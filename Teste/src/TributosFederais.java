import java.util.Scanner;

public class TributosFederais {

    private int option;
    private String option2;
    private Scanner scan = new Scanner(System.in);
    double N1;

    private CalculadoraFederais calcularIRPJ = new CalculadoraFederais();
    private CalculadoraFederais calcularCSLL = new CalculadoraFederais();
    private CalculadoraFederais calcularPIS = new CalculadoraFederais();
    private CalculadoraFederais calcularCOFINS = new CalculadoraFederais();
    private CalculadoraFederais calcularIPI = new CalculadoraFederais();
    private CalculadoraFederais calcularIOF = new CalculadoraFederais();
    private CalculadoraFederais calcularII = new CalculadoraFederais();

    public void federais() throws Exception {
        clearConsole();

        do{

            System.out.println("Bem-vindo ao menu de Tributos Federais!");
            System.out.println("");
            System.out.println("----------------------Tributos Federais -------------------------------");
            System.out.println("1 -- Imposto de Renda Pessoa Jurídica (IRPJ) --------------------------");
            System.out.println("2 -- Contribuição Social sobre o Lucro Líquido (CSLL) -----------------");
            System.out.println("3 -- Programa de Integração Social (PIS) ------------------------------");
            System.out.println("4 -- Contribuição para o Financiamento da Seguridade Social (COFINS) --");
            System.out.println("5 -- Imposto sobre Produtos Industrializados (IPI) --------------------");
            System.out.println("6 -- Imposto sobre Operações Financeiras (IOF) ------------------------");
            System.out.println("7 -- Imposto sobre Operações de Crédito, Câmbio e Seguro (IOF) --------");
            System.out.println("8 -- Voltar para o menu inicial: --------------------------------------");
            System.out.println("9 -- Sair -------------------------------------------------------------");
            System.out.println("--------------------- Digite a opção desejada: ------------------------");

            option = scan.nextInt();

            switch (option) {
            case 1:
                clearConsole(); 
                System.out.println("Imposto de Renda Pessoa Jurídica (IRPJ)");
                System.out.println("Digite o valor: ");
                N1 = scan.nextDouble();
                double resultadoIRPJ = calcularIRPJ.calcularIRPJ(N1);
                System.out.println("Resultado: " + resultadoIRPJ);
                System.out.printf("\n");
                System.out.println("Deseja calcular outro tributo? (s/n)");
                option2 = scan.next();

                if (option2.equals("s")) {
                    clearConsole();
                    federais();
                }else{
                    clearConsole();
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                }
                break;

            case 2:
                clearConsole();
                System.out.println("Contribuição Social sobre o Lucro Líquido (CSLL)");
                System.out.println("Digite o valor: ");
                N1 = scan.nextDouble();
                double resultadoCSLL = calcularCSLL.calcularCSLL(N1);
                System.out.println("Resultado: " + resultadoCSLL);
                System.out.printf("\n");
                System.out.println("Deseja calcular outro tributo? (s/n)");
                option2 = scan.next();

                if (option2.equals("s")) {
                    clearConsole();
                    federais();
                }else{
                    clearConsole();
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                }
                
                break;

            case 3:
                clearConsole();
                System.out.println("Programa de Integração Social (PIS)");
                System.out.println("Digite o valor: ");
                N1 = scan.nextDouble();
                double resultadoPIS = calcularPIS.calcularPIS(N1);
                System.out.println("Resultado: " + resultadoPIS);
                System.out.printf("\n");
                System.out.println("Deseja calcular outro tributo? (s/n)");
                option2 = scan.next();

                if (option2.equals("s")) {
                    clearConsole();
                    federais();
                }else{
                    clearConsole();
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                }
                break;

            case 4:
                clearConsole();
                System.out.println("Contribuição para o Financiamento da Seguridade Social (COFINS)");
                System.out.println("Digite o valor: ");
                N1 = scan.nextDouble();
                double resultadoCOFINS = calcularCOFINS.calcularCOFINS(N1);
                System.out.println("Resultado: " + resultadoCOFINS);

                System.out.printf("\n");
                System.out.println("Deseja calcular outro tributo? (s/n)");
                option2 = scan.next();

                if (option2.equals("s")) {
                    clearConsole();
                    federais();
                }else{
                    clearConsole();
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                }
                break;

            case 5:
                clearConsole();
                System.out.println("Imposto sobre Produtos Industrializados (IPI)");
                System.out.println("Digite o valor: ");
                N1 = scan.nextDouble();
                double resultadoIPI = calcularIPI.calcularIPI(N1);
                System.out.println("Resultado: " + resultadoIPI);
                System.out.printf("\n");
                System.out.println("Deseja calcular outro tributo? (s/n)");
                option2 = scan.next();

                if (option2.equals("s")) {
                    clearConsole();
                    federais();
                }else{
                    clearConsole();
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                }
                break;

            case 6:
                clearConsole();
                System.out.println("Imposto sobre Operações Financeiras (IOF)");
                System.out.println("Digite o valor: ");
                N1 = scan.nextDouble();
                double resultadoIOF = calcularIOF.calcularIOF(N1);
                System.out.println("Resultado: " + resultadoIOF);
                System.out.printf("\n");
                System.out.println("Deseja calcular outro tributo? (s/n)");
                option2 = scan.next();

                if (option2.equals("s")) {
                    clearConsole();
                    federais();
                }else{
                    clearConsole();
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                }
                break;

            case 7:
                clearConsole();
                System.out.println("Imposto sobre Operações de Crédito, Câmbio e Seguro (IOF)");
                System.out.println("Digite o valor: ");
                N1 = scan.nextDouble();
                double resultadoII = calcularII.calcularImpostoImportacao(N1);
                System.out.println("Resultado: " + resultadoII);
                System.out.printf("\n");
                System.out.println("Deseja calcular outro tributo? (s/n)");
                option2 = scan.next();

                if (option2.equals("s")) {
                    clearConsole();
                    federais();
                }else{
                    clearConsole();
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                }
                break;
            case 8:
                clearConsole();
                App.main(null);
                System.out.println("Voltando para o menu inicial...");
                break;
            case 9:
                clearConsole();
                System.out.println("Programa encerrado.");
                break;
            default:
                clearConsole();
                System.out.println("Opção inválida. Tente novamente.");
                break;
            }
        }
        while (option != 9);
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

    public static void main(String[] args) throws Exception { // Método main
        TributosFederais tributos = new TributosFederais();
        tributos.federais();
    }
}
