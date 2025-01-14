public class Vestuario extends Loja{
    private boolean produtosImportados;
    
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,  boolean produtosImportados, int quantiMaxEstoque){
         super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantiMaxEstoque);
         this.produtosImportados = produtosImportados;
    }
    
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }
    
    public boolean getProdutosImportados(){
        return produtosImportados;
    }
    
    public String toString(){
        return (super.toString()+"\nProduto importado: "+produtosImportados);
    }
}