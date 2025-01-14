public class Alimentacao extends Loja{
    private Data dataAlvara;
    
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantiMaxEstoque){
         super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantiMaxEstoque);
         this.dataAlvara = dataAlvara;
    }
    
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }
    
    public Data getDataAlvara(){
        return dataAlvara;
    }
    
    public String toString(){
        return (super.toString()+"\nData alvara: "+dataAlvara.toString());
    }
}