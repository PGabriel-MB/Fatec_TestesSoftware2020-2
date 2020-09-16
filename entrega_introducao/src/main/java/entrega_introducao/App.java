package entrega_introducao;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //System.out.println(new App().HelloWorld());
        int dia, mes, ano;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o dia:\n");
        dia = leitor.nextInt();

        leitor.nextLine();


        System.out.println("Agora, digite o Mês \n:");
        mes = leitor.nextInt();

        leitor.nextLine();

        System.out.println("E agora digite o Ano: \n");
        ano = leitor.nextInt();

        System.out.println("Dia da semana :\n" + new DayOfWeek().diaDaSemana(dia, mes, ano));
    }
}
