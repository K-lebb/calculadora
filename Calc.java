import java.util.Scanner;
public class Calc{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String args[]){
    

    Numero n1 = new Numero();
    Numero n2 = new Numero();
    Numero resultado = new Numero();
    //String continuar= "S";
    String operacao;
    
    System.out.print("Qual operação você deseja realizar?:");
    operacao = leia.next();

    if(operacao.equals("+") || operacao.equals("soma")){

    

    System.out.printf("Digite um valor:");
    n1.setarValor(leia.nextInt());
    System.out.print("Digite um valor:");
    n2.setarValor(leia.nextInt());
    resultado.setarValor(n1.getValor() + n2.getValor());
    System.out.printf("%nA soma de %d com %d é igual a %d   ", n1.getValor(), n2.getValor(), resultado.getValor());


    } else if(operacao.equals("-") || operacao.equals("subtracao")){

    System.out.printf("Digite um valor:");
    n1.setarValor(leia.nextInt());
    System.out.print("Digite um valor:");
    n2.setarValor(leia.nextInt());
    resultado.setarValor(n1.getValor() - n2.getValor());
    System.out.printf("%nA subtração de %d com %d é igual a %d   ", n1.getValor(), n2.getValor(), resultado.getValor());


    }else if(operacao.equals("/") || operacao.equals("divisao")){

    System.out.printf("Digite um valor:");
    n1.setarValor(leia.nextInt());
    System.out.print("Digite um valor:");
    n2.setarValor(leia.nextInt());
    resultado.setarValor(n1.getValor() / n2.getValor());
    System.out.printf("%nA divisão de %d com %d é igual a %d   ", n1.getValor(), n2.getValor(), resultado.getValor());
    }else if(operacao.equals("*") || operacao.equals("multiplicacao")){
    System.out.printf("Digite um valor:");
    n1.setarValor(leia.nextInt());
    System.out.print("Digite um valor:");
    n2.setarValor(leia.nextInt());
    resultado.setarValor(n1.getValor() * n2.getValor());
    System.out.printf("%nA multiplicação de %d com %d é igual a %d   ", n1.getValor(), n2.getValor(), resultado.getValor());
}
}
}