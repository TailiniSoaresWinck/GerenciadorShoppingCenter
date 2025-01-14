public class Produto{
    private String nome;
    private double preco;
    private Data dataValidade;
    
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    
    public Data getDataValidade(){
        return dataValidade;
    }
    
    public boolean estaVencido(Data dataRecebida){
        if(dataRecebida.getAno() < dataValidade.getAno()){
            return false;
        }
        else if(dataRecebida.getAno() == dataValidade.getAno()){
            if(dataRecebida.getMes() < dataValidade.getMes()){
                return false;
            }
            else if(dataRecebida.getMes() == dataValidade.getMes()){
                if(dataRecebida.getDia() <= dataValidade.getDia()){
                    return false;
                }
            }
        }
        return true;
    }
   
    public String toString(){
        return ("Nome do produto: "+nome+"\nPreço: "+preco+"\nData de validade: "+dataValidade.toString());
    }
}