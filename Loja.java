public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantiMaxEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantiMaxEstoque];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantiMaxEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantiMaxEstoque];
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }

    public Data getDataFundacao(){
        return dataFundacao;
    }

    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }

    public double gastosComSalario(){
        if(salarioBaseFuncionario == -1){
            return -1;
        }
        return salarioBaseFuncionario*quantidadeFuncionarios;
    }

    public char tamanhoDaLoja(){
        if(quantidadeFuncionarios < 10){
            return 'P';
        }
        else if(quantidadeFuncionarios >=10 && quantidadeFuncionarios<=30){
            return 'M';
        }
        else{
            return 'G';
        }
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false; 
    }
    
    public boolean removeProduto(String nomeProduto){
        for(int i = 0; i<estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)){
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    public void imprimeProdutos(){
        for(int i = 0; i< estoqueProdutos.length; i++){
            if (estoqueProdutos[i] != null) {
                System.out.println("Produto " + (i + 1) + ": " + estoqueProdutos[i].toString());
            } else {
                System.out.println("Não há produtos disponiveis!");
                break;
            }
        }
    }


    public String toString(){
        String retorno = "Nome: "+nome
            +"\nQuantidade funcionários: "+quantidadeFuncionarios
            +"\nSalario base: "+salarioBaseFuncionario
            +"\n"+endereco.toString()
            +"\nData fundação: "+dataFundacao.toString()
            +"\nEstoque produtos:\n";

        imprimeProdutos();

        return retorno;
    }
}