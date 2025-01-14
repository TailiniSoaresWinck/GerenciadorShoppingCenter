public class Data{
    private int dia, mes, ano;
    
    public Data(int dia, int mes, int ano){
        
        boolean dataValida = true;
        if(mes < 1 || mes > 12){
            dataValida = false;
        }
        else if(mes == 2){
            if(verificaAnoBissexto()){
                if(dia < 1 || dia > 29){
                    dataValida = false;
                }
            }
            else{
                if(dia<1 || dia>28){
                    dataValida = false;
                }
            }
        }
        else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if(dia < 1 || dia > 30){
                dataValida = false;
            }
        }
        else{
            if(dia < 1 || dia > 31){
                System.out.println("Data inválida");
                this.dia = 1;
                this.mes = 1;
                this.ano = 2000;
            }
        }
        
        if(!dataValida){
            System.out.println("Data inválida");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
        else{
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;   
        }
        
    }
    
    public boolean verificaAnoBissexto(){
        //Verifica se o ano é bissexto atraves da regra se o ano for bisssexto será divisivel por 4 e nao por 100, ou divisivel por 400;
        
        if((this.ano%4 == 0 && this.ano%100 != 0) || (this.ano%400 == 0)){
            return true;
        }
        return false;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getDia(){
        return dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public int getAno(){
        return ano;
    }
    
    public String toString(){
        return (dia+"/"+mes+"/"+ano);
    }
}