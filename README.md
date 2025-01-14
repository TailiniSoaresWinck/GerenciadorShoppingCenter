
# Gerenciador de Shopping Center 📈🚀

Esse projeto foi desenvolvido para um trabalho na Unisinos, para aprimorar conhecimentos adquiridos durante o primeiro semestre, onde foi desenvolvido utilizando **JAVA**.

## Principais funções 📊

- *estaVencido(Data dataRecebida)*
  
**Objetivo:** Verifica se uma data recebida já está vencida em relação a uma data de validade (dataValidade).

**Metodologia utilizada:** Comparação sequencial dos componentes da data (ano, mês e dia), de forma hierárquica. É um método direto e simples para verificar a validade de uma data.

- *insereLoja(Loja loja)*
  
**Objetivo:** Insere uma nova loja em um array de lojas (lojas).

**Metodologia utilizada:** Busca sequencial. O método verifica todas as posições possíveis até encontrar um espaço ou concluir que não há mais espaço disponível.

- *removeLoja(String nomeLoja)*

**Objetivo:** Remove uma loja do array lojas com base no nome da loja fornecido.

**Metodologia utilizada:** Busca sequencial e remoção por índice.

- *quantidadeLojasPorTipo(String tipoLoja)*
  
**Objetivo:** Conta quantas lojas de um tipo específico existem no array de lojas (lojas).

**Metodologia utilizada:** Validação de entrada e busca por tipo específico usando instanceof.


