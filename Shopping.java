public class Shopping{
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantiMaxLoja){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantiMaxLoja];

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public Loja[] getLojas(){
        return lojas;
    }

    public boolean insereLoja(Loja loja){
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false; 
    }

    public boolean removeLoja(String nomeLoja){
        for(int i = 0; i<lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja){
        int contador = 0; 

        if(tipoLoja == null || tipoLoja.isEmpty()){ //validando o parametro de entrada
            return -1;
        }

        for (Loja loja : lojas) { //foreach
            if (loja != null) {
                if (tipoLoja.equalsIgnoreCase("Cosmético") && loja instanceof Cosmetico) {
                    contador++;
                } else if (tipoLoja.equalsIgnoreCase("Vestuário") && loja instanceof Vestuario) {
                    contador++;
                } else if (tipoLoja.equalsIgnoreCase("Bijuteria") && loja instanceof Bijuteria) {
                    contador++;
                } else if (tipoLoja.equalsIgnoreCase("Alimentação") && loja instanceof Alimentacao) {
                    contador++;
                } else if (tipoLoja.equalsIgnoreCase("Informática") && loja instanceof Informatica) {
                    contador++;
                }
            }
        }
        return contador > 0 ? contador : -1; //retorna o valor do contador caso maior que 0 se não -1
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaComMaiorSeguro = null;
        double maiorSeguro = 0; 

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) loja; //cast para Informatica
                double seguro = lojaInformatica.getSeguroEletronicos(); 

                if (seguro > maiorSeguro) {
                    maiorSeguro = seguro;
                    lojaComMaiorSeguro = lojaInformatica;
                }
            }
        }

        return lojaComMaiorSeguro; 
    }

}