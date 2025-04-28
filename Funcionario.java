public abstract class Funcionario{
    private String nome;

    public String getNome(){
        return nome;
    }

  public void setNome(String nome){
    this.nome = nome;
  }
// Método abstrato que seráimplementado pelas classes filhas
    public abstract double calcularSalarioFinal();
}