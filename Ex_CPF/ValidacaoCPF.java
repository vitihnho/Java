public class ValidacaoCPF
{
    public static void main(String[] args){
        int[] cpf = {5,3,7,0,0,9,5,1,8,3,3};
        int multiplicador = 10;
        int x = 0;
        double sm = 0;
        double sm2 = 0;
        
        while(multiplicador!=1){
            int soma = (cpf[x] * multiplicador);
            multiplicador--;
            x++;
            sm += soma;
            System.out.println("Valor " + x + "= " + soma + "\n");
        }
        System.out.println("Calculando 1º Digito\n");
        
        double digito = ((11 - (sm / 11)) * -1);
        
        System.out.printf("Valor do 1º Digito: %.10f", digito);
        System.out.println("\nValor Total: " + sm + "\n");
        
        multiplicador = 11;
        x = 0;
        while(multiplicador!=1){
           int soma2 = (cpf[x] * multiplicador);
           multiplicador--;
           x++;
           sm2 += soma2;
           System.out.println("Valor " + x + "= " + soma2 + "\n");
        }
        
        double digito2 = ((11 - (sm2 / 11)) * -1);
        
        System.out.printf("Valor do 2º Digito: %.10f", digito2);
        System.out.println("\nValor Total: " + sm2);
        /*multiplicador = 11;
        for(x=0;multiplicador!=1;x++){
            int soma = (cpf[x] * multiplicador);
            
        }
        
        sm += cpf[10] * 2;
        
        digito = ((11 - (sm / 11)) * -1);
        
        System.out.println("\nValor Total: " + sm);
        System.out.printf("Valor do 2º Digito: %.10f",digito);*/
        
    }
}
