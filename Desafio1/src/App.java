import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("***************************************************");
        System.out.println("********************  SIMCITY  ********************");
        System.out.println("***************************************************");
        taxaDeImposto();
    }
    public static void taxaDeImposto(){
        Scanner leitor = new Scanner(System.in);
        int menu;
        double imposto = 0;
        double resultado = 0;
        String nome = "";
        String profissao = "";

        System.out.println("\nOlá, quantos mes vc gostaria fazer calcular?1 a 12 meses");
        int mes = leitor.nextInt();
        double vetor[] = new double[mes];

        for(int i = 0; i < vetor.length; i++ ){
           System.out.println("Informe salario mes "+(i+1)+": "); 
           vetor[i] = leitor.nextDouble();
        }
        for(int i = 0; i < 1000; i++ ){
        System.out.println("\nOlá,escolhe o menu oque você gostaria continuar:\n\n"+
                             "1 = cadastro\n"+
                             "2 = mostrar sua informação\n"+
                             "3 = salario\n"+
                             "4 = calcular imposto\n"+
                             "5 = digita exit para sair o sistema\n");
        menu = leitor.nextInt();
        if(menu == 1){
            System.out.println(" ---------------------------------");
            System.out.println("Nome: ");
            nome = leitor.next();
            System.out.println(" ---------------------------------");
            System.out.println("Profissão: ");
            profissao = leitor.next();
            System.out.println(" ---------------------------------");
        }
        if(menu == 2){
            System.out.println(" ---------------------------------");
            System.out.println("     Nome: "+nome+"                   ");
            System.out.println(" ---------------------------------");
            System.out.println("     Profissao: "+profissao+"         ");
            System.out.println(" ---------------------------------");
        }
       if(menu == 3){
            for(int j = 0; j < vetor.length; j++ ){
                System.out.println(" ---------------------------------------------");
                System.out.println("              Salario: "+vetor[j]);
                System.out.println(" ----------------------------------------------");
        }
    }
        if(menu == 4){
        for(i = 0;i < vetor.length; i++ ){
            if(vetor[i] >= 0.00 && vetor[i] <=2000.00){
                System.out.println(" --------------------------------------------------------------------------");
                System.out.println("     mes "+(i+1)+" Não tem imposto     ");
                System.out.println(" --------------------------------------------------------------------------");
            }else if(vetor[i] >= 2001.00 && vetor[i] <= 3000.00){
                imposto = vetor[i] * 0.08;
                resultado = vetor[i] - imposto;
                System.out.println(" --------------------------------------------------------------------------");
                System.out.println("     mes "+(i+1)+" com 8% desconto de imposto seu salario é "+resultado);
                System.out.println(" --------------------------------------------------------------------------");
            }else if(vetor[i] >= 3001.00 && vetor[i] <= 4500.00){
                imposto = vetor[i] * 0.18;
                resultado = vetor[i] - imposto;
                System.out.println(" --------------------------------------------------------------------------");
                System.out.println("     mes "+(i+1)+" com 18% desconto de imposto seu salario é "+resultado);
                System.out.println(" --------------------------------------------------------------------------");
            }else{
                imposto = vetor[i] * 0.28;
                resultado = vetor[i] - imposto;
                System.out.println(" --------------------------------------------------------------------------");
                System.out.println("     mes "+(i+1)+" com 28% desconto de imposto seu salario mês é "+resultado);
                System.out.println(" --------------------------------------------------------------------------");
            }
        }
    }
    if(menu == 5){
        System.out.println(" ---------------------------------");
        System.out.println(" *** Encerrando com sucesso *** :D");
        System.out.println(" ---------------------------------\n");
        System.exit(0);
 }
    }
}
}

