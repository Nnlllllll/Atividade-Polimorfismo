public class Empresa{    
    public static void main(String[] args) {
        Funcionario v = new Vendedor(2000, 500); // Vendedor com salario base de 2000 e comissão de 500
        Funcionario f= new FreeLancer(20, 150); // Freelancer com 20 dias trabalhados a 150 cada

    System.out.println("Salário do Vendedor:" + obterSalarioDoFuncionario(v)); // Chama Vendedor
    System.out.println("Salário do Freelancer: " + obterSalarioDoFuncionario(f)); // Chama FreeLancer
    }

    public static double obterSalarioDoFuncionario(Funcionario funcionario){
    return funcionario.calcularSalarioFinal(); // Polimorfismo em açao
    }
}
