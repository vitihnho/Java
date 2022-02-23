public class CotacaoMoeda
{
   public static void main(String[] args){
        double dolar = 5;
        double real = 500;
        
        System.out.println("Dolar: " + dolar);
        System.out.println("Real: " + real);
        
        double ValorCotacao = real * dolar;
        System.out.println(ValorCotacao + "\n");
        
        if(ValorCotacao > 1000){
            System.out.println("O valor da cotação é maior que 1000");
            ValorCotacao = (ValorCotacao + (ValorCotacao * 0.2));
            System.out.println(ValorCotacao);
        }
        else{
            System.out.println("O valor da cotação é menor que 1000");
        }
    }
}
