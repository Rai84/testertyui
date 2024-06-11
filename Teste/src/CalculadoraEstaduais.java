public class CalculadoraEstaduais {

    // Método para calcular o ICMS
    public double calcularICMS(double valor) {
        double percentualICMS = 0.15; // Exemplo, ajuste conforme a legislação vigente
        return valor * percentualICMS;
    }

    // Método para calcular a IPVA
    public double calcularIPVA(double valor) {
        double percentualIPVA = 0.05; // Exemplo, ajuste conforme a legislação vigente
        return valor * percentualIPVA;
    }

    // Método para calcular o ITCMD
    public double calcularITCMD(double faturamento) {
        double percentualITCMD = 0.01; // Exemplo, ajuste conforme a legislação vigente
        return faturamento * percentualITCMD;
    }

    // Método para calcular a ITBI
    public double calcularITBI(double faturamento) {
        double percentualITBI = 0.03; // Exemplo, ajuste conforme a legislação vigente
        return faturamento * percentualITBI;
    }

    
}
