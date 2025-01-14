public class Informatica extends Loja{
    private double seguroEletronicos;
    
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,  double seguroEletronicos, int quantiMaxEstoque){
         super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantiMaxEstoque);
         this.seguroEletronicos = seguroEletronicos;
    }
    
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }
    
    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }
    
    public String toString(){
        return (super.toString()+"\nSeguro eletronicos: "+seguroEletronicos);
    }
}