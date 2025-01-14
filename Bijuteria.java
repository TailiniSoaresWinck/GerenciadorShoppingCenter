public class Bijuteria extends Loja{
    private double metaVendas;
    
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int quantiMaxEstoque){
         super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantiMaxEstoque);
         this.metaVendas = metaVendas;
    }
    
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }
    
    public double getMetaVendas(){
        return metaVendas;
    }
    
    public String toString(){
        return (super.toString()+"\nMeta Vendas: "+metaVendas);
    }
}