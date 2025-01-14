public class Principal{
    public static void main(String args[]){
        Loja loja = null;
        Produto produto = null;
        int opcao;  
        
        do{
        System.out.println("Selecione as opções: ");
        System.out.println("(1) Criar uma loja ");
        System.out.println("(2) Criar um produto ");
        System.out.println("(3) Sair ");
        
        opcao = Teclado.leInt("Digite uma opção: ");
        
        switch(opcao){
            case 1:
                System.out.println("Cadastro de loja ");
                loja = new Loja(Teclado.leString("Informe o nome da loja: "), 
                                Teclado.leInt("Informe a quantidade de funcionarios: " ),
                                Teclado.leDouble("Informe o salário base dos funcionarios: "), 
                                new Endereco(Teclado.leString("Informe o nome da rua: "),
                                             Teclado.leString("Informe o nome da cidade: "),
                                             Teclado.leString("Informe o nome do estado: "),
                                             Teclado.leString("Informe o nome do país: "),
                                             Teclado.leString("Informe o cep: "),
                                             Teclado.leString("Informe o numero: "),
                                             Teclado.leString("Informe o complemento: ")
                                             ),
                                new Data(Teclado.leInt("Informe o dia de fundação da loja: "),
                                         Teclado.leInt("Informe o mês de fundação da loja: "),
                                         Teclado.leInt("Informe o ano de fundação da loja: ")
                                         ),
                                Teclado.leInt("Informe a quantidade máxima para o estoque: ")
                                );
                
                break;
            case 2: 
                System.out.println("Cadastro de produto ");
                produto = new Produto(Teclado.leString("Informe o nome do produto: "), 
                                Teclado.leDouble("Informe o preço do produto: " ),
                                new Data(Teclado.leInt("Informe o dia de validade: "),
                                         Teclado.leInt("Informe o mês de validade: "),
                                         Teclado.leInt("Informe o ano de validade: ")
                                         )
                                );
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        
        }while(opcao!=3);
        
        if(produto.estaVencido(new Data(20, 10, 2023))){
            System.out.println("PRODUTO VENCIDO");
        }
        else{
            System.out.println("PRODUTO NÃO VENCIDO");
        }
        
        System.out.println("Dados da loja cadastrada");
        System.out.println(loja.toString());
    }
}