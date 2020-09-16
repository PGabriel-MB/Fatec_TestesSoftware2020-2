package entrega_introducao;

import java.util.Locale;
import java.util.Scanner;

import org.joda.time.DateTime;


public class App {
    public String diaDaSemana(int dia, int mes, int ano) {
        DateTime dateTime1 = new DateTime(ano, mes, dia, 00, 00, 00);
        DateTime.Property diaSemana = dateTime1.dayOfWeek();

        Locale pt_BR = new Locale("pt", "BR");
        return diaSemana.getAsText(pt_BR);
    }

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

        System.out.println("Dia da semana :\n" + new App().diaDaSemana(dia, mes, ano));
    }
}
