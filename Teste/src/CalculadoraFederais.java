public class CalculadoraFederais {
    
    // Método para calcular o IRPJ
    public double calcularIRPJ(double valor) {
        double percentualIRPJ = 0.15; // Exemplo, ajuste conforme a legislação vigente
        return valor * percentualIRPJ;
    }

    // Método para calcular a CSLL
    public double calcularCSLL(double valor) {
        double percentualCSLL = 0.05; // Exemplo, ajuste conforme a legislação vigente
        return valor * percentualCSLL;
    }

    // Método para calcular o PIS
    public double calcularPIS(double faturamento) {
        double percentualPIS = 0.01; // Exemplo, ajuste conforme a legislação vigente
        return faturamento * percentualPIS;
    }

    // Método para calcular a COFINS
    public double calcularCOFINS(double faturamento) {
        double percentualCOFINS = 0.03; // Exemplo, ajuste conforme a legislação vigente
        return faturamento * percentualCOFINS;
    }

    // Método para calcular o IPI
    public double calcularIPI(double valorProdutos) {
        double percentualIPI = 0.05; // Exemplo, ajuste conforme a legislação vigente
        return valorProdutos * percentualIPI;
    }

    // Método para calcular o IOF
    public double calcularIOF(double valorOperacao) {
        double percentualIOF = 0.002; // Exemplo, ajuste conforme a legislação vigente
        return valorOperacao * percentualIOF;
    }

    // Método para calcular o II
    public double calcularImpostoImportacao(double valorImportacao) {
        double percentualII = 0.1; // Exemplo, ajuste conforme a legislação vigente
        return valorImportacao * percentualII;
    }

    // Outros métodos podem ser adicionados conforme necessário

    public static void main(String[] args) {
        // Exemplo de uso
        CalculadoraFederais calculadora = new CalculadoraFederais();
        double valor = 100000.0;
        double irpj = calculadora.calcularIRPJ(valor);
        System.out.println("IRPJ: " + irpj);
    }
}
