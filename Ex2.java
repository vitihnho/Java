public class Ex2
{
    public static void main(String[] args){
    double cotDolar = 5;
    double valorReal = 5000;    
    double valorDolar = (valorReal/cotDolar);
    
    while(valorDolar < 3000){
        cotDolar -= 0.5;
        valorDolar = (valorReal/cotDolar);
        System.out.println("Valor em Dolar: U$ " + valorDolar);
        System.out.println("Cotacao do Dolar: U$ " + cotDolar + "\n");
    }    
    
}
}
