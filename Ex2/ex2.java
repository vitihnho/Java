import java.util.Scanner;

public class ex2
{
   
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double[] valoresMoedas = {5,4.96,3.75};
        double valorReal = 10;
        int x=0;
        
        System.out.println("Digite um valor: ");
        x = ler.nextInt();
    
    if(x==1){
        System.out.println("Valor em real na 1º moeda = " + (valorReal * valoresMoedas[0]));
        
    }else if(x==2){
        System.out.println("Valor em real na 2º moeda = " + (valorReal * valoresMoedas[1]));
    }else if(x==3){
        System.out.println("Valor em real na 3º moeda = " + (valorReal * valoresMoedas[2]));
    }
}
}
